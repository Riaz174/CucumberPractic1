package Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/Feature/ContactOfCustomer.Feature"},glue= {"StepDefinition"},monochrome = true ,tags= {"@Adhoc,@Function"})		
		
public class Runner {
}
