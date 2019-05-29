package pmt.testcases.stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pmt.pageobjectmodel.Mastercategory_POM;
import pmt.pageobjectmodel.Pageobjectclass;
import pmt.utility.BaseClass;

public class TC002_PMTproductcategory extends BaseClass {

	Pageobjectclass pom;
	Mastercategory_POM mpom;
	
	@Given("^user will enter the url$")
	public void user_will_enter_the_url() throws Throwable {
	  BaseClass.browserlaunch();
		
	}

	@When("^user will enter the username, password and click on login$")
	public void user_will_enter_the_username_password_and_click_on_login() throws Throwable {
		pom = new Pageobjectclass();
		 pom.logindetails(pro.getProperty("username"), pro.getProperty("password"));
		 Thread.sleep(5000);
	}

	@Then("^user will successfully login$")
	public void user_will_successfully_login() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("CNCPMT"))
		{
			System.out.println("Login Successfully");
		}else {
			System.out.println("Login Failed");
		}
	}

	@Given("^User will mouseover and choose the product category page$")
	public void user_will_mouseover_and_choose_the_product_category_page() throws Throwable {
	    mpom = new Mastercategory_POM();
	    
	    mpom.clickonproductcategory();
	    
		
	}

	@When("^User will click on the add button and add a new category$")
	public void user_will_click_on_the_add_button_and_add_a_new_category() throws Throwable {
	    
		mpom.addcategory1();
	}

	@And("^User will enter the category name and choose the equivalent PIES category$")
	public void user_will_enter_the_category_name_and_choose_the_equivalent_PIES_category() throws Throwable {
	    
		mpom.entrycategory(pro.getProperty("categoryname"));
		mpom.savingcategory();
		Thread.sleep(3000);
		mpom.acceptAlert();
	}

	
	@Then("^User will successfully added and verify that the record has come$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {
		//Thread.sleep(3000);
		mpom.verifyingtext(pro.getProperty("categoryname"));
	    System.out.println("category successfully added");
	    BaseClass.teardown();
	}
/*
	@Given("^User will go to master and choose product sub category$")
	public void user_will_go_to_master_and_choose_product_sub_category() throws Throwable {
	   
	}

	@When("^User will click on the add button and choose the category drop down list$")
	public void user_will_click_on_the_add_button_and_choose_the_category_drop_down_list() throws Throwable {
	    
	}

	@When("^User will ente the sub category name  and choose the equivalent and save button is clicked$")
	public void user_will_ente_the_sub_category_name_and_choose_the_equivalent_and_save_button_is_clicked() throws Throwable {
	   
	}

	@Then("^User will successfully added and verify the record has come$")
	public void user_will_successfully_added_and_verify_the_record_has_come() throws Throwable {
	    
	}

	@Given("^User will go to master and choose part description$")
	public void user_will_go_to_master_and_choose_part_description() throws Throwable {
	    
	}

	@When("^User will click on the add button and choose the category & sub category drop down list$")
	public void user_will_click_on_the_add_button_and_choose_the_category_sub_category_drop_down_list() throws Throwable {
	    
	}

	@When("^User will ente the part description name  and save button is clicked$")
	public void user_will_ente_the_part_description_name_and_save_button_is_clicked() throws Throwable {
	    
	}*/
}
