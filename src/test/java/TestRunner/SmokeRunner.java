package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "StepDefinitions", dryRun = false)

//feature = where girkin files are located. glue = code; dryRun true = will check for which test the code is not written without executing all of the tests
//if you want ot run testcases - dryRun = false

public class SmokeRunner {

}
