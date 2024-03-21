package testCases.Cont;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class PersonalInformation extends BaseClass {
   @Test
    public void changesInfo(){
        logger.info("**** Personal_Information *****");

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
            regpage.clickinfopers();
            Thread.sleep(2000);
            regpage.clickmasculin();
            Thread.sleep(2000);
            regpage.entersurname();
            Thread.sleep(2000);
            regpage.entername();
            Thread.sleep(2000);
            regpage.enterdatebirth();
            Thread.sleep(2000);
            regpage.clicksaveinfobtn();
            Thread.sleep(2000);

       } catch (Exception exception){
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }
       logger.debug("application logs end.......");
       logger.info("**** Personal_Information *****");
    }

}
