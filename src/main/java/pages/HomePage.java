package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class HomePage extends AbstractPage {

    @FindBy(id = "navbarDropdown")
    WebElementFacade userLabel;
}
