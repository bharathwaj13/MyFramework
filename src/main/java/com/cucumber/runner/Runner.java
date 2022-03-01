package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/main/java/com/cucumber/features" }, 
glue = { "com.cucumber.steps","com.cucumber.pages","com.cucumber.hooks"}, 
monochrome = true, 
dryRun = false, 
strict = true,
plugin = { "pretty","html:reports/cucumber.html",	"json:reports/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/" },
tags="@smoke"
		)

public class Runner extends AbstractTestNGCucumberTests{

}
