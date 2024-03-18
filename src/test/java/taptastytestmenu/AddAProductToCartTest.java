package taptastytestmenu;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastymenu.AddAProductToCart;
import utils.BasePage;

//Add a product to cart
public class AddAProductToCartTest extends BasePage {

    @Test
    public void addToCart() throws InterruptedException {

        logger.info("**** starting TC_AddToCart  *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            AddAProductToCart addAProductToCart = new AddAProductToCart(driver);
            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Add to cart a product");
            addAProductToCart.addAProductToCart();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_AddToCart *****");
    }
}
