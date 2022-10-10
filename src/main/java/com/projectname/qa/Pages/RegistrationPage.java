package com.projectname.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.projectname.qa.Base.TestBase;

public class RegistrationPage extends TestBase{

	//Declaration ==> webelements
	
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy(xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy(name="firstname") private WebElement firstname;
	@FindBy(name="lastname") private WebElement surname;
	@FindBy(name="reg_email__") private WebElement mob_email;
	@FindBy(name="reg_passwd__") private WebElement password;
	@FindBy(name="birthday_day") private WebElement birthdate;
	@FindBy(name="birthday_month") private WebElement birthmonth;
	@FindBy(name="birthday_year") private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']") private WebElement gender_male;
	@FindBy(xpath="//input[@value='1']") private WebElement gender_female;
    @FindBy(xpath="//button[@type='submit']") private WebElement submitbtn;
	
	
	// Initialization.
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Usage
	
	public void ClickFacebookSignupLink() {
		signuplink.click();
	}
	
	public void VerifyFacebookRegistrationPageFblogo() {
		
		Assert.assertTrue(reg_fblogo.isDisplayed(), "The facebook logo on registration page is not displayed");
	}
	
	public void VerifyFacebookRegistrationPageAlreadyAccount() {
		
		Assert.assertTrue(already_acc.isDisplayed(), "The already having an account option on registration page is not displayed");
		
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
	}
	
	public void SetFacebookRegistrationPageFirstname(String fn) {
		firstname.sendKeys(fn);
	}
	
	public void SetFacebookRegistrationPageLastname() {
		surname.sendKeys("xyz");
	}
	
	public void SetFacebookRegistrationPageMobileEmail() {
		mob_email.sendKeys("test123@gmail.com");
	}
	
	public void SetFacebookRegistrationPassword() {
		password.sendKeys("abc@123");
	}
	
	public void SetFacebookRegistrationPageBirthDay() {
		Select bday = new Select(birthdate);
		
		Assert.assertTrue(birthdate.isDisplayed(), "Birth day drop down is not available on the website");
		
		Assert.assertFalse(birthdate.isSelected(), "The birthdate is selected initially");
		bday.selectByVisibleText("20");
	}
	
	public void SetFacebookRegistrationPageBirthMonth() {
		Select bmonth = new Select(birthmonth);
		
		Assert.assertTrue(birthmonth.isDisplayed(), "Birth month drop down is not available on the website");
		
		Assert.assertFalse(birthmonth.isSelected(), "The birth month is selected initially");
		bmonth.selectByVisibleText("Mar");
	}
	
	public void SetFacebookRegistrationPageBirthYear() {
		Select byear = new Select(birthyear);
		
		Assert.assertTrue(birthyear.isDisplayed(), "Birth year drop down is not available on the website");
		
		Assert.assertFalse(birthyear.isSelected(), "The birth year is selected initially");
		byear.selectByVisibleText("1996");
	}
	
	public void SetFacebookRegistrationPageGender(String gender) {
		
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
			}else {
				System.out.println("Please select valid input");
			}
	}
	
	public void ClickFacebookRegistrationPageSubmitBtn() {
		//submitbtn.click();
	}

	
	
	
	
	
	
}
