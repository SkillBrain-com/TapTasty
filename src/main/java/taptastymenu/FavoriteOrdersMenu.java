package taptastymenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FavoriteOrdersMenu {

    By menuButton = By.xpath("(//a[@class = 'link'])[2]");
    By favoriteOrdersButton = By.xpath("(//div[@class = 'item-title'])[1]");
    By orderNumber = By.xpath("//div[@class = 'item-header']");


    public WebDriver driver;
    public WebDriverWait wait;

    public FavoriteOrdersMenu(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void favoriteOrdersMenu() throws InterruptedException {


        TimeUnit.SECONDS.sleep(2);
        driver.findElement(menuButton).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(favoriteOrdersButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(orderNumber));
        String textOrderNumber = driver.findElement(orderNumber).getText();
        System.out.println(textOrderNumber);
        Assert.assertEquals(textOrderNumber,"Comanda #011613541o2H");

    }
}
