package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class TC_001_CheckFavorite extends BaseClass {

	@Test
	public void verify_cart() {
		logger.info("**** starting TC_001_CheckFavorite  *****");

		logger.debug("application logs started......");

		try {
			HomePage hp = new HomePage(driver);
			hp.lnkLogin();
			logger.info("Clicked on Login button");

			logger.info("Going to login page");
			LogInPage regpage = new LogInPage(driver);

			regpage.setEmail("mircea.dragomir93+5@gmail.com");
			regpage.password("testare");

			regpage.clickLogin();
			Thread.sleep(2000);

			regpage.clickmenu();
			Thread.sleep(6000);
			regpage.aleggustari();
			Thread.sleep(6000);
			regpage.cartofi();
			Thread.sleep(6000);

		}
		catch(Exception e)
		{
			logger.error("test failed..");
			logger.debug("debug logs....");
			Assert.fail();
		}

		logger.debug("application logs end.......");
		logger.info("**** finished TC_001_CheckFavorite *****");
	}
}








