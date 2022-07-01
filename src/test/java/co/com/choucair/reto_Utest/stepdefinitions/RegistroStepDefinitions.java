package co.com.choucair.reto_Utest.stepdefinitions;


import co.com.choucair.reto_Utest.model.RegistroUtest;
import co.com.choucair.reto_Utest.tasks.AccountRegister;
import co.com.choucair.reto_Utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

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
        theActorCalled(actor).wasAbleTo(OpenUp.thePage());
    }

    @When("^He enter the necessary data to proceed with the registration$")
    public void enterTheNecessaryDataToProceedWithTheRegistration(List <RegistroUtest> dataRegistro) {
        theActorInTheSpotlight().attemptsTo(
                AccountRegister.FirstRegister(dataRegistro.get(0)),
                AccountRegister.AddressInteraction(dataRegistro.get(0)),
                AccountRegister.DeviceRegister(dataRegistro.get(0)),
                AccountRegister.LastRegister(dataRegistro.get(0))
                );
    }

    @Then("^validate successful registration message$")
    public void validateSuccessfulRegistrationMessage(){

    }


}
