package RunTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features/AmazonTest.feature"},
glue={"StepDefinations"},plugin={"html:target/Reports"},tags={"@TAG1"})
//monochrome=true,dryRun=false)


public class TestRunner {

}
