package co.com.choucair.reto_Utest.tasks;

import co.com.choucair.reto_Utest.model.RegistroUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import static co.com.choucair.reto_Utest.userinterface.RegisterTwoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddressRegister implements Task {

    private RegistroUtest datosRegistro;

    public AddressRegister(RegistroUtest datosRegistro) {
        this.datosRegistro = datosRegistro;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                        WaitUntil.the(CITY, isVisible()),
                        Enter.theValue(datosRegistro.getCity()).into(CITY).thenHit(Keys.TAB)
                );

        actor.attemptsTo(
                Enter.theValue(datosRegistro.getPostalcode()).into(CODE_POSTAL),
                WaitUntil.angularRequestsHaveFinished(),
                Click.on(BUTTON_NEXT_DEVICES)
        );

    }
}
