package co.com.choucair.reto_Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


import static net.serenitybdd.core.annotations.findby.By.*;



public class RegisterThreePage extends PageObject {

    public static final Target COMPUTER = Target.the("Select your computer")
            .located(name("osId"));

    public static final Target VERSION = Target.the("Select your version computer")
            .located(name("osVersionId"));

    public static final Target LANGUAGE = Target.the("Select your language")
            .located(name("osLanguageId"));

    public static final Target MOBILE_DEVICE = Target.the("Select your mobile")
            .located(name("handsetMakerId"));

    public static final Target MODEL = Target.the("Select your model of mobile")
            .located(name("handsetModelId"));
    public static final Target MODEL_LIST = Target.the("Select your model of mobile")
            .located(xpath("//input[@placeholder='Select a Model']"));

    public static final Target OPERATING_SYSTEM = Target.the("where we select the mobile operating system")
            .located(name("handsetOSId"));

    public static final Target LIST_ELEMENT_SELECTION = Target.the("Select item list")
            .locatedBy("//div[text()='{0}']");

    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("We click to continue")
            .located(xpath("//a[@Class='btn btn-blue pull-right']//span"));


}
