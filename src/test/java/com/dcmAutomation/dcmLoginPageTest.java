package com.dcmAutomation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.dcmHomePage;
import pages.dcmLoginPage;

public class dcmLoginPageTest extends DriverInstance {
         dcmHomePage dcmHomePage = new dcmHomePage(driver);
         dcmLoginPage dcmLoginPage = new dcmLoginPage(driver);


         @Given("^User launches application$")
    public void userLaunchesApplication() throws Throwable{
             System.out.println("User launches application");

    }

    @Then("^User clicks on Login button$")
    public void user_clicks_on_Login_button() throws Throwable {
        dcmHomePage.clickLoginButton();
    }

    @When("^User enters Email address and Password$")
    public void user_enters_Email_address_and_Password() throws Throwable {
          dcmLoginPage.doLogin("aamu@dynamiccrowdmeasurement.com.au", "Dcm@2020!");

    }

    @Then("^User clicks on the Continue button$")
    public void user_clicks_on_the_Continue_button() throws Throwable {
           dcmLoginPage.clickButton();
    }

    @Then("^User should see the Dashboard displayed$")
    public void user_should_see_the_Dashboard_displayed() throws Throwable {
        dcmLoginPage.assertDashboard();
    }

}
