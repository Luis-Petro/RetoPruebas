package choucairtesting.tasks;

import choucairtesting.model.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;
import static choucairtesting.userinterface.OpenCardLoginPage.*;


public class Login implements Task {


   private List<LoginData> dt;
   public Login (List<LoginData> dt) {
       this.dt = dt;
   }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Enter.theValue(dt.get(0).getUser()).into(USER),
               Enter.theValue(dt.get(0).getPassword()).into(PASSWORD),
               Click.on(ACCCESSBUTTON)
       );

    }

    public static Login ToAccess(List<LoginData> dt) {
        return Tasks.instrumented(Login.class, dt);
    }
}
