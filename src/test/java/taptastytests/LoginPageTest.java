package taptastytests;

import org.testng.annotations.Test;
import taptasty.LoginPage;
import utils.BasePage;
import utils.DataGeneration;

public class LoginPageTest extends BasePage {

    @Test
    public void loginPage(){
        driver.get("https://ristorantelavitaebella.taptasty.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginPage();

    }
}
