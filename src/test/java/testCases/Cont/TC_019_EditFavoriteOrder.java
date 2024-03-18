package testCases.Cont;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class TC_019_EditFavoriteOrder extends BaseClass {
    @Test
    public void editFavoriteOrder(){
        logger.info("**** starting TC_019_EditFavoriteOrder *****");
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
            regpage.setClickFavoriteOrder();
            regpage.setExpandFirstOrder();
            regpage.setAddInCart();
            regpage.setPopUpMessageFavOrder();
            regpage.setSecondPopUpMessage();

        }
        catch(Exception e)
        {
            logger.error("test failed..");
            logger.debug("debug logs....");
            //	Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_019_EditFavoriteOrder *****");

    }
}
