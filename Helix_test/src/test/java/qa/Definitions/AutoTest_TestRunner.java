package qa.Definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = {"FeatureFiles"},
		glue={"qa/Definitions"},
		//plugin = {"html:target/Report.html" },
		//dryRun = false
		//plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" }
		plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber", "json:target/cucumber.json" }
		
	    //tags= ""

		)

public class AutoTest_TestRunner extends AbstractTestNGCucumberTests {

	
}
