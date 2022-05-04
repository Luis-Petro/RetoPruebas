package choucairtesting.stepdefinitions;
import choucairtesting.model.*;
import choucairtesting.question.Answer;
import choucairtesting.tasks.*;
import choucairtesting.tasks.scenario1.EditProduct;
import choucairtesting.tasks.scenario1.NavigateTo;
import choucairtesting.tasks.scenario2.CreateNewProduct;
import choucairtesting.tasks.scenario2.Navigate_To;
import cucumber.api.java.en.*;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.*;
import java.util.List;


public class OpenCardStedDefinitons {

    @Before
    public void  setStage (){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than user enters the website$")
    public void than_user_enters_the_website()  {
            OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage());
        }


    @And("^enter valid access data$")
    public void enter_valid_access_data(List<LoginData> Data)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.ToAccess(Data));
    }

    @And("^than user navigate to the product edit screen$")
    public void thanUserNavigateToTheProductEditScreen(List<ProductData> Data) {
        OnStage.theActorInTheSpotlight().attemptsTo(NavigateTo.NavigateTo(Data));
    }

    @When("^Update product data$")
    public void updateProductData(List<ProductData> Data) {
        OnStage.theActorInTheSpotlight().attemptsTo(EditProduct.Update(Data));
    }

    @Then("^verify that you do not have permissions$")
    public void verifyThatYouDoNotHavePermissions(List<ResultData> Data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer
                .toThe(Data.get(0).getErrorMessage())));
    }

    @Given("^than user navigate to the new product screen$")
    public void thanUserNavigateToTheNewProductScreen() {
        OnStage.theActorInTheSpotlight().attemptsTo(Navigate_To.NavigateTo());
        
    }

    @When("^fill in the product data$")
    public void fillInTheProductData(List<ProductData> Data) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateNewProduct.Create(Data));
    }
}
