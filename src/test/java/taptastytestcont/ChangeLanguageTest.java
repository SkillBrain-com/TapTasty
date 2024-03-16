package taptastytestcont;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastycont.AddAddressManual;
import taptastycont.ChangeLanguage;
import utils.BasePage;
import utils.DataGeneration;

//Change the language of website to English
public class ChangeLanguageTest extends BasePage {

    @Test
    public void changeLanguage(){

        logger.info("**** starting TC_ChangeLanguage  *****");

        logger.debug("application logs started......");

        try {
            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            ChangeLanguage changeLanguage = new ChangeLanguage(driver);
            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Change the language");
            changeLanguage.changeLanguage();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_ChangeLanguage *****");


    }
}
