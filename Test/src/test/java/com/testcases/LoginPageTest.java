package com.testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.AddAddressPage;
import com.pages.CheckoutPage;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CheckoutPage checkout;
	AddAddressPage address=new AddAddressPage();
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeTest()
	public void setup(){
		initialization();
		loginPage =new LoginPage();	
	}
	@Test(priority=2)
	public void validateLoginTitleTest()
	{
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Swag Labs");
		System.out.println(title);
	}
	
	@Test(priority=1)
	public void loginPageTest() {
		homePage=loginPage.login(prop.getProperty("username"), (prop.getProperty("password")));
	}
	
	@Test(priority=3)
	public void addToCartTest() {
		checkout=homePage.addToCart();
		
	}
	@Test(priority=4)
	public void listOfItems() {
		String name="";
		List<WebElement> text=checkout.validateListOfItems();
		for(int i=0; i<text.size(); i++)
		{
			
			name=text.get(i).getText();
			System.out.println(name);
			
		}
		
		
	}
	@Test(priority=5)
	public void addAddress() {
		checkout.addInformationPage();
	}
	@Test(priority=6)
	public void enterAddress() throws InterruptedException {
		address.login("Kalavathi", "Vavilala", "500090");
		String actual=driver.getCurrentUrl();
		if(actual.equals("https://www.saucedemo.com/checkout-step-two.html"))
		{
			System.out.println("The Process is Completed");
		}
		else
		{
			System.out.println("The Process is not Completed, please check");
		}
		
	}
	@AfterTest()
	public void tearDown() {
		driver.quit();
	}

}
