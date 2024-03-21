package taptastytestmenu;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastymenu.AddMoreProductsToCartAndDeleteAll;
import utils.BasePage;

//After login, click menu
// add to cart from burgher menu first product,
// go back and select Bigbox menu from the footer menu,
//select first product, go back select rollz menu and select secand product
//go to cart and delete all the items, and verify is th cart is empty
public class AddMoreProductsToCartAndDeleteAllTest extends BasePage {

    @Test
    public void addMoreProductsToCartAndDeleteAll() throws InterruptedException {

        logger.info("**** starting TC_AddMoreProductsToCartAndDeleteAll  *****");

        logger.debug("application logs started......");

        try {
            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            AddMoreProductsToCartAndDeleteAll addMoreProductsToCartAndDeleteAll = new AddMoreProductsToCartAndDeleteAll(driver);
             logger.info("Log in");
            loginPage.loginPage();
            logger.info("Add to cart multiple items and delete from the card all of them");
            addMoreProductsToCartAndDeleteAll.addMoreProductsToCartAndDeleteAll();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_AddMoreProductsToCartAndDeleteAll *****");

    }
}
