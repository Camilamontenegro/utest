package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.PaginaLocalizadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Presionardos implements Task {
    public static Presionardos nextLocation() {
        return Tasks.instrumented(Presionardos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaLocalizadora.BOTON_NEXTLOCATION));
    }
}
