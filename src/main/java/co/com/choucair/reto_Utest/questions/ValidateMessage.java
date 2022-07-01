package co.com.choucair.reto_Utest.questions;


import co.com.choucair.reto_Utest.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.reto_Utest.userinterface.RegisterComplete.L_WELCOME_MESSAGE;

@Subject("Get the welcome message to utest")
public class ValidateMessage implements Question<Boolean>{

        @Override
        public Boolean answeredBy(Actor actor) {

            String message = Text.of(L_WELCOME_MESSAGE).viewedBy(actor).asString();
            return Constants.WELCOME_MESSAGE.getValue().equals(message);

        }

        public static ValidateMessage ofWelcomeMessage() {
            return new ValidateMessage();
        }
}
