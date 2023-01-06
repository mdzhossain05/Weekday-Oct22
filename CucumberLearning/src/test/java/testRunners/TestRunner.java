package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/Features",
		glue = "stepDefinitions",
		plugin = {"html:target/output"},
		tags = "@positiveTest"
		)

public class TestRunner {


	
}
