package com.lpg.qa.LoginTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Login.InvalidAUPLogin;
import com.lpg.qa.Login.TestBase;



public class  InvalidAUPLoginTest extends  TestBase{

	WebDriver driver;
   
	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
	//	TestBase.driver.close();
	}
	
	
	@Test
	public void  InvalidAUPLoginPageTest() throws InterruptedException {
		InvalidAUPLogin  DL=new InvalidAUPLogin(TestBase.driver); 
	//	DL.verifyMyerpagancycode();
		DL.verifyMyerpUserid();
		DL.verifyMyerpPassword();
		DL.VerifyandClickonMyerpLoginwithoutBtn1();
	}
}
