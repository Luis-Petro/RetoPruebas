package choucairtesting.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static choucairtesting.userinterface.OpenCardProducts.ERRORMESSAGE;

public class Answer implements Question<Boolean> {

    private String errorMessage;

    public Answer(String errorMessage) {

        this.errorMessage = errorMessage;
    }

    public static Answer toThe(String errorMessage) {
        return new Answer(errorMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String errorMessageText = Text.of(ERRORMESSAGE).viewedBy(actor).asString();

        if (errorMessageText.contains(errorMessage)) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
