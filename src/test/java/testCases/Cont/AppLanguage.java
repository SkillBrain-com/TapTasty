package testCases.Cont;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class AppLanguage extends BaseClass {
    @Test
    public void changesAppLanguage() {
        logger.info("**** App_Language *****");

        logger.debug("application logs started......");

        try {

            HomePage hp = new HomePage(driver);
            hp.lnkLogin();
            logger.info("Clicked on Login button");

            logger.info("Going to login page");
            LogInPage regpage = new LogInPage(driver);

            regpage.setEmail("radu.bobanga14@gmail.com");
            regpage.password("test123456");

            regpage.clickLogin();
            Thread.sleep(2000);
            regpage.clickcont();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.xpath(" //li[@class='language']//div[@class='item-inner']//div[1]"))).perform();
            regpage.clickapplanguage();
            Thread.sleep(2000);
            regpage.clickromanian();
            Thread.sleep(2000);
            regpage.clicksavelanguage();
            Thread.sleep(2000);

        } catch (Exception exception) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }
        logger.debug("application logs end.......");
        logger.info("**** App_Language *****");
    }
}
