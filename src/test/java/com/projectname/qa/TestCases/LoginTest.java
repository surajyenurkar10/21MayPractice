package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.LoginPage;

public class LoginTest extends TestBase {


	@BeforeClass
	public void setup() {
		
		InitializeBrowser("Chrome");
	}

	@AfterClass
	public void teardown() {
	TestBase.driver.close();
	}
	
	@Test
	public void FacebookLoginPageTest() {
		
		LoginPage lp = new LoginPage(TestBase.driver);
		lp.VerifyFacebookLoginPageLogo();
		lp.VerifyFacebookLoginPageTagline();
		lp.VerifyFacebookLoginPageCreateNewAccountBtn();
		lp.VerifyFacebookLoginPageForgotPassword();
		lp.VerifyFacebookLoginPageFooterlinksSize();
		lp.SetFacebookLoginPageUsername();
		lp.SetFacebookLoginPagePassword();
		lp.SetFacebookLoginPageLogin_Btn();
	}
	

}
