package common.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;

public class DriverFactory {
    public static final String URL = "https://ristorantelavitaebella.taptasty.com/";
    public static WebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public static void setUp(ITestContext context) {
        System.setProperty("webdriver.chrome.driver", getChromeDriverPath() + "\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(URL);
        context.setAttribute("WebDriver", driver);
    }

    private static String getChromeDriverPath() {
        return System.getProperty("user.dir");
    }

    public void tearDown() {
        driver.quit();
    }


}
