package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class AddAddressPage extends TestBase{
	
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code")
	WebElement postalcode;
	
	@FindBy(id="continue")
	WebElement clickContinue;
	
	@FindBy(id="finish")
	WebElement finish;
	
	
	
	public AddAddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	
	public static String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String firstName, String lastName, String postalCode) {
		firstname.sendKeys(firstName);
		lastname.sendKeys(lastName);
		postalcode.sendKeys(postalCode);
		clickContinue.click();
		finish.click();
		return new HomePage();
	}
	
	


}
