package co.com.choucair.reto_Utest.tasks;

import co.com.choucair.reto_Utest.model.RegistroUtest;
import co.com.choucair.reto_Utest.userinterface.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Register implements Task {

    private List<RegistroUtest> datosRegistro;

    public Register(List<RegistroUtest> datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    public static Register Interaction(List <RegistroUtest> dataForm) {
        return Tasks.instrumented(Register.class,dataForm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistroPage.BUTTON_JOIN),
                Enter.theValue(datosRegistro.get(0).getFirst_name())
                        .into(RegistroPage.FIRST_NAME),
                Enter.theValue(datosRegistro.get(0).getLast_name()).into(RegistroPage.LAST_NAME),
                Enter.theValue(datosRegistro.get(0).getEmail()).into(RegistroPage.EMAIL),
                Click.on(RegistroPage.BIRTH_MONTH),
                Click.on(RegistroPage.BIRTH_DAY),
                Click.on(RegistroPage.BIRTH_YEAR),
                Click.on(RegistroPage.NEXT_LOCATION),
                Enter.theValue(datosRegistro.get(0).getCity()).into(RegistroPage.CITY),
                Enter.theValue(datosRegistro.get(0).getPostalcode()).into(RegistroPage.CODE_POSTAL),
                Click.on(RegistroPage.COUNTRY)


        );
    }

}
