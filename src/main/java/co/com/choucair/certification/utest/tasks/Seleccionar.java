package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.PaginaLocalizadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.css.sac.SelectorList;

import java.util.concurrent.TimeUnit;

public class Seleccionar implements Task {
    public static Seleccionar dateBirth() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(PaginaLocalizadora.CAMPO_MES),
               Click.on(PaginaLocalizadora.CAMPO_MARCH),
               Click.on(By.xpath("//*[@id='birthDay']")),
               Click.on(PaginaLocalizadora.CAMPO_12),
                Click.on(PaginaLocalizadora.CAMPO_ANNO),
                Click.on(PaginaLocalizadora.CAMPO_1997)
       );

    }


    public void tiempo() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
