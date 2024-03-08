package taptastytests;

import org.testng.annotations.Test;
import taptasty.FirstProductToCart;
import taptasty.LoginPage;
import utils.BasePage;

public class FirstProductToCartTest extends BasePage {
    @Test
    public void firstProductTest() throws InterruptedException {
        driver.get("https://ristorantelavitaebella.taptasty.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginPage();
        FirstProductToCart firstProductToCart = new FirstProductToCart(driver);
        firstProductToCart.firsProduct();
    }
}