package com.lpg.qa.Login;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class InvalidAUPLogin {
	
	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	
	
	// initialization
	 WebDriver driver;
	 public void setup(WebDriver driver) 
	 {
		 this.driver=driver;
	 }
	public InvalidAUPLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

		// usage
		public void VerifyandClickonMyerpLoginwithoutBtn1() {
			 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
			 Assert.assertEquals("please enter valid agancycode","please enter valid userid","please enter valid password");
			 Reporter.log(" verifyMyerplogin",true);
			login.click();
		}
		
		public void verifyMyerpagancycode() {
			 Assert.assertTrue(agancycode.isEnabled(),"agancycode field is enabled");
			 Reporter.log("verifyMyerpagancycode", true);
			 agancycode.sendKeys("ERP_00001//");
		}
		public void verifyMyerpUserid() {
			 Assert.assertTrue(userid.isEnabled(),"uerid field is enabled");
			 Reporter.log("verifyMyerpUserid", true);
			 userid.sendKeys("pankaj");
		}
		public void verifyMyerpPassword() {
			 Assert.assertTrue(password.isEnabled(),"passwordfield is enabled");
			 Reporter.log(" verifyMyerpPassword", true);
			 password.sendKeys("pankaj@123");
		}
		
		public void VerifyandClickonMyerpLoginBtn() {
			 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
			 Reporter.log(" verifyMyerplogin", true);
			login.click();
		}
		
}

