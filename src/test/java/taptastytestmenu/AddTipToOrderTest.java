package taptastytestmenu;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastymenu.AddTipToOrder;
import utils.BasePage;

/*Add a product to cart , from pizza menu, select first product ,
choose the sezi of pizza, and added 2 extra option, added to cart , click "Bacsis" button ,
add tip amount (ex 10), and check if the tip entered is the same as the one we see before placing the order */
public class AddTipToOrderTest extends BasePage {

    @Test
    public void addTipOrder() throws InterruptedException {


        logger.info("**** starting TC_AddTipToOrder *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            AddTipToOrder addTipToOrder = new AddTipToOrder(driver);

            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Add a product to cart and add a tip");
            addTipToOrder.addTipToOrder();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_AddTipToOrder *****");

    }
}
