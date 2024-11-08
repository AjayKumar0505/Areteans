package com.ABS.ataf.common.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/featurefilesPegaApp/" }, glue = {
		"classpath:com.ABS.ataf.stepdef.Pega","classpath:com.ABS.ataf.stepdef.common", "classpath:com.ABS.ataf.TestBase" }, plugin = { "pretty",
				"html:target/cucumber-html-report", "json:target/cucumber-report/cucumber.json",
				"pretty:target/cucumber-pretty.txt", "junit:target/cucumber-results.xml" },

		monochrome = true,

		dryRun = false
//tags= {"@test0,@test1"}
)
public class CommonRunner extends AbstractTestNGCucumberTests {

}
