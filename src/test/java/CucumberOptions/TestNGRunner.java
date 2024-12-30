package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature", glue="StepDefinitions", monochrome = true, tags="@smokeTest")
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
