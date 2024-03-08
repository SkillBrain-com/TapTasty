package taptasty;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FirstProductToCart {

    By location = By.xpath("(//div[@class = 'wrapperImg'])[1]");
    By menu = By.xpath("(//div[@class = 'wrapperImg'])[6]");
    By product = By.xpath("(//span[@class = 'desc-product'])[1]");
    By title = By.xpath("(//span[@class = 'title-product'])[1]");
    By addButton = By.cssSelector("a[class = \"link text-uppercase \"]");
    By popUpWindowClose = By.xpath("//div/a[@class = 'text-uppercase link']");
    By backButton = By.xpath("(//div/div/div/div/div/a[@class = 'backButton link icon-only'])[1]");

    public WebDriver driver;
    public WebDriverWait wait;

    public FirstProductToCart(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void firsProduct() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(location));
        driver.findElement(location).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(menu)).perform();
        driver.findElement(menu).click();
        wait.until(ExpectedConditions.elementToBeClickable(product));
        driver.findElement(product).click();
        wait.until(ExpectedConditions.elementToBeClickable(addButton));
        driver.findElement(addButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(popUpWindowClose));
        driver.findElement(popUpWindowClose).click();

        Dimension newSize = new Dimension(800, 600); // Înlocuiește cu dimensiunea dorită
        driver.manage().window().setSize(newSize);

        driver.findElement(backButton).click();
        driver.manage().window().maximize();

        String titleProduct = driver.findElement(title).getText();
        Assert.assertEquals(titleProduct,"DOUBLE CHEESE CHICKEN MENU");


    }
}
