package apitesting.step_definitions;

import apitesting.data.StepData;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;

public class DeleteVerified {

    private StepData stepData;

    public DeleteVerified(StepData stepData) {
        this.stepData = stepData;
    }

    @Then("The todo is successfully deleted")
    public void theTodoIsSuccessfullyDeleted() {
        ValidatableResponse response = stepData.getResponseSpec();

        System.out.println("*** Status code: " +response.extract().statusCode() + " ***");
       // response.log().body();

        response.assertThat().statusCode(200);

    }
}
