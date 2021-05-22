package testcases_stepdef;

import org.testng.Assert;

import BaseClass.browsersetup;
import PageObjectory.adminpage;
import PageObjectory.leavepage;
import Utilities.util;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaveStep extends browsersetup {
	leavepage lp;
	util ut;
	
	@Given("^User clicks on leave tab$")
	public void user_clicks_on_leave_tab() throws Throwable {
		Thread.sleep(1000);
		lp= new leavepage(driver); 
	    lp.ClickOnLeavePage();
	}

	@When("^User clicks on From calender$")
	public void user_clicks_on_From_calender() throws Throwable {
	   lp.FromDate();
	   Thread.sleep(1000);
	}
	
	@When("^User selects month and year for From Calender$")
	public void user_selects_month_and_year_for_From_Calender() throws Throwable {
		ut= new util(driver);
		ut.SelectUserRoledropdown(lp.Month(),"Sep"); 
		   Thread.sleep(1000);
		ut.SelectUserRoledropdown(lp.Year(),"2022"); 
		   Thread.sleep(1000);
	    
	}

	@Then("^User clicks on any date$")
	public void user_clicks_on_any_date() throws Throwable {
	   lp.DatePicker();
	    
	}

	@Then("^User clicks on To Calender$")
	public void user_clicks_on_To_Calender() throws Throwable {
		   lp.ToDate();
		   Thread.sleep(1000);
	    
	}

	@Then("^User selects month and year for To Calender$")
	public void user_selects_month_and_year_for_To_Calender() throws Throwable {
		ut= new util(driver);
		ut.SelectUserRoledropdown(lp.Month(),"Sep"); 
		   Thread.sleep(1000);
		ut.SelectUserRoledropdown(lp.Year(),"2023"); 
		   Thread.sleep(1000);
	    
	}

	@Then("^User selects any date$")
	public void user_selects_any_date() throws Throwable {
		  lp.DatePicker();
	    
	}

	@Then("^User unchecks Pending Approval checkbox$")
	public void user_unchecks_Pending_Approval_checkbox() throws Throwable {
	   lp.UncheckboxPending();
	    
	}

	@When("^User enters \"([^\"]*)\"$")
	public void user_enters(String EnterEmployeeName) throws Throwable {
	   lp.EnterName(EnterEmployeeName);
	    
	}

	@When("^User checkbox SubUnit$")
	public void user_checkbox_SubUnit() throws Throwable {
	   lp.ClickOnSubUnit();
	    
	}

	@Then("^User selects \"([^\"]*)\"$")
	public void user_selects(String Dropdownvalue) throws Throwable {
		ut.SelectUserRoledropdown(lp.SelectAdmin(),Dropdownvalue); 
	    
	}

	@Then("^User clicks including past employee checkbox$")
	public void user_clicks_including_past_employee_checkbox() throws Throwable {
	   lp.CheckboxPastEmployee();
	    
	}

	@Then("^User clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
	   
	    lp.SearchBtn();
	    Thread.sleep(1000);
	}



}