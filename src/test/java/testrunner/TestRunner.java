package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/home/vishal/eclipse-workspace/cucumber/src/test/java/features",
		glue = "stepdefinition"
		)



public class TestRunner {

}
