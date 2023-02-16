package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.EMR;


 public class EMRTest extends LpgTestBase{

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
			public void EMRPageTest() throws InterruptedException {
				EMR emr=new  EMR(LpgTestBase.driver); 
				
				emr.verifyMyerpagancycode();
				emr.verifyMyerpUserid();
				emr.verifyMyerpPassword();
				emr.VerifyandClickonMyerpLoginBtn();
				emr.VerifyandClickonMyerpGodownTransactionModule();
				emr.VerifyandClickonMyerpGTEMRForm();
				emr.VerifyMyerpEMRSelectGodown();
				emr.VerifyandClickonMyerpGTEMRReInvoiceNumber();
				emr.VerifyMyerpEMRSelectVehicle();
				emr.VerifyandClickonMyerpGTEMRProduct();
				emr.VerifyandClickonMyerpGTEMRSoundQauntity();
				emr.VerifyandClickonMyerpGTEMRClearBtn();
				emr.VerifyMyerpEMRSelectGodown();
				emr.VerifyandClickonMyerpGTEMRReInvoiceNumber();
				emr.VerifyMyerpEMRSelectVehicle();
				emr.VerifyandClickonMyerpGTEMRProduct();
				emr.VerifyandClickonMyerpGTEMRSoundQauntity();
				emr.VerifyandClickonMyerpGTEMRSubmitBtn();
				
			
				 
				 }
		}
