package co.com.choucair.reto_Utest.tasks;

import co.com.choucair.reto_Utest.model.RegistroUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.reto_Utest.userinterface.RegisterFourPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LastRegister implements Task {

    private RegistroUtest datosRegistro;

    public LastRegister(RegistroUtest datosRegistro) {
        this.datosRegistro = datosRegistro;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(INPUT_PASSWORD, isVisible()),
                Enter.theValue(datosRegistro.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(datosRegistro.getPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(BOX_STAY_INFORMED),
                Click.on(BOX_ACCEPT_TERM),
                Click.on(BOX_ACCEPT_PRIVACY),
                Click.on(BUTTON_COMPLETED)
        );
    }
}
