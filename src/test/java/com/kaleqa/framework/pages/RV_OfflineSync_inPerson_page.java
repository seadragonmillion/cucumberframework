package com.kaleqa.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kaleqa.framework.utils.util;

public class RV_OfflineSync_inPerson_page  {
	
	WebDriver driver;
	RV_OfflineSync_inPerson_page rp; 
	util ut;

	public RV_OfflineSync_inPerson_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "pii-main-menu-button-a")
	private WebElement AnalysisBtn;

	public void AnalysisBtn() throws Throwable {
		Thread.sleep(7000);
		AnalysisBtn.click();
	}
	
	@FindBy(id = "pii-a-menu-rv")
	private WebElement RemoteVerificationBtn;

	public void RemoteVerificationBtn() {
		RemoteVerificationBtn.click();
	}

//(1)	
	@FindBy(id = "pii-rv-tab-1-title")
	private WebElement ReportTitletext;

	public void ReportTitletext(String ReportTitle) {
		ReportTitletext.sendKeys(ReportTitle);
	}

//(3)	
	@FindBy(id = "pii-rv-imgperson-photo-input")
	private WebElement ClickChooseFile;

	public void ClickChooseFile() {
		ut = new util(driver);
		ut.switchiframe();
		ClickChooseFile.click();
	}

	public void ChooseFileButton(String choosephoto) {   //should I delete this?????????????????????
		
		ClickChooseFile.sendKeys(choosephoto);
	}
	
//(4)	
	@FindBy(id = "pii-rv-tab-1-details")
	private WebElement TextDetail;

	public void TextDetail(String Detail) {
		TextDetail.sendKeys(Detail);
	}
	
//(5)
	@FindBy(id = "pii-rv-tab-1-5-inperson-radio-ip")
	private WebElement ClickInPersontab;

	public void ClickInPersontab() {
		ClickInPersontab.click();
	}
	
//(6)
	@FindBy(id = "pii-rv-tab-1-6ip-icertify-checkbox")
	private WebElement ClickICertify;

	public void ClickICertify() {
		ClickICertify.click();
	}
	
	@FindBy(id = "pii-rv-tab-1-details")
	private WebElement VerifierNametext;

	public void VerifierNametext(String VerifierName) {
		VerifierNametext.sendKeys(VerifierName);
	}
	
	@FindBy(id = "pii-rv-tab-1-details")
	private WebElement VerifierTitletext;

	public void VerifierTitletext(String VerifierTitle) {
		VerifierTitletext.sendKeys(VerifierTitle);
	}
	
//(7)
	@FindBy(id = "pii-rv-save2")
	private WebElement ClickSaveBtn;

	public void ClickSaveBtn() {
		ClickSaveBtn.click();
	}
	
}
