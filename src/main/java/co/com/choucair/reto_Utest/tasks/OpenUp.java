package co.com.choucair.reto_Utest.tasks;

import co.com.choucair.reto_Utest.userinterface.UtestUrl;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenUp implements Task {

    private UtestUrl utestUrl;

    public OpenUp() {}

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }


    @Override
    @Step("The Utest page opens")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Open.browserOn(utestUrl) );
    }
}
