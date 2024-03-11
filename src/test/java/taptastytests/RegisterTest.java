package taptastytests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import taptasty.RegisterPage;
import utils.BasePage;
import utils.DataGeneration;

//Register a new user by email

public class RegisterTest extends BasePage {

    @Test
    public void registerTest() {

        logger.info("**** starting TC_RegisterByEmail  *****");

        logger.debug("application logs started......");

        try {
            logger.info("Log in");
            driver.get("https://ristorantelavitaebella.taptasty.com/");
            DataGeneration dataGeneration = DataGeneration.getInstance();
            String passwordSaved = dataGeneration.passwordLogin;
            logger.info("Clicked on Register by email");
            RegisterPage registerPage = new RegisterPage(driver);
            registerPage.register(dataGeneration.email, passwordSaved, passwordSaved);

        }catch(Exception e)
            {
                logger.error("test failed..");
                logger.debug("debug logs....");
                Assert.fail();
            }

            logger.debug("application logs end.......");
            logger.info("**** finished TC_RegisterByEmail *****");
        }
    }

