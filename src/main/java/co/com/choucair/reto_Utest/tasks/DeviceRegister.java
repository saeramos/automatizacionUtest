package co.com.choucair.reto_Utest.tasks;

import co.com.choucair.reto_Utest.model.RegistroUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class DeviceRegister implements Task {

    private RegistroUtest datosRegistro;

    public DeviceRegister(RegistroUtest datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
