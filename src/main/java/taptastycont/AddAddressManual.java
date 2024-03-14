package taptastycont;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/*Add manual test*/
public class AddAddressManual {

    By accountButton = By.xpath("(//div/a[@class='link'])[3]");
    By myAddress = By.xpath("(//div[@class = 'item-title'])[2]");
    By addAddressManual = By.xpath("(//a[@class = 'w100 text-uppercase addNewAddress link'])[1]");
    By addressOfficeHome = By.xpath("(//input[@type='text'])[1]");
    By address = By.xpath("(//input[@type='text'])[2]");
    By numberHouse = By.xpath("(//input[@type='text'])[3]");
    By city = By.xpath("(//input[@type='text'])[5]");
    By county = By.xpath("(//input[@type='text'])[6]");
    By saveButton = By.xpath("//a[@class = 'w100 text-uppercase link']");



    public WebDriver driver;
    public WebDriverWait wait;

    public AddAddressManual(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void addressManual(String addressParameter,String number,String cityParameter,String countyParameter) throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(accountButton).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(myAddress).click();
        driver.findElement(addAddressManual).click();
        driver.findElement(addressOfficeHome).sendKeys("Home");
        driver.findElement(address).sendKeys(addressParameter);
        driver.findElement(numberHouse).sendKeys(number);
        driver.findElement(city).sendKeys(cityParameter);
        driver.findElement(county).sendKeys(countyParameter);
        driver.findElement(saveButton).click();
    }
}
