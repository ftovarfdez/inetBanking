package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver locDriver;

	public LoginPage(WebDriver remoteDriver) {
		locDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}

	@FindBy(css = "input[name=uid]")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(css = "input[name=password]")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(css = "input[name=btnLogin]")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(css = "div:nth-child(7) > div > ul > li:nth-child(15) > a")
	@CacheLookup
	WebElement linkLogout;

	public void setUserName(String username) {
		txtUserName.sendKeys(username);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void clickSubmit() {
		btnSubmit.click();
	}
	
	public void clickLogOut() {
		linkLogout.click();
	}

}
