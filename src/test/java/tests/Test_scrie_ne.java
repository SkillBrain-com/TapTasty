package tests;

import Login_Page_methods_xpaths.LoginPage;
import WebPage_xpaths_and_methods.Fisa_test_Scrie_ne;
import common.config.DriverFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_scrie_ne extends DriverFactory {

    public LoginPage login(){
        return new LoginPage();
    }

    public Fisa_test_Scrie_ne obiect(){
        return new Fisa_test_Scrie_ne();
    }

    @Test(description = "se testeaza functionalitatea obtiunii de Scrie-ne de feedback")
    @Parameters({"username","password","input"})
    public void fisa_test(String username, String password, String input) throws InterruptedException {
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
        obiect().click_scrie_ne_button();
        Thread.sleep(2000);
        obiect().click_alege_locatia_button();
        Thread.sleep(2000);
        obiect().click_locatie_delivery();
        Thread.sleep(2000);
        obiect().click_back_button_locatie_tab();
        Thread.sleep(2000);
        obiect().click_opinie_checkbox();
        Thread.sleep(2000);
        obiect().click_text_area(input);
        Thread.sleep(2000);
        obiect().click_click_trimite_button();
    }
}
