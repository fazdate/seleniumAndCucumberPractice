package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactUsStepDefs extends AbstractStepDefs {

    @And("contact us link is clicked")
    public void contactUsLinkIsClicked() {
        homePage.clickContactUsLink();
    }

    @Given("the your name field is set to {string}")
    public void theYourNameFieldIsSetTo(String arg0) {
        homePage.setNameField(arg0);
    }

    @And("the e-mail address field is set to {string}")
    public void theEmailAddressFieldIsSetTo(String arg0) {
        homePage.setEmailField(arg0);
    }

    @And("the enquiry text is set to {string}")
    public void theEnquiryTextIsSetTo(String arg0) {
        homePage.setEnquiryField(arg0);
    }

    @When("the submit button is clicked")
    public void theSubmitButtonIsClicked() {
        homePage.clickSubmitButton();
    }

    @Then("the continue button is shown")
    public void theContinueButtonIsShown() {
        if (!homePage.isContinueButtonShown()) {
            Assert.fail();
        }
    }

}
