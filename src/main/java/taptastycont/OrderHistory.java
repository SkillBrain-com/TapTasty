package taptastycont;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OrderHistory {

    By accountButton = By.xpath("(//div/a[@class='link'])[3]");
    By historyOrderButton = By.xpath("(//div[@class = 'item-title'])[3]");
    By firstFavoriteOrder = By.xpath("(//p[@class = 'shoppingCartId'])[1]");
    By backButton = By.xpath("//i[@class= 'icon f7-icons']");

    public WebDriver driver;
    public WebDriverWait wait;

    public OrderHistory(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void orderHistory() throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(accountButton).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(historyOrderButton).click();
        String textOrder = driver.findElement(firstFavoriteOrder).getText();
        Assert.assertEquals(textOrder,"Comanda #xP1795575reu");
        wait.until(ExpectedConditions.elementToBeClickable(backButton));
        driver.findElement(backButton).click();
    }
}
