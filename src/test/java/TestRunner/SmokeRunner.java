package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\Features",
        glue = "StepDefinitions",
        dryRun = false,
        tags = "@ScenarioOutline",
        plugin =  {"pretty"}//makes console more readable
       )
//feature package path(if add login.feature -only to this one ; glue - path to StepDef package;
//feature = where Girkin files are located. glue = code; dryRun true = will check for which test the code is not written without executing all of the tests
//if you want ot run testcases - dryRun = false
//tags - only this case will be executed  , if several =tags ="@testCase2 or @testCase2" or tag the same name for a number of tests,ex.@smoke).we can use several tags for one case

public class SmokeRunner {

}
