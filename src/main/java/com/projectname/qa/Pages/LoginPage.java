package com.projectname.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.projectname.qa.Base.TestBase;

public class LoginPage extends TestBase{

	//Declaration
	
	
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement login_fblogo;
	@FindBy(xpath="//h2[@class='_8eso']") private WebElement login_fbtagline;
	@FindBy(xpath="//input[@name='email']") private WebElement username;
	@FindBy(xpath="//input[@name='pass']") private WebElement password;
	@FindBy(xpath="//button[@value='1']") private WebElement login_btn;
	@FindBy(xpath="//a[text()='Forgotten password?']") private WebElement forgot_password;
	@FindBy(xpath="//a[text()='Create New Account']") private WebElement createnew_account;
	@FindBys({@FindBy(xpath="//div[@id='pageFooterChildren']//li")}) List<WebElement> footerlinks;
	
	//Initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void VerifyFacebookLoginPageLogo() {
		
		Assert.assertTrue(login_fblogo.isDisplayed(), "The fb logo on login page is not displayed");
		
		Reporter.log("VerifyFacebookLoginPageLogo",true);
			}
	
    public void VerifyFacebookLoginPageTagline() {
		
		Assert.assertTrue(login_fbtagline.isDisplayed(), "The fb tagline on login page is not displayed");
		
		Assert.assertEquals(login_fbtagline.getText(), "Facebook helps you connect and share with the people in your life.");
		
		Reporter.log("VerifyFacebookLoginPageTagline",true);
			}
	
    public void VerifyFacebookLoginPageForgotPassword() {
		
		Assert.assertTrue(forgot_password.isDisplayed(), "The forgot password link on login page is not displayed");
		
		Assert.assertEquals(forgot_password.getText(), "Forgotten password?");
		
		Reporter.log("VerifyFacebookLoginPageForgotPassword",true);
			}
	
	
     public void VerifyFacebookLoginPageCreateNewAccountBtn() {
		
		Assert.assertTrue(createnew_account.isDisplayed(), "Create new account btn on login page is not displayed");
		
		Assert.assertTrue(createnew_account.isEnabled(), "Create new account btn on login page is disabled");

		Assert.assertEquals(createnew_account.getText(), "Create New Account");
		
		Reporter.log("VerifyFacebookLoginPageCreateNewAccountBtn",true);
			}
	
     
	   public void SetFacebookLoginPageUsername() {
		   
		   Assert.assertTrue(username.isDisplayed(), "Username field is not displayed");
		   username.sendKeys("abc123@gmail.com");
		   Reporter.log("SetFacebookLoginPageUsername",true);
	   }
	
	   public void SetFacebookLoginPagePassword() {
		   
		   Assert.assertTrue(password.isDisplayed(), "Password field is not displayed");
		   password.sendKeys("abc@123");
		   Reporter.log("SetFacebookLoginPagePassword",true);
	   }
	
       public void SetFacebookLoginPageLogin_Btn() {
		   
		   Assert.assertTrue(login_btn.isDisplayed(), "Login button field is not displayed");
		   login_btn.click();
		   Reporter.log("SetFacebookLoginPageLogin_Btn",true);
	   }
	
	
       public void VerifyFacebookLoginPageFooterlinksSize() {
    	   Assert.assertEquals(footerlinks.size(), 31);
    	   
		   Reporter.log("VerifyFacebookLoginPageFooterlinksSize",true);

       }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
