package taptastycont;

import org.apache.xmlbeans.impl.xb.substwsdl.TImport;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/*Change the name from personal data*/
public class ChangePersonalInformation {

    By accountButton = By.xpath("(//div/a[@class='link'])[3]");
    By personalInfo = By.xpath("(//div[@class='item-content'])[1]");
    By firstName = By.xpath("(//input[@type = 'text'])[1]");
    By secondName = By.xpath("(//input[@type = 'text'])[2]");
    By saveButton = By.xpath("//div/a[@class ='w100 text-uppercase link']");
    By deleteFirstName = By.xpath("(//div/span[@class =\"input-clear-button\"])[1]");
    By deleteSecondName = By.xpath("(//div/span[@class =\"input-clear-button\"])[2]");
    By deleteDateOfBirth = By.xpath("(//span[@class = 'input-clear-button'])[3]");
    By deletePhoneNumber = By.xpath("(//button/span)[2]");
    By dateOfBirth = By.xpath("//input[@type = 'date']");
    By numberPhone = By.xpath("//input[@type = 'tel']");
    By popUpWindow = By.cssSelector(".dialog-button.dialog-button-bold");




    public WebDriver driver;
    public WebDriverWait wait;

    public ChangePersonalInformation(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void changePersonalInformation(String fNume,String sName) throws InterruptedException {

        Actions actions = new Actions(driver);

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(accountButton).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(personalInfo).click();
        driver.findElement(deleteFirstName).click();
        driver.findElement(deleteSecondName).click();
        driver.findElement(firstName).sendKeys(fNume);
        driver.findElement(secondName).sendKeys(sName);
        driver.findElement(deleteDateOfBirth).click();
        driver.findElement(dateOfBirth).sendKeys("12031987");
        driver.findElement(deletePhoneNumber).click();
        driver.findElement(numberPhone).click();
        driver.findElement(numberPhone).sendKeys("0727245950");
        actions.moveToElement(driver.findElement(saveButton));
        driver.findElement(saveButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(popUpWindow));
        driver.findElement(popUpWindow).click();

    }
}
