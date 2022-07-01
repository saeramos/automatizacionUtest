package co.com.choucair.reto_Utest.tasks;

import co.com.choucair.reto_Utest.model.Devices;
import co.com.choucair.reto_Utest.model.RegistroUtest;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class AccountRegister{

    public static Performable FirstRegister(RegistroUtest dataForm) {//primera intefaz de registro
        return Tasks.instrumented(FirstRegister.class,dataForm);
    }
    public static Performable AddressInteraction(RegistroUtest dataForm) {//Segunda intefaz de registro
        return Tasks.instrumented(AddressRegister.class,dataForm);
    }

    public static Performable DeviceRegister(Devices dataForm) {//Tercera intefaz de registro
        return Tasks.instrumented(DeviceRegister.class,dataForm);
    }

    public static Performable LastRegister(RegistroUtest dataForm){
        return Tasks.instrumented(LastRegister.class,dataForm);
    }

}
