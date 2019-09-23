package pmt.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pmt.utility.BaseClass;

public class Interchange_POM extends BaseClass{

		
		public Interchange_POM() {
			PageFactory.initElements(driver, this);
		}
		
		
		
		@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_2']")
		private WebElement partspageheaderclick;
		
		
		
		@FindBy(xpath="//input[@id='MainContent_txtMelling']")
		private WebElement txtpartsearch;
		
		
		@FindBy(xpath="//input[@id='MainContent_btnPsearch']")
		private WebElement btnPsearch;
		
		
		@FindBy(xpath="//div[@id='interchange']")
		private WebElement interchangeclick;
		
		
		@FindBy(xpath="//select[@id='MainContent_drpCompetitorName']")
		private WebElement drpCompetitorName;
		
		
		@FindBy(xpath="//input[@id='MainContent_txtCompetitorPartno1']")
		private WebElement txtCompetitorPartno1;
		
		
		
		@FindBy(xpath="//input[@id='MainContent_btnSave']")
		private WebElement btnSave;
		
		
		
		@FindBy(xpath="//tr[@class='odd']//input[@id='MainContent_ImageButton1']")
		private WebElement imgEdit_0;
		
		
		@FindBy(xpath="//tr[@class='odd']//input[@id='MainContent_ImageButton2']")
		private WebElement imgDelete_0;
		
		
		
		
		public void partslanding(String partnoenter) {
			partspageheaderclick.click();
			txtpartsearch.sendKeys(partnoenter);
			btnPsearch.click();
		}
		
		
		public void interchangesclick() {
			interchangeclick.click();
			
		}
		
		
		
		public void interchangedrpdownnotes() throws InterruptedException {
			WebElement intnotesselect = drpCompetitorName ;
			Select select = new Select(intnotesselect);
			select.selectByVisibleText(pro.getProperty("interchangetype"));
			Thread.sleep(2000);
		}
		
		
		public void interchangenoteenter(String notes) {
			txtCompetitorPartno1.sendKeys(notes);
			
		}
		
		
		public void savebtn() {
			btnSave.click();
		}
		
		
		
		
		/*
		 * alert accept & fetching text
		 */
		public void acceptAlert() throws InterruptedException{
			Alert alert = driver.switchTo().alert();
			//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
			System.out.println("Parts Related " + "Description Notes" + alert.getText());
			alert.accept();
			
		}
		
		
		
		
		public void editinterchange(String editnotes) {
			imgEdit_0.click();
			txtCompetitorPartno1.sendKeys(editnotes);
			
		}
		
		
		public void deletepartinter() {
			imgDelete_0.click();
		}
		
		
		
		
		
		
		
		
		
		
}


