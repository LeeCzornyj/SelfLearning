package runnerPackage;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

public class RunnerClass {

	@RunWith(Cucumber.class)
	@CucumberOptions(format={"pretty","html:reports/test-report"},tags= "@smokeTest")
	
	public class CucumberRunner {
		
	}
}
