package taptastymenu;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AddMoreInformationToOrder {

    By menuButton = By.xpath("(//a[@class = 'link'])[2]");
    By pizzaMenu = By.xpath("(//div[@class = 'wrapperImg'])[7]");
    By firstProduct = By.xpath("(//div[@class = 'cards-product bounceInUp'])[1]");
    By dimensionPizzaButton = By.xpath("(//div[@class= 'check'])[7]");
    By addExtra1 = By.xpath("(//div[@class= 'optionValue'])[11]");
    By addExtra2 = By.xpath("(//div[@class= 'optionValue'])[12]");
    By addToCart = By.xpath("//i[@class= 'margin-left-10 icon material-icons']");
    By checkCart = By.xpath("(//span[@class= 'cartNotification badge'])[3]");
    By addInformatioButton = By.cssSelector(".f-s-14.text-center");
    By addInfoSection = By.cssSelector("div.accordion-item-content>textarea");
    By okButton = By.xpath("//a[@class = 'link w100 text-uppercase btn-proceed']");
    By continueButton = By.xpath("//i[@class = 'continueArrow icon f7-icons']");
    By payCashButton = By.xpath("//div[text() = 'Plătește numerar']");
    By finaliseTheOrder = By.xpath("//a[@class = 'a w100 text-uppercase payment-button link']");
    By verify = By.xpath("//div[text() = 'MULȚUMIM!']");

    public WebDriver driver;
    public WebDriverWait wait;

    public AddMoreInformationToOrder(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void addMoreInformationToOrder() throws InterruptedException {

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
        actions.moveToElement(driver.findElement(addInformatioButton)).perform();
        driver.findElement(addInformatioButton).click();
        driver.findElement(addInfoSection).sendKeys("No mayo");
        driver.manage().window().maximize();

        driver.findElement(okButton).click();

        actions.moveToElement(driver.findElement(continueButton)).perform();
        driver.findElement(continueButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(payCashButton));
        driver.findElement(payCashButton).click();
        driver.findElement(finaliseTheOrder).click();
        String verifyText = driver.findElement(verify).getText();
        Assert.assertEquals(verifyText,"MULȚUMIM!");





    }
}
