package taptastytestmenu;

import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastymenu.CheckThePriceBeforeOrder;
import utils.BasePage;

//Verify if the price is the same before and after you added to cart
//(ex pizza -> first product,select dimensiune and added 2 extra options)

public class CheckThePriceBeforeOrderTest extends BasePage {

    @Test
    public void checkThePriceBeforeOrder() throws InterruptedException {

        driver.get("https://ristorantelavitaebella.taptasty.com/");
        LoginPage loginPage = new LoginPage(driver);
        CheckThePriceBeforeOrder checkThePriceBeforeOrder = new CheckThePriceBeforeOrder(driver);

        loginPage.loginPage();
        checkThePriceBeforeOrder.checkThePriceBeforeOrder();
    }
}
