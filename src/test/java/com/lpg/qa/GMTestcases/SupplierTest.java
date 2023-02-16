package com.lpg.qa.GMTestcases;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.Supplier;
		
	public class SupplierTest  extends LpgTestBase{

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
			public void SupplierPageTest() throws InterruptedException {
				Supplier s=new Supplier(LpgTestBase.driver); 
				s.verifyMyerpagancycode();
				s.verifyMyerpUserid();
				s.verifyMyerpPassword();
				s.VerifyandClickonMyerpLoginBtn();
				s.VerifyMyerpMasterModule();
				s.VerifyMyerpGenralMasterModule();
				s.VerifyMyerpSupplier();
				s.SelectCompany();
				s.VerifyMyerpSsupcompanyCode();
				s.VerifyMyerpSupplierName();
				s.SelectGroup();
				s.VerifyMyerpSupplierContandDetial();
				s.VerifyMyerpSupplierAddress1();
				s.SelectState();
				s.VerifyMyerpSupplierActveChk();
				s.VerifyMyerpSupplierClearBtn();
			    s.SelectCompany1();
				s.VerifyMyerpSsupcompanyCode1();
				s.VerifyMyerpSupplierName1();
				s.SelectGroup1();
				s.VerifyMyerpSupplierContandDetial1();
				s.VerifyMyerpSupplierAddress11();
				s.SelectState1();
				s.VerifyMyerpSupplierActveChk1();
				s.VerifyMyerpSupplierSubmitBtn();
				//s.VerifyMyerpSupplierSubmiOKBtn();
				s.VerifyandClickonPSearchbar1();
			    s.VerifyMyerpSupplierEditBtn();
			    s.VerifyMyerpSupplierYesUpdateBtn();
			    s.VerifyMyerpSupplierName2();
			    s.SelectGroup2();
			    s.VerifyMyerpSupplierUpdateBtn();
			    //s.VerifyMyerpSupplierUpdateokBtn();
			    s.VerifyMyerpSupplierExportBtn();
			    s.VerifyandClickonPSearchbar2();
				
			
				
				

}
			
	}
