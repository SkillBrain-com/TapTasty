package taptastytests;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptastymenu.AddProductToFavorit;
import taptasty.DeleteProductFromFavorite;
import taptasty.LoginPage;
import utils.BasePage;

public class DeleteProductFromFavoriteTest extends BasePage {
    @Test
    public void deleteProductFromFavorite() throws InterruptedException {


        logger.info("**** starting TC_Delete_Product_From_Favorite  *****");

        logger.debug("application logs started......");

        try{
        driver.get("https://ristorantelavitaebella.taptasty.com/");
        LoginPage loginPage = new LoginPage(driver);
        AddProductToFavorit addProductToFavorit = new AddProductToFavorit(driver);
        DeleteProductFromFavorite deleteProductFromFavorite = new DeleteProductFromFavorite(driver);

        loginPage.loginPage();
        addProductToFavorit.addToFavorite();
        deleteProductFromFavorite.deleteProductFromFavorite();
        }catch (Exception e){
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }
        logger.debug("application logs end.......");
        logger.info("**** finished TC_Delete_Product_From_Favorite *****");

    }
}
