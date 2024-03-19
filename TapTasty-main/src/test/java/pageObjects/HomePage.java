package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//a[normalize-space()='Log in']")
		WebElement lnkLogin;
	public void lnkLogin() 
	{ 
		lnkLogin.click(); 
	}
	
	@FindBy(xpath="//div[@class='right']//a[@class='link'][normalize-space()='Cont']")
		WebElement lnkCont;
	public void clickCont()
	{
		lnkCont.click();
	}

}
