package testCases.Orders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class TC_001_OrderClassicRoll extends BaseClass {
    @Test
    public void verifyPromotions(){
        logger.info("**** starting TC_001_OrderClassicRoll *****");
        logger.debug("application logs started......");
        try {
            HomePage hp = new HomePage(driver);
            hp.lnkLogin();
            logger.info("Clicked on Login button");

            logger.info("Going to login page");
            LogInPage regpage = new LogInPage(driver);

            regpage.setEmail("andreea.oananastac8@gmail.com");
            regpage.password("Chavi2727an");

            regpage.clickLogin();
            Thread.sleep(2000);

            regpage.contInformation();
            regpage.clickmenu();
            regpage.setClickRollz();
            regpage.setClickClassicRollz();
            regpage.setSaveCart();
            regpage.setSomethingToDrink();
            regpage.setAddOneMoreRollz();
            Thread.sleep(2000);
            regpage.setFinishOrder();
            Thread.sleep(2000);
            WebElement iframe = driver.findElement(By.tagName("iframe"));
            new Actions(driver)
                    .scrollToElement(iframe)
                    .perform();
            regpage.setContinueButton();
            regpage.setPayCash();
            regpage.setLastStepForFinishOrder();




        }
        catch(Exception e)
        {
            logger.error("test failed..");
            logger.debug("debug logs....");
            //	Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_001_OrderClassicRoll *****");

    }
}
