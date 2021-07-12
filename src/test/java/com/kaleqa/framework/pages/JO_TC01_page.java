package com.kaleqa.framework.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kaleqa.framework.utils.util;

public class JO_TC01_page {

	WebDriver driver;

	public JO_TC01_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "pii-main-menu-button-a")
	private WebElement mainMenuAnalysisBtn;

	public void mainMenuAnalysisOption() throws Throwable {
		Thread.sleep(7000);
		mainMenuAnalysisBtn.click();
	}

	@FindBy(xpath = "//div[contains(text(),'detect')]")
	private WebElement analysisMenuText;

	public String analysisMenuTextVerify() {
		return analysisMenuText.getText();
	}

	@FindBy(id = "pii-a-menu-jo")
	private WebElement analysismenuJOTab;

	public void analysismenuJOTab() {
		analysismenuJOTab.click();
	}

	// 1.1 form
	@FindBy(xpath = "//div[contains(text(),'Record job observation details and descriptio')]")
	private WebElement JobObs_SubTitleText;

	public String JobObs_SubTitleVerify() {
		return JobObs_SubTitleText.getText();
	}

	@FindBy(id = "pii-joa-tab-1-title")
	private WebElement reportTitle;

	public void reportTitleEnter(String strreportTitle) {
		reportTitle.sendKeys(strreportTitle);
	}

	@FindBy(id = "pii-joa-tab-1-org")
	private WebElement JobObs_Organisation;

	public void JobObs_Organisation(String orgName) {
		JobObs_Organisation.sendKeys(orgName);
	}

	@FindBy(id = "pii-joa-tab-1-dpt")
	private WebElement JobObs_DepartName;

	public void JobObs_DepartmentName(String departName) {
		JobObs_DepartName.sendKeys(departName);
	}

	@FindBy(xpath = "(//a[@title='Open Date Picker'])[3]")
	private WebElement JobObs_Date;

	public void JobObs_DateClick() {
		util ut = new util(driver);
		ut.clickUsingJavascript(JobObs_Date);
	}

	@FindBy(xpath = "//input[@placeholder='Name of observer']") // sendkey, form enters Job Observer
	private WebElement JobObs_JobObserver;

	public void JobObs_JobObserverEnter(String jobObserver) {
		JobObs_JobObserver.sendKeys(jobObserver);
	}

	@FindBy(id = "pii-joa-tab-1-location") // sendkey, form enters Location
	private WebElement JobObs_JobLocation;

	public void JobObs_JobLocationEnter(String jobLocation) {
		JobObs_JobLocation.sendKeys(jobLocation);
	}

	@FindBy(id = "pii-joa-tab-1-job") // sendkey, form enters Job Observed
	private WebElement JobObs_JobObserved;

	public void JobObs_JobObserved(String jobObserv) {
		JobObs_JobObserved.sendKeys(jobObserv);
	}

	// Supporting files section: upload photos
	@FindBy(id = "pii-jo-event-filecollapsible-header-0") // click, support file tab
	private WebElement supportFileOption;

	public void JobObs_supportFileOption() {
		supportFileOption.click();
	}

	@FindBy(id = "pii-jo-event-file-title-0") // sendkey, supportfile title
	private WebElement supportFileTitle;

	public void JobObs_supportFileTitle(String Title) {
		supportFileTitle.sendKeys(Title);
	}

	@FindBy(id = "pii-jo-event-file-description-0") // sendkey, supportfile description
	private WebElement supportFileDescription;

	public void JobObs_supportFileDes(String Description) {
		supportFileDescription.sendKeys(Description);
	}

	@FindBy(id = "pii-jo-event-file-button-0") // click, supportfile's choose fileBtn
	private WebElement ChooseFileBtn;

	public void ClickOnChooseFileBtn() {
		ChooseFileBtn.click();
	}

	public void ChooseFileButton(String choosephoto) {
		ChooseFileBtn.sendKeys(choosephoto);
	}

	@FindBy(id = "pii-jo-event-file-rotate-0") // click rotation button of 1st photo
	private WebElement rotationBtn;

	public void ClickRotationBtn() {
		util ut = new util(driver);
		ut.clickUsingJavascript(rotationBtn);
//		rotationBtn.click();
	}

	// choose photos from local

	@FindBy(id = "pii-jo-addnewfile-button") // click, attach another btn
	private WebElement attachAnotherBtn;

	public void clickOnAttachAnotherBtn() {
		attachAnotherBtn.click();
	}

	@FindBy(xpath = "//label[contains(text(),'Supporting file (2)')]") // gettext, supporting file2 should display
	private WebElement supportFileSecondDisplay;

	public String supportFileTextVerify() {
		return supportFileSecondDisplay.getText();
	}

	@FindBy(id = "pii-jo-event-file-title-1") // sendkey, 2nd supportfile title
	private WebElement supportFileSecondTitle;

	public void supportFileTitleEnter(String TitleTwo) {
		supportFileSecondTitle.sendKeys(TitleTwo);
	}

	@FindBy(id = "pii-jo-event-file-description-1") // sendkey, 2nd supportfile description
	private WebElement supportFileSecondDescription;

	public void supportFileDesEnter(String DescriptionTwo) {
		supportFileSecondDescription.sendKeys(DescriptionTwo);
	}

	@FindBy(id = "pii-jo-event-file-button-1") // click, supportfile's choose fileBtn
	private WebElement ChooseFileBtnTwo;

	public void ClickOnChooseFileBtnTwo() {
		ChooseFileBtnTwo.click();
	}

	@FindBy(id = "pii-jo-event-file-button-1") // click, 2nd supportfile's choose fileBtn
	private WebElement supportFileSecondBtn;

	public void clickOnSecondChooseFileBtn() {
		supportFileSecondBtn.click();
	}

	public void ChooseFileBtn(String choosephoto) {
		supportFileSecondBtn.sendKeys(choosephoto);
	}

	@FindBy(id = "pii-joa-tab-1-submit") // click, next button to finish1.1
	private WebElement JONextBtn;

	public void clickOnNextBtn() {
		JONextBtn.click();
	}

	@FindBy(id = "pii-joa-obstype-select") // click rotation button of 1st photo
	private WebElement JobObservation;

	public WebElement JobObservation() {
		return JobObservation;
	}

	@FindBy(id = "pii-joa-obscat-select") // click rotation button of 1st photo
	private WebElement Category;

	public WebElement Category() {
		return Category;
	}

	@FindBy(xpath = "//div[@class='ui-block-b']/div/div/label") // click rotation button of 1st photo
	private List<WebElement> checkboxes;

	public List<WebElement> checkboxes() {
		return checkboxes;
	}

	@FindBy(id = "pii-joa-button-next") // click, next button to finish1.2
	private WebElement JONextBtnTwo;

	public void clickOnNextBtnTwo() {
		// JONextBtnTwo.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", JONextBtnTwo);
	}

	// [1.3]checkbox dynamic locators
	public WebElement getCheckBox(String checkBoxLabel) {   //this method used in switch case
		return driver
				.findElement(By.xpath("//*[@class='ui-checkbox']/label[contains(text(),'" + checkBoxLabel + "')]"));
//		/following-sibling::input
	}

	//[1.3] observed factors vs characteristics in switchcase
	public WebElement getCheckBox(String characteristic, String checkBoxLabel) {
		return driver.findElement(By.xpath("//div[contains(text(),'" + characteristic 
				+ "')]/following-sibling::table[1]//label[contains(text(),'" + checkBoxLabel + "')]"));
	}

	public WebElement getTextAreaOfCheckBox(String checkBoxLabel) {
		return driver.findElement(
				By.xpath("//label[contains(text(),'" + checkBoxLabel + "')]/ancestor::tr/td[2]//textarea"));
	}
	//[1.3] observed factors vs characteristics in switchcase
	public WebElement getTextAreaOfCheckBox(String characteristic, String checkBoxLabel) {
		return driver.findElement(
				By.xpath("//div[contains(text(),'" + characteristic + "')]/following-sibling::table[1]//label[contains(text(),'" + checkBoxLabel + "')]/ancestor::tr/td[2]//textarea"));
	}

	public WebElement getTextPDFMainLabelTableEntry(String mainLabel, String tableText) {
		return driver.findElement(By.xpath("//h2[contains(text(),'" + mainLabel
				+ "')]/following-sibling::table//tbody//*[contains(text(),'" + tableText + "')]"));
	}

	public WebElement getTextPDFMainLabelTableEntry(String mainLabel, String obFactorLabel, String charac) {
		return driver.findElement(By
				.xpath("//h2[contains(text(),'" + mainLabel + "')]/following-sibling::table//tbody//*[contains(text(),'"
						+ obFactorLabel + "')]//ancestor::tr/td[2]/*[contains(text(),'" + charac + "')]"));
	}

	@FindBy(id = "pii-joa-button-next") // click, next button to finish1.3
	private WebElement JONextBtnThree;

	public void clickOnNextBtnThree() {
		JONextBtnThree.click();
	}

	// [1.4]proceed to analysis
	@FindBy(id = "pii-joa-proceed-to-analysis")
	private WebElement JOProceedToAnaBtn;

	public void clickOnProceedToAnaBtn() {
		JOProceedToAnaBtn.click();
	}

	public void datepicker() throws InterruptedException {

		DateFormat dateFormat2 = new SimpleDateFormat("d");
		Date date2 = new Date();
		String today = dateFormat2.format(date2);
		System.out.println("Current day : " + today);
		Thread.sleep(1000);
		JobObs_DateClick();
		Thread.sleep(1000);
		// find the calendar
		WebElement dateWidget = driver.findElement(By.xpath("//div[@class='ui-datebox-grid']"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("div"));

		// comparing the text of cell with today's date and clicking it.
		for (WebElement cell : columns) {
			// System.out.println("cell display as : " +cell.getText());
			if (cell.getText().equals(today)) {
				Thread.sleep(1000);
				cell.click();
				break;
			}
		}

	}

	//[1.2]select type + category + all factors
	public void selectAndValidateCheckBoxes(String observationtype, String category) {
		util ut = new util(driver);
		if (observationtype.equalsIgnoreCase("SPV Mitigation")) {
			System.out.println("Selecting the checkboxes");
			switch (category) {
			case "Equipment": {
				//getCheckBox method used dynamic xpath
				getCheckBox("Change").click();
				getCheckBox("Anomaly").click();
				getCheckBox("Degradation").click();
				break;
			}
			case "Procedure": {
				ut.clickUsingJavascript(getCheckBox("Requirement"));
				ut.clickUsingJavascript(getCheckBox("Operating condition"));
				ut.clickUsingJavascript(getCheckBox("Assumption"));
				ut.clickUsingJavascript(getCheckBox("Scope"));
				ut.clickUsingJavascript(getCheckBox("Testing"));
				ut.clickUsingJavascript(getCheckBox("Alignment"));
				ut.clickUsingJavascript(getCheckBox("Accuracy"));
				ut.clickUsingJavascript(getCheckBox("Analysis"));
				ut.clickUsingJavascript(getCheckBox("Applicability"));
				break;
			}
			case "Injury": {
				ut.clickUsingJavascript(getCheckBox("Line of fire"));
				ut.clickUsingJavascript(getCheckBox("Overexertion"));
				ut.clickUsingJavascript(getCheckBox("Slip/Trip/Fall"));
				ut.clickUsingJavascript(getCheckBox("Equipment related"));
				ut.clickUsingJavascript(getCheckBox("Environment related"));
				break;
			}
			}

		} else if (observationtype.equalsIgnoreCase("Error-inducing Condition")) {
			switch (category) {
			case "Time related": {
				getCheckBox("Time-sensitive operation").click();
				getCheckBox("Schedule delay").click();
				getCheckBox("Long working hours").click();
				getCheckBox("Extreme time pressure").click();
				break;
			}
			case "Activity related": {
				getCheckBox("New equipment, tools, or procedures").click();
				getCheckBox("Defective or damaged tools/equipment").click();
				getCheckBox("Omitted human performance tool").click();
				getCheckBox("Unknown critical points").click();
				break;
			}
			case "People related": {
				getCheckBox("Undocumented verbal instructions").click();
				getCheckBox("Acts of noncompliance").click();
				getCheckBox("Time sensitive communication").click();
				break;
			}
			case "Environment related": {
				getCheckBox("Unprotected equipment").click();
				getCheckBox("Unidentified safety issues").click();
				getCheckBox("Potential LOP failure").click();
				break;
			}
			}
		} else if (observationtype.equalsIgnoreCase("Error-prone Behavior")) {
			switch (category) {
			case "Intentional noncompliance": {
				getCheckBox("Burden").click();
				getCheckBox("Undue Motivation").click();
				getCheckBox("Risk Perceived").click();
				getCheckBox("Peer Pressure").click();
				break;
			}
			case "Unintentional noncompliance": {
				getCheckBox("Distraction").click();
				getCheckBox("Drowsiness").click();
				getCheckBox("Overconfidence").click();
				getCheckBox("Time Pressure").click();
				ut.clickUsingJavascript(getCheckBox("Attention Insufficiency"));
				ut.clickUsingJavascript(getCheckBox("All-inclusiveness"));
				ut.clickUsingJavascript(getCheckBox("Bypass Control"));
				ut.clickUsingJavascript(getCheckBox("Clarity"));
				ut.clickUsingJavascript(getCheckBox("Training"));
				ut.clickUsingJavascript(getCheckBox("Qualification"));
				ut.clickUsingJavascript(getCheckBox("Accountability"));
				break;
			}
			case "Knowledge-based errors": {
				getCheckBox("Blind Trust").click();
				getCheckBox("Overconfidence").click();
				getCheckBox("OOS/OOM").click();
				ut.clickUsingJavascript(getCheckBox("Sunk-cost trap"));
				ut.clickUsingJavascript(getCheckBox("Two-option trap"));
				ut.clickUsingJavascript(getCheckBox("Complacency"));
				ut.clickUsingJavascript(getCheckBox("Laziness"));
				ut.clickUsingJavascript(getCheckBox("Ignorance"));
				ut.clickUsingJavascript(getCheckBox("Fear"));
				break;
			}
			}
		}
	}

	// [1.3]click checkbox and sendkey text
	public void enterCategoryDetails(String observationtype, String category) throws InterruptedException {
		util ut = new util(driver);
		if (observationtype.equalsIgnoreCase("SPV Mitigation")) {
			switch (category) {
			case "Equipment": {
				getCheckBox("Color").click();
				getTextAreaOfCheckBox("Color").sendKeys("sbor$174/*+AbC_Z");

				getCheckBox("Vibration").click();
				getTextAreaOfCheckBox("Vibration").sendKeys("sbor$174/*+AbC_Z");

				getCheckBox("Geometry").click();
				getTextAreaOfCheckBox("Geometry").sendKeys("sbor$174/*+AbC_Z");

//				ut.scrollElementIntoView(getCheckBox("Scratch"));
				ut.clickUsingJavascript(getCheckBox("Scratch"));
				
				getTextAreaOfCheckBox("Scratch").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Surface"));
				getTextAreaOfCheckBox("Surface").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Small cracks"));
				getTextAreaOfCheckBox("Small cracks").sendKeys("sbor$174/*+AbC_Z");

//				ut.scrollElementIntoView(getCheckBox("Features"));
				ut.clickUsingJavascript(getCheckBox("Fractures"));
				getTextAreaOfCheckBox("Fractures").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Leak"));
				getTextAreaOfCheckBox("Leak").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Damage"));
				getTextAreaOfCheckBox("Damage").sendKeys("sbor$174/*+AbC_Z");
				break;
			}
			case "Procedure": {
				// below 4 options repeat 9 times
				

				String SPVMitigationProcedureCharacteristics = "Requirement,Operating condition,Assumption,Scope,Testing,Alignment,Accurac,Analysis,Applicability";
				String[] characArr = SPVMitigationProcedureCharacteristics.split(",");
				for(String charac : characArr) {
					ut.clickUsingJavascript(getCheckBox(charac, "Missing"));
					getTextAreaOfCheckBox(charac, "Missing").sendKeys("sbor$174/*+AbC_Z");

					ut.clickUsingJavascript(getCheckBox(charac, "Not clear"));
					getTextAreaOfCheckBox(charac, "Not clear").sendKeys("sbor$174/*+AbC_Z");

					ut.clickUsingJavascript(getCheckBox(charac, "Incorrect"));
					getTextAreaOfCheckBox(charac, "Incorrect").sendKeys("sbor$174/*+AbC_Z");

					ut.clickUsingJavascript(getCheckBox(charac, "Incomplete"));
					getTextAreaOfCheckBox(charac, "Incomplete").sendKeys("sbor$174/*+AbC_Z");
				}
				break;
			}
			case "Injury": {
				getCheckBox("Fall-and-bounce").click();
				getTextAreaOfCheckBox("Fall-and-bounce").sendKeys("sbor$174/*+AbC_Z");

				getCheckBox("Rolling down").click();
				getTextAreaOfCheckBox("Rolling down").sendKeys("sbor$174/*+AbC_Z");

				getCheckBox("Tool-use").click();
				getTextAreaOfCheckBox("Tool-use").sendKeys("sbor$174/*+AbC_Z");

				getCheckBox("Hit-and-fly").click();
				getTextAreaOfCheckBox("Hit-and-fly").sendKeys("sbor$174/*+AbC_Z");

				getCheckBox("Anchor-failure").click();
				getTextAreaOfCheckBox("Anchor-failure").sendKeys("sbor$174/*+AbC_Z");

				getCheckBox("Falling object").click();
				getTextAreaOfCheckBox("Falling object").sendKeys("sbor$174/*+AbC_Z");

				getCheckBox("Distraction").click();
				getTextAreaOfCheckBox("Distraction").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Line of fire", "Roll-over"));
				getTextAreaOfCheckBox("Line of fire", "Roll-over").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Lift beyond limit"));
				getTextAreaOfCheckBox("Lift beyond limit").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Body position twisted"));
				getTextAreaOfCheckBox("Body position twisted").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("unqualified walkways"));
				getTextAreaOfCheckBox("unqualified walkways").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("elevation-sloping terrains"));
				getTextAreaOfCheckBox("elevation-sloping terrains").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Fall from elevation-ladder"));
				getTextAreaOfCheckBox("Fall from elevation-ladder").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Fall from elevation-scaffolding"));
				getTextAreaOfCheckBox("Fall from elevation-scaffolding").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Fall from elevation-openings in working areas"));
				getTextAreaOfCheckBox("Fall from elevation-openings in working areas").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Inadequate PPE or PIPE"));
				getTextAreaOfCheckBox("Inadequate PPE or PIPE").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Equipment related", "Roll-over"));
				getTextAreaOfCheckBox("Equipment related", "Roll-over").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Roll-down"));
				getTextAreaOfCheckBox("Roll-down").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Pinch"));
				getTextAreaOfCheckBox("Pinch").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Drawing-in"));
				getTextAreaOfCheckBox("Drawing-in").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Malfunction"));
				getTextAreaOfCheckBox("Malfunction").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Welding"));
				getTextAreaOfCheckBox("Welding").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Back-feeding"));
				getTextAreaOfCheckBox("Back-feeding").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Insulation damage"));
				getTextAreaOfCheckBox("Insulation damage").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Poison ivy"));
				getTextAreaOfCheckBox("Poison ivy").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Dust, debris, or vapor"));
				getTextAreaOfCheckBox("Dust, debris, or vapor").sendKeys("sbor$174/*+AbC_Z");

				// spelling error, will report bug
				ut.clickUsingJavascript(getCheckBox("Low visibility"));
				getTextAreaOfCheckBox("Low visibility").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Harsh weather"));
				getTextAreaOfCheckBox("Harsh weather").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Natural disaster"));
				getTextAreaOfCheckBox("Natural disaster").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Unleashed dogs"));
				getTextAreaOfCheckBox("Unleashed dogs").sendKeys("sbor$174/*+AbC_Z");
				// spelling error, will report bug
				ut.clickUsingJavascript(getCheckBox("Pests and insests"));
				getTextAreaOfCheckBox("Pests and insests").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Inadequate instructions or signages"));
				getTextAreaOfCheckBox("Inadequate instructions or signages").sendKeys("sbor$174/*+AbC_Z");
				break;
			}
			}

		} else if (observationtype.equalsIgnoreCase("Error-inducing Condition")) {
			switch (category) {
			case "Time related": {
				
				ut.clickUsingJavascript(getCheckBox("Vague statement in SOP"));
				getTextAreaOfCheckBox("Vague statement in SOP").sendKeys("sbor$174/*+AbC_Z");
				
				
				ut.clickUsingJavascript(getCheckBox("Time-sensitive", "Interruptive work environment"));
				getTextAreaOfCheckBox("Time-sensitive", "Interruptive work environment").sendKeys("sbor$174/*+AbC_Z");
				
			
				ut.clickUsingJavascript(getCheckBox("Schedule delay", "Interruptive work environment"));
				getTextAreaOfCheckBox("Schedule delay", "Interruptive work environment").sendKeys("sbor$174/*+AbC_Z");

				
				ut.clickUsingJavascript(getCheckBox("uncomfortable working condition"));
				getTextAreaOfCheckBox("uncomfortable working condition").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Not changing workforce after 10 hours of work"));
				getTextAreaOfCheckBox("Not changing workforce after 10 hours of work").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Extreme time", "Interruptive work environment"));
				getTextAreaOfCheckBox("Extreme time", "Interruptive work environment").sendKeys("sbor$174/*+AbC_Z");

				break;
			}
			case "Activity related": {
				getCheckBox("Unfamiliar conditions").click();
				getTextAreaOfCheckBox("Unfamiliar conditions").sendKeys("sbor$174/*+AbC_Z");
						
				String condActi = "Defective or damaged,Omitted,Unknown";
				String[] characArr = condActi.split(",");
				for(String charac : characArr) {
					ut.clickUsingJavascript(getCheckBox(charac, "Not identified prior to starting the job"));
					getTextAreaOfCheckBox(charac, "Not identified prior to starting the job").sendKeys("sbor$174/*+AbC_Z");
				}
					break;
			}
			case "People related": {
				ut.clickUsingJavascript(getCheckBox("No guidelines or rules to mandate the documentation of verbal instructions"));
				getTextAreaOfCheckBox("No guidelines or rules to mandate the documentation of verbal instructions").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("No rules or coaching to hold acts of noncompliance accountable"));
				getTextAreaOfCheckBox("No rules or coaching to hold acts of noncompliance accountable").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Not identified prior to starting the job"));
				getTextAreaOfCheckBox("Not identified prior to starting the job").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("No guidelines or rules to ensure the communication is done within required time frame"));
				getTextAreaOfCheckBox("No guidelines or rules to ensure the communication is done within required time frame").sendKeys("sbor$174/*+AbC_Z");
				break;
			}
			case "Environment related": {
				ut.clickUsingJavascript(getCheckBox("Unprotected equipment","Not identified prior to starting the job"));
				getTextAreaOfCheckBox("Unprotected equipment","Not identified prior to starting the job").sendKeys("sbor$174/*+AbC_Z");

				getCheckBox("Interruptive work environment").click();
				getTextAreaOfCheckBox("Interruptive work environment").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Potential LOP","Not identified prior to starting the job"));
				getTextAreaOfCheckBox("Potential LOP","Not identified prior to starting the job").sendKeys("sbor$174/*+AbC_Z");
				break;
			}
			}
		} else if (observationtype.equalsIgnoreCase("Error-prone Behavior")) {
			switch (category) {
			case "Intentional noncompliance": {
				ut.clickUsingJavascript(getCheckBox("to obtain tools and equipment"));
				getTextAreaOfCheckBox("to obtain tools and equipment").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("to obtain documents or procedures"));
				getTextAreaOfCheckBox("to obtain documents or procedures").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("to obtain and wear PPE"));
				getTextAreaOfCheckBox("to obtain and wear PPE").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("over-complex"));
				getTextAreaOfCheckBox("over-complex").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("due to task being"));
				getTextAreaOfCheckBox("due to task being").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("can go home earlier"));
				getTextAreaOfCheckBox("can go home earlier").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("rewarded with bonus"));
				getTextAreaOfCheckBox("rewarded with bonus").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("especially for contractors who are paid"));
				getTextAreaOfCheckBox("especially for contractors who are paid").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("especially working at high temperature"));
				getTextAreaOfCheckBox("especially working at high temperature").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("not provide feedback about"));
				getTextAreaOfCheckBox("not provide feedback about").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Violation of established"));
				getTextAreaOfCheckBox("Violation of established").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("consequences of violations are"));
				getTextAreaOfCheckBox("consequences of violations are").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Risk of injury due to"));
				getTextAreaOfCheckBox("Risk of injury due to").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Feeling of low perceived"));
				getTextAreaOfCheckBox("Feeling of low perceived").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Staff is not trained to coach"));
				getTextAreaOfCheckBox("Staff is not trained to coach").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Staff is not held accountable"));
				getTextAreaOfCheckBox("Staff is not held accountable").sendKeys("sbor$174/*+AbC_Z");
				
				ut.clickUsingJavascript(getCheckBox("Staff does not fully understand"));
				getTextAreaOfCheckBox("Staff does not fully understand").sendKeys("sbor$174/*+AbC_Z");
				
				ut.clickUsingJavascript(getCheckBox("Supervisors do not reinforce"));
				getTextAreaOfCheckBox("Supervisors do not reinforce").sendKeys("sbor$174/*+AbC_Z");
				break;
			}
			case "Unintentional noncompliance": {
				ut.clickUsingJavascript(getCheckBox("Preoccupation"));
				getTextAreaOfCheckBox("Preoccupation").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Interruptions"));
				getTextAreaOfCheckBox("Interruptions").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Multitasking"));
				getTextAreaOfCheckBox("Multitasking").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Daily cycle"));
				getTextAreaOfCheckBox("Daily cycle").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Mental fatigue"));
				getTextAreaOfCheckBox("Mental fatigue").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Not knowing weakness"));
				getTextAreaOfCheckBox("Not knowing weakness").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Not seeking compensation"));
				getTextAreaOfCheckBox("Not seeking compensation").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Not addressing change"));
				getTextAreaOfCheckBox("Not addressing change").sendKeys("sbor$174/*+AbC_Z");
				
				ut.clickUsingJavascript(getCheckBox("Reducing attention span"));
				getTextAreaOfCheckBox("Reducing attention span").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Short-cutting"));
				getTextAreaOfCheckBox("Short-cutting").sendKeys("sbor$174/*+AbC_Z");
				
				ut.clickUsingJavascript(getCheckBox("Working long hours"));
				getTextAreaOfCheckBox("Working long hours").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("programmatic requirements"));
				getTextAreaOfCheckBox("programmatic requirements").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Omission of operation conditions"));
				getTextAreaOfCheckBox("Omission of operation conditions").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Omission of scope"));
				getTextAreaOfCheckBox("Omission of scope").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("measurements in program validation"));
				getTextAreaOfCheckBox("measurements in program validation").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("programs due to inadequate review"));
				getTextAreaOfCheckBox("programs due to inadequate review").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("inadequate previous root cause"));
				getTextAreaOfCheckBox("inadequate previous root cause").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("corrective actions not carried out"));
				getTextAreaOfCheckBox("corrective actions not carried out").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("out-of-procedure"));
				getTextAreaOfCheckBox("out-of-procedure").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("single-point-vulnerabilty"));
				getTextAreaOfCheckBox("single-point-vulnerabilty").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Point-of-no-return"));
				getTextAreaOfCheckBox("Point-of-no-return").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("prevent skipping steps"));
				getTextAreaOfCheckBox("prevent skipping steps").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("not analyzed and mitigated"));
				getTextAreaOfCheckBox("not analyzed and mitigated").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("inattention-to-detail"));
				getTextAreaOfCheckBox("inattention-to-detai").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("prevent forgetting-related errors"));
				getTextAreaOfCheckBox("prevent forgetting-related errors").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("amongst employees to encourage"));
				getTextAreaOfCheckBox("amongst employees to encourage").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Inadequate review"));
				getTextAreaOfCheckBox("Inadequate review").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Incorrect instructions"));
				getTextAreaOfCheckBox("Incorrect instructions").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("due to inexperienced rule preparers"));
				getTextAreaOfCheckBox("due to inexperienced rule preparers").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("to avoid internal QA findings"));
				getTextAreaOfCheckBox("to avoid internal QA findings").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("execute procedure steps"));
				getTextAreaOfCheckBox("execute procedure steps").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("procedures not clearly defined"));
				getTextAreaOfCheckBox("procedures not clearly defined").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("greater than 8th grade"));
				getTextAreaOfCheckBox("greater than 8th grade").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("between equipment and procedure"));
				getTextAreaOfCheckBox("between equipment and procedure").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Time sensitive"));
				getTextAreaOfCheckBox("Time sensitive").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Measurement units"));
				getTextAreaOfCheckBox("Measurement units").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Inadequate training materials in scope"));
				getTextAreaOfCheckBox("Inadequate training materials in scope").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("refresher training"));
				getTextAreaOfCheckBox("refresher training").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("line management"));
				getTextAreaOfCheckBox("line management").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("learned into training"));
				getTextAreaOfCheckBox("learned into training").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Inadequate provision"));
				getTextAreaOfCheckBox("Inadequate provision").sendKeys("sbor$174/*+AbC_Z");
				
				ut.clickUsingJavascript(getCheckBox("Inadequate qualification"));
				getTextAreaOfCheckBox("Inadequate qualification").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("staff on critical jobs"));
				getTextAreaOfCheckBox("staff on critical jobs").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("managers of critical jobs"));
				getTextAreaOfCheckBox("managers of critical jobs").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("source inspection"));
				getTextAreaOfCheckBox("source inspection").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("working on the site"));
				getTextAreaOfCheckBox("working on the site").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("training instructors"));
				getTextAreaOfCheckBox("training instructors").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Monitoring and Trending"));
				getTextAreaOfCheckBox("Monitoring and Trending").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Constant Reinforcement"));
				getTextAreaOfCheckBox("Constant Reinforcement").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("system for performance control"));
				getTextAreaOfCheckBox("system for performance control").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("RCA and corrective"));
				getTextAreaOfCheckBox("RCA and corrective").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("field observation"));
				getTextAreaOfCheckBox("field observation").sendKeys("sbor$174/*+AbC_Z");
				break;
			}
			case "Knowledge-based errors": {
				ut.clickUsingJavascript(getCheckBox("Information incomplete"));
				getTextAreaOfCheckBox("Information incomplete").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Information inconsistent"));
				getTextAreaOfCheckBox("Information inconsistent").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("No independent"));
				getTextAreaOfCheckBox("No independent").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("differences between task"));
				getTextAreaOfCheckBox("differences between task").sendKeys("sbor$174/*+AbC_Z");
		
				ut.clickUsingJavascript(getCheckBox("Inadequate capability"));
				getTextAreaOfCheckBox("Inadequate capability").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Inadequate wisdom"));
				getTextAreaOfCheckBox("Inadequate wisdom").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Failed to recognize possible"));
				getTextAreaOfCheckBox("Failed to recognize possible").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("contingency plans for"));
				getTextAreaOfCheckBox("contingency plans for").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("mitigate factors for possible"));
				getTextAreaOfCheckBox("mitigate factors for possible").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("future utilization value"));
				getTextAreaOfCheckBox("future utilization value").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("replacement costs to change"));
				getTextAreaOfCheckBox("replacement costs to change").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("consider more options before"));
				getTextAreaOfCheckBox("consider more options before").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("collecting more information"));
				getTextAreaOfCheckBox("collecting more information").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Happy with the status quo"));
				getTextAreaOfCheckBox("Happy with the status quo").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Resisting improvements"));
				getTextAreaOfCheckBox("Resisting improvements").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Ignoring signs"));
				getTextAreaOfCheckBox("Ignoring signs").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Happy to talk about past"));
				getTextAreaOfCheckBox("Happy to talk about past").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Making many excuses, few actions"));
				getTextAreaOfCheckBox("Making many excuses, few actions").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("procrastination"));
				getTextAreaOfCheckBox("procrastination").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("thinking of complex issues"));
				getTextAreaOfCheckBox("thinking of complex issues").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("predictive decisions"));
				getTextAreaOfCheckBox("predictive decisions").sendKeys("sbor$174/*+AbC_Z");

				ut.clickUsingJavascript(getCheckBox("Relying on others"));
				getTextAreaOfCheckBox("Relying on others").sendKeys("sbor$174/*+AbC_Z");

				// below 7 items repeat 1 times
				String pronBehav = "Ignorance,Fear";
				String[] characBehav = pronBehav.split(",");
				for(String charac : characBehav) {
					ut.clickUsingJavascript(getCheckBox(charac,"could induce dissonance"));
					getTextAreaOfCheckBox(charac,"could induce dissonance").sendKeys("sbor$174/*+AbC_Z");

					ut.clickUsingJavascript(getCheckBox(charac,"that could fail him"));
					getTextAreaOfCheckBox(charac,"that could fail him").sendKeys("sbor$174/*+AbC_Z");

					ut.clickUsingJavascript(getCheckBox(charac,"disagreement with others"));
					getTextAreaOfCheckBox(charac,"disagreement with others").sendKeys("sbor$174/*+AbC_Z");

					ut.clickUsingJavascript(getCheckBox(charac,"claiming not enough time"));
					getTextAreaOfCheckBox(charac,"claiming not enough time").sendKeys("sbor$174/*+AbC_Z");

					ut.clickUsingJavascript(getCheckBox(charac,"Being defensive when he"));
					getTextAreaOfCheckBox(charac,"Being defensive when he").sendKeys("sbor$174/*+AbC_Z");

					ut.clickUsingJavascript(getCheckBox(charac,"Being a pleaser"));
					getTextAreaOfCheckBox(charac,"Being a pleaser").sendKeys("sbor$174/*+AbC_Z");

					ut.clickUsingJavascript(getCheckBox(charac,"Traumatized by past"));
					getTextAreaOfCheckBox(charac,"Traumatized by past").sendKeys("sbor$174/*+AbC_Z");
				}
						
				break;
			}
			}
		}
	}

	public void validatePDFEntryUsingMainLabel(String mainLabel, String tableEntry) {
		getTextPDFMainLabelTableEntry(mainLabel, tableEntry).isDisplayed();
	}

	public static void main(String[] args) {
		String SPVMitigationEquipmentCharacteristics = "Change=Color,Vibration,Geometry!Anomaly=Scratch,Surface,Small Cracks!Degradation=Fractures,Leak,Damage";

		String[] ObFactors = SPVMitigationEquipmentCharacteristics.split("!");
		for (String ObFactor : ObFactors) {
			String ObFactorLabel = ObFactor.split("=")[0];
			String[] characteristics = ObFactor.split("=")[1].split(",");
			for (String charac : characteristics) {
				System.out.println("Validating Observation Factor - " + ObFactorLabel + "Value _ " + charac);
//				getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
			}
		}
	}

	public void validateObservedFactorsAndTheirCharacteristicsInPDF(String mainLabel, String observationtype,
			String category) {
		String SPVMitigationEquipmentCharacteristics = "Change=Color,Vibration,Geometry!Anomaly=Scratch,Surface,Small cracks!Degradation=Fractures,Leak,Damage";
		String SPVMitigationProcedureCharacteristics = "Requirement=Missing,Not clear,Incorrect,Incomplete!Operating condition=Missing,Not clear,Incorrect,Incomplete!Assumption=Missing,Not clear,Incorrect,Incomplete!Scope=Missing,Not clear,Incorrect,Incomplete!Testing=Missing,Not clear,Incorrect,Incomplete!Alignment=Missing,Not clear,Incorrect,Incomplete!Accuracy=Missing,Not clear,Incorrect,Incomplete!Analysis=Missing,Not clear,Incorrect,Incomplete!Applicability=Missing,Not clear,Incorrect,Incomplete";
		String SPVMitigationInjuryCharacteristics = "Line of fire=Fall-and-bounce,Rolling down a sloping,Tool-use,sledge hammering,Anchor-failure,Falling object,Distraction while-walking,welding tractor!Overexertion=Lift beyond limit,Body position twisted!Slip/Trip/Fall=same elevation-unqualified walkways,elevation-sloping terrains,elevation-ladder,elevation-scaffolding,elevation-openings in working areas!Equipment related=Inadequate,Roll-over,Roll-down,Pinch,Drawing-in,Malfunction,Welding,Back-feeding,Insulation damage!Environment related=Poison ivy and poison oak,Dust,Low,Harsh weather,Natural disaster,Unleashed dogs,Pests,Inadequate instructions";
		String ErrorInducingConditionTimeRelatedCharacteristics = "Time-sensitive operation=Vague statement,Interruptive work!Schedule delay=Interruptive work!Long working hours=uncomfortable working,Not changing workforce!Extreme time pressure=Interruptive work";
		String ErrorInducingConditionActivityRelatedCharacteristics = "New equipment=Unfamiliar conditions!Defective=Not identified prior!Omitted human performance tool=Not identified prior!Unknown critical points=Not identified prior";
		String ErrorInducingConditionPeopleRelatedCharacteristics = "Undocumented=No guidelines or rules!Acts of noncompliance=No rules or coaching!Time sensitive=Not identified prior,No guidelines or rules to ensure";
		String ErrorInducingConditionEnvironmentRelatedCharacteristics = "Unprotected equipment=Not identified prior!Unidentified safety issues=Interruptive work!Potential=Not identified prior";

		String ErrorProneBehaviorIntentionalNonComplianceCharacteristics = "Burden=to obtain tools and equipment,obtain documents or procedures,obtain and wear,over-complex or burdensome,due to task being too burdensome!Undue Motivation=so that the staff can go home,rewarded with bonus or to avoid,contractors who are paid based on number,high temperature!Risk Perceived=feedback about job performance,Violation of established,insignificant due to lack,Risk of injury,due to peer observation!Peer Pressure=coach or correct violations,accountable to correct,understand the behavior standards,reinforce peer coaching in the field";
		String ErrorProneBehaviorUnIntentionalNonComplianceCharacteristics = "Distraction=Preoccupation,Interruptions,Multitasking!Drowsiness=Daily cycle,Mental fatigue!Overconfidence=Not knowing weakness,compensation for weakness,abnormality!Time Pressure=Reducing attention span,Short-cutting!Attention Insufficiency=Working long hours!All-inclusiveness=programmatic requirements,conditions in program(s),scope in program(s),measurements in program validation,due to inadequate review,previous root cause analysis,due to corrective actions!Bypass Control=out-of-procedure situations,self-check or independent,Point-of-no-return,prevent skipping,Likely noncompliance,reminders to prevent inattention,Lack of checklists,peer pressure amongst,Inadequate review!Clarity=Incorrect instructions,vague or interpretable words,reviewing sufficient samples,judgement to execute,Interfaces with other,readability,Unclear and inconsistent,not called out,Measurement units!Training=usefulness,refresher,line management,inclusion of lessons,provision of needed!Qualification=staff on critical jobs,managers of critical jobs,Inadequate qualification of vendors,working on the site,training instructors!Accountability=Performance Monitoring and Trending,Constant Reinforcement,performance control,RCA,field observation";
		String ErrorProneBehaviorKnowledgeBasedErrorsCharacteristics = "Blind Trust=without supporting analysis,Information inconsistent,No independent!Overconfidence=Did not recognize,capability,wisdom!OOS=possible failures,contingency,mitigate factors!Sunk=utilization value,replacement costs!Two-option=consider more,consider collecting!Complacency=status quo,Resisting improvements,Ignoring signs,Happy to talk!Laziness=Making many excuses,Mental,Avoiding thinking,predictive decisions,Relying on!Ignorance=dissonance,could fail him,disagreement,enough knowledge to act,Being defensive,Being a pleaser,Traumatized!Fear=dissonance,could fail him,disagreement,enough knowledge to act,Being defensive,Being a pleaser,Traumatized";

		if (observationtype.equalsIgnoreCase("SPV Mitigation")) {
			switch (category) {
			case "Equipment": {
				getTextPDFMainLabelTableEntry(mainLabel, "Change").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Anomaly").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Degradation").isDisplayed();
				String[] ObFactors = SPVMitigationEquipmentCharacteristics.split("!");

				for (String ObFactor : ObFactors) {
					String ObFactorLabel = ObFactor.split("=")[0];
					String[] characteristics = ObFactor.split("=")[1].split(",");
					for (String charac : characteristics) {
						getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
					}
				}
				break;
			}
			case "Procedure": {
				getTextPDFMainLabelTableEntry(mainLabel, "Requirement").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Operating condition").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Assumption").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Scope").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Testing").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Alignment").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Accuracy").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Analysis").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Applicability").isDisplayed();
				String[] ObFactors = SPVMitigationProcedureCharacteristics.split("!");
				for (String ObFactor : ObFactors) {
					String ObFactorLabel = ObFactor.split("=")[0];
					String[] characteristics = ObFactor.split("=")[1].split(",");
					for (String charac : characteristics) {
						getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
					}
				}
				break;
			}
			case "Injury": {
				getTextPDFMainLabelTableEntry(mainLabel, "Line of fire").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Overexertion").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Slip/Trip/Fall").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Equipment related").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Environment related").isDisplayed();
				String[] ObFactors = SPVMitigationInjuryCharacteristics.split("!");
				for (String ObFactor : ObFactors) {
					String ObFactorLabel = ObFactor.split("=")[0];
					String[] characteristics = ObFactor.split("=")[1].split(",");
					for (String charac : characteristics) {
						getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
					}
				}
				break;
			}
			}

		} else if (observationtype.equalsIgnoreCase("Error-inducing Condition")) {
			switch (category) {
			case "Time related": {
				getTextPDFMainLabelTableEntry(mainLabel, "Time-sensitive operation").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Schedule delay").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Long working hours").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Extreme time pressure").isDisplayed();
				String[] ObFactors = ErrorInducingConditionTimeRelatedCharacteristics.split("!");
				for (String ObFactor : ObFactors) {
					String ObFactorLabel = ObFactor.split("=")[0];
					String[] characteristics = ObFactor.split("=")[1].split(",");
					for (String charac : characteristics) {
						getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
					}
				}
				break;
			}
			case "Activity related": {
				getTextPDFMainLabelTableEntry(mainLabel, "New equipment, tools, or procedures").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Defective or damaged tools/equipment").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Omitted human performance tool").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Unknown critical points").isDisplayed();
				String[] ObFactors = ErrorInducingConditionActivityRelatedCharacteristics.split("!");
				for (String ObFactor : ObFactors) {
					String ObFactorLabel = ObFactor.split("=")[0];
					String[] characteristics = ObFactor.split("=")[1].split(",");
					for (String charac : characteristics) {
						getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
					}
				}
				break;
			}
			case "People related": {
				getTextPDFMainLabelTableEntry(mainLabel, "Undocumented verbal instructions").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Acts of noncompliance").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Time sensitive communicaiton").isDisplayed();
				String[] ObFactors = ErrorInducingConditionPeopleRelatedCharacteristics.split("!");
				for (String ObFactor : ObFactors) {
					String ObFactorLabel = ObFactor.split("=")[0];
					String[] characteristics = ObFactor.split("=")[1].split(",");
					for (String charac : characteristics) {
						getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
					}
				}
				break;
			}
			case "Environment related": {
				getTextPDFMainLabelTableEntry(mainLabel, "Unprotected equipment").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Unidentified safety issues").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Potential").isDisplayed();
				String[] ObFactors = ErrorInducingConditionEnvironmentRelatedCharacteristics.split("!");
				for (String ObFactor : ObFactors) {
					String ObFactorLabel = ObFactor.split("=")[0];
					String[] characteristics = ObFactor.split("=")[1].split(",");
					for (String charac : characteristics) {
						getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
					}
				}
				break;
			}
			}
		} else if (observationtype.equalsIgnoreCase("Error-prone Behavior")) {
			switch (category) {
			case "Intentional noncompliance": {
				getTextPDFMainLabelTableEntry(mainLabel, "Burden").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Undue Motivation").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Risk Perceived").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Peer Pressure").isDisplayed();
				String[] ObFactors = ErrorProneBehaviorIntentionalNonComplianceCharacteristics.split("!");
				for (String ObFactor : ObFactors) {
					String ObFactorLabel = ObFactor.split("=")[0];
					String[] characteristics = ObFactor.split("=")[1].split(",");
					for (String charac : characteristics) {
						getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
					}
				}
				break;
			}
			case "Unintentional noncompliance": {
				getTextPDFMainLabelTableEntry(mainLabel, "Distraction").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Drowsiness").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Overconfidence").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Time Pressure").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Attention Insufficiency").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "All-inclusiveness").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Bypass Control").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Clarity").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Training").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Qualification").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Accountability").isDisplayed();
				String[] ObFactors = ErrorProneBehaviorUnIntentionalNonComplianceCharacteristics.split("!");
				for (String ObFactor : ObFactors) {
					String ObFactorLabel = ObFactor.split("=")[0];
					String[] characteristics = ObFactor.split("=")[1].split(",");
					for (String charac : characteristics) {
						getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
					}
				}
				break;
			}
			case "Knowledge-based errors": {
				getTextPDFMainLabelTableEntry(mainLabel, "Blind Trust").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Overconfidence").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "OOS").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Sunk-cost trap").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Two-option trap").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Complacency").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Laziness").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Ignorance").isDisplayed();
				getTextPDFMainLabelTableEntry(mainLabel, "Fear").isDisplayed();
				String[] ObFactors = ErrorProneBehaviorKnowledgeBasedErrorsCharacteristics.split("!");
				for (String ObFactor : ObFactors) {
					String ObFactorLabel = ObFactor.split("=")[0];
					String[] characteristics = ObFactor.split("=")[1].split(",");
					for (String charac : characteristics) {
						getTextPDFMainLabelTableEntry(mainLabel, ObFactorLabel, charac).isDisplayed();
					}
				}
				break;
			}
			}
		}
	}

}
