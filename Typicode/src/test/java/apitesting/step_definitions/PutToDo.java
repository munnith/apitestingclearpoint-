package apitesting.step_definitions;

import apitesting.data.StepData;
import com.google.gson.JsonObject;
import io.cucumber.java.en.When;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class PutToDo {

    private StepData stepData;

    public PutToDo(StepData stepData) {
        this.stepData = stepData;
    }

    @When("I put a todo request with id {int}")
    public void iPutATodoRequestWithId(int id) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", "foo");
        jsonObject.addProperty("body", "bar");
        jsonObject.addProperty("id", id);

        ValidatableResponse response =
                given().config(RestAssuredConfig.config().encoderConfig(EncoderConfig.encoderConfig().encodeContentTypeAs("json", ContentType.TEXT)))
                    .spec(stepData.getRequestSpec())
                    .body(jsonObject.toString())
                    .contentType("application/json")
                .when()
                    .put("/" +id)
                .then();

        stepData.setResponseSpec(response);

    }
}
