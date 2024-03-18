package taptastymenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CompleteTheOrder {

    By completeOrder = By.xpath("(//div[@class = 'toolbar-inner'])[2]");
    By continueButton = By.xpath("//i[@class = 'continueArrow icon f7-icons']");
    By payCashButton = By.xpath("//div[text() = 'Plătește numerar']");
    By finaliseTheOrder = By.xpath("//a[@class = 'a w100 text-uppercase payment-button link']");
    By verify = By.xpath("//div[text() = 'MULȚUMIM!']");

    public WebDriver driver;
    public WebDriverWait wait;

    public CompleteTheOrder(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void completeTheOrder() throws InterruptedException{

        Actions actions = new Actions(driver);

        driver.findElement(completeOrder).click();
        actions.moveToElement(driver.findElement(continueButton)).perform();
        driver.findElement(continueButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(payCashButton));
        driver.findElement(payCashButton).click();
        driver.findElement(finaliseTheOrder).click();
        String verifyText = driver.findElement(verify).getText();
        Assert.assertEquals(verifyText,"MULȚUMIM!");

    }
}
