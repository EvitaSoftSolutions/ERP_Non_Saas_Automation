package com.lpg.qa.LoginTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Login.Login;
import com.lpg.qa.lpgBase.TestBase;


public class LoginTest  extends TestBase{

	WebDriver driver;
   
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
	//	TestBase.driver.close();
	}
	
	
	@Test
	public void LoginPageTest() throws InterruptedException {
	Login lpg=new Login(TestBase.driver); 
		//lpg.VerifyandClickonMyerpLoginwithoutBtn1();
		lpg.verifyMyerpagancycode();
		lpg.verifyMyerpUserid();
		lpg.verifyMyerpPassword();
		lpg.VerifyandClickonMyerpLoginBtn();
		
	   
	} 
}
