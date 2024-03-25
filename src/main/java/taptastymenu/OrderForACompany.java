package taptastymenu;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

//Add a product to cart , Burgher menu -> DUBLU PUI CHEESE,
//Add company details and click "Finalizeaza comanda" button and verify next page if test pass
public class OrderForACompany {

    By toggleButton = By.xpath("//span[@class = 'toggle-icon']");
    By companyName = By.xpath("//input[@placeholder = 'Numele companiei']");
    By companyNumber = By.xpath("//input[@placeholder = 'CUI, NR REG']");
    By companyAddress = By.xpath("//input[@placeholder = 'Adresa (stradă și număr)']");
    By companyCity = By.xpath("//input[@placeholder = 'Localitatea']");
    By companyCounty = By.xpath("//input[@placeholder = 'Județul']");
    By companyCountry = By.xpath("//input[@placeholder = 'Țara']");
    By finishOrder = By.xpath("//a[@class = 'link w100 text-uppercase btn-proceed']");
    By verifyNextPage = By.xpath("//div[@class = 'block-title']");

    public WebDriver driver;
    public WebDriverWait wait;

    public OrderForACompany(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void orderForACompany (String numberCompany, String addressCompany, String cityCompany,String countyCompany,String countryCompany){


        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(driver.findElement(toggleButton)).perform();
        driver.findElement(toggleButton).click();


        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(companyName));
        driver.findElement(companyName).sendKeys("LTD-TapTasty");
        driver.findElement(companyNumber).sendKeys(numberCompany);
        driver.findElement(companyAddress).sendKeys(addressCompany);
        driver.findElement(companyCity).sendKeys(cityCompany);
        driver.findElement(companyCounty).sendKeys(countyCompany);
        driver.findElement(companyCountry).sendKeys(countryCompany);
        driver.findElement(finishOrder).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(verifyNextPage));
        String textNextPage = driver.findElement(verifyNextPage).getText();
        Assert.assertEquals(textNextPage,"Ridicare comandă");

    }

}
