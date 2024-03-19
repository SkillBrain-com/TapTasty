package tests;

import Login_Page_methods_xpaths.LoginPage;
import WebPage_xpaths_and_methods.Fisa_test_adresele_mele_adauga_adresa;
import common.config.DriverFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.swing.*;

public class Test_Adauga_Adresa extends DriverFactory {

    public LoginPage login(){
        return new LoginPage();
    }

    public Fisa_test_adresele_mele_adauga_adresa obiect(){
        return new Fisa_test_adresele_mele_adauga_adresa();
    }

    @Test(description = "se testeaza functionalitatea -Adresele mele- din tabul -Cont-. Se adauga o noua adresa")
    @Parameters({"username","password","input_adresa","input_strada","input_nr_strada","input_bloc","input_oras","input_judet","input_alte_detalii"})
    public void fisa_test(String username, String password, String input_adresa, String input_strada, String input_nr_strada, String input_bloc, String input_oras, String input_judet, String input_alte_detalii) throws InterruptedException {
        Thread.sleep(2000);
        login().click_log_in_button();
        Thread.sleep(2000);
        login().insert_text_email(username);
        Thread.sleep(2000);
        login().insert_text_password(password);
        Thread.sleep(2000);
        login().click_cont_log_in_button();
        Thread.sleep(2000);
        obiect().click_cont_button();
        Thread.sleep(2000);
        obiect().click_adresele_mele_buton();
        Thread.sleep(2000);
        obiect().click_add_address_button();
        Thread.sleep(2000);
        obiect().insert_text_adresa_field(input_adresa);
        Thread.sleep(2000);
        obiect().insert_text_strada_field(input_strada);
        Thread.sleep(2000);
        obiect().insert_text_nr_strada_field(input_nr_strada);
        Thread.sleep(2000);
        obiect().insert_text_bloc_scara_apartament_field(input_bloc);
        Thread.sleep(2000);
        obiect().insert_text_localitate_field(input_oras);
        Thread.sleep(2000);
        obiect().insert_text_judet_field(input_judet);
        Thread.sleep(2000);
        obiect().insert_text_alte_detalii_field(input_alte_detalii);
        Thread.sleep(2000);
        obiect().click_finalizat_button();
    }
}
