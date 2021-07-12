package com.kaleqa.framework.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class browsersetup {

	protected static WebDriver driver; // Interface WebDriver can initialize all the drivers at one time

	public static WebDriver setup(String browsername, String Url) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("KobitonAndroid")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("sessionName", "Kale Android Web Test");
			capabilities.setCapability("sessionDescription", "This is an example for Kale Android Web testing");
			capabilities.setCapability("deviceOrientation", "portrait");
			capabilities.setCapability("captureScreenshots", true);
			capabilities.setCapability("browserName", "chrome");
			capabilities.setCapability("deviceGroup", "KOBITON");
			capabilities.setCapability("deviceName", "*");
			capabilities.setCapability("platformName", "Android");
			try {
				driver = new AndroidDriver<WebElement>(
						new URL("https://amlee2021:e9f45af2-e16d-4a91-8954-d2432fe4f480@api.kobiton.com/wd/hub"),
						capabilities);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

		} else if (browsername.equalsIgnoreCase("KobitonIOS")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("sessionName", "iOS Web Cucumber");
			capabilities.setCapability("sessionDescription", "This is an example for iOS Web testing");
			capabilities.setCapability("deviceOrientation", "portrait");
			capabilities.setCapability("captureScreenshots", true);
			capabilities.setCapability("browserName", "safari");
			capabilities.setCapability("deviceGroup", "KOBITON");
			capabilities.setCapability("deviceName", "*");
			capabilities.setCapability("platformName", "iOS");
			try {
				driver = new AndroidDriver<WebElement>(
						new URL("https://amlee2021:e9f45af2-e16d-4a91-8954-d2432fe4f480@api.kobiton.com/wd/hub"),
						capabilities);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get(Url);
		return driver;
	}
}
