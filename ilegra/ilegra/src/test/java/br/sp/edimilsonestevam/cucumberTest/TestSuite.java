package br.sp.edimilsonestevam.cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/br/sp/edimilsonestevam/feature"}
                , glue = { "br/sp/edimilsonestevam/stepDefinition" }
				, plugin = {"html:target/cucumber-reports"}
				, dryRun = false
				, monochrome = true)

public class TestSuite {

}