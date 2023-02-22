package com.lpg.qa.tvmoduletestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.tvmodules.TranferVoucherTVOut;


		public class TranferVoucherTVOutTest extends LpgTestBase{

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
			public void  TranferVoucherTVOutPageTest() throws InterruptedException {
				 TranferVoucherTVOut tvto=new  TranferVoucherTVOut(LpgTestBase.driver); 
				
					/*
					 * tvto.verifyMyerpagancycode(); tvto.verifyMyerpUserid();
					 * tvto.verifyMyerpPassword(); tvto.VerifyandClickonMyerpLoginBtn();
					 */
				 tvto.setup(driver);
				 tvto.VerifyMyerpTVModule();
				 tvto.VerifyMyerpTVtvoutForm();
				 tvto.VerifyMyerpTVtvoutConsumerNum();
				 tvto.VerifyMyerpTVtvoutConsumerSubmitBtn();
				 tvto.TVtvOutSelectDprReceived();
				 tvto.TVtvOutSelectCylenderReceivedAt();
				 tvto.TVtvOutSelectCylenderReceivedBy();
				 tvto.TVtvOutSelectCylenderReasonForTVout();
				 tvto.VerifyMyerpTVtvOutTotalDepositAmount();
				 tvto.TVtvOutSelectState();
				 tvto.District();
				 tvto.Tahsil();
				 tvto.VerifyMyerpTVtvOutEnterCity();
				 tvto.VerifyMyerpTVtvOutServicesTextbox();
				 tvto.VerifyMyerpTVtvOutQantityTextbox();
				 tvto.VerifyMyerpTVtvOutUnitCostTextbox();
				 tvto.VerifyMyerpTVtvOutSubmitBtn();
			
				
				 tvto.VerifyMyerpTVtvoutConsumerNum();
				 tvto.VerifyMyerpTVtvoutConsumerSubmitBtn();
				 tvto.TVtvOutSelectDprReceived();
				 tvto.TVtvOutSelectCylenderReceivedAt();
				 tvto.TVtvOutSelectCylenderReceivedBy();
				 tvto.TVtvOutSelectCylenderReasonForTVout();
				 tvto.VerifyMyerpTVtvOutTotalDepositAmount();
				 tvto.TVtvOutSelectProduct();
				 tvto.TVtvOutSelectState();
				 tvto.District();
				 tvto.Tahsil();
				 tvto.VerifyMyerpTVtvOutEnterCity();
				 tvto.VerifyMyerpTVtvOutServicesTextbox();
				 tvto.VerifyMyerpTVtvOutQantityTextbox();
				 tvto.VerifyMyerpTVtvOutUnitCostTextbox();
				 tvto.VerifyMyerpTVtvOutClearBtn();
				 
				 
			}
		}