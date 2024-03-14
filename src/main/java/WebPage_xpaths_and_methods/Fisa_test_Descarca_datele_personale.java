package WebPage_xpaths_and_methods;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fisa_test_Descarca_datele_personale extends CommonMethods {
    @FindBy(xpath = "//a[@class='link' and contains(text(), 'Cont')]")
    private WebElement cont_button;

    public void click_cont_button(){
        click(cont_button);
    }

    @FindBy(xpath = "//div[@class='item-title' and contains(text(), 'Descarcă datele personale')]")
    private WebElement descarca_informatii_personale;

    public void click_descarca_informatii_personale(){
        click(descarca_informatii_personale);
    }

    @FindBy(xpath = "//span[@class='dialog-button dialog-button-bold' and contains(text(), 'OK')]")
    private WebElement ok_descarca_informatii_personale;

    public void click_ok_descarca_informatii_personale(){
        click(ok_descarca_informatii_personale);
    }

    @FindBy(xpath = "//div[@class='dialog-buttons']//span[@class='dialog-button dialog-button-bold' and contains(text(), 'OK')]")
    private WebElement confirmation_ok;

    public void click_confirmation(){
        click(confirmation_ok);
    }
}
