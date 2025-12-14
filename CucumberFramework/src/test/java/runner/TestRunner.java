package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//in runner class we are dealing with two annotations 
//@RunWith
//@CucumberOptions	
	

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features//Fblogin.feature", 
                             glue ="stepDefination" ,
                             dryRun=true,
                             plugin = {"pretty","html:target/cucumber-reports/emailable-report.html"}

)
public class TestRunner {

	
	
	
}
