package apitesting.step_definitions;

import apitesting.data.StepData;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.CoreMatchers.equalTo;

public class PostingVerified {

    private StepData stepData;
    private ValidatableResponse response;

    public PostingVerified(StepData stepData) {
        this.stepData = stepData;
    }

    @Then("The todo is successfully posted")
    public void theTodoIsSuccessfullyPosted() {
        response = stepData.getResponseSpec();

        System.out.println("*** Status code: " +response.extract().statusCode() + " ***");
        //response.log().body();

        response.assertThat().statusCode(201);
        response.body("title", equalTo("foo"));

    }
}
