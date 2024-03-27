package taptastycont;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DeleteAccount {

    By accountButton = By.xpath("(//div/a[@class='link'])[3]");
    By deleteButton = By.xpath("(//div[@class= 'item-title'])[14]");
    By okButton = By.xpath("//span[@class = 'dialog-button dialog-button-bold']");
    By confirmationDeleted = By.xpath("//div[@class = 'dialog-text']");

    public WebDriver driver;
    public WebDriverWait wait;

    public DeleteAccount(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void deleteAccount() throws InterruptedException {

        Actions actions = new Actions(driver);

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(accountButton).click();
        TimeUnit.SECONDS.sleep(1);
        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(driver.findElement(deleteButton)).perform();
        driver.findElement(deleteButton).click();
        driver.findElement(okButton).click();

        TimeUnit.MILLISECONDS.sleep(500);
        String textConfirm = driver.findElement(confirmationDeleted).getText();
        Assert.assertEquals(textConfirm,"Ne pare rău să vedem că părăsiți comunitatea noastră. Solicitarea dumneavoastră a fost salvată. Vă rugăm să ne permiteți 72 de ore să o procesăm complet. Vom reveni cu un mesaj, la adresa dumneavoastră de e-mail.");



    }
}
