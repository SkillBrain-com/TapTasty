package taptastymenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class AddAProductToCart {

    By menuButton = By.xpath("(//a[@class = 'link'])[2]");
    By burgherMenu = By.xpath("(//div[@class = 'wrapperImg'])[5]");
    By product1 = By.xpath("(//div[@class = 'cards-product bounceInUp'])[1]");
    By addToCartButton = By.xpath("//i[@class = 'margin-left-10 icon material-icons']");
    By checkCartButton = By.xpath("//i/span[@class = 'cartNotification badge']");
    By productName = By.xpath("//p[@class = 'nameProduct']");

    public WebDriver driver;
    public WebDriverWait wait;

    public AddAProductToCart(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void addAProductToCart() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(menuButton).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(burgherMenu)));
        driver.findElement(burgherMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(product1));
        driver.findElement(product1).click();
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();
        driver.findElement(checkCartButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
        String textProduct = driver.findElement(productName).getText();
        Assert.assertEquals(textProduct,"DOUBLE CHEESE CHICKEN MENU");

    }
}
