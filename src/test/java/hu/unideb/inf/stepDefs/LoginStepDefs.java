package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs extends AbstractStepDefs {

    @And("my account is clicked")
    public void clickMyAccount() {
        homePage.clickMyAccountButton();
    }

    @And("login is clicked")
    public void clickLogin() {
        homePage.clickLoginButton();
    }

    @Given("the email field is filled with {string}")
    public void fillEmailField(String string) {
        homePage.setEmailField(string);
    }

    @Given("the password field is filled with {string}")
    public void fillPasswordField(String string) {
        homePage.setPasswordField(string);
    }

    @When("the Sign In button is clicked")
    public void clickFormLoginButton() {
        homePage.clickFormLoginButton();
    }

    @Then("the user has logged in")
    public void checkIfLoggedIn() {
        if (!homePage.checkIfLoggedIn()) {
            Assert.fail();
        }
    }

    @Then("the error message is shown")
    public void loginErrorMessageIsShown(){
        if (!homePage.checkIfErrorIsShown()) {
            Assert.fail();
        }
    }

}
