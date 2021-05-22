package PageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leavepage {

WebDriver driver;
	
	
	public leavepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//b[contains(text(),'Leave')]")   //click
	private WebElement LeavePage;
	
	@FindBy(id="calFromDate")  //click from date
	private WebElement FromDate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement Month;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement Year;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[3]/a")
	private WebElement datepicker;
	
	@FindBy(id="calToDate")
	private WebElement ToDate;
	

	
	@FindBy(id="leaveList_chkSearchFilter_1")    //uncheckbox Pending Approval
	private WebElement UncheckPendingApproval;
	
	@FindBy(id="leaveList_txtEmployee_empName")    //Enter Employee Name, sendkey
	private WebElement EnterEmployeeName;
	
	@FindBy(id="leaveList_cmbSubunit")    //Click Sub Unit
	private WebElement ClickSubUnit;
	
	@FindBy(xpath="//select[@id='leaveList_cmbSubunit']")    //Select Administration
	private WebElement SelectAdmin;
	
	@FindBy(id="leaveList_cmbWithTerminated")    //checkbox include past employee
	private WebElement IncludePastEmployee;

	@FindBy(id="btnSearch")    //Click Search Button
	private WebElement SearchBtn;
	
		
	
	public void ClickOnLeavePage() {
		LeavePage.click();
	}
	
	public void FromDate() {
		FromDate.click();
	}
	
	
	public void ToDate() {
		ToDate.click();
	}
		

	
	public WebElement Month() {
		return Month;
	}
	
	public WebElement Year() {
		return Year;
	}
	
	
	public void DatePicker() {
		datepicker.click();
	}
	public void UncheckboxPending() {
		UncheckPendingApproval.click();
		
	}
	
	public void EnterName(String EmployeeName) {
		EnterEmployeeName.sendKeys(EmployeeName);
	}
	
	public void ClickOnSubUnit() {
		ClickSubUnit.click();
	}

	public WebElement SelectAdmin() {
		return SelectAdmin;   //will insert data in feature file
	}
	
	public void CheckboxPastEmployee() {
		IncludePastEmployee.click();
			}
	
	
	public void SearchBtn() {
		SearchBtn.click();
	}
	
	}
