package tests;

import Login_Page_methods_xpaths.LoginPage;
import WebPage_xpaths_and_methods.Fisa_test_Descarca_datele_personale;
import common.config.DriverFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.zip.DataFormatException;

public class Test_Descarca_datele_personale extends DriverFactory {
    public Fisa_test_Descarca_datele_personale obiect(){
        return new Fisa_test_Descarca_datele_personale();
    }

    public LoginPage login(){
        return new LoginPage();
    }

    @Test(description = "In acest scenariu se verifica fisa de test cu titlul: Regression Testing Cont : Descarca datele personale ")
    @Parameters({"username","password"})
    public void login_email_and_password(String username, String password) throws InterruptedException {
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
        obiect().click_descarca_informatii_personale();
        Thread.sleep(2000);
        obiect().click_ok_descarca_informatii_personale();
        Thread.sleep(2000);
        obiect().click_confirmation();
    }
}
