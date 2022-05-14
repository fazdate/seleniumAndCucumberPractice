package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class GiftStepDefs extends AbstractStepDefs {

    @Given("the gift certificates link is clicked")
    public void clickOnGiftCertificatesLink() {
        homePage.clickOnGiftCertificatesLink();
    }

    @And("the recipients name field set to {string}")
    public void theRecipientsNameFieldSetTo(String arg0) {
        homePage.setRecipientsNameFieldTo(arg0);
    }

    @And("the recipients email field set to {string}")
    public void theRecipientsEmailFieldSetTo(String arg0) {
        homePage.setRecipientsEmailFieldTo(arg0);
    }

    @And("the your name field set to {string}")
    public void theYourNameFieldSetTo(String arg0) {
        homePage.setYourNameFieldTo(arg0);
    }

    @And("your email field set to {string}")
    public void yourEmailFieldSetTo(String arg0) {
        homePage.setYourEmailField(arg0);
    }

    @And("the gift certificate theme is set to birthday")
    public void theGiftCertificateThemeIsSetToBirthday() {
        homePage.clickOnBirthday();
    }

    @And("the message is set to {string}")
    public void theMessageIsSetTo(String arg0) {
        homePage.setMessageFieldTo(arg0);
    }

    @And("the amount is set to {string}")
    public void theAmountIsSetTo(String arg0) {
        homePage.setAmountFieldTo(arg0);
    }

    @And("the agreement box is ticked")
    public void theAgreementBoxIsTicked() {
        homePage.clickOnAgreementBox();
    }
}
