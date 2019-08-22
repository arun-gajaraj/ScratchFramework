/**
 * 
 */
package com.scratchframework.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.scratchframework.utils.WebDriverFactory;

/**
 * @author arun.gajaraj
 *
 */
public class TestBaseClass {
	
	@BeforeSuite
	public void initTest() {
		
	}
	

	public static WebDriver driver;

	@BeforeMethod
	public void initDriver() {

		driver = WebDriverFactory.getBrowserInstance();

	}

	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}

}
