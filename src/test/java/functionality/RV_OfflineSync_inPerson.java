package functionality;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kaleqa.framework.utils.util;

public class RV_OfflineSync_inPerson extends BaseTest {

	util ut;

	@Test
	public void testRVReportSync() throws AWTException, InterruptedException {

		ut = new util(driver);
		ut.switchiframe();
		Thread.sleep(1000);

		driver.findElement(By.id("pii-main-menu-button-a")).click();

		driver.findElement(By.id("pii-a-menu-rv")).click();

		// insert code, put network offline

		Random rn = new Random();
		rn.nextInt(999999);
		String title = "OfflineRVreportSyncTest" + rn;
		driver.findElement(By.id("pii-rv-tab-1-title")).sendKeys(title);

		// driver.findElement(By.id("pii-rv-imgperson-photo-input")).click();
		ut.clickUsingJavascript(driver.findElement(By.id("pii-rv-imgperson-photo-input")));

		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection(System.getProperty("user.dir") + "\\uploadfile\\mask off2.jpg");
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

		driver.findElement(By.id("pii-rv-tab-1-details")).sendKeys("work evaluation");

		// driver.findElement(By.id("pii-rv-tab-1-5-inperson-radio-ip")).click();
		ut.clickUsingJavascript(driver.findElement(By.id("pii-rv-tab-1-5-inperson-radio-ip")));

		driver.findElement(By.id("pii-rv-tab-1-6ip-icertify-checkbox")).click();

		driver.findElement(By.id("pii-rv-tab-1-6-inperson-name")).sendKeys("MarryAnne");

		driver.findElement(By.id("pii-rv-tab-1-6-inperson-title")).sendKeys("Site Manager");

		driver.findElement(By.id("pii-rv-save2")).click();

		driver.findElement(By.id("pii-rv-dialog-confirmed")).click();

		driver.findElement(By.id("pii-user-home-panel-btn-rv")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//a[contains(text(),'" + title + "')]")).isDisplayed(), true);

		// insert put Network online, add wait time for syncing

		// verify offline report is in the listing ONLINE (don't know how to take
		// xpath), can verify report name

	}

}
