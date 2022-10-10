package com.projectname.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

public static WebDriver driver;
	
	
	public void InitializeBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SQL2019\\SeleniumAlljarfiles\\Chrome_driver_version(104)\\chromedriver.exe");
			driver =new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SQL2019\\RulesEng\\Firefox\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}else {
			System.out.println("Wrong Browser Name Selected");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
