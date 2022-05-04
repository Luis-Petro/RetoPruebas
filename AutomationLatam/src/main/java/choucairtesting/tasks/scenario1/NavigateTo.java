package choucairtesting.tasks.scenario1;
import choucairtesting.model.ProductData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static choucairtesting.userinterface.OpenCardHomePage.*;


public class NavigateTo implements Task {

    private List<ProductData> dt;
    public NavigateTo(List<ProductData> dt) {
        this.dt = dt;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATALOG),
                Click.on(PRODUCTS),
                Enter.theValue(dt.get(0).getProductName()).into(PRODUCTNAME),
                Click.on(BUTTONFILTER),
                Click.on(BUTTONEDIT)
        );

    }

    public static NavigateTo NavigateTo(List<ProductData> dt) {
        return Tasks.instrumented(NavigateTo.class, dt);
    }
}
