package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	WebElement addBagPack;
	
	@FindBy(name="add-to-cart-sauce-labs-bike-light")
	WebElement addBikeLight;
	
	@FindBy(name="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement addTShirt;
	
	@FindBy(id="shopping_cart_container")
	WebElement cart;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public CheckoutPage addToCart() {
		addBagPack.click();
		addBikeLight.click();
		addTShirt.click();
		cart.click();
		
		return new CheckoutPage();
		
	}


}
