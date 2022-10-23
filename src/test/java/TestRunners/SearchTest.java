package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/Search.feature"},
		glue = {"stepdefinitions","applicationHooks"},
		tags = "@Smoke or @Regression",
		plugin = {"pretty"}
		)
public class SearchTest {

}
