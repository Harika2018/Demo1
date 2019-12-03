//import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\harik\\eclipse-workspace\\practice\\Practice\\src\\main\\java\\Features\\sampleFeatures.feature"
		,glue={"StepDefs"}
		,dryRun=false
		,plugin= {"pretty","html:output/pretty.html"})
public class TestRunner {
	
	

}
