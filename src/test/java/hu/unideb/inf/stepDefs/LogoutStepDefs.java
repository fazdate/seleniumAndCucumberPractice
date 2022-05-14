package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs extends AbstractStepDefs {

    @When("the logout button is clicked")
    public void theLogoutButtonIsClicked() {
        myAccountPage.clickLogoutButton();
    }

    @Then("account logout text is shown")
    public void accountLogoutTextIsShown() {
        if (!myAccountPage.isLogoutTextShown()) {
            Assert.fail();
        }
    }
}
