package pmt.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pmt.utility.BaseClass;

public class Pageobjectclass extends BaseClass {

	/*public Pageobjectclass(WebDriver driver) {
		super();
	}*/
	
	@FindBy(how = How.ID,using="txtUsername")
	@CacheLookup
	private WebElement txtusername;
	
	@FindBy(how = How.ID,using="txtPassword")
	public WebElement txtpassword;
	
	@FindBy(id="btnLogin")
	WebElement btnlogin;
	
	public Pageobjectclass() {
		//this.ldriver=rdriver;
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	public void logindetails(String username, String pwd) {
		txtusername.sendKeys(username);
		txtpassword.sendKeys(pwd);
		btnlogin.click();
	
	}
	
	/*public void setusername(String un) {
		txtusername.sendKeys(un);
		
	} 
	
	public void setpwd(String pwd) {
		txtpassword.sendKeys(pwd);
	} 
	
	 public void clicksubmit() {
		btnlogin.click();
	} */
	
	
}
