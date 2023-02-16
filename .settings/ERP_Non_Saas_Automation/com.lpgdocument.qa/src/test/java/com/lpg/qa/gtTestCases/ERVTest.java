package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.ERV;



		public   class ERVTest extends LpgTestBase{

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
			public void ERVPageTest() throws InterruptedException {
				ERV erv=new  ERV(LpgTestBase.driver); 
				
				/*
				 * erv.verifyMyerpagancycode(); erv.verifyMyerpUserid();
				 * erv.verifyMyerpPassword(); erv.VerifyandClickonMyerpLoginBtn();
				 */
				erv.setup(driver);
				 erv.VerifyandClickonMyerpGodownTransactionModule();
				 erv.VerifyandClickonMyerpGTERVForm();
				 erv.VerifyMyerpERVSelectGodown();
				 erv.VerifyMyerpERVVehicleNumber();
				 erv.VerifyandClickonMyerpEProductTextBox();
				 erv.VerifyandClickonMyerpSoundQantityTextBox();
				 erv.VerifyandClickonMyerpDefective();
				 erv.VerifyandClickonMyerpClearBtn();
				 erv.VerifyandClickonMyerpSumitERVBtn();
				// erv.VerifyandClickonMyerpvehicleno();
				 erv.VerifyandClickonMyerpSubmitBtn();
				 erv.VerifyandClickonMyerpXMIERV(); 
				 erv.VerifyMyerpGenralReportModule();
				 erv.VerifyMyerpDailyComplaintReport();
				 erv.VerifyMyerpSelectDate();
				 erv.verifyMyerpSelectGodown();
				 erv.VerifyandClickonMyerpGetDataBtn();
				 erv.VerifyandClickonMyerpGetDataBtn();
				
					
					/*
					 * erv.VerifyMyerpERVSelectGodown(); erv.VerifyMyerpERVVehicleNumber();
					 * erv.VerifyandClickonMyerpEProductTextBox();
					 * erv.VerifyandClickonMyerpSoundQantityTextBox();
					 * erv.VerifyandClickonMyerpDefective();
					 */
				 
				 
			}
		}