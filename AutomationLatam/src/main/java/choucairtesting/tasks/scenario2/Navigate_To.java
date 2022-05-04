package choucairtesting.tasks.scenario2;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static choucairtesting.userinterface.OpenCardHomePage.*;
import static choucairtesting.userinterface.OpenCardProducts.BUTTONNEWPRODUCT;

public class Navigate_To implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATALOG),
                Click.on(PRODUCTS),
                Click.on(BUTTONNEWPRODUCT)
        );

    }

    public static Navigate_To NavigateTo() {
        return Tasks.instrumented(Navigate_To.class);
    }
}
