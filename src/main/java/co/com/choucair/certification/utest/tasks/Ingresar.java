package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Ingresar implements Task {
    private PaginaUtest paginaUtest;

    public static Ingresar utest() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaUtest));

    }

}
