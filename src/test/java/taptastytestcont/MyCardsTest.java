package taptastytestcont;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastycont.MyCards;
import utils.BasePage;

public class MyCardsTest extends BasePage {

    @Test
    public void myCards() throws InterruptedException {

        logger.info("**** starting TC_MyCards  *****");

        logger.debug("application logs started......");

        try{
        driver.get("https://ristorantelavitaebella.taptasty.com/");
        LoginPage loginPage = new LoginPage(driver);
        MyCards myCards = new MyCards(driver);

        logger.info("Log in");
        loginPage.loginPage();
        logger.info("Check my cards");
        myCards.myCards();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_MyCars *****");
    }

}
