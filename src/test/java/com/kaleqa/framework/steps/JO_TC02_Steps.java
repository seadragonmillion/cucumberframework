package com.kaleqa.framework.steps;

import com.kaleqa.framework.base.browsersetup;
import com.kaleqa.framework.pages.JO_TC01_page;
import com.kaleqa.framework.utils.util;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JO_TC02_Steps extends browsersetup {

	JO_TC01_page jp;
	util ut;

	@Then("^User select valid data from observation type \"([^\"]*)\" and category dropdown \"([^\"]*)\"$")
	public void user_select_valid_data_from_observation_type_and_category_dropdown(String observationtype,
			String category) throws Throwable {
		ut = new util(driver);
		jp = new JO_TC01_page(driver);
		Thread.sleep(1000);
		ut.SelectdropdownByVisible(jp.JobObservation(), observationtype);
		Thread.sleep(1000);
		ut.SelectdropdownByValue(jp.Category(), category);
		Thread.sleep(1000);
	}

	/*
	 * @Then("^I click the check box randomly$") public void
	 * i_click_the_check_box_randomly() throws Throwable {
	 * ut.CheckboxClick(jp.checkboxes()); }
	 */

	@When("^I select the checkboxes for \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_validate_the_checkbox_for_observation_category(String observationtype, String categoryText)
			throws Throwable {
		jp = new JO_TC01_page(driver);
		jp.selectAndValidateCheckBoxes(observationtype, categoryText);
	}

	@Then("^User clicks on next button two$") 
	public void User_clicks_the_next_button2() throws Throwable {
		ut.switchiframe();
//		driver.switchTo().frame("pii-iframe-main");
		jp.clickOnNextBtnTwo();
	}
	
	@When("^I provide details for categories for \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_provide_details_for_categories(String observationtype, String cagtegoryText) throws Throwable {
		jp = new JO_TC01_page(driver);
		Thread.sleep(3000);
		jp.enterCategoryDetails(observationtype, cagtegoryText); //[1.3]click checkbox and sendkey text
	}

	@Then("^User clicks on next button3$") 
	public void User_clicks_the_next_button() throws Throwable {
		jp.clickOnNextBtnThree();
	}

	@Then("^User clicks Proceed to common analysis button$")
	public void User_clicks_Proceed_to_common_analysis_button() throws Throwable {
		jp.clickOnProceedToAnaBtn();
	}

	@Then("^User validates pdf file entry for main label \"([^\"]*)\" entry value \"([^\"]*)\"$")
	public void User_clicks_Proceed_to_common_analysis_button(String mainLabel, String tableEntry) throws Throwable {
		jp.validatePDFEntryUsingMainLabel(mainLabel, tableEntry);
	}
	 
	@Then("^User validates observed factors and their characteristics in pdf file entry for main label \"([^\"]*)\" for \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_validates_observed_factors_and_their_characteristics_in_pdf_for_main_label(String mainLabel, String jobObservationType, String category) throws Throwable {
		jp.validateObservedFactorsAndTheirCharacteristicsInPDF(mainLabel, jobObservationType, category);
	}
	
}
