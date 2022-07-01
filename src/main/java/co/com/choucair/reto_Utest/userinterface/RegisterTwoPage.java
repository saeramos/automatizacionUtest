package co.com.choucair.reto_Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import  net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.core.annotations.findby.By.xpath;
import static net.serenitybdd.core.annotations.findby.By.id;

public class RegisterTwoPage extends PageObject {

    public static Target CITY = Target.the("Enter your City")
            .located(id("city"));
    public static Target CODE_POSTAL = Target.the("Enter your Postal Code")
            .located(id("zip"));
    public static Target COUNTRY  = Target.the("Select the country")
            .located(xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static Target COUNTRY1 = Target.the("Select the country")
            .located(xpath("//*[@id='ui-select-choices-row-6-51']/span/div"));
    public static Target BUTTON_NEXT_DEVICES = Target.the("Click to continue")
            .located(xpath("//a[@class='btn btn-blue pull-right']//span"));
}
