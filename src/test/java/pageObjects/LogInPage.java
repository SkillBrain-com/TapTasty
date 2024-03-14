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
    /*
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

     */
    @FindBy(xpath = "//div[@class='right']//a[@class='link'][normalize-space()='Cont']")
    WebElement contSelect;
    public void contInformation(){
        contSelect.click();
    }

    @FindBy(xpath = "//a[@href='/personal-information/']//div[@class='item-content']//div[@class='item-inner']")
    WebElement personalInformationSelect;
    public void personalinformation (){
        personalInformationSelect.click();

    }

    @FindBy(xpath = "//input[@class='input-with-value input-focused']")
    WebElement numeSelect;
    public void modificareNume (String nume){
        numeSelect.click();
        numeSelect.sendKeys(nume);
    }
}
