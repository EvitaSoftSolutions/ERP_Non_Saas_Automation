package com.lpg.qa.accountsTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accountsPages.VoucherDereferencing;


 public class VoucherDereferencingTest  extends LpgTestBase{

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
			public void VoucherDereferencingPageTest() throws InterruptedException {
				VoucherDereferencing vr=new  VoucherDereferencing(LpgTestBase.driver); 
				/*
				 * vr.verifyMyerpagancycode(); vr.verifyMyerpUserid(); vr.verifyMyerpPassword();
				 * vr.VerifyandClickonMyerpLoginBtn();
				 */
				vr.setup(driver);
				vr.VerifyandClickonMyerpAccountsModule();
				vr.VerifyandClickonMyerpVoucherDeReferencingForm();
				vr.VerifyandClickonMyerpVRSelectType();
				vr.VerifyandClickonMyerpVDRDocNumber();
				vr.VerifyandClickonMyerpVDRCleareBtn();
				vr.VerifyandClickonMyerpVRSelectType();
				vr.VerifyandClickonMyerpVDRDocNumber();
				vr.VerifyandClickonMyerpVRGetDataBtn();
				vr.VerifyandClickonMyerpVDRDeRefrenceBtn();
			}
 }