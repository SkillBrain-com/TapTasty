package testBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j
public class BaseClass {

	public WebDriver driver;
	public Logger logger;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup()
	{
		logger=LogManager.getLogger(this.getClass());//Log4j

		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ristorantelavitaebella.taptasty.com/");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
