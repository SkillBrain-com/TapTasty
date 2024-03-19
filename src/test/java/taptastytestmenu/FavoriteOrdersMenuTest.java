package taptastytestmenu;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastycont.FavoriteOrders;
import taptastymenu.FavoriteOrdersMenu;
import utils.BasePage;

//Check favorite orders from menu and verify the order
public class FavoriteOrdersMenuTest extends BasePage {

    @Test
    public void favoriteOrdersMenu() throws InterruptedException {

        logger.info("**** starting TC_FavoriteOrdersMenu *****");

        logger.debug("application logs started......");

        try{

        driver.get("https://ristorantelavitaebella.taptasty.com/");
        LoginPage loginPage = new LoginPage(driver);
        FavoriteOrdersMenu favoriteOrdersMenu = new FavoriteOrdersMenu(driver);

        logger.info("Log in");
        loginPage.loginPage();

        logger.info("Check the favorite orders");
        favoriteOrdersMenu.favoriteOrdersMenu();

        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_CompleteTheOrder *****");
    }

}
