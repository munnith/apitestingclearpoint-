package apitesting.step_definitions;

import apitesting.data.StepData;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.CoreMatchers.*;

public class PutUpdateVerified {

    private StepData stepData;

    public PutUpdateVerified(StepData stepData) {
        this.stepData = stepData;
    }

    @Then("The specific todo is successfully updated")
    public void theSpecificTodoIsSuccessfullyUpdated() {
        ValidatableResponse response = stepData.getResponseSpec();

        System.out.println("*** Status code: " +response.extract().statusCode() + " ***");
        //response.log().body();

        response.assertThat().statusCode(200);
        response.assertThat().body("id", equalTo(25));

    }
}
