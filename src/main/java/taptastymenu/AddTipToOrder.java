package taptastymenu;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AddTipToOrder {

    By menuButton = By.xpath("(//a[@class = 'link'])[2]");
    By pizzaMenu = By.xpath("(//div[@class = 'wrapperImg'])[7]");
    By firstProduct = By.xpath("(//div[@class = 'cards-product bounceInUp'])[1]");
    By dimensionPizzaButton = By.xpath("(//div[@class= 'check'])[7]");
    By addExtra1 = By.xpath("(//div[@class= 'optionValue'])[11]");
    By addExtra2 = By.xpath("(//div[@class= 'optionValue'])[12]");
    By addToCart = By.xpath("//i[@class= 'margin-left-10 icon material-icons']");
    By checkCart = By.xpath("(//span[@class= 'cartNotification badge'])[3]");
    By addTipButton = By.xpath("//div[@class = 'promotion block']/a[2]");
    By addTipAmount = By.xpath("(//input[@class= 'dialog-input'])[1]");
    By okButton = By.xpath("//span[@class = 'dialog-button dialog-button-bold']");
    By copyAmountTip = By.xpath("(//div[@class = 'item-after'])[3]/span");

    public WebDriver driver;
    public WebDriverWait wait;

    public AddTipToOrder(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void addTipToOrder() throws InterruptedException {

        Actions actions = new Actions(driver);
        Dimension newSize = new Dimension(1200,800);

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(menuButton).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(pizzaMenu)));
        driver.findElement(pizzaMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstProduct));
        driver.findElement(firstProduct).click();


        actions.moveToElement(driver.findElement(dimensionPizzaButton)).perform();

        driver.findElement(dimensionPizzaButton).click();

        actions.moveToElement(driver.findElement(addExtra1)).perform();
        driver.findElement(addExtra1).click();

        actions.moveToElement(driver.findElement(addExtra2)).perform();
        driver.findElement(addExtra2).click();

        driver.findElement(addToCart).click();

        actions.moveToElement(driver.findElement(checkCart)).perform();
        driver.findElement(checkCart).click();

        driver.manage().window().setSize(newSize);
        actions.moveToElement(driver.findElement(addTipButton)).perform();
        driver.findElement(addTipButton).click();
        driver.manage().window().maximize();

        wait.until(ExpectedConditions.visibilityOfElementLocated(addTipAmount));
        driver.findElement(addTipAmount).sendKeys("10");

        driver.findElement(okButton).click();

        String textAmount = driver.findElement(copyAmountTip).getText();
        Assert.assertEquals(textAmount,"10.00 lei");




    }
}
