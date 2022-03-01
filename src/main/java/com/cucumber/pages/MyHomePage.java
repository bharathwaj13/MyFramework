package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.BaseTest;

public class MyHomePage extends BaseTest{

	public MyHomePage(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Create Lead']")
	private WebElement link_createLead;

	public String getTitle() {
		return driver.getTitle();
	}

	public CreateLeadPage clickCreateLeadLink() {
		link_createLead.click();
		return new CreateLeadPage();
	}

}
