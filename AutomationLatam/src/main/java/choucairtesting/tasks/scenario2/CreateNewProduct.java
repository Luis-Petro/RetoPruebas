package choucairtesting.tasks.scenario2;

import choucairtesting.model.ProductData;
import choucairtesting.tasks.scenario1.EditProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static choucairtesting.userinterface.OpenCardProducts.*;


public class CreateNewProduct implements Task {

    private List<ProductData> dt;
    public CreateNewProduct(List<ProductData> dt) {
        this.dt = dt;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dt.get(0).getNewProductName()).into(INPUTNAMEPRODUCT),
                Enter.theValue(dt.get(0).getMetaTagTitle()).into(INPUTMETATITLE),
                Click.on(SECTIONDATA),
                Enter.theValue(dt.get(0).getModel()).into(INPUTMODEL),
                Click.on(BUTTONSAVE)
        );

    }

    public static CreateNewProduct Create(List<ProductData> dt) {
        return Tasks.instrumented(CreateNewProduct.class, dt);
    }
}
