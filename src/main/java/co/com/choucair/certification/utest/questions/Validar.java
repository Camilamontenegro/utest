package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.userinterface.PaginaLocalizadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question {
    public static Validar mensaje() {
        return new Validar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaLocalizadora.UBICACION).viewedBy(actor).asString();
    }
}
