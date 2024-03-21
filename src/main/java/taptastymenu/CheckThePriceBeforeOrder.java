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

public class CheckThePriceBeforeOrder {

    By menuButton = By.xpath("(//a[@class = 'link'])[2]");
    By pizzaMenu = By.xpath("(//div[@class = 'wrapperImg'])[7]");
    By firstProduct = By.xpath("(//div[@class = 'cards-product bounceInUp'])[1]");
    By dimensionPizzaButton = By.xpath("(//div[@class= 'check'])[7]");
    By addExtra1 = By.xpath("(//div[@class= 'optionValue'])[11]");
    By addExtra2 = By.xpath("(//div[@class= 'optionValue'])[12]");
    By addToCart = By.xpath("//i[@class= 'margin-left-10 icon material-icons']");
    By checkCart = By.xpath("(//span[@class= 'cartNotification badge'])[3]");
    By checkPrice = By.xpath("//div[@class = 'price col-60']/span");
    By checkPriceFromCart = By.xpath("(//div[@class = 'item-after'])[2]//span");

    public WebDriver driver;
    public WebDriverWait wait;

    public CheckThePriceBeforeOrder(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void checkThePriceBeforeOrder() throws InterruptedException {

        Actions actions = new Actions(driver);

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

        String textBeforeCart = driver.findElement(checkPrice).getText();
        String cutText = textBeforeCart.substring(7);    /*aici am facut un split cu substring ca textul care il copia
                                                                    era "Total: 34.00 lei" inainte sa adaug in cart
                                                                    si din cart cand copiezi textul
                                                                    ai doar valorea 34.00 lei si ca sa fie egale cand fac cu Assert
                                                                    am inceput de la indexul 7 sa taie "Total: " sa ramana 34.00 lei*/

        driver.findElement(addToCart).click();

        actions.moveToElement(driver.findElement(checkCart)).perform();
        driver.findElement(checkCart).click();

        String textAfterCart = driver.findElement(checkPriceFromCart).getText();
        Assert.assertEquals(cutText,textAfterCart);


    }
}
