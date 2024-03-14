package Login_Page_methods_xpaths;

import common.base.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonMethods {
    @FindBy(xpath = "//a[@class='link' and contains(text(), 'Cont')]")
    private WebElement cont_button;

    public void click_cont_button(){
        click(cont_button);
    }

    @FindBy(xpath = "//a[@class='link center' and contains(text(), 'Log in')]")
    private WebElement log_in_button;

    public void click_log_in_button(){
        click(log_in_button);
    }

    @FindBy(xpath = "//div[@class='item-input-wrap']//input[@type='email']")
    private WebElement email_text_box;

    public void insert_text_email(String input){
        click(email_text_box);
        addText(input, email_text_box);
    }

    @FindBy(xpath = "//div[@class='item-input-wrap']//input[@type='password']")
    private WebElement password_text_box;

    public void insert_text_password(String input){
        click(password_text_box);
        addText(input, password_text_box);
    }

    @FindBy(xpath = "//a[@class='loginBtn link']")
    private WebElement cont_log_in_button;

    public void click_cont_log_in_button(){
        click(cont_log_in_button);
    }

}
