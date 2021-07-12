package com.kaleqa.framework.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KaleUtils {
	public static boolean isClickable(WebDriver driver, WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(
			ExpectedConditions.elementToBeClickable(ele));
			return true;
		} catch(Exception e) {
			System.out.println("Element was not displayed returning false");
			return false;
		}
	}
	
	public static void waitFor(long milliSec) {
		try {
			Thread.sleep(milliSec);
		} catch(Exception e) {
		}
	}
}
