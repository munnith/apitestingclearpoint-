package apitesting.step_definitions;

import apitesting.data.StepData;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class DeleteToDo {

    private StepData stepData;

    public DeleteToDo(StepData stepData) {
        this.stepData = stepData;
    }

    @When("I send a delete todo request with id {int}")
    public void iSendADeleteTodoRequestWithId(int id) {
        ValidatableResponse response =
                given()
                        .spec(stepData.getRequestSpec())
                .when()
                        .delete("/" +id)
                .then();

        stepData.setResponseSpec(response);

    }
}
