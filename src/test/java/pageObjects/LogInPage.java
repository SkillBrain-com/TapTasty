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

    @FindBy(xpath = "//input[@Class='input-invalid input-focused']")
    WebElement numeSelect;

    public void modificareNume(String nume) {
        numeSelect.click();
        numeSelect.sendKeys(nume);
    }

    @FindBy(xpath = "//a[contains(text(),'Salvează modificările')]")
    WebElement saveModificationsPersonalInformation;

    public void setSaveModificationsPersonalInformation() {
        saveModificationsPersonalInformation.click();
    }

    @FindBy(xpath = "(//span[@class='input-clear-button'])[1]")
    WebElement clearName;

    public void stergenume() {
        clearName.click();
    }

    @FindBy(xpath = "//div[contains(text(),'Istoric Comenzi')]")
    WebElement historySelect;

    public void setHistorySelect() {
        historySelect.click();
    }

    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[2]/a/div/div[2]/div")
    WebElement myAddresses;

    public void adressSelect() {
        myAddresses.click();
    }

    @FindBy(xpath = "//*[@id=\"double_toolbar\"]/div/a[2]")
    WebElement addingAddressManually;

    public void setAddingAddressManually() {
        addingAddressManually.click();
    }

    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[1]/div/div/li/div/div/div[2]/input")
    WebElement addAddress;
    public void setAddAddress () {
        addAddress.sendKeys("Birou");
    }
    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[2]/div/div/li/div/div/div[2]/input")
    WebElement addNameOfTheStreet;
    public void setAddNameOfTheStreet(){
        addNameOfTheStreet.sendKeys("Octav Bancila");
    }
    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[3]/div/div/li/div/div/div[2]/input")
    WebElement addNumberOfStreet;
    public void setAddNumberOfStreet (){
        addNumberOfStreet.sendKeys("15");
    }
    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[5]/div/div/li/div/div/div[2]/input")
    WebElement addNameOfCity;
    public void setAddNameOfCity(){
        addNameOfCity.sendKeys("Barlad");
    }
    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[6]/div/div/li/div/div/div[2]/input")
    WebElement addCounty;
    public void setAddCounty(){
        addCounty.sendKeys("Vaslui");
    }
    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div/div[2]/div/a")
    WebElement clickFinalizatButton;
    public void setClickFinalizatButton(){
        clickFinalizatButton.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[6]/a/div/div[2]/div")
    WebElement clickChangePassword;
    public void setClickChangePassword(){
        clickChangePassword.click();
    }
    @FindBy(xpath = "//*[@id=\"validateChhangePass\"]/ul/li[1]/div/div/li/div/div/div/input")
    WebElement newPassword;
    public void setNewPassword1(){
        newPassword.sendKeys("Chavi2727an");
    }
    @FindBy(xpath = "//*[@id=\"validateChhangePass\"]/ul/li[2]/div/div/li/div/div/div/input")
    WebElement newPasswordd;
    public void setNewPassword2(){
        newPasswordd.sendKeys("Chavi2727an");
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/div/a")
    WebElement getClickChangePassword;
    public void setGetClickChangePassword(){
        getClickChangePassword.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[7]/a/div/div[2]/div")
    WebElement promotionsSelect;
    public void setPromotionsSelect(){
        promotionsSelect.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[8]/a/div/div[2]/div[1]")
    WebElement changeLanguageSelect;
    public void setChangeLanguageSelect(){
        changeLanguageSelect.click();
    }
    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div[2]/div/div/ul/li[2]/label/div/div")
    WebElement selectEnglish;
    public void setSelectEnglish(){
            selectEnglish.click();
    }
    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div[1]/div/div[2]/a")
    WebElement saveChanges;
    public void setSaveChanges(){
        saveChanges.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[5]/a/div/div[2]/div")
    WebElement clickFavoriteOrder;
    public void setClickFavoriteOrder(){
        clickFavoriteOrder.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/ul/li[1]/a/div/div")
    WebElement clickFirstFavoriteOrder;
    public void setClickFirstFavoriteOrder(){
        clickFavoriteOrder.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[9]/a/div/div[2]")
    WebElement newsletterButton;
    public void setNewsletterButton (){
        newsletterButton.click();
    }
    @FindBy(xpath = "//*[@id=\"toggleEmail\"]/span")
    WebElement selectNotifications;
    public void setSelectNotifications(){
        selectNotifications.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[1]/div[2]/div[1]/ul/li[4]/a/div/div[2]/div")
    WebElement myCards;
    public void setMyCards(){
        myCards.click();
        myCards.getText();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/div[7]/div[2]/div/ul/li[2]/div/div/div/img")
    WebElement clickRollz;
    public void setClickRollz(){
        clickRollz.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div/div[1]/div/div/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/div[1]/div[1]/span[2]")
    WebElement clickClassicRollz;
    public void setClickClassicRollz(){
        clickClassicRollz.click();

    }
    @FindBy(xpath = "//*[@id=\"double_toolbar\"]/div/a[1]/p")
    WebElement saveCart;
    public void setSaveCart(){
        saveCart.click();
    }
    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div/div/div[2]/div/a[1]")
    WebElement somethingToDrink;
    public void setSomethingToDrink(){
        somethingToDrink.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[3]/div[2]/div[1]/ul/li/div/div[2]/div/div/div[3]")
    WebElement addOneMoreRollz;
    public void setAddOneMoreRollz(){
        addOneMoreRollz.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/a")
    WebElement finishOrder;
    public void setFinishOrder(){
        finishOrder.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div[1]/div[4]/div/a")
    WebElement continueButton;
    public void setContinueButton(){
        continueButton.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div/ul/li[2]/label/div[2]/div")
    WebElement payCash;
    public void setPayCash(){
        payCash.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/div[2]/div/a")
    WebElement lastStepForFinishOrder;
    public void setLastStepForFinishOrder(){
        lastStepForFinishOrder.click();
    }
    @FindBy(xpath = "//*[@id=\"validateInfo\"]/ul/li[3]/div/div/li/div/div/div/input")
    WebElement dateOfbirth;
    public void setDateOfbirth(){
        dateOfbirth.sendKeys("02081995");
    }

    @FindBy(xpath = "//*[@id=\"MazPhoneNumberInput\"]/div[2]/div/button")
    WebElement clearPhoneNumber;
    public void setClearPhoneNumber(){
        clearPhoneNumber.click();
    }
    @FindBy(xpath = "")
    WebElement modifyPhoneNumber;
    public void setModifyPhoneNumber(){
        modifyPhoneNumber.sendKeys("2222222222");
    }
    @FindBy(xpath = "//*[@id=\"double_toolbar\"]/div/a[1]")
    WebElement locationAutomatically;
    public void setLocationAutomatically(){
        locationAutomatically.click();
    }
    @FindBy(xpath = "//*[@id=\"validateMapAddress\"]/div/ul/li[1]/div/div/li/div/div/div[2]/input")
    WebElement addressAutomatically;
    public void setAddressAutomatically(){
        addressAutomatically.sendKeys("Birou");
    }
    @FindBy(xpath = "//*[@id=\"validateMapAddress\"]/div/ul/li[3]/div/div/li/div/div/div[2]/input")
    WebElement streetNo;
    public void setStreetNo(){
        streetNo.sendKeys("145");
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/a")
    WebElement saveModificationsAddressAuto;
    public void setSaveModificationsAddressAuto(){
        saveModificationsAddressAuto.click();
    }
    @FindBy(xpath = "//*[@id=\"validateInfo\"]/div/div[2]/label")
    WebElement chooseGender;
    public void setChooseGender(){
        chooseGender.click();
    }
    @FindBy(xpath = "//*[@id=\"MazPhoneNumberInput-550_country_selector\"]")
    WebElement chooseCountryCode;
    public void setChooseCountryCode(){
        chooseCountryCode.click();
    }
    @FindBy(xpath = "//*[@id=\"MazPhoneNumberInput\"]/div[1]/div/div[3]/div/div[1]/div[1]/button")
    WebElement  countryAfghanistan;
    public void setCountryAfghanistan(){
        countryAfghanistan.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div[1]/div[1]/ul/li[2]/label/div/a/span")
    WebElement editAddress;
    public void setEditAddress(){
        editAddress.click();
    }
    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[3]/div/div/li/div/div/div[2]/span")
    WebElement deleteNoStreet;
    public void setDeleteNoStreet(){
        deleteNoStreet.click();
    }
    @FindBy(xpath = "//*[@id=\"validateEditAddress\"]/ul/li[3]/div/div/li/div/div/div[2]/input")
    WebElement newNoStreet;
    public void setNewNoStreet(){
        newNoStreet.sendKeys("245");
    }
    @FindBy(xpath = "//*[@id=\"double_toolbar\"]/div/a[2]")
    WebElement finalStepEditAddress;
    public void setFinalStepEditAddress(){
        finalStepEditAddress.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div[1]/ul/li[1]/div/div")
    WebElement selectFirstOrder;
    public void setSelectFirstOrder(){
        selectFirstOrder.click();
    }
    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div/div[2]/div/a")
    WebElement selectAddFavorite;
    public void setSelectAddFavorite(){
        selectAddFavorite.click();
    }
    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[12]/div[2]/span")
    WebElement popUpMessage;
    public void setPopUpMessage(){
        popUpMessage.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/ul/li[1]/a/div/div")
    WebElement expandFirstOrder;
    public void setExpandFirstOrder(){
        expandFirstOrder.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/ul/li[1]/div/div/div[2]/div[2]/a/p")
    WebElement addInCart;
    public void setAddInCart(){
        addInCart.click();
    }
    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div[2]/span[2]")
    WebElement popUpMessageFavOrder;
    public void setPopUpMessageFavOrder(){
        popUpMessageFavOrder.click();
    }
    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div[2]/span")
    WebElement secondPopUpMessage;
    public void setSecondPopUpMessage(){
        secondPopUpMessage.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/ul/li[1]/div/div/div[2]/div[1]/a")
    WebElement deleteFavoriteOrder;
    public void setDeleteFavoriteOrder(){
        deleteFavoriteOrder.click();
    }
    @FindBy(xpath = "//*[@id=\"framework7-root\"]/div[11]/div[2]/span[2]")
    WebElement popUpDeleteFavOrd;
    public void setPopUpDeleteFavOrd(){
        popUpDeleteFavOrd.click();
    }
    @FindBy(xpath = "//*[@id=\"main-view\"]/div/div[2]/div/ul/li[1]/a/div/div/div[1]")
    WebElement firstOrder;
    public void setFirstOrder(){
        firstOrder.click();
    }
}
