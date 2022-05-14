package hu.unideb.inf.stepDefs;

import io.cucumber.java.en.Given;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("the homepage is open")
    public void openHomePage() {
        homePage.openPage();
    }

    @Given("the my account page is opened")
    public void openMyAccountPage() {
        myAccountPage.openPage();
    }

    @Given("the address book page is opened")
    public void openPage() {
        addressBookPage.openPage();
    }
}
