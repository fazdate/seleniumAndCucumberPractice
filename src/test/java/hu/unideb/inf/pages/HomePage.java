package hu.unideb.inf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private static final String PAGE_URL = "http://tutorialsninja.com/demo/";
    private final WebDriver driver;

    @FindBy(className = "dropdown")
    private WebElement myAccountButton;

    @FindBy(linkText = "Login")
    private WebElement loginButton;

    @FindBy(id = "input-email")
    private WebElement emailField;

    @FindBy(id = "input-password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login'][@type='submit']")
    private WebElement formLoginButton;

    @FindBy(className = "alert-dismissible")
    private WebElement errorText;

    @FindBy(id = "account-account")
    private WebElement accountText;

    @FindBy(xpath = "//*[@id=\"search\"]/input" )
    private WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[1]/a")
    private WebElement firstProduct;

    @FindBy(id = "input-quantity")
    private WebElement quantityField;

    @FindBy(id = "button-cart")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"cart\"]/button")
    private WebElement cartButton;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[1]/td[2]")
    private WebElement subTotal;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[3]/td[2]")
    private WebElement vat;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[4]/td[2]")
    private WebElement totalAmount;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a")
    private WebElement iphone;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button")
    private WebElement clearCartButton;

    @FindBy(xpath = "/html/body/footer/div/div/div[2]/ul/li[1]/a")
    private WebElement contactUsLink;

    @FindBy(id = "input-name")
    private WebElement nameField;

    @FindBy(id = "input-enquiry")
    private WebElement enquiryField;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@value='Submit'][@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")
    private WebElement macBook;

    @FindBy(xpath = "//*[@id=\"form-currency\"]/div/button")
    private WebElement currencyButton;

    @FindBy(xpath = "//*[@id=\"form-currency\"]/div/ul/li[1]/button")
    private WebElement eurButton;

    @FindBy(xpath = "//*[@id=\"form-currency\"]/div/ul/li[2]/button")
    private WebElement gbpButton;

    @FindBy(xpath = "//*[@id=\"form-currency\"]/div/ul/li[3]/button")
    private WebElement usdButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
    private WebElement macBookPrice;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[1]/a")
    private WebElement iphonePicture;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")
    private WebElement addToWishlistButton;

    @FindBy(className = "alert-success")
    private WebElement successText;

    @FindBy(xpath = "//*[@id=\"product-product\"]/div[1]/a[2]")
    private WebElement wishlistLink;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr/td[2]/a")
    private WebElement firstWishlistElement;

    @FindBy(xpath = "/html/body/footer/div/div/div[2]/ul/li[2]/a")
    private WebElement returnsLink;

    @FindBy(id = "input-firstname")
    private WebElement firstNameField;

    @FindBy(id = "input-lastname")
    private WebElement lastNameField;

    @FindBy(id = "input-telephone")
    private WebElement telephoneField;

    @FindBy(id = "input-order-id")
    private WebElement orderIdField;

    @FindBy(id = "input-date-ordered")
    private WebElement dateOrderedField;

    @FindBy(id = "input-product")
    private WebElement productNameField;

    @FindBy(id = "input-model")
    private WebElement productCodeField;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[4]/div/div[3]/label/input")
    private WebElement orderErrorRadioButton;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[5]/div/label[1]/input")
    private WebElement yesRadioButton;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a")
    private WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    private WebElement registerLink;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirm;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
    private WebElement subscribeYesRadioButton;

    @FindBy(xpath = "//input[@value='1'][@type='checkbox']")
    private WebElement privacyPolicyButton;

    @FindBy(xpath = "//input[@value='Continue'][@type='submit']")
    private WebElement registerContinueButton;

    @FindBy(xpath = "/html/body/footer/div/div/div[3]/ul/li[2]/a")
    private WebElement giftCertificatesLink;

    @FindBy(id = "input-to-name")
    private WebElement recipientsNameField;

    @FindBy(id = "input-to-email")
    private WebElement recipientsEmailField;

    @FindBy(id = "input-from-name")
    private WebElement yourNameField;

    @FindBy(id = "input-from-email")
    private WebElement yourEmailField;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div[5]/div/div[1]/label/input")
    private WebElement certificateThemeBirthdayRadioButton;

    @FindBy(id = "input-message")
    private WebElement messageField;

    @FindBy(id = "input-amount")
    private WebElement amountField;

    @FindBy(xpath = "//input[@value='1'][@type='checkbox']")
    private WebElement agreeCheckbox;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickMyAccountButton() {
        System.out.println("asd");
        myAccountButton.click();
        System.out.println("asd");
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void setEmailField(String arg) {
        emailField.sendKeys(arg);
    }

    public void setPasswordField(String arg) {
        passwordField.sendKeys(arg);
    }

    public void clickFormLoginButton() {
        formLoginButton.click();
    }

    public boolean checkIfErrorIsShown() {
        return errorText.isDisplayed();
    }

    public boolean checkIfLoggedIn() {
        return accountText.isDisplayed();
    }

    public void setSearchBar(String arg) {
        searchBar.sendKeys(arg);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickOnFirstProduct() {
        firstProduct.click();
    }

    public void setQuantityField(String arg) {
        quantityField.clear();
        quantityField.sendKeys(arg);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public String getSubTotal() {
        return subTotal.getText();
    }

    public String getVat() {
        return vat.getText();
    }

    public String getTotalAmount() {
        return totalAmount.getText();
    }

    public void clickOnIphone() {
        iphone.click();
    }

    public void clickOnClearCartButton() {
        clearCartButton.click();
    }

    public void clickContactUsLink() {
        contactUsLink.click();
    }

    public void setEnquiryField(String arg) {
        enquiryField.sendKeys(arg);
    }

    public void setNameField(String arg) {
        nameField.sendKeys(arg);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isContinueButtonShown() {
        return continueButton.isDisplayed();
    }

    public void clickOnMacBook() {
        macBook.click();
    }

    public void clickCurrencyButton() {
        currencyButton.click();
    }

    public void clickOnCurrencyButton(String currency) {
        switch (currency) {
            case "USD" -> usdButton.click();
            case "EUR" -> eurButton.click();
            case "GBP" -> gbpButton.click();
        }
    }

    public String getMacBookPrice() {
        return macBookPrice.getText();
    }

    public void clickOnIphonePicture() {
        iphonePicture.click();
    }

    public void clickOnAddToWishlistButton() {
        addToWishlistButton.click();
    }

    public boolean isSuccessTextShown() {
        return successText.isDisplayed();
    }

    public void clickOnWishlistLink() {
        wishlistLink.click();
    }

    public String getValueOfFirstWishlistElement() {
        return firstWishlistElement.getText();
    }

    public void clickOnReturnsLink() {
        returnsLink.click();
    }

    public void setFirstNameFieldTo(String arg) {
        firstNameField.sendKeys(arg);
    }

    public void setLastNameFieldTo(String arg) {
        lastNameField.sendKeys(arg);
    }

    public void setTelephoneField(String arg) {
        telephoneField.sendKeys(arg);
    }

    public void setOrderIdField(String arg) {
        orderIdField.sendKeys(arg);
    }

    public void setDateOrderedField(String arg) {
        dateOrderedField.sendKeys(arg);
    }

    public void setProductNameField(String arg) {
        productNameField.sendKeys(arg);
    }

    public void setProductCodeField(String arg) {
        productCodeField.sendKeys(arg);
    }

    public void clickOnOrderErrorRadioButton() {
        orderErrorRadioButton.click();
    }

    public void clickOnYesRadioButton() {
        yesRadioButton.click();
    }

    public void clickOnMyAccount() {
        myAccount.click();
    }

    public void clickOnRegisterLink() {
        registerLink.click();
    }

    public void setPasswordConfirm(String arg) {
        passwordConfirm.sendKeys(arg);
    }

    public void clickOnSubscribeYesRadioButton() {
        subscribeYesRadioButton.click();
    }

    public void clickOnPrivacyPolicyButton() {
        privacyPolicyButton.click();
    }

    public void clickOnContinueButton() {
        registerContinueButton.click();
    }

    public void clickOnGiftCertificatesLink() {
        giftCertificatesLink.click();
    }

    public void setRecipientsNameFieldTo(String arg) {
        recipientsNameField.sendKeys(arg);
    }

    public void setRecipientsEmailFieldTo(String arg) {
        recipientsEmailField.sendKeys(arg);
    }

    public void setYourNameFieldTo(String arg) {
        yourNameField.sendKeys(arg);
    }

    public void setYourEmailField(String arg) {
        yourEmailField.sendKeys(arg);
    }

    public void clickOnBirthday() {
        certificateThemeBirthdayRadioButton.click();
    }

    public void setMessageFieldTo(String arg) {
        messageField.sendKeys(arg);
    }

    public void setAmountFieldTo(String arg) {
        amountField.clear();
        amountField.sendKeys(arg);
    }

    public void clickOnAgreementBox() {
        agreeCheckbox.click();
    }
}
