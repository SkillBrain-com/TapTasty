package taptastytests;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.AddProductToFavorit;
import taptasty.LoginPage;
import utils.BasePage;

public class AddProductToFavoriteTest extends BasePage {

    @Test
    public void addProductToFavorite() throws InterruptedException {


        logger.info("**** starting TC_Add_Product_To_Favorite  *****");

        logger.debug("application logs started......");

        try{
        driver.get("https://ristorantelavitaebella.taptasty.com/");
        LoginPage loginPage = new LoginPage(driver);
        AddProductToFavorit addProductToFavorit = new AddProductToFavorit(driver);
        logger.info("Log in");
        loginPage.loginPage();
        logger.info("Add product to favorite");
        addProductToFavorit.addToFavorite();
    }catch (Exception e){

            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }
        logger.debug("application logs end.......");
        logger.info("**** finished TC_Add_Product_To_Favorite *****");
    }
}
