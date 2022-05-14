package hu.unideb.inf.stepDefs;

import hu.unideb.inf.pages.AddressBookPage;
import hu.unideb.inf.pages.HomePage;
import hu.unideb.inf.pages.MyAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class AbstractStepDefs {

    public static WebDriver driver;

    private static final int WAIT_TIME = 10;

    static HomePage homePage;
    static MyAccountPage myAccountPage;
    static AddressBookPage addressBookPage;


    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
        myAccountPage = new MyAccountPage(driver);
        addressBookPage = new AddressBookPage(driver);

    }
}
