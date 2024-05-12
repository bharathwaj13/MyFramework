package com.cucumber.steps;

import org.testng.Assert;

import com.cucumber.base.BaseTest;
import com.cucumber.pages.HomePage;
import com.cucumber.pages.MyHomePage;

import io.cucumber.java.en.Then;

public class CreateLeadSteps extends BaseTest {

	HomePage homePage=new HomePage();
	MyHomePage myHomePage=new MyHomePage();

	@Then("Click on CRMSFA Link")
	public void click_on_crmsfa_link() {
		homePage.clickCRMSFAButton();
		System.out.println("Master branch line 1");
		Assert.assertTrue(myHomePage.getTitle().contains("My Home"));
	}

	@Then("Click Create Leads Link")
	public void click_create_leads_link() {
		myHomePage.clickCreateLeadLink();
	}
}
