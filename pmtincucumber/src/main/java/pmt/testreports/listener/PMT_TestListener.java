package pmt.testreports.listener;

import com.aventstack.extentreports.ExtentReports;

public class PMT_TestListener extends ExtentReport    {

	
	private static ExtentReports extent;
	
	
	public void Starton() {
		System.out.println("Exectuion Satrted on this Environment ...");
		extent=setup();
	}
	
	public void Finish() {
		System.out.println("Exection Completed");
		extent.flush();
		System.out.println("Generated Report ");
		
	}
}
