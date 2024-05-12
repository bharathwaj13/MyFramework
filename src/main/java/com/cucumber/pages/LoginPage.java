package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.BaseTest;

public class LoginPage extends BaseTest {
	
	
	public LoginPage() {
		System.out.println("Inside LoginPage Constructor");
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement ele_userName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement ele_password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement button_login;
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public HomePage performLogin() {
		System.out.println("Inside performLogin method");
		System.out.println(driver.getTitle());

		System.out.println("Updated from ctslearn branch1");
		System.out.println("Inserted from Master Line 4");

		ele_userName.sendKeys("DemoSalesManager");
		ele_password.sendKeys("crmsfa");
		button_login.click();
		return new HomePage();
	}

}
