package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchStepDefs extends AbstractStepDefs {

    @And("the search bar is filled with {string}")
    public void theSearchBarIsFilledWith(String arg0) {
        homePage.setSearchBar(arg0);
    }

    @And("the search button is clicked")
    public void theSearchButtonIsClicked() {
        homePage.clickSearchButton();
    }

    @And("the first product is clicked")
    public void theFirstProductIsClicked() {
        homePage.clickOnFirstProduct();
    }

    @And("the quantity is set to {string}")
    public void theQuantityIsSetTo(String arg0) {
        homePage.setQuantityField(arg0);
    }

    @And("the add to cart button is clicked")
    public void theAddToCartButtonIsClicked() {
        homePage.clickAddToCartButton();
    }

    @When("the cart is clicked")
    public void theCartIsClicked() {
        homePage.clickCartButton();
    }

    @Then("the Total should be {string}")
    public void theTotalShouldBe(String arg0) {
        Assert.assertEquals(arg0, homePage.getTotalAmount());
    }
}
