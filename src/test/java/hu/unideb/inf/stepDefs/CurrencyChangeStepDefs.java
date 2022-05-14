package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CurrencyChangeStepDefs extends AbstractStepDefs {

    @And("the macbook is clicked")
    public void clickMackBook() {
        homePage.clickOnMacBook();
    }

    @When("the currency button is clicked")
    public void theCurrencyButtonIsClicked() {
        homePage.clickCurrencyButton();
    }

    @And("the currency is changed to {string}")
    public void theCurrencyIsChangedToCurrency(String arg0) {
        homePage.clickOnCurrencyButton(arg0);
    }

    @Then("the price of macbook is {string}")
    public void thePriceOfMacbookIsPrice(String arg0) {
        Assert.assertEquals(arg0, homePage.getMacBookPrice());
    }

}
