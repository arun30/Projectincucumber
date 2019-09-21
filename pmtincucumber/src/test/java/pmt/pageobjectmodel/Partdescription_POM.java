package pmt.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pmt.utility.BaseClass;

public class Partdescription_POM extends BaseClass {

	
	public Partdescription_POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_2']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;
	
	
	@FindBy(xpath="//input[@id='MainContent_btnPsearch']")
	private WebElement btnPsearch;
	
	
	@FindBy(xpath="//div[@id='Description']")
	private WebElement partdescclick;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpNotesType']")
	private WebElement drpNotesType;
	
	
	@FindBy(xpath="//input[@id='MainContent_txtNotes']")
	private WebElement txtNotes;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement btnSave;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_gv_imgEdit_0']")
	private WebElement imgEdit_0;
	
	
	@FindBy(xpath="//input[@id='MainContent_gv_imgDelete_0']")
	private WebElement imgDelete_0;
	
	
	
	
	public void partslanding(String partnoenter) {
		partspageheaderclick.click();
		txtpartsearch.sendKeys(partnoenter);
		btnPsearch.click();
	}
	
	
	public void descriptionclick() {
		partdescclick.click();
		
	}
	
	
	
	
	public void descriptiondrpdownnotes() throws InterruptedException {
		WebElement descnotesselect = drpNotesType ;
		Select select = new Select(descnotesselect);
		select.selectByVisibleText(pro.getProperty("notestype"));
		Thread.sleep(2000);
	}
	
	
	public void descriptionadd(String notes) {
		txtNotes.sendKeys(notes);
		
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
	
	
	
	
	public void editpartdesc(String editnotes) {
		imgEdit_0.click();
		txtNotes.sendKeys(editnotes);
		
	}
	
	
	public void deletepartdesc() {
		imgDelete_0.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
