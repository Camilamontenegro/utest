package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLocalizadora {

    public static final Target JOIN_TODAY = Target.the("Presionarjointoday").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target CAMPO_FIRST = Target.the("campofirst").located(By.id("firstName"));
    public static final Target CAMPO_LAST = Target.the("campolast").located(By.id("lastName"));
    public static final Target CAMPO_EMAIL = Target.the("campoemail").located(By.id("email"));
    public static final Target CAMPO_MES = Target.the("campomes").located(By.id("birthMonth"));
    public static final Target CAMPO_MARCH = Target.the("campomarch").located(By.xpath("//option[contains(text(),'January')]"));
    public static final Target CAMPO_DIA = Target.the("campodia").located(By.cssSelector("#birthDay"));
    public static final Target CAMPO_12 = Target.the("campo10").located(By.cssSelector("//option[@label='10']"));
    public static final Target CAMPO_ANNO = Target.the("campoanno").located(By.id("birthYear"));
    public static final Target CAMPO_1997 = Target.the("campo1997").located(By.cssSelector("//option[contains(number(),'1997')]"));
    public static final Target CAMPO_IDIOMA = Target.the("campoidioma").located(By.className("ui-select-search input-xs ng-pristine ng-valid ng-empty ng-touched"));
    public static final Target BOTON_NEXTLOCATION = Target.the("presionardosnextlocation").located(By.className("btn btn-blue"));
    public static final Target UBICACION = Target.the("Validarubicacion").located(By.className("sub-title"));
}
