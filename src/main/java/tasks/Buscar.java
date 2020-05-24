package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.Google;

public class Buscar implements Task {
    private String palabra;

    public Buscar(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(palabra).into(Google.BUSCADOR)
        , Hit.the(Keys.ENTER).into(Google.BUSCADOR)
        );

    }

    public static Buscar laPalabra(String palabra){
        return Tasks.instrumented(Buscar.class,palabra);
    }

}
