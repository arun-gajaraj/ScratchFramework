package com.scratchframework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class WebDriverFactory {

//	public static WebDriver driver = null;
	static WebDriver driver = null;

	public static WebDriver getBrowserInstance(String browserName) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arun.gajaraj\\Downloads\\Work\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arun.gajaraj\\Downloads\\Work\\geckodriver.exe");

//		browserName = (browserName != null) ? browserName.toLowerCase() : "chrome"; // default Browser

		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		default:
			driver = new FirefoxDriver();
			break;

		}
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver getBrowserInstance() {

		String browserName = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest()
				.getParameter("browserName");
		return getBrowserInstance(browserName);
	}

}
