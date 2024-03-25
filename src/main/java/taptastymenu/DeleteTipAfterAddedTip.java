package taptastymenu;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DeleteTipAfterAddedTip {

    By deleteTipButton = By.xpath("//a[@class = 'margin--0--top10 button']");
    By tipButton = By.xpath("//a[@class = 'margin--0--top10 button']");

    public WebDriver driver;
    public WebDriverWait wait;

    public DeleteTipAfterAddedTip(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void deleteTip(){
        Dimension newSize = new Dimension(1200,800);
        driver.manage().window().setSize(newSize);
        driver.findElement(deleteTipButton).click();
        driver.manage().window().maximize();
        String textTipButton = driver.findElement(tipButton).getText();
        Assert.assertEquals(textTipButton,"Lasă bacșiș");
    }
}
