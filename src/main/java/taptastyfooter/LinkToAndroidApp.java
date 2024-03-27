package taptastyfooter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class LinkToAndroidApp {

    By linkToAndroidApp = By.xpath("(//div[@class ='image-badge'])[1]//a[@href = '#'][2]");

    public WebDriver driver;
    public WebDriverWait wait;

    public LinkToAndroidApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void linkToIOSApp(){

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(driver.findElement(linkToAndroidApp)).perform();
        driver.findElement(linkToAndroidApp).click();

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        for(String window: windowHandles){

            if(!window.equals(parentWindow)){

                driver.switchTo().window(window);
                break;

            }
        }


        Assert.assertEquals(driver.getCurrentUrl(),"https://play.google.com/store/apps/details?id=com.inmobito.ristorantelavitaebellaapp");
    }
}
