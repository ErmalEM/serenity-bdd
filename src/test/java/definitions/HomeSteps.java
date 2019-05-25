package definitions;

import net.thucydides.core.steps.ScenarioSteps;
import org.assertj.core.api.Assertions;
import pages.HomePage;

public class HomeSteps extends ScenarioSteps {

    HomePage homePage;

    public void verifyUserIsLoggedIn() {

        Assertions.assertThat(homePage.getUserLabel().isPresent()).isTrue();
    }
}
