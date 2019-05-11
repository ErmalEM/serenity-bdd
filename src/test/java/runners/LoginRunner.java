package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Ardit Podrimaj
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="classpath:features/Login.feature",
        glue = "classpath:definitions")
public class LoginRunner {

}