package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features//BackgroundDemo//BackgroundDemo.feature",  
                             glue ="stepDefination" ,
                             dryRun=true,
                             plugin = {"pretty","html:target/cucumber-reports/emailable-report.html"}

)
public class BackgroundRunnerTest {

}
