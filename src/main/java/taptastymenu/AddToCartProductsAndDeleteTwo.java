package taptastymenu;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddToCartProductsAndDeleteTwo {

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
    By deleteFirstProduct = By.xpath("(//a[@class = 'delete button'])[1]//span");
    By deleteSecondProduct = By.xpath("(//a[@class = 'delete button'])[2]//span");
    By okButton = By.xpath("//span[@class = 'dialog-button dialog-button-bold']");
    By userList = By.xpath("//div[@class = 'ueserCart list']");
    By productsOnCart = By.xpath("//div[@class = 'item-media']");


    public WebDriver driver;
    public WebDriverWait wait;

    public AddToCartProductsAndDeleteTwo(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void addProductsToCartAndDeleteTwo() throws InterruptedException {

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

        TimeUnit.SECONDS.sleep(1);
        driver.findElement(bigBoxMenu).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(firstProductBox).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(rollzMenu)));
        driver.findElement(rollzMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductRollz));
        driver.findElement(firstProductRollz).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        driver.findElement(addToCartButton).click();
        driver.findElement(checkCartButton).click();

        driver.findElement(deleteFirstProduct).click();
        wait.until(ExpectedConditions.elementToBeClickable(okButton));
        driver.findElement(okButton).click();

        wait.until(ExpectedConditions.elementToBeClickable(deleteSecondProduct));
        driver.findElement(deleteSecondProduct).click();
        wait.until(ExpectedConditions.elementToBeClickable(okButton));
        driver.findElement(okButton).click();

        TimeUnit.SECONDS.sleep(1);
        List<WebElement> listProducts = driver.findElements(userList);
        WebElement list = listProducts.get(0);

        List<WebElement> sizeList = list.findElements(productsOnCart);
        System.out.println("Size of the list is = " + sizeList.size());

        Assert.assertEquals(sizeList.size(),1);

    }
}
