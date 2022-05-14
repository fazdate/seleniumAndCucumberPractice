package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartStepDefs extends AbstractStepDefs {

    @Given("iphone is clicked")
    public void clickOnIphone() {
        homePage.clickOnIphone();
    }

    @Given("the qty is set to {string}")
    public void theQtyIsSetToQuantity(String arg0) {
        homePage.setQuantityField(arg0);
    }

    @When("the add to cart is clicked")
    public void theAddToCartIsClicked() {
        homePage.clickAddToCartButton();
    }

    @And("the cart button is clicked")
    public void theCartButtonIsClicked() {
        homePage.clickCartButton();
    }

    @Then("the sub-total is {string}")
    public void theSubTotalIsSubTotal(String arg0) {
        Assert.assertEquals(arg0, homePage.getSubTotal());
    }

    @And("the vat is {string}")
    public void theVatIsVat(String arg0) {
        Assert.assertEquals(arg0, homePage.getVat());
    }

    @And("the total is {string}")
    public void theTotalIsTotal(String arg0) {
        Assert.assertEquals(arg0, homePage.getTotalAmount());
    }

    @And("clear cart button is clicked")
    public void clearCartButtonIsClicked() {
        homePage.clickOnClearCartButton();
    }
}
