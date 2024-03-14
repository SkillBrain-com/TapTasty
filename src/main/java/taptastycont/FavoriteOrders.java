package taptastycont;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FavoriteOrders {

    By accountButton = By.xpath("(//div/a[@class='link'])[3]");
    By favoriteOrdersButton = By.xpath("(//div[@class = 'item-title'])[5]");
    By backButton = By.xpath("//i[@class= 'icon f7-icons']");

    public WebDriver driver;
    public WebDriverWait wait;

    public FavoriteOrders(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void favoriteOrders () throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(accountButton).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(favoriteOrdersButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(backButton)).click();
    }
}
