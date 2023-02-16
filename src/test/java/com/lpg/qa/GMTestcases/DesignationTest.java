package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.Designation;

 
	public class DesignationTest  extends LpgTestBase{

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
		public void DesignationPageTest() throws InterruptedException {
			Designation des=new Designation(LpgTestBase.driver);  
		des.verifyMyerpagancycode();
		des.verifyMyerpUserid();
		des.verifyMyerpPassword();
		des.VerifyandClickonMyerpLoginBtn();
		des.VerifyMyerpMasterModule();
		des.VerifyMyerpGenralMasterModule();
		des.VerifyDesignationform();
		des.VerifyDesignationName1();
		des.VerifyShortName1();
		des.VerifyDesignationActiveCheckbox1();
		des.VerifyDesignationClearbtn();
		des.VerifyDesignationName();
		des.VerifyShortName();
		des.VerifyDesignationActiveCheckbox();
	    des.VerifyDesignationSubmitbtn();
	    des.Verifyalreadyexistalertokbtn();
	    des.VerifyDesignationEditbtn();
	    des.VerifyDesignationYesupdateitbtn();
	    des.VerifyUpdateShortName11();
	    des.VerifydesignationUpdatebtn();
	    des.VerifyDesignationupdatedmsgok();
	    des.VerifyDesignatiosearchoption();
	    des.VerifyDesignationexportbtn();
	    des.VerifyDesignatiosearchoption1();
		   
		} 
	}

	
	
