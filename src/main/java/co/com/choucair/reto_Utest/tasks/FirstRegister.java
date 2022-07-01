package co.com.choucair.reto_Utest.tasks;

import co.com.choucair.reto_Utest.model.RegistroUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Arrays;

import static co.com.choucair.reto_Utest.userinterface.RegisterOnePage.*;

public class FirstRegister implements Task {

    private RegistroUtest datosRegistro;

    public FirstRegister(RegistroUtest datosRegistro) {
        this.datosRegistro = datosRegistro;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        datosRegistro.setIdioms(Arrays.asList("Spanish", "German", "Italian"));
        actor.attemptsTo(
                Click.on(BUTTON_JOIN),
                Enter.theValue(datosRegistro.getFirst_name())
                        .into(FIRST_NAME),
                Enter.theValue(datosRegistro.getLast_name()).into(LAST_NAME),
                Enter.theValue(datosRegistro.getEmail()).into(EMAIL),
                Click.on(BIRTH_MONTH),
                Click.on(BIRTH_DAY),
                Click.on(BIRTH_YEAR)


        );
        datosRegistro.getIdioms().forEach(language->
                actor.attemptsTo(
                        Enter.theValue(language).into(SELECT_LANGUAGE)
                                .thenHit(Keys.ARROW_DOWN)
                                .thenHit(Keys.ENTER))
        );
        actor.attemptsTo(
                WaitUntil.the(NEXT_LOCATION, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Click.on(NEXT_LOCATION)
        );

    }

}
