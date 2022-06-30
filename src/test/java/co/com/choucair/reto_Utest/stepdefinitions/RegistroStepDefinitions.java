package co.com.choucair.reto_Utest.stepdefinitions;


import co.com.choucair.reto_Utest.model.RegistroUtest;
import co.com.choucair.reto_Utest.tasks.OpenUp;
import co.com.choucair.reto_Utest.tasks.Register;
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

    @When("^Enter the necessary data to proceed with the registration$")
    public void enterTheNecessaryDataToProceedWithTheRegistration(List <RegistroUtest> dataRegistro){
        theActorInTheSpotlight().attemptsTo(Register.Interaction(dataRegistro));
    }

    @Then("^validate successful registration message$")
    public void validateSuccessfulRegistrationMessage(){

    }


}
