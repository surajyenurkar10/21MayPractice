package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.RegistrationPage;

public class RegistrationTest extends TestBase{ // methods call. // Testcases
	
	//Browser setup ==> validations apply ==> browser close.
	
	
	@BeforeClass
	public void setup() {
		
		InitializeBrowser("Chrome");
	}

	@AfterClass
	public void teardown() {
		TestBase.driver.close();
	}
	
	@Test
	public void FacebookRegistrationPageTest_Positive() {
		
		RegistrationPage rp = new RegistrationPage(TestBase.driver);
		rp.ClickFacebookSignupLink();
		rp.VerifyFacebookRegistrationPageFblogo();
		rp.VerifyFacebookRegistrationPageAlreadyAccount();
		rp.SetFacebookRegistrationPageFirstname("xyz");
		rp.SetFacebookRegistrationPageLastname();
		rp.SetFacebookRegistrationPageMobileEmail();
		rp.SetFacebookRegistrationPassword();
		rp.SetFacebookRegistrationPageBirthDay();
		rp.SetFacebookRegistrationPageBirthMonth();
		rp.SetFacebookRegistrationPageBirthYear();
		rp.SetFacebookRegistrationPageGender("male");
		rp.ClickFacebookRegistrationPageSubmitBtn();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
