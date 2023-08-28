package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class CheckoutPage extends TestBase {
	
	@FindBy(xpath="//div[@class='cart_list']//descendant::a")
	List<WebElement> list;
	
	@FindBy(name="checkout")
	WebElement checkout;
	
	
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public List<WebElement> validateListOfItems() {
		return list;
	}
	
	public AddAddressPage addInformationPage() {
		checkout.click();
		
		return new AddAddressPage();
		
	}

}
