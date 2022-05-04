package choucairtesting.tasks.scenario3;

import choucairtesting.model.ProductData;
import choucairtesting.tasks.scenario2.Navigate_To;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static choucairtesting.userinterface.OpenCardHomePage.*;
import static choucairtesting.userinterface.OpenCardHomePage.BUTTONFILTER;

import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
public class DeleteProduct implements Task {

    private List<ProductData> dt;
    public DeleteProduct(List<ProductData> dt) {
        this.dt = dt;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATALOG),
                Click.on(PRODUCTS),
                Enter.theValue(dt.get(0).getProductName()).into(PRODUCTNAME),
                Click.on(BUTTONFILTER),
                Click.on(CHECKBOX),
                Click.on(BUTTONDELETE),
                Hit.the(Keys.ENTER).keyIn(BUTTONDELETE)




        );

    }

    public static DeleteProduct Delete(List<ProductData> dat) {
        return Tasks.instrumented(DeleteProduct.class);
    }
}
