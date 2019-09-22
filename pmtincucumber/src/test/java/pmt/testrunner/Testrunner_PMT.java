package pmt.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Featurefiles",
		glue = "pmt.testcases.stepdefinition",
		dryRun = false,
		monochrome = true,
		format = {"pretty", "html: test-output", "json:json_output/cucumbeer.json"},
			//	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},
				//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		strict = false,
				tags = {"@application"}
		
		)





public class Testrunner_PMT {

	

	/*
	 * @AfterClass public static void writeExtentReport() {
	 * Reporter.loadXMLConfig(new
	 * File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath())
	 * ); }
	 */

	/* @AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("F:\\Selenium test code\\pmt\\pmtincucumber\\Configuration\\extent-config.xml"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "ARUN");
	Reporter.setSystemInfo("Application Name", "PMT Test App ");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}*/
}
