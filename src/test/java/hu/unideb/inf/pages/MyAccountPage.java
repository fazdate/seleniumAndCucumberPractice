package hu.unideb.inf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    private static final String PAGE_URL = "http://tutorialsninja.com/demo/index.php?route=account/account";
    private final WebDriver driver;

    @FindBy(xpath = "//*[@id=\"content\"]/ul[1]/li[1]/a")
    private WebElement editAccountLink;

    @FindBy(id = "input-firstname")
    private WebElement firstNameField;

    @FindBy(id = "input-lastname")
    private WebElement lastNameField;

    @FindBy(id = "input-telephone")
    private WebElement telephoneField;

    @FindBy(xpath = "//input[@value='Continue'][@type='submit']")
    private WebElement continueButton;

    @FindBy(className = "alert-success")
    private WebElement successText;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[13]")
    private WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    private WebElement logoutText;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickEditAccountLink() {
        editAccountLink.click();
    }

    public void fillFirstNameField(String arg) {
        firstNameField.clear();
        firstNameField.sendKeys(arg);
    }

    public void fillLastNameField(String arg) {
        lastNameField.clear();
        lastNameField.sendKeys(arg);
    }

    public void fillTelephoneField(String arg) {
        telephoneField.clear();
        telephoneField.sendKeys(arg);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public boolean isSuccessTextShown() {
        return successText.isDisplayed();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public boolean isLogoutTextShown() {
        return logoutText.isDisplayed();
    }



}
