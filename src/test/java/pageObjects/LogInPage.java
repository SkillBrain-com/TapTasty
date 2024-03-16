package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[@placeholder='Email']")
    WebElement setEmail;
    public void setEmail(String email) {
      setEmail.sendKeys(email);
    }

    @FindBy(xpath="//a[@class='loginBtn link']")
    WebElement Login;
    public void clickLogin() {
        Login.click();
    }
   
    @FindBy(xpath="//input[@placeholder='Parolă']")
    WebElement txtPassword;
    public void password(String pass) {
        txtPassword.sendKeys(pass);
    }
    @FindBy(xpath="//div[@class='right']//div//a[@class='link'][normalize-space()='Meniu']")
    WebElement menu;
    public void clickmenu() {
        menu.click();
    }

    @FindBy(xpath="//li[5]//div[1]//div[1]//div[1]//img[1]")
    WebElement gustari;
    public void aleggustari() {
        gustari.click();
    }

    @FindBy(xpath="//span[contains(text(),'Cartofi prăjiți cu crustă crocantă - 170 gr')]")
    WebElement cartofiselect;
    public void cartofi() {
        cartofiselect.click();
    }
    @FindBy(xpath = "//div[@Class='right']//a[@Class='link'][normalize-space()='Cont']")
    WebElement contSelect;

    public void contInformation() {
        contSelect.click();
    }

    @FindBy(xpath = "//div[contains(text(),'Informații personale')]")
    WebElement personalInformationSelect;

    public void personalinformation() {
        personalInformationSelect.click();

    }

    @FindBy(xpath = "//*[@id=\"validateInfo\"]/ul/li[1]/div/div/li/div/div/div[2]/input")
    WebElement numeSelect;

    public void modificareNume(String nume) {
        numeSelect.click();
        numeSelect.sendKeys(nume);
    }
    @FindBy(xpath = "//a[contains(text(),'Salvează modificările')]")
    WebElement salveazaNume;

    public void salvare() {
        salveazaNume.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[2]/a/div/div[2]")
    WebElement myAddress;
    public void setMyAddress(){
        myAddress.click();
    }
}
