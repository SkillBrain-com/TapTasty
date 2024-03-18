package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement setEmail;

    public void setEmail(String email) {
        setEmail.sendKeys(email);
    }

    @FindBy(xpath = "//a[@class='loginBtn link']")
    WebElement Login;

    public void clickLogin() {
        Login.click();
    }

    @FindBy(xpath = "//input[@placeholder='Parolă']")
    WebElement txtPassword;

    public void password(String pass) {
        txtPassword.sendKeys(pass);
    }

    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[2]/div/div/div/a")
    WebElement menu;

    public void clickmenu() {
        menu.click();
    }

    @FindBy(xpath = "//li[5]//div[1]//div[1]//div[1]//img[1]")
    WebElement gustari;

    public void aleggustari() {
        gustari.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Cartofi prăjiți cu crustă crocantă - 170 gr')]")
    WebElement cartofiselect;

    public void cartofi() {
        cartofiselect.click();
    }

    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[2]/div/div/a[1]")
    WebElement cont;

    public void clickcont() {
        cont.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[1]/a/div/div[2]/div")
    WebElement infopers;

    public void clickinfopers() {
        infopers.click();
    }

    @FindBy(xpath = "//*[@id=\"validateInfo\"]/div/div[1]/label")
    WebElement choosegender;

    public void clickmasculin() {
        choosegender.click();
    }

    @FindBy(xpath = "//*[@id=\"validateInfo\"]/ul/li[1]/div/div/li/div/div/div[2]/input")
    WebElement surname;

    public void entersurname() {
        surname.sendKeys("Radu");
    }

    @FindBy(xpath = "//*[@id=\"validateInfo\"]/ul/li[2]/div/div/li/div/div/div[2]/input")
    WebElement name;

    public void entername() {
        name.sendKeys("Bobanga");
    }

    @FindBy(xpath = "//*[@id=\"validateInfo\"]/ul/li[3]/div/div/li/div/div/div/input")
    WebElement datebirth;

    public void enterdatebirth() {
        datebirth.sendKeys("14072002");
    }


    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/a")
    WebElement saveinfobtn;

    public void clicksaveinfobtn() {
        saveinfobtn.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[2]/a/div/div[2]/div")
    WebElement myaddress;

    public void clickmyaddress() {
        myaddress.click();
    }

    @FindBy(xpath = "//*[@id=\"double_toolbar\"]/div/a[2]")
    WebElement addaddressmanualy;

    public void clickaddaddressmanuly() {
        addaddressmanualy.click();
    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[1]/div/div/li/div/div/div[2]/input")
    WebElement nameaddress;

    public void enternameaddress() {
        nameaddress.sendKeys("Acasa");
    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[2]/div/div/li/div/div/div[2]/input")
    WebElement strada;

    public void enterstrada() {
        strada.sendKeys("Aleea Calarasilor");
    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[3]/div/div/li/div/div/div[2]/input")
    WebElement number;

    public void enternumber() {
        number.sendKeys("4");
    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[5]/div/div/li/div/div/div[2]/input")
    WebElement city;

    public void entercity() {
        city.sendKeys("Sibiu");
    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[6]/div/div/li/div/div/div[2]/input")
    WebElement region;

    public void enterregion() {
        region.sendKeys("Sibiu");
    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[7]/div/div/li/div/div/div[2]/textarea")
    WebElement details;

    public void enterdetails() {
        details.sendKeys("langa parc");
    }

    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div/div[2]/div/a")
    WebElement done;

    public void clickdone() {
        done.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[3]/a/div/div[2]/div")
    WebElement orderhistory;

    public void clickorderhistory() {
        orderhistory.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div[1]/ul/li")
    WebElement order;

    public void clickorder() {
        order.click();
    }

    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div/div[2]/div/a")
    WebElement addfavorite;

    public void clickaddfavorite() {
        addfavorite.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[4]/a/div/div[2]/div")
    WebElement mycard;

    public void clickmycards() {
        mycard.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[5]/a/div/div[2]/div")
    WebElement favoriteorder;

    public void clickfavoriteorder() {
        favoriteorder.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/ul/li/a/div/div/div[1]")
    WebElement favorder;

    public void clickfavorder() {
        favorder.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/ul/li/div/div/div[2]/div[2]/a")
    WebElement addcartfavorder;

    public void clickaddfavorder() {
        addcartfavorder.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/div[7]/div[2]/div/ul/li[5]/div/div/div/img")
    WebElement burgerz;

    public void clickburgerz() {
        burgerz.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/div/div/div[2]/div/div[5]/div/div[2]/div[3]/div/div[2]/div[1]/div[1]/span[1]")
    WebElement doublechickenmayomenu;

    public void clickdoublechickenmayomenu() {
        doublechickenmayomenu.click();
    }

    @FindBy(xpath = "//*[@id=\"114898\"]")
    WebElement pepsi;

    public void checkpepsi() {
        pepsi.click();
    }

    @FindBy(xpath = "//*[@id=\"114903\"]")
    WebElement sosderosiidulce;

    public void checksosderosiidulce() {
        sosderosiidulce.click();
    }

    @FindBy(xpath = "//*[@id=\"double_toolbar\"]/div/a[1]")
    WebElement addchart;

    public void clickaddchart() {
        addchart.click();
    }

    /*@FindBy(xpath = "//*[@id=\"double_toolbar\"]/div/a[2]/i")
    WebElement favorite;

    public void clickfavorite() {
        favorite.click();
    }*/

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[6]/a/div/div[2]")
    WebElement changepassword;
    public void clickchangepassword(){
        changepassword.click();
    }

    @FindBy(xpath = "//*[@id=\"validateChhangePass\"]/ul/li[1]/div/div/li/div/div/div/input")
    WebElement newpassord;
    public void enternewpassword(){
        newpassord.sendKeys("test12345678");
    }

    @FindBy(xpath = "//*[@id=\"validateChhangePass\"]/ul/li[2]/div/div/li/div/div/div/input")
    WebElement confirmnewpassword;
    public void enterconfirmpassword(){
        confirmnewpassword.sendKeys("test123456789");
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/a")
    WebElement changepasswordbtn;
    public void clickchangepasswordbtn(){
        changepasswordbtn.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[7]/a/div/div[2]")
    WebElement promotion;
    public void clickpromotion(){
        promotion.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[8]/a/div/div[2]/div[1]")
    WebElement applanguage;
    public void clickapplanguage(){applanguage.click();}

    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div[2]/div/div/ul/li[1]/label/div/div")
    WebElement romanian;
    public void clickromanian(){romanian.click();}

    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div[1]/div/div[2]/a")
    WebElement savelanguage;
    public void clicksavelanguage(){savelanguage.click();}

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[9]/a/div/div[2]/div")
    WebElement newsletter;
    public void clicknewsletter(){newsletter.click();}

    @FindBy(xpath = "//*[@id=\"toggleEmail\"]/span")
    WebElement emailnotif;
    public void clickemailnotif(){emailnotif.click();}

}
