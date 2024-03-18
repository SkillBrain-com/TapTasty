package testCases.Cont;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

import java.sql.PreparedStatement;

public class AdreseleMele extends BaseClass {
    @Test
    public void changesMyAddress() {
        logger.info("**** My_Address *****");

        logger.debug("application logs started......");

        try {

            HomePage hp = new HomePage(driver);
            hp.lnkLogin();
            logger.info("Clicked on Login button");

            logger.info("Going to login page");
            LogInPage regpage = new LogInPage(driver);

            regpage.setEmail("radu.bobanga14@gmail.com");
            regpage.password("test12345678");

            regpage.clickLogin();
            Thread.sleep(2000);
            regpage.clickcont();
            Thread.sleep(2000);
            regpage.clickmyaddress();
            Thread.sleep(2000);
            regpage.clickaddaddressmanuly();
            Thread.sleep(2000);
            regpage.enternameaddress();
            Thread.sleep(2000);
            regpage.enterstrada();
            Thread.sleep(2000);
            regpage.enternumber();
            Thread.sleep(2000);
            regpage.entercity();
            Thread.sleep(2000);
            regpage.enterregion();
            Thread.sleep(2000);
            regpage.enterdetails();
            Thread.sleep(2000);
            regpage.clickdone();
            Thread.sleep(2000);

        } catch (Exception exception) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            //Assert.fail();
        }
        logger.debug("application logs end.......");
        logger.info("**** My_Address *****");
    }
}