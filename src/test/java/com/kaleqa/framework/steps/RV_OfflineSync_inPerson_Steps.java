package com.kaleqa.framework.steps;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;

import com.kaleqa.framework.base.browsersetup;
import com.kaleqa.framework.pages.RV_OfflineSync_inPerson_page;
import com.kaleqa.framework.utils.util;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RV_OfflineSync_inPerson_Steps extends browsersetup {
	
	RV_OfflineSync_inPerson_page rp; 
	util ut;
	String photofile = System.getProperty("user.dir") + "\\uploadfile\\weargloves.png";
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^click Analysis$")
	public void click_Analysis() throws Throwable {
		ut = new util(driver);                           //should I need this????????????????????
		ut.switchiframe();
		Thread.sleep(1000);
		rp = new RV_OfflineSync_inPerson_page(driver);   //why we need this?????????????
		Thread.sleep(1000);
		rp.AnalysisBtn();
		Thread.sleep(1000);
	    
	}

	@Then("^click Remote Verification module$")
	public void click_Remote_Verification_module() throws Throwable {
	    rp.RemoteVerificationBtn();
	    
	}

//(1)
	@Then("^enter text \"([^\"]*)\"$")
	public void enter_text(String ReportTitle) throws Throwable {
	    rp.ReportTitletext(ReportTitle);
	    
	}

//(3)	
	@Then("^click ChooseFile and upload photo_three$")
	public void click_ChooseFile_and_upload_photo_three() throws Throwable {
		
		if (Hooks.getProps().getProperty("Browsername").equalsIgnoreCase("Chrome")) {
			Thread.sleep(1000);
			ut.switchiframe();
			rp.ClickChooseFile();
			Thread.sleep(1000);
			Robot rb = new Robot();
			Thread.sleep(1000);
			StringSelection str = new StringSelection(photofile);
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
		}
	}
	
	
//(4)	
	@When("^enter text \"([^\"]*)\" for description_four$")
	public void enter_text_for_description_four(String Detail) throws Throwable {
			rp.TextDetail(Detail);
	    
	}

//(5)
	@And("^click InPerson tab_five$")
	public void click_InPerson_tab_five() throws Throwable {
			rp.ClickInPersontab();
	}

	
//(6)	
	@Given("^click I certify_six$")
	public void click_I_certify_six() throws Throwable {
	    rp.ClickICertify();
	    
	}

	@And("^enter VNametext \"([^\"]*)\"_six$")
	public void enter_VNametext__six(String VerifierName) throws Throwable {
	    rp.VerifierNametext(VerifierName);
	    
	}

	@And("^enter VTitletext \"([^\"]*)\"_six$")
	public void enter_VTitletext__six(String VerifierTitle) throws Throwable {
	    rp.VerifierTitletext(VerifierTitle);
	    
	}

//(7)	
	@Then("^click save button_seven$")
	public void click_save_button_seven() throws Throwable {
	    rp.ClickSaveBtn();
	    
	}

}
