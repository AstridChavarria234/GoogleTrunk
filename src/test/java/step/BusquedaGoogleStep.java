package step;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Buscar;
import utils.MiChrome;

public class BusquedaGoogleStep {

    @Before
    public void before(){
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(MiChrome.enLaPagina("https://www.google.com"))));

    }

    @Given("^que el (.*) esta en google$")
    public void queElUsuarioEstaEnGoogle(String nombre) {
        OnStage.theActorCalled(nombre);
    }

    @When("^él busca la palabra (.*)")
    public void élBuscaLaPalabraImpresora(String palabra) {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.laPalabra(palabra));
    }

}
