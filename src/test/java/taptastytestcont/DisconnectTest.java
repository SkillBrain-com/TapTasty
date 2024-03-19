package taptastytestcont;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastycont.Disconnect;
import taptastycont.NotificationByEmailOnOff;
import utils.BasePage;

//Disconnect from the website Log out
public class DisconnectTest extends BasePage {

    @Test
    public void disconnect() throws InterruptedException {

        logger.info("**** starting TC_Disconnect  *****");

        logger.debug("application logs started......");

        try {
            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            Disconnect disconnect = new Disconnect(driver);

            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Disconnect from the website");
            disconnect.disconnect();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_Disconnect *****");

    }

}
