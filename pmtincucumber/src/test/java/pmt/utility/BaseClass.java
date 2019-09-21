package pmt.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pmt.testreports.listener.ExtentReport;

public class BaseClass extends ExtentReport {


	public static WebDriver driver;
	public static Properties pro;
	
	
	public BaseClass() {
		try {
			pro = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Arunkumar\\git\\Projectincucumber\\pmtincucumber\\Configuration\\logindetails.properties");
			pro.load(fis);
		} catch(IOException e) {
			e.getMessage();
		}
	}
	
	
	
	public static void browserlaunch() {
		
		String browsername = pro.getProperty("Browser");
		
		if(browsername.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "F:\\Selenium test code\\pmt\\pmtincucumber\\Drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(browsername.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
		}else if(browsername.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
			
		
	}
	
	public String getReportConfigPath(){
		String reportConfigPath = pro.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
	

	  public static String getusername() { 
		 String subcategoryname = pro.getProperty("subcategoryname");
	 return subcategoryname;
	 }
	 
	  public static String getpassword() { 
		  String password =pro.getProperty("password"); 
		  return password;
		  }
	
	 
	public static void teardown() {
		driver.quit();
	}
	
}
