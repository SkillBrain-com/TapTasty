package taptastytestcont;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptastycont.DeleteAccount;
import taptastycont.LoginPageForDelete;
import utils.BasePage;

//Delete account, the account was deleted, probably after 72h the test will failed
//because the email will not be anymore avaible , change de email from DeleteAccount from
//taptastycont package from main

public class DeleteAccountTest extends BasePage {

    @Test
    public void deleteAccount() throws InterruptedException {

        logger.info("**** starting TC_DeleteAccount *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");


            LoginPageForDelete loginPageForDelete = new LoginPageForDelete(driver);
            DeleteAccount deleteAccount = new DeleteAccount(driver);

            logger.info("Log in");
            loginPageForDelete.loginPageForDelete();
            logger.info("Delete account");
            deleteAccount.deleteAccount();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_DeleteAccount *****");
    }

}
