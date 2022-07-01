package co.com.choucair.reto_Utest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.JavascriptExecutor;
import net.serenitybdd.screenplay.targets.Target;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Click_web  implements Performable {

        Target target;

        public Click_web(Target target) {
            this.target = target;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            JavascriptExecutor exe = (JavascriptExecutor)getDriver();
            exe.executeScript("document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();",target.getCssOrXPathSelector());
        }

        public static Click_web onXpath(Target target){
            return Tasks.instrumented(Click_web.class, target);
        }

}
