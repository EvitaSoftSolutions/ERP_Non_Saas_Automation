package com.lpg.qa.LoginTestcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Login.DirectLoginWithoutAUP;
import com.lpg.qa.lpgBase.TestBase;


public class  DirectLoginWithoutAUPTest extends TestBase{

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
	public void  DirectLoginWithoutAUPPageTest() throws InterruptedException {
		DirectLoginWithoutAUP  DL=new DirectLoginWithoutAUP (TestBase.driver);  
		DL.VerifyandClickonMyerpLoginwithoutBtn1();
	}
}
