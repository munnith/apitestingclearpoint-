package apitesting.step_definitions;

import apitesting.data.StepData;
import io.cucumber.java.en.Given;

public class SetEndpoint {

    private final StepData stepData;

    public SetEndpoint(StepData stepData) {
        this.stepData = stepData;
    }

    @Given("I have an endpoint")
    public void iHaveAnEndpoint() {
        stepData.getRequestSpec().baseUri("https://jsonplaceholder.typicode.com/todos");
//        stepData.getRequestSpec().baseUri("https://reqres.in/api/users");
    }
}
