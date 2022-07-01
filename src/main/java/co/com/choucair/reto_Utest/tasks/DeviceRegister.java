package co.com.choucair.reto_Utest.tasks;

import co.com.choucair.reto_Utest.interactions.Click_web;
import co.com.choucair.reto_Utest.model.RegistroUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.reto_Utest.userinterface.RegisterThreePage.*;


public class DeviceRegister implements Task {

    private RegistroUtest datosRegistro;

    public DeviceRegister(RegistroUtest datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER),
                Click_web.onXpath(LIST_ELEMENT_SELECTION.of(datosRegistro.getComputer())),

                Click.on(VERSION),
                Click_web.onXpath(LIST_ELEMENT_SELECTION.of(datosRegistro.getVersion())),

                Click.on(LANGUAGE),
                Click_web.onXpath(LIST_ELEMENT_SELECTION.of(datosRegistro.getLanguage())),

                Click.on(MOBILE_DEVICE),
                Click_web.onXpath(LIST_ELEMENT_SELECTION.of(datosRegistro.getMobile())),

                Click.on(MODEL),
                Enter.theValue(datosRegistro.getModel()).into(MODEL_LIST).thenHit(Keys.TAB),

                Click.on(OPERATING_SYSTEM),
                Click_web.onXpath(LIST_ELEMENT_SELECTION.of(datosRegistro.getSystem())),

                Click.on(BUTTON_NEXT_LAST_STEP)
        );

    }
}
