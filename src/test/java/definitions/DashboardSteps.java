package definitions;

import net.thucydides.core.steps.ScenarioSteps;
import pages.DashboardPage;

public class DashboardSteps extends ScenarioSteps {

    DashboardPage dashboardPage;

    public void clickLoginButton() {

        dashboardPage.getLoginButton().click();
    }
}
