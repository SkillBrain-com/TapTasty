package taptastycont;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ChangePassword {

    By accountButton = By.xpath("(//div/a[@class='link'])[3]");
    By changePasswordButton = By.xpath("(//div[@class = 'item-title'])[6]");
    By newPassword = By.xpath("(//input[@type = 'password'])[1]");
    By confirmPassword = By.xpath("(//input[@type = 'password'])[2]");
    By savePasswordButton = By.xpath("//div/a[@class = 'w100 text-uppercase link']");


    public WebDriver driver;
    public WebDriverWait wait;

    public ChangePassword(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void changePassword() throws InterruptedException {
        String password = "123456";
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(accountButton).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(changePasswordButton).click();
        driver.findElement(newPassword).sendKeys(password);
        driver.findElement(confirmPassword).sendKeys(password);
        driver.findElement(savePasswordButton).click();
    }
}
