package co.com.choucair.reto_Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.core.annotations.findby.By.xpath;
import static net.serenitybdd.core.annotations.findby.By.id;

public class RegisterOnePage extends PageObject {

    public static Target BUTTON_JOIN = Target.the("Join Today")
            .located(xpath("//a[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
    public static Target FIRST_NAME = Target.the("First Name")
            .located(id("firstName"));

    public static Target LAST_NAME = Target.the("Last Name")
            .located(id("lastName"));
    public static Target EMAIL = Target.the("Email Address")
            .located(id("email"));
    public static Target BIRTH_MONTH = Target.the("Select Birth Month")
            .located(xpath("//select['birthMonth']/option[contains(text(),'December')]"));
    public static Target BIRTH_DAY = Target.the("Select Birth Day")
            .located(xpath("//select['birthDay']/option[contains(text(),'16')]"));
    public static Target BIRTH_YEAR = Target.the("Select Birth Year")
            .located(xpath("//select['birthYear']/option[contains(text(),'1995')]"));
    public static Target SELECT_LANGUAGE = Target.the("Where select the Languages")
            .located(xpath("//input[@type='search']"));
    public static Target NEXT_LOCATION = Target.the("Click in button Next Location")
            .located(xpath("//div/a/span[contains(text(),'Next: Location')]"));


}
