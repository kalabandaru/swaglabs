package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory-Object Repository
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement LoginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	
	public static String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String userName, String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		LoginButton.click();
		
		return new HomePage();
	}

}
