package apitesting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test"},
        glue = {"apitesting/step_definitions"},
        strict = true
)
public class TestRunner {
}
