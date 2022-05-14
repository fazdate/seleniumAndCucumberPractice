package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ReturnsStepDefs extends AbstractStepDefs {

    @Given("Returns link is clicked")
    public void returnsLinkIsClicked() {
        homePage.clickOnReturnsLink();
    }

    @Given("the first name is set to {string}")
    public void theFirstNameIsSetTo(String arg0) {
        homePage.setFirstNameFieldTo(arg0);
    }

    @And("the last name is set to {string}")
    public void theLastNameIsSetTo(String arg0) {
        homePage.setLastNameFieldTo(arg0);
    }

    @And("the telephone field is set to {string}")
    public void theTelephoneFieldIsSetTo(String arg0) {
        homePage.setTelephoneField(arg0);
    }

    @And("the order id field is set to {string}")
    public void theOrderIdFieldIsSetTo(String arg0) {
        homePage.setOrderIdField(arg0);
    }

    @And("the order date field is set to {string}")
    public void theOrderDateFieldIsSetTo(String arg0) {
        homePage.setDateOrderedField(arg0);
    }

    @And("the product name is set to {string}")
    public void theProductNameIsSetTo(String arg0) {
        homePage.setProductNameField(arg0);
    }

    @And("the product code is set to {string}")
    public void theProductCodeIsSetTo(String arg0) {
        homePage.setProductCodeField(arg0);
    }

    @And("the reason for return is set to Order error")
    public void theReasonForReturnIsSetToOrderError() {
        homePage.clickOnOrderErrorRadioButton();
    }

    @And("the product is opened to Yes")
    public void theProductIsOpenedToYes() {
        homePage.clickOnYesRadioButton();
    }
}
