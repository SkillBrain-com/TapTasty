package taptastytestcont;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastycont.NotificationByEmailOnOff;
import utils.BasePage;

//Turn On/Off the notification by email toggle button
public class NotificationByEmailOnOffTest extends BasePage {

    @Test
    public void notificationByEmail() throws InterruptedException {

        logger.info("**** starting TC_NotificationByEmail  *****");

        logger.debug("application logs started......");

        try {
            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            NotificationByEmailOnOff notificationByEmailOnOff = new NotificationByEmailOnOff(driver);

            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Notification On/Off by email");
            notificationByEmailOnOff.notificationByEmail();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_NotificationByEmail *****");

    }
}
