package testcases_stepdef;

import org.testng.Assert;

import BaseClass.browsersetup;
import PageObjectory.adminpage;
import Utilities.util;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStep extends browsersetup {
	adminpage ap;
	util ut;
	
	@Given("^User clicks admin tab$")
	public void user_clicks_admin_tab() throws Throwable {
		Thread.sleep(1000);
		ap= new adminpage(driver); //arg driver comes from adminpage's constructor to initialize driver to the object
	    ap.Admintab();
	}

	@When("^User clicks user management tab$")
	public void user_clicks_user_management_tab() throws Throwable {
	    ap.UserManagementTab();
	}

	@And("^User enters system username \"([^\"]*)\"$")
	public void user_enters_system_username(String searchname) throws Throwable {
		ap.SearchName(searchname);
	}



	@When("^User select User Role Dropdown \"([^\"]*)\"$") 
	public void user_select_User_Role_Dropdown(String Dropdownvalue) throws Throwable {
	ut= new util(driver);
	ut.SelectUserRoledropdown(ap.SelectAdmin(),Dropdownvalue); //ap.SelectAdmin() call from adminpage's method ;  Dropdownvalue will take value from .feature file's data
  
}

@When("^User click and enter \"([^\"]*)\"$")
public void user_click_and_enter(String EmployeeName) throws Throwable {
    ap.SearchEmployeeName(EmployeeName);
}

@Then("^User clicks search button$")
public void user_clicks_search_button() throws Throwable {
    ap.SearchBtn();
    Thread.sleep(1000);
}

@Then("^User confirm employee status show Enable text$")
public void user_confirm_employee_status_show_Enable_text() throws Throwable {
    String actualstatus = ap.ConfirmEmployeeStatusText();//Enabled
    String expectedstatus = "Enabled";
    Assert.assertEquals(actualstatus, expectedstatus);
}



}
