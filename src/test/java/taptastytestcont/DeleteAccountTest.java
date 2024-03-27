package taptastytestcont;

import org.testng.annotations.Test;
import taptastycont.DeleteAccount;
import taptastycont.LoginPageForDelete;
import utils.BasePage;

public class DeleteAccountTest extends BasePage {

    @Test
    public void deleteAccount() throws InterruptedException {

        driver.get("https://ristorantelavitaebella.taptasty.com/");



        LoginPageForDelete loginPageForDelete = new LoginPageForDelete(driver);
        DeleteAccount deleteAccount = new DeleteAccount(driver);

        loginPageForDelete.loginPageForDelete();
        deleteAccount.deleteAccount();
    }

}
