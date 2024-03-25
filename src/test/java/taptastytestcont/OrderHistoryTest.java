package taptastytestcont;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastycont.OrderHistory;
import utils.BasePage;

//Click order history, check first order and go back to account
public class OrderHistoryTest extends BasePage {

    @Test
    public void orderHistory () throws  InterruptedException {

        logger.info("**** starting TC_OrderHistory  *****");

        logger.debug("application logs started......");

        try {

        driver.get("https://ristorantelavitaebella.taptasty.com/");
        LoginPage loginPage = new LoginPage(driver);
        OrderHistory orderHistory = new OrderHistory(driver);

        logger.info("Log in");
        loginPage.loginPage();
        logger.info("Check order history");
        orderHistory.orderHistory();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_OrderHistory *****");

    }
}
