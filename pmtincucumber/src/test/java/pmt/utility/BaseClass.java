package pmt.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pmt.testreports.listener.ExtentReport;

public class BaseClass extends ExtentReport {


	public static WebDriver driver;
	public static Properties pro;
	
	
	public BaseClass() {
		try {
			pro = new Properties();
			FileInputStream fis = new FileInputStream("F:\\Selenium test code\\pmt\\pmtincucumber\\Configuration\\logindetails.properties");
			pro.load(fis);
		} catch(IOException e) {
			e.getMessage();
		}
	}
	
	public static void browserlaunch() {
		
		String browsername = pro.getProperty("Browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium test code\\pmt\\pmtincucumber\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(pro.getProperty("url"));
			
		
	}
	
	public String getReportConfigPath(){
		String reportConfigPath = pro.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
	

	  public static String getusername() { 
		 String username = pro.getProperty("username");
	 return username;
	 }
	 
	  public static String getpassword() { 
		  String password =pro.getProperty("password"); 
		  return password;
		  }
	
	 
	public static void teardown() {
		driver.quit();
	}
	
}
