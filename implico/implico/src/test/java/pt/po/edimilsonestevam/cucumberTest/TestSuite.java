package pt.po.edimilsonestevam.cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/pt/po/edimilsonestevam/feature" }, glue = {
		"pt/po/edimilsonestevam/stepDefinition" }, plugin = {
				"html:target/cucumber-reports" }, dryRun = false, monochrome = true)

public class TestSuite {

}