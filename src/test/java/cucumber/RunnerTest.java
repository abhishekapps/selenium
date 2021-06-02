package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="C:\\Abhishek\\cucumber\\src\\test\\java\\cucumber",
		glue="cucumber",
		plugin= {"pretty"},
		monochrome=true
		)

public class RunnerTest extends AbstractTestNGCucumberTests {
	
	

}
