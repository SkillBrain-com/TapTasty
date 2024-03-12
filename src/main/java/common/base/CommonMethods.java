package common.base;

import common.config.DriverFactory;
import common.constants.CommonConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CommonMethods {
    
    protected WebDriver driver;
    
    public CommonMethods(){
        driver = DriverFactory.driver;
        PageFactory.initElements(driver, this);
    }

    protected void click(WebElement locator){
//        Duration timeout = Duration.ofSeconds(CommonConstants.WEB_DRIVER_WAIT_DURATION);
//        WebDriverWait wait = new WebDriverWait(driver, timeout);
//        WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(locator));
        clickable(locator).click();
    }

    private WebDriverWait waitPage(){
        Duration timeout = Duration.ofSeconds(CommonConstants.WEB_DRIVER_WAIT_DURATION);
        return new WebDriverWait(driver, timeout);
    }

    private WebElement clickable(WebElement locator){
        waitPage().until(ExpectedConditions.elementToBeClickable(locator));
        return locator;
    }

    protected void addText(String input, WebElement locator){
//        Duration timeout = Duration.ofSeconds(CommonConstants.WEB_DRIVER_WAIT_DURATION);
//        WebDriverWait wait = new WebDriverWait(driver, timeout);
//        WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(locator));
        clickable(locator).sendKeys(input);
    }
}
