package co.com.choucair.reto_Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage {

    public static Target BUTTON_JOIN = Target.the("Join Today")
            .located(By.xpath("//a[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
    public static Target FIRST_NAME = Target.the("First Name")
            .located(By.id("firstName"));

    public static Target LAST_NAME = Target.the("Last Name")
            .located(By.id("lastName"));
    public static Target EMAIL = Target.the("Email Address")
            .located(By.id("email"));
    public static Target BIRTH_MONTH = Target.the("Select Birth Month")
            .located(By.xpath("//select['birthMonth']/option[contains(text(),'December')]"));
    public static Target BIRTH_DAY = Target.the("Select Birth Day")
            .located(By.xpath("//select['birthDay']/option[contains(text(),'16')]"));
    public static Target BIRTH_YEAR = Target.the("Select Birth Year")
            .located(By.xpath("//select['birthYear']/option[contains(text(),'1995')]"));
    public static Target NEXT_LOCATION = Target.the("Click in button Next Location")
            .located(By.xpath("//div/a/span[contains(text(),'Next: Location')]"));
    public static Target CITY = Target.the("Enter your City")
            .located(By.id("city"));
    public static Target CODE_POSTAL = Target.the("Enter your Postal Code")
            .located(By.id("zip"));
    public static Target COUNTRY  = Target.the("Select the country").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static Target COUNTRY1 = Target.the("Select the country").located(By.xpath("//*[@id=\"ui-select-choices-row-6-51\"]/span/div"));


}
