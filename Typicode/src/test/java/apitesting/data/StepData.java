package apitesting.data;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class StepData {

    private RequestSpecification requestSpec;
    private ValidatableResponse responseSpec;

    public RequestSpecification getRequestSpec() {
        return requestSpec;
    }

    public void setRequestSpec(RequestSpecification requestSpec) {
        this.requestSpec = requestSpec;
    }

    public ValidatableResponse getResponseSpec() {
        return responseSpec;
    }

    public void setResponseSpec(ValidatableResponse responseSpec) {
        this.responseSpec = responseSpec;
    }
}
