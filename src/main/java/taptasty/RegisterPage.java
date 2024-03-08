package taptasty;
import org.apache.xmlbeans.impl.xb.substwsdl.TImport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RegisterPage {

    By loginButton = By.xpath("(//a[@class = 'link center'])[1]");
    By registerButton = By.xpath("//div[@class = 'registerButton']//a[@class ='link']");
    By emailUser = By.cssSelector("input[type=\"email\"]");
    By passwordUser = By.xpath("(//input[@type = \"password\"])[1]");
    By passwordConfirmUser = By.xpath("(//input[@type = \"password\"])[2]");
    By termenConditiiButton = By.xpath("(//label/i[@class=\"icon icon-checkbox\"])[1]");
    By createAccountButton = By.xpath("//div[@class='toolbar-inner']/a[@class='checkbox w100 text-uppercase button']");
    By okButton = By.cssSelector(".dialog-button.dialog-button-bold");



    public WebDriver driver;
    public WebDriverWait wait;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void register(String email,String password,String passwordConfirm) {

        driver.findElement(loginButton).click();

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(registerButton)).perform();
        driver.findElement(registerButton).click();

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(emailUser)));

        driver.findElement(emailUser).sendKeys(email);
        driver.findElement(passwordUser).sendKeys(password);
        driver.findElement(passwordConfirmUser).sendKeys(passwordConfirm);
        driver.findElement(termenConditiiButton).click();
        driver.findElement(createAccountButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(okButton));
        driver.findElement(okButton).click();

    }


}
