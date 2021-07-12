package com.kaleqa.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kaleqa.framework.utils.KaleUtils;

public class loginpage4hook {

WebDriver driver;
	
	
	public loginpage4hook(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="pii-login-button")
	private WebElement kaleLoginBtn;
	
	@FindBy(id="pii-un")
	private WebElement kaleLoginUserId;
	
	@FindBy(id="pii-pw")
	private WebElement kaleLoginUserPw;
	
	@FindBy(id="pii-signin-button")
	private WebElement kaleLoginBtnInPopup;
	
	
	public WebElement getKaleLoginBtn() {
		return kaleLoginBtn;
	}

	public void setKaleLoginBtn(WebElement kaleLoginBtn) {
		this.kaleLoginBtn = kaleLoginBtn;
	}

	public WebElement getKaleLoginUserId() {
		return kaleLoginUserId;
	}

	public void setKaleLoginUserId(WebElement kaleLoginUserId) {
		this.kaleLoginUserId = kaleLoginUserId;
	}

	public WebElement getKaleLoginUserPw() {
		return kaleLoginUserPw;
	}

	public void setKaleLoginUserPw(WebElement kaleLoginUserPw) {
		this.kaleLoginUserPw = kaleLoginUserPw;
	}

	public WebElement getKaleLoginBtnInPopup() {
		return kaleLoginBtnInPopup;
	}

	public void setKaleLoginBtnInPopup(WebElement kaleLoginBtnInPopup) {
		this.kaleLoginBtnInPopup = kaleLoginBtnInPopup;
	}

	public void loginPageBtn() {
		kaleLoginBtn.click();

	}
		
	public void loginPageUserName(String kaleLoginUserName) {
		kaleLoginUserId.sendKeys(kaleLoginUserName);
	}
	
	public void loginPageUserPw(String kaleLoginUserPassword) {
		kaleLoginUserPw.sendKeys(kaleLoginUserPassword);
	}
	
	public void loginPopupBtn() {
		kaleLoginBtnInPopup.click();
	}
	
	public void login( String userName, String password) {
		KaleUtils.waitFor(1000);
		kaleLoginUserId.clear();
		kaleLoginUserId.sendKeys(userName);
		KaleUtils.waitFor(1000);
		kaleLoginUserPw.sendKeys(password);
		KaleUtils.waitFor(1000);
		kaleLoginBtnInPopup.click();
		KaleUtils.waitFor(3000);
	}

}
