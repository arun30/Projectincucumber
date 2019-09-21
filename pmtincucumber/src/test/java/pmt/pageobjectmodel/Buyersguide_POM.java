package pmt.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pmt.utility.BaseClass;

public class Buyersguide_POM extends BaseClass {


			
			public Buyersguide_POM() {
				PageFactory.initElements(driver, this);
			}
				
			
			@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_2']")
			private WebElement partspageheaderclick;
			
			
			
			@FindBy(xpath="//input[@id='MainContent_txtMelling']")
			private WebElement txtpartsearch;
			
			
			@FindBy(xpath="//input[@id='MainContent_btnPsearch']")
			private WebElement btnPsearch;
			
			
			@FindBy(xpath="//div[@id='BuyersGuid1']")
			private WebElement BuyersGuid1click;
			
			
			@FindBy(xpath="//select[@id='MainContent_drpVehicleType']']")
			private WebElement drpVehicleType;
			
			
			@FindBy(xpath="//select[@id='MainContent_drpMake']']")
			private WebElement drpMake;
			
			
			
			@FindBy(xpath="//select[@id='MainContent_drpModel']")
			private WebElement drpModel;
			
			
			@FindBy(xpath="//input[@id='MainContent_searchbtn']")
			private WebElement searchbtn;
			
			
			@FindBy(xpath="//input[@id='MainContent_GvApplications_chkActivee1_0']")
			private WebElement selectappln;
			

			
			@FindBy(xpath="//input[@id='MainContent_btnSave']")
			private WebElement btnSave;
			
			
			
			@FindBy(xpath="//tr[@id='tr_0']//input[@id='appartsedit_btn']")
			private WebElement appartsedit_btn;
			
			
			@FindBy(xpath="//textarea[@id='MainContent_GvApplications_txtapppartsnotes_0']")
			private WebElement apppartsnotes;
			
			
			@FindBy(xpath="//tr[@id='tr_0']//input[@name='ctl00$MainContent$checkbox2']")
			private WebElement Delete_checkbox2;
			
			
			@FindBy(xpath="//div[@class='dataTables_scrollHeadInner']//input[@id='apppartdelete']")
			private WebElement apppartdelete;
			
			
			
			
			public void partslanding(String partnoenter) {
				partspageheaderclick.click();
				txtpartsearch.sendKeys(partnoenter);
				btnPsearch.click();
			}
			
			
			public void interchangesclick() {
				BuyersGuid1click.click();
				
			}
			
			
			
			public void apppartsvehicldropdown() throws InterruptedException {
				WebElement vehiclesselect = drpVehicleType ;
				Select select = new Select(vehiclesselect);
				select.selectByVisibleText(pro.getProperty("vehicletypename"));
				Thread.sleep(2000);
			}
			
			
			
			public void apppartsmakedropdown() throws InterruptedException {
				WebElement makeselect = drpMake ;
				Select select = new Select(makeselect);
				select.selectByVisibleText(pro.getProperty("makename"));
				Thread.sleep(2000);
			}
			
			
			
			
			public void apppartsmodeldropdown() throws InterruptedException {
				WebElement modelselect = drpModel ;
				Select select = new Select(modelselect);
				select.selectByVisibleText(pro.getProperty("modelname"));
				Thread.sleep(2000);
			}
			
			
			
			
			public void apppartsearch() {
				searchbtn.click();
			}
			
			
			
			
			public void apppartsenginebase() {
				selectappln.click();
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
			
			
			
			
			public void editappparts() {
				appartsedit_btn.click();
					
			}
			
			public void apppartsnote(String apppartnotes) {
				apppartsnotes.sendKeys(apppartnotes);
			}
			
			public void deletepartdesc() {
				Delete_checkbox2.click();
				apppartdelete.click();
				
			}
			
			
			
			
			
			
			
			
			
			
}


