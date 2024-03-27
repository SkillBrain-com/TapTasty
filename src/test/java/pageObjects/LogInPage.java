package pageObjects;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.Callable;

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

    @FindBy(xpath = "//div[@class='right']//div//a[@class='link'][normalize-space()='Meniu']")
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

    public void setMyAddress() {
        myAddress.click();

    }

    @FindBy(xpath = "//*[@id=\"double_toolbar\"]/div/a[2]")
    WebElement addAddressManually;

    public void setAddAddressManually() {
        addAddressManually.click();


    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[1]/div/div/li/div/div/div[2]/input")
    WebElement addAddress;

    public void setAddAddress() {
        addAddress.sendKeys("birou");
    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[2]/div/div/li/div/div/div[2]/input")
    WebElement streetName;

    public void setStreetName() {
        streetName.sendKeys("Mihail Codreanu");

    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[3]/div/div/li/div/div/div[2]/input")
    WebElement numberStreet;

    public void setNumberStreet() {
        numberStreet.sendKeys("28");

    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[4]/div/div/li/div/div/div[2]/input")
    WebElement fullAddress;

    public void setFullAddress() {
        fullAddress.sendKeys("Bl.29 Scara B parter");

    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[5]/div/div/li/div/div/div[2]/input")
    WebElement town;

    public void setTown() {
        town.sendKeys("Iasi");
    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[6]/div/div/li/div/div/div[2]/input")
    WebElement addTown;

    public void setAddTown() {
        addTown.sendKeys("Iasi");

    }

    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div/div[2]/div/a")
    WebElement completed;

    public void setCompleted() {
        completed.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[3]/a/div/div[2]/div")
    WebElement OrderHistory;

    public void SetOrderHistory() {
        OrderHistory.click();


    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[4]/a/div/div[2]/div")
    WebElement CardsPaymentMetod;

    public void SetCardsPaymentMetod() {
        CardsPaymentMetod.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[5]/a/div/div[2]/div")
    WebElement FavoriteOrder;

    public void SetFavoriteOrder() {
        FavoriteOrder.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/ul/li/a/div/div/div[1]")
    WebElement SelectFavoriteOrder;

    public void SetSelectFavoriteOrder() {
        SelectFavoriteOrder.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[6]/a/div/div[2]/div")
    WebElement ChangePassword;

    public void SetChangePassword() {
        ChangePassword.click();
    }

    @FindBy(xpath = "//*[@id=\"validateChhangePass\"]/ul/li[1]/div/div/li/div/div/div/input")
    WebElement ClickChangePassword1;

    public void SetClickChangePassword1() {
        ClickChangePassword1.sendKeys("Moscraciun1");
    }

    @FindBy(xpath = "//*[@id=\"validateChhangePass\"]/ul/li[2]/div/div/li/div/div/div/input")
    WebElement ClickChangePassword2;

    public void SetClickPassword2() {
        ClickChangePassword2.sendKeys("Moscraciun1");
    }

    @FindBy(xpath = "//*[@id=\"validateChhangePass\"]/ul/li[1]/div/div/span/i")
    WebElement SeePassword;

    public void SetSeePassword() {
        SeePassword.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/a")
    WebElement ConfirmNewPassword;

    public void SetConfirmNewPassword() {
        ConfirmNewPassword.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[7]/a/div/div[2]/div")
    WebElement Promotions;

    public void SetPromotions() {
        Promotions.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[8]/a/div/div[2]/div[1]")
    WebElement SelectLanguage;

    public void SetSelectLanguage() {
        SelectLanguage.click();
    }

    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div[2]/div/div/ul/li[2]/label/div")
    WebElement SelectEnglishLanguage;

    public void SetSelectEnglishLanguage() {
        SelectEnglishLanguage.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[9]/a/div/div[2]/div")
    WebElement Newsletter;

    public void SetNewsletter() {
        Newsletter.click();
    }

    @FindBy(xpath = "//*[@id=\"toggleEmail\"]/span")
    WebElement SelectEmailNotifications;

    public void SetSelectEmailNotifications() {
        SelectEmailNotifications.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[2]/ul/li[1]/a/div/div[2]/div")
    WebElement SelectContactUs;

    public void SetSelectContactUs() {
        SelectContactUs.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[2]/ul/li[2]/a/div/div[2]/div")
    WebElement SelectFeedBack;

    public void SetSelectFeedBack() {
        SelectFeedBack.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/ul/li/a/div/div")
    WebElement SelectChooseLocation;

    public void SetSelectChooseLocation() {
        SelectChooseLocation.click();
    }

    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div/div/div[2]/div/ul/li[1]/label/div/div")
    WebElement ChooseTapTastyGastoPanDelivery;

    public void SetChooseTapTastyGastoPanDelivery() {
        ChooseTapTastyGastoPanDelivery.click();

    }













}





















































































































