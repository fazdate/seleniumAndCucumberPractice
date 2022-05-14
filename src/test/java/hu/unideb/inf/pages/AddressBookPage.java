package hu.unideb.inf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressBookPage {

    private static final String PAGE_URL = "http://tutorialsninja.com/demo/index.php?route=account/address";
    private final WebDriver driver;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[4]")
    private WebElement addressBookButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/a")
    private WebElement newAddressButton;

    @FindBy(id = "input-firstname")
    private WebElement firstNameField;

    @FindBy(id = "input-lastname")
    private WebElement lastNameField;

    @FindBy(id = "input-address-1")
    private WebElement address1Field;

    @FindBy(id = "input-city")
    private WebElement cityField;

    @FindBy(id = "input-postcode")
    private WebElement postCodeField;

    @FindBy(id = "input-country")
    private WebElement countrySelect;

    @FindBy(id = "input-zone")
    private WebElement regionSelect;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset/div[10]/div/label[1]/input")
    private WebElement defaultAddressYesRadio;

    @FindBy(xpath = "//input[@value='Continue'][@type='submit']")
    private WebElement continueButton;

    @FindBy(className = "alert-success")
    private WebElement successText;

    public AddressBookPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickAddressBookButton() {
        addressBookButton.click();
    }

    public void clickNewAddressButton() {
        newAddressButton.click();
    }

    public void fillFirstNameField(String arg) {
        firstNameField.clear();
        firstNameField.sendKeys(arg);
    }

    public void fillLastNameField(String arg) {
        lastNameField.clear();
        lastNameField.sendKeys(arg);
    }

    public void fillAddressField(String arg) {
        address1Field.sendKeys(arg);
    }

    public void fillCityField(String arg) {
        cityField.sendKeys(arg);
    }

    public void fillPostCodeField(String arg) {
        postCodeField.sendKeys(arg);
    }

    public void setCountrySelect(String arg) {
        Select selectObject = new Select(countrySelect);
        selectObject.selectByVisibleText(arg);
    }

    public void setRegionSelect(String arg) {
        Select selectObject = new Select(regionSelect);
        selectObject.selectByValue(arg);
    }

    public void clickDefaultAddressRadio() {
        defaultAddressYesRadio.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public boolean isSuccessTextShown() {
        return successText.isDisplayed();
    }
}
