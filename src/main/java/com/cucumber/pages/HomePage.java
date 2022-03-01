package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.BaseTest;

public class HomePage extends BaseTest {
	
	public HomePage() {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//div[@class='crmsfa']")
	private WebElement button_crmsfa;
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public MyHomePage clickCRMSFAButton() {
		button_crmsfa.click();
		return new MyHomePage();
	}

}
