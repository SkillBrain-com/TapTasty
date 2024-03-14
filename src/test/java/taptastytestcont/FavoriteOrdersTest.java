package taptastytestcont;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastycont.FavoriteOrders;
import taptastycont.MyCards;
import utils.BasePage;

//Check favorite orders from account and back to account
public class FavoriteOrdersTest extends BasePage {

    @Test
    public void myCards() {

        logger.info("**** starting TC_FavoriteOrders  *****");

        logger.debug("application logs started......");

        try{
            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            FavoriteOrders favoriteOrders = new FavoriteOrders(driver);

            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Check my favorite orders");
            favoriteOrders.favoriteOrders();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_FavoriteOrders *****");
    }
}
