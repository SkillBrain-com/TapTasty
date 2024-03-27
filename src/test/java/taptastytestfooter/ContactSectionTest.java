package taptastytestfooter;

import org.testng.Assert;
import org.testng.annotations.Test;
import taptastyfooter.ContactSection;
import utils.BasePage;

//Navigate to website scroll to footer and click on Contact button
// verify by email if we are on the right page
public class ContactSectionTest extends BasePage {

    @Test
    public void contactSection(){

        logger.info("**** starting TC_ContactSection *****");

        logger.debug("application logs started......");

        try {

            driver.get("https://ristorantelavitaebella.taptasty.com/");
            ContactSection contactSection = new ContactSection(driver);

            logger.info("Navigate to website and click on contact button from footer");
            contactSection.contactSection();
        }catch (Exception e) {
            logger.error("test failed..");
            logger.debug("debug logs....");
            Assert.fail();
        }

        logger.debug("application logs end.......");
        logger.info("**** finished TC_ContactSection *****");
    }
}
