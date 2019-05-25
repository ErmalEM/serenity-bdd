package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by Ardit Podrimaj
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginPage extends PageObject {

    @FindBy(id = "email")
    WebElementFacade emailInput;

    @FindBy(id = "password")
    WebElementFacade passwordInput;

    @FindBy(css = ".btn.btn-primary")
    WebElementFacade loginButton;
}