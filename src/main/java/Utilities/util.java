package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class util {
	
WebDriver driver;
	
	
	public util(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public void SelectUserRoledropdown(WebElement element, String value) {
		Select userroledropdown = new Select(element); //element is xpath, defind page objectory
		userroledropdown.selectByVisibleText(value);
	}

}
