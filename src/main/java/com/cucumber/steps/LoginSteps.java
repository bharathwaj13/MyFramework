package com.cucumber.steps;

import org.testng.Assert;

import com.cucumber.base.BaseTest;
import com.cucumber.pages.HomePage;
import com.cucumber.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseTest {

	


	LoginPage loginPage;
	HomePage homePage;

	@When("Login to LeafTaps Application")
	public void login_to_leaf_taps_application() {
		String url=prop.getProperty("url");
		driver.get(url);
		loginPage=new LoginPage();
		homePage=loginPage.performLogin();
	}

	@Then("Verify User has successfully logged in")
	public void verify_user_has_successfully_logged_in() {
		//homePage=new HomePage();
		System.out.println(homePage.getTitle());
		Assert.assertTrue(homePage.getTitle().contains("Leaftaps"));
	}
}
