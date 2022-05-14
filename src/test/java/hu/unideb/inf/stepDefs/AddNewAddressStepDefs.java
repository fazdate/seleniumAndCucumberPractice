package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddNewAddressStepDefs extends AbstractStepDefs {

    @Given("the address book button is clicked")
    public void theAddressBookButtonIsClicked() {
        addressBookPage.clickAddressBookButton();
    }

    @And("the new address button is clicked")
    public void theNewAddressButtonIsClicked() {
        addressBookPage.clickNewAddressButton();
    }

    @Given("the first name field is set to {string}")
    public void theFirstNameFieldIsChangedTo(String arg0) {
        addressBookPage.fillFirstNameField(arg0);
    }

    @Given("the last name field is set to {string}")
    public void theLastNameFieldIsChangedTo(String arg0) {
        addressBookPage.fillLastNameField(arg0);
    }

    @And("the address field is set to {string}")
    public void theAddressFieldIsChangedTo(String arg0) {
        addressBookPage.fillAddressField(arg0);
    }

    @And("the city field is set to {string}")
    public void theCityFieldIsChangedTo(String arg0) {
        addressBookPage.fillCityField(arg0);
    }

    @And("the post code field is set to {string}")
    public void thePostCodeFieldIsChangedTo(String arg0) {
        addressBookPage.fillPostCodeField(arg0);
    }

    @And("the country field is set to {string}")
    public void theCountryFieldIsSetToHungary(String arg0) {
        addressBookPage.setCountrySelect(arg0);
    }

    @And("the the region is set to the value {string}")
    public void theTheRegionIsSetToNone(String arg0) {
        addressBookPage.setRegionSelect(arg0);
    }

    @And("the default address radio is set to yes")
    public void theDefaultAddressRadioIsSetToYes() {
        addressBookPage.clickDefaultAddressRadio();
    }

    @When("the address continue button is clicked")
    public void clickContinueButton() {
        addressBookPage.clickContinueButton();
    }

    @Then("the address success text is shown")
    public void successTextIsShown() {
        if (!addressBookPage.isSuccessTextShown()) {
            Assert.fail();
        }
    }
}
