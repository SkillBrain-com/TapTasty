package taptastyfooter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ContactSection {

    By contactButton = By.xpath("(//div[@class = 'item-title'])[8]");
    By verifyByEmail = By.xpath("(//span[@style = 'font-size: 13.3333px; white-space: pre-wrap;'])[7]");

    public WebDriver driver;
    public WebDriverWait wait;

    public ContactSection(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void contactSection(){

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(driver.findElement(contactButton)).perform();
        driver.findElement(contactButton).click();

        String textByEmail = driver.findElement(verifyByEmail).getText();
        Assert.assertEquals(textByEmail,"info+22@11digits.com");


    }
}
