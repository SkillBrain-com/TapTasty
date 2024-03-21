package taptastymenu;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AddMoreProductsToCartAndDeleteAll {


    By menuButton = By.xpath("(//a[@class = 'link'])[2]");
    By burgherMenu = By.xpath("(//div[@class = 'wrapperImg'])[5]");
    By product1 = By.xpath("(//div[@class = 'cards-product bounceInUp'])[1]");
    By bigBoxMenu = By.xpath("(//div[@class = 'wrapperTitle'])[1]");
    By firstProductBox = By.xpath("(//span[@class = 'title-product'])[1]");
    By rollzMenu = By.xpath("(//div[@class = 'wrapperTitle'])[2]");
    By firstProductRollz = By.xpath("(//span[@class = 'desc-product'])[7]");
    By addToCartButton = By.xpath("//i[@class = 'margin-left-10 icon material-icons']");
    By noMoreProductsButton = By.xpath("//div[@class = 'toolbar-inner']//a[@class = 'text-uppercase link']");
    By backButton = By.xpath("(//a[@class = 'backButton link icon-only'])[1]");
    By checkCartButton = By.xpath("//i/span[@class = 'cartNotification badge']");
    By deleteAllTheProducts = By.xpath("//a[@class = 'button']//span");
    By okButton = By.xpath("//span[@class = 'dialog-button dialog-button-bold']");
    By checkEmptyIsEmpty = By.xpath("//div[@class = 'item-inner']//div");


    public WebDriver driver;
    public WebDriverWait wait;

    public AddMoreProductsToCartAndDeleteAll(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void addMoreProductsToCartAndDeleteAll() throws InterruptedException {

        Dimension newSize = new Dimension(800,600);

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(menuButton).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(burgherMenu)));
        driver.findElement(burgherMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(product1));
        driver.findElement(product1).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        driver.findElement(addToCartButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(noMoreProductsButton));
        driver.findElement(noMoreProductsButton).click();
        driver.manage().window().setSize(newSize);
        driver.findElement(backButton).click();
        driver.manage().window().maximize();



        wait.until(ExpectedConditions.visibilityOf(driver.findElement(bigBoxMenu)));
        driver.findElement(bigBoxMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductBox));
        driver.findElement(firstProductBox).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        driver.findElement(addToCartButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(noMoreProductsButton));
        driver.findElement(noMoreProductsButton).click();
        driver.manage().window().setSize(newSize);
        driver.findElement(backButton).click();
        driver.manage().window().maximize();



        wait.until(ExpectedConditions.visibilityOf(driver.findElement(rollzMenu)));
        driver.findElement(rollzMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductRollz));
        driver.findElement(firstProductRollz).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        driver.findElement(addToCartButton).click();
        driver.findElement(checkCartButton).click();
        driver.findElement(deleteAllTheProducts).click();
        wait.until(ExpectedConditions.elementToBeClickable(okButton));
        driver.findElement(okButton).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(checkEmptyIsEmpty));
        String textCart = driver.findElement(checkEmptyIsEmpty).getText();

        Assert.assertEquals(textCart,"Coșul este gol!");

    }


}
