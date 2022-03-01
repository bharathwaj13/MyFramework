package com.cucumber.hooks;





import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cucumber.base.BaseTest;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Hooks extends BaseTest {
	
	Logger log=LoggerFactory.getLogger(Hooks.class);

	@Before()
	public void before() {
		log.info("-----------------------------------Before Hooks-----------------------------------------------");
		BaseTest.initBrowser();
	}


	@After() public void tearDown(Scenario sc) {
		log.info("-----------------------------------After Hooks-----------------------------------------------");
		if(sc.isFailed()) {
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			//embed it in the report
			sc.attach(screenshot, "image/png", sc.getLine().toString());
		}
		closeAllBrowsers(); 
	}

}
