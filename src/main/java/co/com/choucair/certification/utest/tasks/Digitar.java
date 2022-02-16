package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.PaginaLocalizadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Digitar implements Task {

    public static Digitar emailAddress() {
        return Tasks.instrumented(Digitar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("andrea123@gmail.com").into(PaginaLocalizadora.CAMPO_EMAIL));
    }
}
