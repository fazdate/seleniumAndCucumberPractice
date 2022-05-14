package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ChangeAccountStepDefs extends AbstractStepDefs {

    @Given("the edit account information link is clicked")
    public void clickEditAccountInformationLink() {
        myAccountPage.clickEditAccountLink();
    }

    @Given("the first name field is changed to {string}")
    public void theFirstNameFieldIsChangedTo(String arg0) {
        myAccountPage.fillFirstNameField(arg0);
    }

    @Given("the last name field is changed to {string}")
    public void theLastNameFieldIsChangedTo(String arg0) {
        myAccountPage.fillLastNameField(arg0);
    }

    @Given("the telephone field is changed to {string}")
    public void theTelephoneFieldIsChangedTo(String arg0) {
        myAccountPage.fillTelephoneField(arg0);
    }

    @When("the continue button is clicked")
    public void clickContinueButton() {
        myAccountPage.clickContinueButton();
    }

    @Then("the success text is shown")
    public void successTextIsShown() {
        if (!myAccountPage.isSuccessTextShown()) {
            Assert.fail();
        }
    }
}
