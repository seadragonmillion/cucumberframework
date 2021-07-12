package com.kaleqa.framework.steps;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.kaleqa.framework.base.browsersetup;
import com.kaleqa.framework.pages.JO_TC01_page;
import com.kaleqa.framework.utils.util;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JO_TC01_Steps extends browsersetup {

	JO_TC01_page jp;
	util ut;
	String photofile_One = System.getProperty("user.dir") + "\\uploadfile\\mask off2.jpg";
	String photofile_Two = System.getProperty("user.dir") + "\\uploadfile\\weargloves.png";
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("^User clicks on Analysis option$")
	public void user_clicks_on_Analysis_option() throws Throwable {
		ut = new util(driver);
		ut.switchiframe();
		Thread.sleep(1000);
		jp = new JO_TC01_page(driver);
		Thread.sleep(1000);
		jp.mainMenuAnalysisOption();
		Thread.sleep(1000);
	}

	@Given("^User should be landed to Analysis sub menu by verifying submenu text \"([^\"]*)\"$")
	public void user_should_be_landed_to_Analysis_sub_menu_by_verifying_submenu_text(String AnalysisMenu)
			throws Throwable {

		Thread.sleep(2000);
		Assert.assertEquals(jp.analysisMenuTextVerify(), AnalysisMenu); // actual, expected

	}

	@Then("^User clicks on Job Observation Analysis option$")
	public void user_clicks_on_Job_Observation_Analysis_option() throws Throwable {
		jp.analysismenuJOTab();

	}

	@Then("^User verifies subtitle text Record job observation details…to the job observation\"([^\"]*)\"$")
	public void user_verifies_subtitle_text_Record_job_observation_details_to_the_job_observation(
			String jobobservationdetails) throws Throwable {
		Assert.assertEquals(jp.JobObs_SubTitleVerify(), jobobservationdetails);

	}

	@Then("^User enter valid name for Report Title \"([^\"]*)\"$")
	public void user_enter_valid_name_for_Report_Title(String strreportTitle) throws Throwable {
		jp.reportTitleEnter(strreportTitle);
	}

	@Given("^User enters valid name for Organisation\"([^\"]*)\"$")
	public void user_enters_valid_name_for_Organisation(String orgName) throws Throwable {
		jp.JobObs_Organisation(orgName);

	}

	@When("^User enters valid name for Department\"([^\"]*)\"$")
	public void user_enters_valid_name_for_Department(String departName) throws Throwable {

		jp.JobObs_DepartmentName(departName);
	}

	@When("^User clicks on Calender and select valid Date$")
	public void user_clicks_on_Calender_and_select_valid_Date() throws Throwable {

		Thread.sleep(1000);
		jp.datepicker();
		Thread.sleep(1000);
	}

	@Then("^User enters valid name for Observer \"([^\"]*)\"$")
	public void user_enters_valid_name_for_Observer(String jobObserver) throws Throwable {
		jp.JobObs_JobObserverEnter(jobObserver);

	}

	@When("^User enters valid precise Location \"([^\"]*)\"$")
	public void user_enters_valid_precise_Location(String jobLocation) throws Throwable {
		jp.JobObs_JobLocationEnter(jobLocation);

	}

	@Then("^User enters valid detailed description for Job observed \"([^\"]*)\"$")
	public void user_enters_valid_detailed_description_for_Job_observed(String jobObserv) throws Throwable {
		jp.JobObs_JobObserved(jobObserv);

	}

	@When("^User clicks on Supporting file details button$")
	public void user_clicks_on_Supporting_file_details_button() throws Throwable {
		Thread.sleep(1000);
		jp.JobObs_supportFileOption();

	}

	@Then("^User enters valid Title \"([^\"]*)\"$")
	public void user_enters_valid_Title(String Title) throws Throwable {
		Thread.sleep(1000);
		jp.JobObs_supportFileTitle(Title);
	}

	@When("^User enters valid Description \"([^\"]*)\"$")
	public void user_enters_valid_Description(String Description) throws Throwable {
		jp.JobObs_supportFileDes(Description);
	}

	@Then("^User clicks on Choose file and select valid file to upload$")
	public void user_clicks_on_Choose_file_and_select_valid_file_to_upload() throws Throwable {
		if (Hooks.getProps().getProperty("Browsername").equalsIgnoreCase("Chrome")) {
			Thread.sleep(1000);
			jp.ClickOnChooseFileBtn();
			Thread.sleep(1000);
			Robot rb = new Robot();
			Thread.sleep(1000);
			StringSelection str = new StringSelection(photofile_One);
			Thread.sleep(1000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			Thread.sleep(1000);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			Thread.sleep(1000);
		}

	}

	@When("^User clicks on first file rotate button$")
	public void user_clicks_on_first_file_rotate_button() throws Throwable {
		if (Hooks.getProps().getProperty("Browsername").equalsIgnoreCase("Chrome")) {
			jp.ClickRotationBtn();

			js.executeScript("window.scrollBy(0,2000)");
		}

	}

	@When("^User clicks on attach another file button$")
	public void user_clicks_on_attach_another_file_button() throws Throwable {
		if (Hooks.getProps().getProperty("Browsername").equalsIgnoreCase("Chrome")) {
			Thread.sleep(1000);
			jp.clickOnAttachAnotherBtn();
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(1000);
			// ut.switchToDefault();
		}
	}

	@Then("^User verifies supporting file two text display$")
	public void user_verifies_supporting_file_two_text_display() throws Throwable {
		if (Hooks.getProps().getProperty("Browsername").equalsIgnoreCase("Chrome")) {
			Thread.sleep(1000);
			// ut.switchiframe();
			String expectedresult = jp.supportFileTextVerify();
			System.out.println("expected result :" + expectedresult);
			Assert.assertEquals(jp.supportFileTextVerify(), "Supporting file (2):");
			// jp.supportFileTextVerify();
		}

	}

	@Then("^User enters valid second Title \"([^\"]*)\"$")
	public void user_enters_valid_second_Title(String TitleTwo) throws Throwable {
		if (Hooks.getProps().getProperty("Browsername").equalsIgnoreCase("Chrome")) {
			jp.supportFileTitleEnter(TitleTwo);
		}
	}

	@Then("^User enters valid second Description \"([^\"]*)\"$")
	public void user_enters_valid_second_Description(String DescriptionTwo) throws Throwable {
		if (Hooks.getProps().getProperty("Browsername").equalsIgnoreCase("Chrome")) {
			jp.supportFileDesEnter(DescriptionTwo);
		}
	}

	@Then("^User clicks on Choose file and select valid Second file to upload$")
	public void user_clicks_on_Choose_file_and_select_valid_Second_file_to_upload() throws Throwable {
		if (Hooks.getProps().getProperty("Browsername").equalsIgnoreCase("Chrome")) {
			Thread.sleep(1000);
			jp.ClickOnChooseFileBtnTwo();
			Thread.sleep(1000);
			Robot rb = new Robot();
			Thread.sleep(1000);
			StringSelection str = new StringSelection(photofile_Two);
			Thread.sleep(1000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			Thread.sleep(1000);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,2000)");
		}
	}

	@Then("^User clicks on next button$")
	public void user_clicks_on_next_button() throws Throwable {
		Thread.sleep(1000);
		jp.clickOnNextBtn();

	}

}
