package PageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminpage {

WebDriver driver;
	
	
	public adminpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement Admintab;
	
	@FindBy(id="menu_admin_UserManagement")
	private WebElement UserManagementTab;
	
	@FindBy(id="searchSystemUser_userName")
	private WebElement SearchName;
	
	@FindBy(id="searchBtn")
	private WebElement SearchBtn;
	
	@FindBy(id="searchSystemUser_userType")
	private WebElement SelectAdmin;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	private WebElement ClickSearchNameBox;
	
	@FindBy(xpath="//td[contains(text(),'Enabled')]")
	private WebElement ConfirmStatusText;
	
	
	
	public WebElement SelectAdmin() {
		return SelectAdmin; //already defined method in util.java, so we don't define method here > use return WebElement

	}
	
	
	public void Admintab() {
		Admintab.click();
	}
		
	public void UserManagementTab() {
		UserManagementTab.click();
	}
	
	public void SearchName(String searchname) {
			SearchName.sendKeys(searchname);
		
	}
	
	public void SearchEmployeeName(String EmployeeName) {
		ClickSearchNameBox.click();
		ClickSearchNameBox.sendKeys(EmployeeName);
	}
	
	public void SearchBtn() {
		SearchBtn.click();
	}
	
	int a=10;
	String n= "amit";
	double h=10.29;
	
	
	public String ConfirmEmployeeStatusText() {
		System.out.println();
		return ConfirmStatusText.getText();	
	}
}
