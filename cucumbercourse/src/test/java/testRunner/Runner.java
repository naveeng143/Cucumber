package testRunner;

// Comma based syntax deprecated with new cucumber release
// We can use in tage with OR / And / NOT
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/linkdinlearning/cucumbercourse/features"}, 
		glue = {"stepDefnitions", "Hooks"},
//		tags = { "@SmokeTest, @RegressionTest" },
		tags = { "@ListofMaps" },
		plugin = {"pretty",
				"html: target/report/html/report",
				"json: target/report/json/report.json",
				"junit: target/report/junit/report.xml"},
				monochrome = true
)
public class Runner {

}
