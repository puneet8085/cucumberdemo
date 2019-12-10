package Resource;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature",glue = "" ,plugin = {"pretty","html:reports/cucumber-reports"},monochrome = true)


public class Runner {


}
