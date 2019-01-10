package cucumber.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java", glue = {"cucumber.cucumber","DataTable"}, plugin = {"pretty", "html:ExecutionReports","testng:target/testng-output.xml" }, tags = {"~@Regression","~@Smoke"} )

public class TestRunner {

}
