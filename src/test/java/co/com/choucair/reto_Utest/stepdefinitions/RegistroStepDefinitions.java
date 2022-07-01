package co.com.choucair.reto_Utest.stepdefinitions;


import co.com.choucair.reto_Utest.exceptions.CreaterAccountFailed;
import co.com.choucair.reto_Utest.model.Devices;
import co.com.choucair.reto_Utest.model.RegistroUtest;
import co.com.choucair.reto_Utest.questions.ValidateMessage;
import co.com.choucair.reto_Utest.tasks.AccountRegister;
import co.com.choucair.reto_Utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

public class RegistroStepDefinitions {

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) proceeds to open the page utest$")
    public void ProceedsToOpenThePageUtest(String actor){
        theActorCalled(actor);
        theActorInTheSpotlight().wasAbleTo(OpenUp.thePage());
    }

    @When("^He enter the necessary data to proceed with the registration$")
    public void enterTheNecessaryDataToProceedWithTheRegistration(List <RegistroUtest> dataRegistro) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                AccountRegister.FirstRegister(dataRegistro.get(0)),
                AccountRegister.AddressInteraction(dataRegistro.get(0))
                );
    }
    @When("^Proceed to enter the device data in the registration form$")
    public void proceedToEnterTheDeviceDataInTheRegistrationForm(List<Devices> device)  {
        theActorInTheSpotlight().attemptsTo( AccountRegister.DeviceRegister(device.get(0)));
    }

    @When("^Enter the password for the user to register$")
    public void enterThePasswordForTheUserToRegister(List<RegistroUtest> u) {
        theActorInTheSpotlight().attemptsTo(AccountRegister.LastRegister(u.get(0)));
    }

    @Then("^validate successful registration message$")
    public void validateSuccessfulRegistrationMessage(){
        theActorInTheSpotlight().should(
                seeThat(ValidateMessage.ofWelcomeMessage(), Matchers.equalTo(true)).orComplainWith(CreaterAccountFailed.class)
        );
    }


}
