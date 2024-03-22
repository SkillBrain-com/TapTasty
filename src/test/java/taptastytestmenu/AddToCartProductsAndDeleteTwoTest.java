package taptastytestmenu;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastymenu.AddToCartProductsAndDeleteTwo;
import utils.BasePage;

//Add to cart 3 products, from burgher menu first product
//from BigBox first product
//from Rollz second product
//view the cart and delete two products (Burgher and BigBox products) from the cart
//verify if we still have 1 item in the cart and the name of the product (from Rollz menu -> CHILLI-MAYO ROLL)

public class AddToCartProductsAndDeleteTwoTest extends BasePage {

    @Test
    public void addToCartProductsAndDeleteTwo() throws InterruptedException {

        logger.info("**** starting TC_ AddToCartProductsAndDeleteTwo  *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            AddToCartProductsAndDeleteTwo addToCartProductsAndDeleteTwo = new AddToCartProductsAndDeleteTwo(driver);

            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Add 3 items to cart and delete two items, check if we still have 1 product to cart");
            addToCartProductsAndDeleteTwo.addProductsToCartAndDeleteTwo();

        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_ AddToCartProductsAndDeleteTwo *****");
    }
}
