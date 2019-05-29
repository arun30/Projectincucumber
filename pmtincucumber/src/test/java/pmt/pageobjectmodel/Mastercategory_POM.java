package pmt.pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pmt.utility.BaseClass;

public class Mastercategory_POM extends BaseClass {

	
	public Mastercategory_POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	public WebElement master;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_0']")
	public WebElement mastercategory;
	
	@FindBy(xpath="//input[@id='MainContent_btnAdd']")
	public WebElement addcategory;
	
	@FindBy(id="MainContent_txtProductCategory")
	public WebElement entercategory;
	
	@FindBy(xpath="//input[@id='MainContent_radioACESList_14']")
	public WebElement equivalentcategory;
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement savecategory;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[1]")
	private WebElement verifytext;
	
	public void clickonproductcategory() throws Throwable {
			
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		mastercategory.click();
		Thread.sleep(5000);
	}
	
	public void addcategory1() throws Throwable {
		addcategory.click();
		Thread.sleep(3000);
	}
	
	public void entrycategory(String categoryname) {
		entercategory.sendKeys(categoryname);
		equivalentcategory.click();
	}
	
	public void savingcategory() throws InterruptedException {
		savecategory.click();
		//wait(2);
	}
	
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Product Category " + alert.getText());
		alert.accept();
		
	}
	
	public void verifyingtext(String vrfytxt) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualtext = verifytext.getText();
		System.out.println("Text present as "+ actualtext);
		if(actualtext.equals(vrfytxt))
		{
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
	}
	
	
	
	
}
