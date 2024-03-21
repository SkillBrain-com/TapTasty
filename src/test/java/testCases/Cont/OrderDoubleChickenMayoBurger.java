package testCases.Cont;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class OrderDoubleChickenMayoBurger extends BaseClass {
    @Test
    public void changesOrderHistory() {
        logger.info("**** Order_Double_Chicken_Mayo_Burger *****");

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
            regpage.clickmenu();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.xpath("//li[5]//div[1]//div[1]//div[1]//img[1]"))).perform();
            regpage.clickburgerz();
            Thread.sleep(2000);
            regpage.clickdoublechickenmayomenu();
            Thread.sleep(2000);
            actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.xpath("//input[@id='114884']"))).perform();
            regpage.checkpepsi();
            Thread.sleep(2000);
            actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.xpath("//input[@id='114889']"))).perform();
            regpage.checksosderosiidulce();
            Thread.sleep(2000);
            regpage.clickaddchart();
            Thread.sleep(2000);


} catch (Exception exception) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }
        logger.debug("application logs end.......");
        logger.info("**** Order_Double_Chicken_Mayo_Burger *****");
    }
}
