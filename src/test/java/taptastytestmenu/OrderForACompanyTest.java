package taptastytestmenu;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.LoginPage;
import taptastymenu.AddAProductToCart;
import taptastymenu.OrderForACompany;
import utils.BasePage;
import utils.DataGeneration;

//Add a product to cart , Burgher menu -> DUBLU PUI CHEESE,
//Add company details and click "Finalizeaza comanda" button and verify next page if test pass
public class OrderForACompanyTest extends BasePage {

    @Test
    public void orderForACompany() throws InterruptedException {

        logger.info("**** starting TC_OrderForACompany *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");
            DataGeneration dataGeneration = DataGeneration.getInstance();
            LoginPage loginPage = new LoginPage(driver);
            AddAProductToCart addAProductToCart = new AddAProductToCart(driver);
            OrderForACompany orderForACompany = new OrderForACompany(driver);

            logger.info("Log in");
            loginPage.loginPage();
            logger.info("Add a product to cart");
            addAProductToCart.addAProductToCart();
            logger.info("Add company details");
            orderForACompany.orderForACompany(dataGeneration.nrAddress, dataGeneration.address, dataGeneration.city, dataGeneration.county, dataGeneration.country);
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_OrderForACompany *****");
    }
}
