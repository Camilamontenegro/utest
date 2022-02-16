package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.questions.Validar;
import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class MyStepDefinitions {
    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que andrea ingresa a la app utest$")
    public void queAndreaIngresaALaAppUtest() {
        OnStage.theActorCalled("andrea").wasAbleTo(Ingresar.utest());
    }

    @And("^da click en el boton Join Today$")
    public void daClickEnElBotonJoinToday() {
        OnStage.theActorInTheSpotlight().attemptsTo(Presionar.joinToday());
    }

    @And("^ingresa su first name$")
    public void ingresaSuFirstName() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.firstName());
    }

    @And("^ingresa last name$")
    public void ingresaLastName() {
        OnStage.theActorInTheSpotlight().attemptsTo(Escribir.lastName());
    }

    @And("^ingresa email address$")
    public void ingresaEmailAddress() {
        OnStage.theActorInTheSpotlight().attemptsTo(Digitar.emailAddress());
    }

    @And("^ingresa su date of birth$")
    public void ingresaSuDateOfBirth() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.dateBirth());
    }

    @And("^selecciona el lenguaje$")
    public void seleccionaElLenguaje() {
        OnStage.theActorInTheSpotlight().attemptsTo(Elegir.idioma());
    }

    @When("^da click en el boton next location$")
    public void daClickEnElBotonNextLocation() {
        OnStage.theActorInTheSpotlight().attemptsTo(Presionardos.nextLocation());
    }

    @Then("^verifica que lo direcciona a los datos de ubicacion$")
    public void verificaQueLoDireccionaALosDatosDeUbicacion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.mensaje(), Matchers.equalTo("Add Your Address")));
    }
}
