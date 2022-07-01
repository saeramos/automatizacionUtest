package co.com.choucair.reto_Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.core.annotations.findby.By.xpath;

public class RegisterComplete extends PageObject {

    public static final Target LBL_WELCOME_MESSAGE= Target.the("Welcome message")
            .located(xpath("//div[@class='image-box-header']//h1"));
}
