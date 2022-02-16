package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.PaginaLocalizadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class Diligenciar implements Task {
    public static Diligenciar firstName() {
        return Tasks.instrumented(Diligenciar.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(Enter.theValue("andrea").into(PaginaLocalizadora.CAMPO_FIRST));

    }
}
