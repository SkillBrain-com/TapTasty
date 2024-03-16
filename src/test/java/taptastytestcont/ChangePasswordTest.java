package taptastytestcont;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastycont.ChangePassword;
import utils.BasePage;

//Change the password
public class ChangePasswordTest extends BasePage {

    @Test
    public void changePassword() throws InterruptedException {

        logger.info("**** starting TC_ChangePassword  *****");

        logger.debug("application logs started......");

        try{
        driver.get("https://ristorantelavitaebella.taptasty.com/");
        LoginPage loginPage = new LoginPage(driver);
        ChangePassword changePassword = new ChangePassword(driver);

        logger.info("Log in");
        loginPage.loginPage();
        logger.info("Change password");
        changePassword.changePassword();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_ChangePassword *****");

    }
}
