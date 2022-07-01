package co.com.choucair.reto_Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.core.annotations.findby.By.xpath;



public class RegisterThreePage extends PageObject {

    public static final Target COMPUTER = Target.the("Select your computer")
            .located(xpath("//div[@name='osId']"));

    public static final Target VERSION = Target.the("Select your version computer")
            .located(xpath("//div[@name='osVersionId']"));

    public static final Target LANGUAGE = Target.the("Select your language")
            .located(xpath("//div[@name='osLanguageId']"));

    public static final Target MOBILE_DEVICE = Target.the("Select your mobile")
            .located(xpath("//div[@name='handsetMakerId']"));

    public static final Target MODEL = Target.the("Select your model of mobile")
            .located(xpath("//div[@name='handsetModelId']"));

    public static final Target OPERATING_SYSTEM = Target.the("where we select the mobile operating system")
            .located(xpath("//div[@name='handsetOSId']"));

    public static final Target LIST_ELEMENT_SELECTION = Target.the("Select item list")
            .locatedBy("//div[text()='{0}']");

    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("We click to continue")
            .located(xpath("//a[@Class='btn btn-blue pull-right']//span"));


}
