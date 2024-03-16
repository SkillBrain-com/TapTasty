package taptastycont;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ChangeLanguage {

    By accountButton = By.xpath("(//div/a[@class='link'])[3]");
    By changeLanguageButton = By.xpath("(//div[@class = 'item-title'])[8]");
    By selectLanguageButton = By.xpath("(//label[@class= 'item-radio item-content'])[2]");
    By saveButton = By.xpath("//a[@class= 'link sheet-close']");

    public WebDriver driver;
    public WebDriverWait wait;

    public ChangeLanguage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void changeLanguage() throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(accountButton).click();
        TimeUnit.SECONDS.sleep(1);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(changeLanguageButton)).perform();
        driver.findElement(changeLanguageButton).click();
        driver.findElement(selectLanguageButton).click();
        driver.findElement(saveButton).click();
    }
}
