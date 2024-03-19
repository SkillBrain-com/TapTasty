package taptastytestmenu;


import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastymenu.AddAProductToCart;
import taptastymenu.CompleteTheOrder;
import utils.BasePage;

//Complete the order after adding a product to cart
public class CompleteTheOrderTest extends BasePage {

    @Test
    public void completeTheOrder() throws InterruptedException {

        logger.info("**** starting TC_CompleteTheOrder *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            AddAProductToCart addAProductToCart = new AddAProductToCart(driver);
            CompleteTheOrder completeTheOrder = new CompleteTheOrder(driver);

            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Add a product to cart");
            addAProductToCart.addAProductToCart();
            logger.info("Complete the order");
            completeTheOrder.completeTheOrder();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_CompleteTheOrder *****");
    }
}
