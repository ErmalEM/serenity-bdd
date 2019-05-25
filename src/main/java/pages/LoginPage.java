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

//    @FindBy(id = "email")
//    WebElementFacade emailInput;
//
//    @FindBy(id = "pass")
//    WebElementFacade passwordInput;
//
//    @FindBy(css = "[value=\"Log In\"]")
//    WebElementFacade loginButton;

      @FindBy(css = "[href = \"/login\"")
      WebElementFacade loginButton;

      @FindBy(id = "pass")
      WebElementFacade passwordInput;
}