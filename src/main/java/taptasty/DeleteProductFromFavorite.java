package taptasty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import java.util.concurrent.TimeUnit;
/*Delete item from Favorite
Click delete button
Check if the Favorite is empty */
public class DeleteProductFromFavorite {

    By deleteButton = By.cssSelector(".button");
    By confirmDeleted = By.xpath("//div[text() = 'Nu există produse favorite!' ]");
    public WebDriver driver;
    public WebDriverWait wait;

    public DeleteProductFromFavorite(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void deleteProductFromFavorite() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
        driver.findElement(deleteButton).click();
        String text = driver.findElement(confirmDeleted).getText();
        Assert.assertEquals(text,"Nu există produse favorite!");
    }
}
