package apitesting.step_definitions;

import apitesting.data.StepData;
import com.google.gson.JsonObject;
import io.cucumber.java.en.When;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class PostToDo {

    private StepData stepData;

    public PostToDo(StepData stepData) {
        this.stepData = stepData;
    }

    @When("I post a todo request with id {int}")
    public void iPostATodoRequestWithId(int id) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", "foo");
        jsonObject.addProperty("body", "bar");
        jsonObject.addProperty("id", id);

        ValidatableResponse response =
            given()
                .config(RestAssuredConfig.config().encoderConfig(EncoderConfig.encoderConfig().encodeContentTypeAs("json", ContentType.TEXT)))
                .spec(stepData.getRequestSpec())
                .body(jsonObject.toString())
                .contentType("application/json")
            .when()
                .post()
            .then();

        stepData.setResponseSpec(response);
    }
}
