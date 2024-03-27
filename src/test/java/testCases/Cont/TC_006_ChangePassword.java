package testCases.Cont;

import  org.testng.annotations.Test;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class TC_006_ChangePassword extends BaseClass {
    @Test
    public void changepassword(){
        logger.info(" starting  TC_006_ChangePassword*");
        logger.debug("application logs started......");
        try {
            HomePage hp = new HomePage(driver);
            hp.lnkLogin();
            logger.info("Clicked on Login button");

            logger.info("Going to login page");
            LogInPage regpage = new LogInPage(driver);

            regpage.setEmail("abistriceanu32@gmail.com");
            regpage.password("Acasa1234");

            regpage.clickLogin();
            Thread.sleep(2000);
            regpage.contInformation();
            regpage.SetChangePassword();
            regpage.SetClickChangePassword1();
            regpage.SetClickPassword2();
            regpage.SetSeePassword();
            regpage.SetConfirmNewPassword();













        }
        catch(Exception e)
        {
            logger.error("test failed..");
            logger.debug("debug logs....");
            //    Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info(" finished TC_006_ChangePassword *");


    }








}