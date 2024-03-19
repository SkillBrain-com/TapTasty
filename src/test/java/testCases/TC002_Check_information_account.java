package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

import static org.testng.Assert.fail;

public class TC002_Check_information_account extends BaseClass{

    @Test
    public void verify_personal()
    {
        logger.info("**** starting TC002_Check_information_account  *****");

        logger.debug("application logs started......");

        try {
            HomePage hp = new HomePage(driver);
            hp.lnkLogin();
            logger.info("Clicked on Login button");

            logger.info("Going to login page");
            LogInPage regpage = new LogInPage(driver);


            regpage.setEmail("mircea.dragomir93+5@gmail.com");
            regpage.password("testare");

            regpage.clickLogin();
            regpage.clickCont();

            regpage.info();

        }
        catch(Exception e)
        {
            logger.error("test failed..");
            logger.debug("debug logs....");
            fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_001_CheckFavorite *****");
    }
}

