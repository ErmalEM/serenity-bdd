package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

/**
 * Created by Ardit Podrimaj
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    public void enterEmail(String email) {
        loginPage.getEmailInput().type(email);
    }

    public void enterPassword(String password) {
        loginPage.getPasswordInput().type(password);
    }

    public void clickLoginButton() {
        loginPage.getLoginButton().click();
    }
}