package taptasty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/*Add a product to favorite
Select location Orade
Select bigbox menu
Select first product
Select favorite button
*/
public class AddProductToFavorit {

    By location = By.xpath("(//img[@class = 'banner'])[1]");
    By menu = By.xpath("(//div[@class = 'item-inner']/p)[2]");
    By product = By.xpath("//span[text()=\"PUI MOZZARELLA CU SOS CLASIC ȘI PARMEZAN\"]");
    By favorite = By.cssSelector(".vertical--align--middle");
    By okButton = By.cssSelector("span.dialog-button.dialog-button-bold");


    public WebDriver driver;
    public WebDriverWait wait;

    public AddProductToFavorit(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void addToFavorite() throws InterruptedException {

        driver.findElement(location).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(menu)).perform();
        driver.findElement(menu).click();
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product));
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(product).click();

        driver.findElement(favorite).click();

        driver.findElement(okButton).click();
    }




}
