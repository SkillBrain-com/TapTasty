package tests;

import Login_Page_methods_xpaths.LoginPage;
import common.config.DriverFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin extends DriverFactory {
    public LoginPage login(){
        return new LoginPage();
    }

    @Test(description = "in aceasta metoda se verifica scenariul de login cu email si parola")
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
    }
}
