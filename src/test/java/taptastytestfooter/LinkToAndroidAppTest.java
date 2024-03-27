package taptastytestfooter;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptastyfooter.LinkToAndroidApp;
import taptastyfooter.LinkToIOSApp;
import utils.BasePage;

//Verificam buttonul de Android din footer
// si daca ne duce pe pagina dorita,
// verificam daca suntem pe pagina/linkul care trebuie ne focusam pe tabul nou deschis
public class LinkToAndroidAppTest extends BasePage {

    @Test
    public void linkToAndroidApp(){

        logger.info("**** starting TC_ LinkToAndroidApp  *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");


            LinkToAndroidApp linkToAndroidApp = new LinkToAndroidApp(driver);

            logger.info("Navigate to website and click IOS App button and verify the link ");
            linkToAndroidApp.linkToIOSApp();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_ LinkToAndroidApp *****");
    }
}
