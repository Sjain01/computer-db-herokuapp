package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report",
				  "json:target/cucumber.json","junit:target/cucumber-xml",
				  "rerun:target/rerun.txt"},
		tags = {}
		)
public class RunCukesTest{
	
}