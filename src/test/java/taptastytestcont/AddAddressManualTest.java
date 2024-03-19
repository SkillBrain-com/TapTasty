package taptastytestcont;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastycont.AddAddressManual;
import utils.BasePage;
import utils.DataGeneration;

//Add a address manul from account
public class AddAddressManualTest extends BasePage {

    @Test
    public void addressManual() throws InterruptedException{

        logger.info("**** starting TC_AddAddressManual  *****");

        logger.debug("application logs started......");

        try {
            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            DataGeneration dataGeneration = DataGeneration.getInstance();
            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Add address manual");
            AddAddressManual addAddressManual = new AddAddressManual(driver);
            addAddressManual.addressManual(dataGeneration.address, dataGeneration.nrAddress, dataGeneration.city, dataGeneration.county);
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_AddAddressManual *****");


    }
}
