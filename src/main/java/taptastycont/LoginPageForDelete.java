package taptastycont;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageForDelete {

    By login = By.xpath("(//a[@class = 'link center'])[1]");
    By email = By.cssSelector("input[type=\"email\"]");
    By password = By.cssSelector("input[type=\"password\"]");
    By enterLogin = By.cssSelector("a.loginBtn");

    public WebDriver driver;
    public WebDriverWait wait;

    public LoginPageForDelete(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void loginPageForDelete(){

        driver.findElement(login).click();
        wait.until(ExpectedConditions.elementToBeClickable(email));
        driver.findElement(email).sendKeys("anamaria@mailinator.com");
        driver.findElement(password).sendKeys("123456");
        driver.findElement(enterLogin).click();

    }
}
