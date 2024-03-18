package WebPage_xpaths_and_methods;

import common.base.CommonMethods;
import common.constants.CommonConstants;
import org.apache.poi.hssf.record.chart.AxisParentRecord;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fisa_test_Scrie_ne extends CommonMethods {

    @FindBy(xpath = "//a[@class='w100 text-uppercase button' and contains(text(), 'Trimite')]")
    private WebElement click_trimite_button;

    public void click_click_trimite_button(){
        click(click_trimite_button);
    }

    @FindBy(xpath = "//a[@class='link popup-close']//i[@class='icon icon-back']")
    private WebElement back_button_locatie_tab;

    public void click_back_button_locatie_tab(){
        click(back_button_locatie_tab);
    }

    @FindBy(xpath = "//a[@class='link' and contains(text(), 'Cont')]")
    private WebElement cont_button;

    public void click_cont_button(){
        click(cont_button);
    }

    @FindBy(xpath = "//div[@class='item-title' and contains(text(), 'Scrie-ne')]")
    private WebElement scrie_ne_button;

    public void click_scrie_ne_button(){
        click(scrie_ne_button);
    }

    @FindBy(xpath = "//div[@class='item-title' and contains(text(), 'Alege locația dorită')]")
    private WebElement alege_locatia_button;

    public void click_alege_locatia_button(){
        click(alege_locatia_button);
    }

    @FindBy(xpath = "//div[@class='item-title' and contains(text(), 'Tap Tasty GASTROPAN 2024 - DELIVERY')]")
    private WebElement locatie_delivery;

    public void click_locatie_delivery(){
        click(locatie_delivery);
    }

    @FindBy(xpath = "//div[@class='item-title' and contains(text(), 'Tap Tasty GASTRO PAN 2024')]")
    private WebElement locatie_pan;

    public void click_locatie_pan(){
        click(locatie_pan);
    }

    @FindBy(xpath = "//div[@class='item-title' and contains(text(), 'TAP TASTY - FEST')]")
    private WebElement locatie_fest;

    public void click_locatie_fest(){
        click(locatie_fest);
    }

    @FindBy(xpath = "//div[@class='item-title' and contains(text(), 'Opinie')]")
    private WebElement opinie_checkbox;

    public void click_opinie_checkbox(){
        click(opinie_checkbox);
    }

    @FindBy(xpath = "//div[@class='item-title' and contains(text(), 'Problemă')]")
    private WebElement problema_checkbox;

    public void click_problema_checkbox(){
        click(problema_checkbox);
    }

    @FindBy(xpath = "//div[@class='item-title' and contains(text(), 'Sugestie')]")
    private WebElement sugestie_checkbox;

    public void click_sugestie_checkbox(){
        click(sugestie_checkbox);
    }

    @FindBy(xpath = "//textarea[@placeholder='Introdu aici']")
    private WebElement text_area;

    public void click_text_area(String input){
        addText(input, text_area);
    }

}
