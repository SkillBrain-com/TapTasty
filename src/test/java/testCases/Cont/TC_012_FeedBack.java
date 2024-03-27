package testCases.Cont;

import  org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class TC_012_FeedBack extends BaseClass {
    @Test
    public void feedback(){
        logger.info(" starting  TC_012_FeedBack *");
        logger.debug("application logs started......");
        try {
            HomePage hp = new HomePage(driver);
            hp.lnkLogin();
            logger.info("Clicked on Login button");

            logger.info("Going to login page");
            LogInPage regpage = new LogInPage(driver);

            regpage.setEmail("abistriceanu32@gmail.com");
            regpage.password("Moscraciun1");

            regpage.clickLogin();
            Thread.sleep(2000);
            regpage.contInformation();
            regpage.SetSelectFeedBack();
            regpage.SetSelectChooseLocation();
            regpage.SetChooseTapTastyGastoPanDelivery();












        }
        catch(Exception e)
        {
            logger.error("test failed..");
            logger.debug("debug logs....");
            //    Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info(" finished TC_012_FeedBack *");


    }








}