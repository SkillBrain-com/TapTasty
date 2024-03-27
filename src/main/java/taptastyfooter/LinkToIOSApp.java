package taptastyfooter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class LinkToIOSApp {

    By linkIOSApp = By.xpath("(//div[@class ='image-badge'])[1]//a[@href = '#'][1]");

    public WebDriver driver;
    public WebDriverWait wait;

    public LinkToIOSApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void linkToIOSApp(){

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(driver.findElement(linkIOSApp)).perform();
        driver.findElement(linkIOSApp).click();

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        for(String window: windowHandles){

            if(!window.equals(parentWindow)){

                driver.switchTo().window(window);
                break;

            }
        }


        Assert.assertEquals(driver.getCurrentUrl(),"https://apps.apple.com/ro/app/ristorante-la-vita-%C3%A8-bella/id1555954228?l=ro");
    }
}
