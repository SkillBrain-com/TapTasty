package testCases.Cont;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class TC_01_Logout extends BaseClass {

    @Test
    public void logout ()
    {
        logger.info("**** starting TC_02_Logout ****");
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

            hp.clickCont();
            Thread.sleep(2000);

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(6000);

            WebElement discconect = driver.findElement(By.xpath("//a[normalize-space()='Deconectare']"));

        }

        catch (Exception e){

            logger.error("test failed...");
            logger.debug("debug logs....");
            Assert.fail();
        }
        logger.debug("Application logs end.......");
        logger.info("**** finished TC_02_Logout ****");

    }

}
