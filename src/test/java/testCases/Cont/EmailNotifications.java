package testCases.Cont;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class EmailNotifications extends BaseClass {
    @Test
    public void changesAppLanguage() {
        logger.info("**** Email_Notifications *****");

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
            regpage.clickemailnotif();
            Thread.sleep(2000);



}catch (Exception exception) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            //Assert.fail();
        }
        logger.debug("application logs end.......");
        logger.info("**** Email_Notifications *****");
    }
}
