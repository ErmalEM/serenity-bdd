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

    public void login(){
        loginPage.getEmailInput().type("your@email.com");
        loginPage.getPasswordInput().type("your.password");
        loginPage.getLoginButton().click();
    }
}