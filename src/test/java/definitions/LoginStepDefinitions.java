package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import steps.LoginSteps;

/**
 * Created by Ardit Podrimaj
 */

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Steps
    DashboardSteps dashboardSteps;

    @Steps
    HomeSteps homeSteps;

    @Given("^User is logged in$")
    public void userIsLoggedIn() {
        dashboardSteps.clickLoginButton();
        loginSteps.enterEmail("kaltrina@fiek.com");
        loginSteps.enterPassword("12kaltrina");
        loginSteps.clickLoginButton();
    }

    @Then("^User should see homepage$")
    public void userShouldSeeDashboard() {
        homeSteps.verifyUserIsLoggedIn();
    }
}