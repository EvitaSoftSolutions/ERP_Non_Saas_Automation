package com.lpg.qa.GMTestcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.Transporter;



	public class TransporterTest  extends LpgTestBase{

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
			public void TransporterPageTest() throws InterruptedException {
				Transporter tt=new Transporter(LpgTestBase.driver); 
			    tt.setup(driver);
				tt.VerifyMyerpMasterModule();
				tt.VerifyMyerpGenralMasterModule();
				tt.VerifyMyerpTransporterForm();
				tt.TSelectCompany();
				tt.VerifyMyerpTcompanyCode();
				tt.VerifyMyerpTName();
				tt.VerifyMyerpTalisename();
				tt.TSelectGroup();
				tt.VerifyMyerpTCategory();
				tt.VerifyMyerpTContandDetial();
				tt.VerifyMyerpTAddress();
				tt.VerifyMyerpTState();
				tt.VerifyMyerpTSelectCity();
				tt.VerifyMyerpTClearBtn();
				tt.TSelectCompany1();
				tt.VerifyMyerpTcompanyCode1();
				tt.VerifyMyerpTName1();
				tt.VerifyMyerpTalisename1();
				tt.TSelectGroup1();
				tt.VerifyMyerpTCategory1();
				tt.VerifyMyerpTContandDetial1();
				tt.VerifyMyerpTAddress1();
				tt.VerifyMyerpTState1();
				tt.VerifyMyerpTSelectCity1();
				tt.VerifyMyerpTSubmitBtn();
				tt.VerifyMyerpTSubmiOKBtn();
				tt.VerifyandClickonPSearchbar1();
				tt.VerifyMyerpTEditBtn();
				tt.VerifyMyerpTYesUpdateBtn();
				tt.VerifyMyerpTName2();
				tt.TSelectGroup2();
				tt.VerifyMyerpTUpdateBtn();
				tt.VerifyMyerpTUpdateokBtn();
				tt.VerifyMyerpTExportBtn();
				tt.VerifyandClickonPSearchbar2();
				
				
				
			   } 
		}


