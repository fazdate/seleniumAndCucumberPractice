package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterStepDefs extends AbstractStepDefs {

    @Given("the my account is clicked")
    public void clickOnMyAccount() {
        homePage.clickOnMyAccount();
    }

    @And("the register link is clicked")
    public void theRegisterLinkIsClicked() {
        homePage.clickOnRegisterLink();
    }

    @And("the confirm password field is set to {string}")
    public void theConfirmPasswordFieldIsSetTo(String arg0) {
        homePage.setPasswordConfirm(arg0);
    }

    @And("the subscribe is set to yes")
    public void theSubscribeIsSetToYes() {
        homePage.clickOnSubscribeYesRadioButton();
    }

    @And("the privacy policy box is clicked")
    public void thePrivacyPolicyBoxIsClicked() {
        homePage.clickOnPrivacyPolicyButton();
    }

    @When("the homepage continue button is clicked")
    public void clickContinueButton() {
        homePage.clickOnContinueButton();
    }
}
