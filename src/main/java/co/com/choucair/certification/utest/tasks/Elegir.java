package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.PaginaLocalizadora;
import co.com.choucair.certification.utest.userinterface.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Elegir implements Task {
    public static Elegir idioma() {
        return Tasks.instrumented(Elegir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaLocalizadora.CAMPO_IDIOMA));
    }
}
