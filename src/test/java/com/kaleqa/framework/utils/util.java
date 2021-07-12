package com.kaleqa.framework.utils;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class util {

	WebDriver driver;

	public util(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SelectUserRoledropdown(WebElement element, String value) {
		Select userroledropdown = new Select(element); // element is xpath, defind page objectory
		userroledropdown.selectByVisibleText(value);
		System.out.println("Element selected succeefully");
	}
	
	public void SelectdropdownByValue(WebElement element, String value) {
		Select userroledropdown = new Select(element); // element is xpath, defind page objectory
		userroledropdown.selectByValue(value);
		System.out.println("Element selected succeefully");
	}
	
	public void SelectdropdownByVisible(WebElement element, String visibleText) {
		Select userroledropdown = new Select(element); // element is xpath, defind page objectory
		userroledropdown.selectByVisibleText(visibleText);
		System.out.println("Element selected succeefully");
	}
	
	public void switchiframe() {
		List<WebElement> iframelist = driver.findElements(By.tagName("iframe"));
		int count = iframelist.size();
		System.out.println("size of iframe : " + count);
		for(int i=0;i<count;i++) {
			System.out.println("Switching to iFrame - " + iframelist.get(i).getAttribute("name"));
			driver.switchTo().frame(i);
		}
	}

	public void switchToDefault() {
		driver.switchTo().defaultContent();
	}
	
	public void scrollElementIntoView(WebElement ele) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",ele);
	}
	
	public void clickUsingJavascript(WebElement ele) {
		scrollElementIntoView(ele);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
	}
	
	public void CheckboxClick(List<WebElement> Table) {

		List<WebElement> col = Table;
		int count = col.size();
		System.out.println("Total No of columns are : " + count);

		for (int i = 0; i < count; i++) {
			String data = col.get(i).getText();
			System.out.println("data display as : " + data);
			col.get(i).click();
		}
	}
	

	public void capturewebtable(List<WebElement> Table) {

		List<WebElement> col = Table;
		int count = col.size();
		System.out.println("Total No of columns are : " + count);

		for (int i = 1; i < count; i++) {
			String data = col.get(i).getText();
			System.out.println("data display as : " + data);
		}
	}
	
	public void verifyVisible(WebElement ele) {
		Assert.assertEquals(ele.isDisplayed(), true);
	}
	
}
