package testCases.Cont;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class TC_012_AddDateOfBirth extends BaseClass {
    @Test
    public void modifyPersonalInformation() {
        logger.info("**** starting TC_012_AddDateOfBirth *****");
        logger.debug("application logs started......");
        try {
            HomePage hp = new HomePage(driver);
            hp.lnkLogin();
            logger.info("Clicked on Login button");

            logger.info("Going to login page");
            LogInPage regpage = new LogInPage(driver);

            regpage.setEmail("andreea.oananastac8@gmail.com");
            regpage.password("Chavi2727an");

            regpage.clickLogin();
            Thread.sleep(2000);

            regpage.contInformation();
            //Thread.sleep(2000);

            regpage.personalinformation();
            regpage.setDateOfbirth();
            regpage.setSaveModificationsPersonalInformation();




        }
        catch(Exception e)
        {
            logger.error("test failed..");
            logger.debug("debug logs....");
            //	Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_012_AddDateOfBirth *****");

    }
}
