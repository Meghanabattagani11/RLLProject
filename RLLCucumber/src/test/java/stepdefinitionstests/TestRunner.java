package stepdefinitionstests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "stepdefinitionstests"
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
