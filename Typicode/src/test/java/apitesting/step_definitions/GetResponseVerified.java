package apitesting.step_definitions;

import apitesting.data.StepData;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.CoreMatchers.*;

public class GetResponseVerified {

    private StepData stepData;
    public ValidatableResponse response;

    public GetResponseVerified(StepData stepData) {
        this.stepData = stepData;
    }

    @Then("I receive the list of all todos")
    public void iReceiveTheListOfAllTodos(){
        response = stepData.getResponseSpec();
        int size = response.extract().jsonPath().getList("id").size();

        System.out.println("*** Status code: " +response.extract().statusCode() + " ***");
        System.out.println("Todo list size: " + size);
//        response.log().body();

        response.assertThat().statusCode(200);
        response.body("size", is(200));
    }

    @Then("I receive the specific todo")
    public void iReceiveTheSpecificTodo() {
        response = stepData.getResponseSpec();

        System.out.println("\n*** Status code: " +response.extract().statusCode() + " ***");
       // response.log().body();

        response.body("id", equalTo(25));


    }
}
