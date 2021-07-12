package functionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.kaleqa.framework.base.browsersetup;
import com.kaleqa.framework.pages.loginpage4hook;
import com.kaleqa.framework.utils.KaleUtils;



public class BaseTest extends browsersetup {

	loginpage4hook lg;
	static String configfilepath = System.getProperty("user.dir") + "//config//file.properties";
	static Properties prop;
	static FileInputStream fileInput;

	public static void Configuration() {
		try {
			fileInput = new FileInputStream(configfilepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Properties getProps() {
		return prop;
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.out.println("Open browser");
		Configuration();
		driver = browsersetup.setup(prop.getProperty("Browsername"), prop.getProperty("Url"));
		lg = new loginpage4hook(driver);
		lg.loginPageBtn();
		lg.login(prop.getProperty("Username"), prop.getProperty("Password"));
		// if above attempt not success, will go inside the if condition as the
		// isClickable method will return true.
		// If the first login attempt will work asexpected, then the isClickable method
		// will return false and thus the if condition (second login attempt) will be
		// skipped
		System.out.println("Trying to see if there is need for second login attempt");
		if (KaleUtils.isClickable(driver, new loginpage4hook(driver).getKaleLoginUserId())) {
			lg.login(prop.getProperty("Username"), prop.getProperty("Password"));
		}
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		System.out.println("Close browser");
//		scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
		try {
			driver.manage().deleteAllCookies(); // delete all cookies
			Thread.sleep(7000);
			// wait 7 seconds to clear cookies.
		} catch (Exception e) {

		}
//		driver.close();
//		driver.quit();
	}
}
