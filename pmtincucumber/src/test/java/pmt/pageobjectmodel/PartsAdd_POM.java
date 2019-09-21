package pmt.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pmt.utility.BaseClass;

public class PartsAdd_POM extends BaseClass {

	
	public PartsAdd_POM(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_2']")
	private WebElement partspageheaderclick;
	
	
	@FindBy(xpath="//button[@id='MainContent_btnAdd']")
	private WebElement addbutton;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpProductCategoryAdd']")
	private WebElement selectproductcategory;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpProductSubCategoryAdd']")
	private WebElement selectsubcategorydropdown;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpPartDescriptionAdd']")
	private WebElement selectpartdescdropdown;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpproductline']")
	private WebElement drpproductline;
	
	
	@FindBy(xpath="//input[@id='MainContent_txtPart']")
	private WebElement txtPart;
	
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement btnSave;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpProductCategory']")
	private WebElement drpProductCategory;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpProductSubCategory']")
	private WebElement drpProductSubCategory;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpPartDescription']")
	private WebElement drpPartDescription;
	
	
	@FindBy(xpath="//select[@id='MainContent_dropproductline']")
	private WebElement dropproductline;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpPart']")
	private WebElement drpPart;
	
	
	@FindBy(xpath="//input[@id='MainContent_btnSearch']")
	private WebElement btnSearch;
	
	
	
	
	public void partslandingpage(){
		partspageheaderclick.click();
		addbutton.click();
		
	}
	
	
	public void partsadd() throws InterruptedException {
		WebElement categoryselect = selectproductcategory;
		Select select = new Select(categoryselect);
		select.selectByVisibleText(pro.getProperty("categoryname"));
		Thread.sleep(2000);
	}
	
	
	public void partsadddrp2() throws InterruptedException {
		WebElement subcategoryselect = selectsubcategorydropdown;
		Select select = new Select(subcategoryselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname"));
		Thread.sleep(2000);
	}
	
	
	public void partsadddrp3() throws InterruptedException {
		WebElement partdescselect = selectpartdescdropdown;
		Select select = new Select(partdescselect);
		select.selectByVisibleText(pro.getProperty("partdesc"));
		Thread.sleep(2000);
	}
	
	
	
	public void partsadddrp4() throws InterruptedException {
		WebElement prdctlnselect = drpproductline;
		Select select = new Select(prdctlnselect);
		select.selectByVisibleText(pro.getProperty("productline"));
		Thread.sleep(2000);
	}
	
	
	
	public void savenewpart(String partname) {
		txtPart.sendKeys(partname);
		btnSave.click();
	}
	
	
	
	/*
	 * alert accept & fetching text
	 */
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts Related " +pro.getProperty("partname") + alert.getText());
		alert.accept();
		
	}
	
	
	
	public void dropdownfiltercategory() throws InterruptedException{
		WebElement categoryfilterselect = drpProductCategory;
		Select select = new Select(categoryfilterselect);
		select.selectByVisibleText(pro.getProperty("categoryname"));
		Thread.sleep(2000);
	}
	
	
	
	public void dropdownfiltersubcategory() throws InterruptedException{
		WebElement subcategoryfilterselect = drpProductSubCategory;
		Select select = new Select(subcategoryfilterselect);
		select.selectByVisibleText(pro.getProperty("subcategoryname"));
		Thread.sleep(2000);
	}
	
	
	
	public void dropdownfilterpartdesc() throws InterruptedException{
		WebElement partdescfilterselect = drpPartDescription;
		Select select = new Select(partdescfilterselect);
		select.selectByVisibleText(pro.getProperty("partdesc"));
		Thread.sleep(2000);
	}
	
	
	
	public void dropdownfilterprdtln() throws InterruptedException{
		WebElement linefilterselect = dropproductline;
		Select select = new Select(linefilterselect);
		select.selectByVisibleText(pro.getProperty("productline"));
		Thread.sleep(2000);
	}
	
	
	
	public void dropdownfilterpartno() throws InterruptedException{
		WebElement partnofilterselect = drpPart;
		Select select = new Select(partnofilterselect);
		select.selectByVisibleText(pro.getProperty("partname"));
		Thread.sleep(2000);
	}
	
	
	
	public void filetrpartno() {
		btnSearch.click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
