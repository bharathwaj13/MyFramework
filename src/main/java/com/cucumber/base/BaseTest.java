package com.cucumber.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.cucumber.utils.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	//Practice GIT

	public static WebDriver driver;
	public static Properties prop;

	public BaseTest() {
		prop=new Properties();
		//Added from cts_learn
		FileInputStream fis;
		try {
			fis = new FileInputStream("src/test/resources/seleniumconfig.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void method() {
		
	}

	public static void initBrowser() {
		String browser=prop.getProperty("browser");

		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("start-maximized");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
		}
		else {
			System.err.println("Chrome was not defined in Configuration");
			throw new RuntimeException();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.PAGE_LOAD_TIMEOUT));
		System.out.println("Test from cts Learn");
		System.out.println("Test from cts Learn Line 2");
		System.out.println("Test from cts Learn Line 3");
		System.out.println("Lines to test merge from learn Branch");
		System.out.println("Lines to test merge from learn Branch");

	}
	
	
	public void closeAllBrowsers() {
		driver.quit();
	}

}
