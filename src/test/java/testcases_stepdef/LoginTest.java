package testcases_stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BaseClass.browsersetup;
import PageObjectory.loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends browsersetup {
	
	loginpage lg;
	
	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {
	System.out.println("This is the first step");
	   Thread.sleep(1000);
	}

	@Then("^User verify Title of the page$")
	public void user_verify_Title_of_the_page() throws Throwable {
	   //firstpart
	   String gettitle =  driver.getTitle();
	   System.out.println("Title displays as : " + gettitle);
	   Assert.assertTrue(true, gettitle);
	   
	   
	   //2nd part
	   String expectedtitle = "OrangeHRM";
	   String actualtitle =  driver.getTitle();
	   System.out.println("Title displays as : " + gettitle);
	   Assert.assertEquals(expectedtitle, actualtitle);
	   Thread.sleep(1000);
	  // driver.close();
	}



}
