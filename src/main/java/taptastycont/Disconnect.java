package taptastycont;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Disconnect {
    By accountButton = By.xpath("(//div/a[@class='link'])[3]");
    By disconnectButton = By.xpath("//img[@alt='Logout']");

    public WebDriver driver;
    public WebDriverWait wait;

    public Disconnect(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void disconnect () throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(accountButton).click();
        TimeUnit.SECONDS.sleep(1);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(disconnectButton)).perform();
        driver.findElement(disconnectButton).click();
    }
}
