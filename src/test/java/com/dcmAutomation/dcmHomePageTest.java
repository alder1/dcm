package com.dcmAutomation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.dcmHomePage;

public class dcmHomePageTest extends DriverInstance {

    dcmHomePage dcmHomePage = new dcmHomePage(driver);


    @Given("^I am on the DCM Landing page$")
    public void iAmOnTheDCMLandingPage() throws Throwable {
        System.out.println("This is DCM login page");
    }

    @When("^I click on the Login button$")
    public void iClickOnTheLoginButton() throws Throwable {
        dcmHomePage.clickLoginButton();
    }

    @Then("^The Login Page should be displayed$")
    public void theLoginPageShouldBeDisplayed() throws Throwable {
        dcmHomePage.assertLoginPage();

    }

}
