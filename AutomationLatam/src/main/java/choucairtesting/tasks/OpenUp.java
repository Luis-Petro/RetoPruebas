package choucairtesting.tasks;

import choucairtesting.userinterface.OpenCardLoginPage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {
    OpenCardLoginPage openCardLoginPage;
    public  static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(openCardLoginPage));
    }
}