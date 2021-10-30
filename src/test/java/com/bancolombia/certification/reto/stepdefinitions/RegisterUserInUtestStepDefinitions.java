package com.bancolombia.certification.reto.stepdefinitions;

import com.bancolombia.certification.reto.iserinterfaces.InitialPage;
import com.bancolombia.certification.reto.questions.TheWelcomeMessage;
import com.bancolombia.certification.reto.tasks.FillForm;
import com.bancolombia.certification.reto.tasks.GoToRegisterModule;
import com.bancolombia.certification.reto.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class RegisterUserInUtestStepDefinitions {
private InitialPage page;

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }

    @Given("^(.*) is on the utest page$")
    public void theUserIsOnTheUtestPage(String name) {
        theActorCalled(name).wasAbleTo(OpenTheBrowser.on(page));
    }
    @Given("^go to the register module$")
    public void goToTheRegisterModule() {
    theActorInTheSpotlight().attemptsTo(GoToRegisterModule.userRegister());
    }

    @When("^enter his dates in the module$")
    public void enterHisDatesInTheModule() {
    theActorInTheSpotlight().attemptsTo(FillForm.whithDates());
    }

    @Then("^shoul see the welcome message (.*)$")
    public void shoulSeeTheWelcomeMessage(String message) {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheWelcomeMessage.onThePage(), Matchers.is(message)));
    }

}
