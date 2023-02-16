package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.UpdateERV;



		public  class UpdateERVTest extends LpgTestBase{

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
			public void UpdateERVPageTest() throws InterruptedException {
				UpdateERV erv=new  UpdateERV(LpgTestBase.driver); 
				
				/*
				 * erv.verifyMyerpagancycode(); erv.verifyMyerpUserid();
				 * erv.verifyMyerpPassword(); erv.VerifyandClickonMyerpLoginBtn();
				 */
				 erv.VerifyandClickonMyerpGodownTransactionModule();
				 erv.VerifyandClickonMyerpGTUpdateERVForm();
				 erv.VerifyandClickonMyerpErvNumber();
				 erv.VerifyandClickonMyerpClearBtn();
				 erv.VerifyandClickonMyerpErvNumber();
				 erv.VerifyandClickonMyerpSearchBtn();
				 
			}
		}