package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/Order.feature"},
		glue = {"stepdefinitions"},
		plugin = {"pretty"}
		)
public class OrderTest {

}
