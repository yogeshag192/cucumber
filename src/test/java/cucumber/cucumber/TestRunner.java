package cucumber.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java"}, 
		glue = {"cucumber.cucumber","DataTable"}, 
		plugin = {"pretty", "html:ExecutionReports","testng:target/csv-output.xml" },
		monochrome = true, //Better formatting in console output.
		//plugin = {"usage"} for time duration of each stepdefinition.
		tags = {"~@Regression", "~@Smoke"} )


public class TestRunner {

}
