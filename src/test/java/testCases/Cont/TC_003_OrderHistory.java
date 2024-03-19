package testCases.Cont;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class TC_003_OrderHistory extends BaseClass {
    @Test
    public void orderHistory(){
        logger.info(" starting TC_003_OrderHistory *");
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
            //Thread.sleep(2000);

            regpage.contInformation();
            Thread.sleep(2000);
            regpage.setMyAddress();
            logger.info("Clicked on MyAddress");
            regpage.setAddAddressManually();
            logger.info("Clicked on Login button");
            regpage.setAddAddress();
            logger.info("Clicked on Login button");
            regpage.setStreetName();
            logger.info("Clicked on Login button");
            regpage.setNumberStreet();
            logger.info("Clicked on Login button");
            regpage.setFullAddress();
            logger.info("Clicked on Login button");
            regpage.setTown();
            logger.info("Clicked on Login button");
            regpage.setAddTown();
            logger.info("Clicked on Login button");
            regpage.setCompleted();
            logger.info("Clicked on Login button");
            regpage.setSetOrderHistory();
            logger.info("Clicked on Login button");




        }
        catch(Exception e)
        {
            logger.error("test failed..");
            logger.debug("debug logs....");
            //    Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info(" finished TC_003_OrderHistory *");


    }








}










