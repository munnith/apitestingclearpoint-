package apitesting.step_definitions;

import apitesting.data.StepData;
import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;


public class Hooks {

    private StepData stepData;

    public Hooks(StepData stepData) {
        this.stepData = stepData;
    }

    @Before
    public void createRequestSpecification(){
        RequestSpecification requestSpec = new RequestSpecBuilder().build();
        stepData.setRequestSpec(requestSpec);
    }
}
