package WebPage_xpaths_and_methods;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fisa_test_adresele_mele_adauga_adresa extends CommonMethods {

    @FindBy(xpath = "//a[@class='link' and contains(text(), 'Cont')]")
    private WebElement cont_button;

    public void click_cont_button(){
        click(cont_button);
    }

    @FindBy(xpath = "//div[@class='item-title' and contains(text(), 'Adresele mele')]")
    private WebElement adresele_mele_buton;

    public void click_adresele_mele_buton(){
        click(adresele_mele_buton);
    }

    @FindBy(xpath = "//a[@class='w100 text-uppercase addNewAddress link' and contains(text(),'Adaugă adresa manual')]")
    private WebElement add_address_button;

    public void click_add_address_button(){
        click(add_address_button);
    }

    @FindBy(xpath = "//a[@class='w100 text-uppercase link' and contains(text(), 'Finalizat')]")
    private WebElement finalizat_button;

    public void click_finalizat_button(){
        click(finalizat_button);
    }


    @FindBy(xpath = "//input[@placeholder='Introdu aici']")
    private WebElement adresa_field;

    public void insert_text_adresa_field(String input){
        click(adresa_field);
        addText(input, adresa_field);
    }

    @FindBy(xpath = "//input[@placeholder='Adaugă doar numele străzii']")
    private WebElement strada_field;

    public void insert_text_strada_field(String input){
        click(strada_field);
        addText(input, strada_field);
    }

    @FindBy(xpath = "//input[@placeholder='Adaugă doar numărul străzii']")
    private WebElement nr_strada_field;

    public void insert_text_nr_strada_field(String input){
        click(nr_strada_field);
        addText(input, nr_strada_field);
    }

    @FindBy(xpath = "//input[@placeholder='Ex: Bl. Q7, Et. 7, Ap. 7']")
    private WebElement bloc_scara_apartament_field;

    public void insert_text_bloc_scara_apartament_field(String input){
        click(bloc_scara_apartament_field);
        addText(input, bloc_scara_apartament_field);
    }

    @FindBy(xpath = "//input[@data-error-message='Vă rugăm adăugați orașul / localitatea.']")
    private WebElement localitate_field;

    public void insert_text_localitate_field(String input){
        click(localitate_field);
        addText(input, localitate_field);
    }

    @FindBy(xpath = "//input[@data-error-message='Vă rugăm adăugați județul.']")
    private WebElement judet_field;

    public void insert_text_judet_field(String input){
        click(judet_field);
        addText(input, judet_field);
    }

    @FindBy(xpath = "//textarea[@placeholder='Exemplu: vis-a-vis de farmacie']")
    private WebElement alte_detalii_field;

    public void insert_text_alte_detalii_field(String input){
        click(alte_detalii_field);
        addText(input, alte_detalii_field);
    }
}
