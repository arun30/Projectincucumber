package pmt.testcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pmt.pageobjectmodel.Pageobjectclass;
import pmt.utility.BaseClass;

public class TC001_PMTLogin extends BaseClass 
{
	
	Pageobjectclass pom;
	
	ExtentTest loginfo=null;
	
	@Given("^enter the url$")
	public void enter_the_url() throws Throwable {
			
		try {
			extent=setup();
			test = extent.createTest(Feature.class, "PMT Valid Login TestCases ");
			test=test.createNode(Scenario.class, "Entering Valid Login Testcases");
			loginfo=test.createNode(new GherkinKeyword("Given"),"Enter the url ");
			BaseClass.browserlaunch();
			loginfo.pass("Browser Launched and Entered URL succesully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			TestStep("Fail",driver,loginfo,e);
		}
		//BaseClass.browserlaunch();
	
	}
	
	@When("^User will enter the username,password and login$")
	public void user_will_enter_the_username_password_and_login() throws Throwable {
		
		try {
		loginfo=test.createNode(new GherkinKeyword("When"),"User will enter the username,password and login ");
		 pom = new Pageobjectclass();
		 pom.logindetails(pro.getProperty("username"), pro.getProperty("password"));
		 Thread.sleep(5000);
		 loginfo.pass("Username And Password Entered Successfully");
		 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		 
		} catch ( Exception e) {
			//AssertionError |
			TestStep("Fail",driver,loginfo,e);
		}
	}

	/*@When("^User will enter the username and password$")
	public void user_will_enter_the_username_and_password() throws Throwable {
			
		 pom = new Pageobjectclass();
		 pom.logindetails(BaseClass.getusername(), pro.getProperty("password"));
		//pom.setusername(pro.getProperty("username"));
		//pom.setpwd(pro.getProperty("password"));
		//pom.setusername();
		
		
	}

	@And("^User will submit$")
	public void user_will_submit() throws Throwable {
	    
		pom.clicksubmit();
		//driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
	}*/

	@Then("^User will successfully login and dashboard page will be seen$")
	public void user_will_successfully_login_and_dashboard_page_will_be_seen() throws Throwable {
	 
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will successfully login and dashboard page will be seen ");
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals("CNCPMT"))
			{
				System.out.println("Login Successfully");
				loginfo.pass("Successfully Landed on Dashboard Page");
			}else {
				System.out.println("Login Failed");
			}
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}catch ( Exception e) {
			TestStep("Fail",driver,loginfo,e);
		}		
		
		BaseClass.teardown();
		extent.flush();
	}
	
	
	
}



