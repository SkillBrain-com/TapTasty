package taptastytestfooter;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptastyfooter.LinkToIOSApp;
import utils.BasePage;

//Verificam buttonul de IOS din footer
// si daca ne duce pe pagina APP Store,
// verificam daca suntem pe pagina/linkul care trebuie ne focusam pe tabul nou deschis
public class LinkToIOSAppTest extends BasePage {

    @Test
    public void linkToIOSApp(){

        logger.info("**** starting TC_LinkToIOSApp  *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");


            LinkToIOSApp linkToIOSApp = new LinkToIOSApp(driver);

            logger.info("Navigate to website and click IOS App button and verify the link ");
            linkToIOSApp.linkToIOSApp();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_OrderHistory *****");
    }

}
