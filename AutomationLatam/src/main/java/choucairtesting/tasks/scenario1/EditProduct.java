package choucairtesting.tasks.scenario1;

import choucairtesting.model.ProductData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static choucairtesting.userinterface.OpenCardProducts.*;

public class EditProduct implements Task {

    private List<ProductData> dt;
    public EditProduct(List<ProductData> dt) {
        this.dt = dt;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue(dt.get(0).getNewProductName()).into(INPUTNAMEPRODUCT),
        Click.on(BUTTONSAVE)
      );
    }

    public static EditProduct Update(List<ProductData> dt) {
        return Tasks.instrumented(EditProduct.class, dt);
    }
}
