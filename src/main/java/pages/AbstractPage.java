package pages;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import enums.WaitDuration;

import java.time.temporal.ChronoUnit;
import java.util.Date;

import static java.time.Duration.of;

@Slf4j
public class AbstractPage extends PageObject {

    private FluentWait<WebDriver> getFluentWait(Integer duration) {
        return new WebDriverWait(getDriver(), duration)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotVisibleException.class);
    }

    public WebElementFacade waitForVisibility(final WebElementFacade webElementFacade) {
        return $(getFluentWait(WaitDuration.DEFAULT.getDuration()).until(ExpectedConditions.visibilityOf(webElementFacade)));
    }

    public WebElementFacade waitForPresence(final By elementSelector) {
        return $(getFluentWait(WaitDuration.DEFAULT.getDuration()).until(ExpectedConditions.presenceOfElementLocated(elementSelector)));
    }

    public AbstractPage waitForLoaderToComplete() {

        final Date startTime = new Date();
        try {
            getRenderedView()
                    .doWait()
                    .withTimeout(of(WaitDuration.DEFAULT.getDuration(), ChronoUnit.SECONDS))
                    .pollingEvery(of(WaitDuration.BASE_POLLING_INTERVAL_MS.getDuration(), ChronoUnit.MILLIS))
                    .until((ExpectedCondition<Boolean>) driver -> evaluateJavascript("var isLoaded = true;\n" +
                            "if (document.querySelector('.loader, #loader, .loader-lg')!== null) {\n" +
                            "  var loader = document.querySelector('.loader, #loader, .loader-lg');\n" +
                            "  var isHiddenByClass = loader.classList.contains('hidden')\n" +
                            "  var isHiddenByStyle = loader.style.display && loader.style.display === 'none';\n" +
                            "  isLoaded = isHiddenByClass || isHiddenByStyle;\n" +
                            "} \n" +
                            "return isLoaded;\n").toString().equalsIgnoreCase("true"));
            final Date endTime = new Date();
            log.trace("loader execution on page took about {} milliseconds", endTime.getTime() - startTime.getTime());
        } catch (Exception e) {
            log.debug("Page wasn't loaded", e.getLocalizedMessage());
        }
        return this;
    }

    public void jsClick(WebElementFacade webElementFacade){
        evaluateJavascript("arguments[0].click();",waitFor(webElementFacade));
    }

    public void javaScriptClick(String locator){
        evaluateJavascript("document.querySelector('[href=\"http://127.0.0.1:1234/login\"]').click();");
    }
}