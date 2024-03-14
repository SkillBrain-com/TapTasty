package taptastytestcont;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptastycont.ChangePersonalInformation;
import taptasty.LoginPage;
import utils.BasePage;
import utils.DataGeneration;

/*Change the name from personal data*/
public class ChangePersonalInformationTest extends BasePage {



    @Test
    public void changePersonalInformation() throws InterruptedException {

        logger.info("**** starting TC_ChangePersonalInformation  *****");

        logger.debug("application logs started......");

        try {
            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            DataGeneration dataGeneration = DataGeneration.getInstance();
            ChangePersonalInformation changePersonalInformation = new ChangePersonalInformation(driver);
            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Change personal info");
            changePersonalInformation.changePersonalInformation(dataGeneration.fName, dataGeneration.lName);
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_ChangePersonalInformation *****");
    }
}
