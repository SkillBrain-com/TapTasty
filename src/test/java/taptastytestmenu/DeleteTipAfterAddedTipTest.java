package taptastytestmenu;


import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastymenu.AddTipToOrder;
import taptastymenu.DeleteTipAfterAddedTip;
import utils.BasePage;

/*Add a product to cart , from pizza menu, select first product ,
choose the sezi of pizza, and added 2 extra option, added to cart , click "Bacsis" button ,
add tip amount (ex 10), and check if the tip entered is the same as the one we see before placing the order
delete the tip and verify the tip button change from "Anuleaza bacsis" to "Lasa Bacsis"*/
public class DeleteTipAfterAddedTipTest extends BasePage {

    @Test
    public void deleteTipOrder() throws InterruptedException {


        logger.info("**** starting TC_DeleteTipAfterAddedTip  *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");
            LoginPage loginPage = new LoginPage(driver);
            AddTipToOrder addTipToOrder = new AddTipToOrder(driver);
            DeleteTipAfterAddedTip deleteTipAfterAddedTip = new DeleteTipAfterAddedTip(driver);

            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Add a tip to order");
            addTipToOrder.addTipToOrder();
            logger.info("Delete the tip");
            deleteTipAfterAddedTip.deleteTip();

        }catch (Exception e){
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }
        logger.debug("application logs end.......");
        logger.info("**** finished TC_DeleteTipAfterAddedTip *****");

    }
}
