package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WishlistStepDefs extends AbstractStepDefs {

    @And("the search field is filled with {string}")
    public void theSearchFieldIsFilledWith(String arg0) {
        homePage.setSearchBar(arg0);
    }

    @And("the iphone is clicked")
    public void theIphoneIsClicked() {
        homePage.clickOnIphonePicture();
    }

    @When("the add to wishlist button is clicked")
    public void theAddToWishlistButtonIsClicked() {
        homePage.clickOnAddToWishlistButton();
    }

    @Then("the wish list success text is shown")
    public void theSuccessTextIsShown() {
        if (!homePage.isSuccessTextShown()) {
            Assert.fail();
        }
    }

    @And("the wishlist link is clicked")
    public void theWishlistLinkIsClicked() {
        homePage.clickOnWishlistLink();
    }

    @And("the iphone is in the wishlist")
    public void theIphoneIsInTheWishlist() {
        Assert.assertEquals("iPhone", homePage.getValueOfFirstWishlistElement());
    }

}
