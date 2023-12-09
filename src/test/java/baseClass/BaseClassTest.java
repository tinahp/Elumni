package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import pages.DashBoard;
import pages.Inventory;
import pages.Manage;
import pages.Payment;

public class BaseClassTest {


    public static WebDriver driver;

    public WebDriver startdriver(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else
            return driver;
        return null;
    }

    //   Declare the protected access Modifiers
    protected DashBoard dashBoard;
    protected Payment payment;
    protected Inventory inventory;
    protected Manage manage;

    @BeforeTest
    public void SetUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("---disable notifications");
//         Set Chrome Browser
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();
        //Open the page URL
        driver.get("https://app.lumibusiness.io/login");

        //Initialize the page after launching the browser
//        loginPage=new LoginPage(driver);
    }
}