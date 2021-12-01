$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dcmHomePage.feature");
formatter.feature({
  "line": 1,
  "name": "As a user of DCM I want to be able to login to the application and create projects",
  "description": "",
  "id": "as-a-user-of-dcm-i-want-to-be-able-to-login-to-the-application-and-create-projects",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4848929500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "as-a-user-of-dcm-i-want-to-be-able-to-login-to-the-application-and-create-projects;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the DCM Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the Login button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The Login Page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "dcmHomePageTest.iAmOnTheDCMLandingPage()"
});
formatter.result({
  "duration": 426245300,
  "status": "passed"
});
formatter.match({
  "location": "dcmHomePageTest.iClickOnTheLoginButton()"
});
formatter.result({
  "duration": 1643138500,
  "status": "passed"
});
formatter.match({
  "location": "dcmHomePageTest.theLoginPageShouldBeDisplayed()"
});
formatter.result({
  "duration": 103434500,
  "status": "passed"
});
formatter.after({
  "duration": 729425400,
  "status": "passed"
});
formatter.uri("dcmLoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "As a user of DCM application,I want to be able to test all the scenarios of login",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1997886900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Check Login with valid Email address and Password",
  "description": "",
  "id": "login;check-login-with-valid-email-address-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launches application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters Email address and Password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User should see the Dashboard displayed",
  "keyword": "And "
});
formatter.match({
  "location": "dcmLoginPageTest.userLaunchesApplication()"
});
formatter.result({
  "duration": 1941500,
  "status": "passed"
});
formatter.match({
  "location": "dcmLoginPageTest.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 563849500,
  "status": "passed"
});
formatter.match({
  "location": "dcmLoginPageTest.user_enters_Email_address_and_Password()"
});
formatter.result({
  "duration": 2167895000,
  "status": "passed"
});
formatter.match({
  "location": "dcmLoginPageTest.user_clicks_on_the_Continue_button()"
});
formatter.result({
  "duration": 1136372400,
  "status": "passed"
});
formatter.match({
  "location": "dcmLoginPageTest.user_should_see_the_Dashboard_displayed()"
});
formatter.result({
  "duration": 2425285100,
  "status": "passed"
});
formatter.after({
  "duration": 731204300,
  "status": "passed"
});
});