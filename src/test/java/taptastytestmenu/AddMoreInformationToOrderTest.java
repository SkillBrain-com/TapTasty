package taptastytestmenu;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastymenu.AddAProductToCart;
import taptastymenu.AddMoreInformationToOrder;
import utils.BasePage;

//Add to an order more information , add to cart from pizza
//first product, add the size of pizzan and 2 extra option,
//from cart add more information about the order (ex No mayo),
//and finish the order and verify if the order was successful
public class AddMoreInformationToOrderTest extends BasePage {

    @Test
    public void addMoreInformationToOrder() throws InterruptedException {

        logger.info("**** starting TC_AddMoreInformationToOrder *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            AddMoreInformationToOrder addMoreInformationToOrder = new AddMoreInformationToOrder(driver);
            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Add to cart a product and add extra info about the order and finish de order");
            addMoreInformationToOrder.addMoreInformationToOrder();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_AddMoreInformationToOrder *****");
    }

}
