package apitesting.step_definitions;

import apitesting.data.StepData;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class GetToDo {

    private StepData stepData;
    private ValidatableResponse response;

    public GetToDo(StepData stepData) {
        this.stepData = stepData;
    }

    @When("I send a request for all todos")
    public void iSendARequestForAllTodos() {
        response =
                given()
                        .spec(stepData.getRequestSpec())
                .when()
                        .get()
                .then();

        stepData.setResponseSpec(response);

    }

    @When("I send a todo request with id {int}")
    public void iSendATodoRequestWithId(int id) {
        response =
                given()
                        .spec(stepData.getRequestSpec())
                .when()
                        .get("/" +id)
                .then();

        stepData.setResponseSpec(response);

    }
}
