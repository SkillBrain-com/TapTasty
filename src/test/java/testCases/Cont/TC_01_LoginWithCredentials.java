package testCases.Cont;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

//https://www.notion.so/skillbrain/Positive-TC-Login-with-credentials-2a8103c42b65426bbf6d4eba0770f1fb?pvs=4
public class TC_01_LoginWithCredentials extends BaseClass {

    @Test
    public void loginwithcredentials ()
    {
        logger.info("**** starting TC_01_LoginWithCredentials **** ") ;

        logger.debug("application logs started.....");

        try {
            HomePage hp = new HomePage(driver);
            hp.lnkLogin();

            logger.info("Clicked on Login button");
            logger.info("Going to login page");

            LogInPage regpage = new LogInPage(driver);

            regpage.setEmail("dante99@mailinator.com");
            regpage.password("123456");

            regpage.clickLogin();
            Thread.sleep(2000);

        }

        catch (Exception e)
        {
            logger.error("test failed...");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("Application logs end.......");
        logger.info("**** finished TC_01_LoginWithCredentials ****");


    }











}
