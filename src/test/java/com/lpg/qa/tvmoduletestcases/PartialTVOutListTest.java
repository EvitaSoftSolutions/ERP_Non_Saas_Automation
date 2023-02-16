package com.lpg.qa.tvmoduletestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.tvmodules.PartialTVOutList;

		public class PartialTVOutListTest extends LpgTestBase{

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
			public void  PartialTVOutListPageTest() throws InterruptedException {
				PartialTVOutList ptvto=new  PartialTVOutList(LpgTestBase.driver); 
				
				 ptvto.verifyMyerpagancycode();
				 ptvto.verifyMyerpUserid();
				 ptvto.verifyMyerpPassword();
				 ptvto.VerifyandClickonMyerpLoginBtn();
				 ptvto.VerifyMyerpTVModule();
				 ptvto.VerifyMyerpPTVtvoutListForm();
				 ptvto.VerifyMyerpPTVtvoutListConsumerNum();
				 ptvto.VerifyMyerpPTVtvOutSelectDprReceived();
				 ptvto.VerifyMyerpPTVtvOutSelectCylenderReceivedBy();
				 ptvto.VerifyMyerpPTVtvOutTotalDepositAmount();
				 ptvto.VerifyMyerpPTVtvOutSelectState();
				 ptvto.VerifyMyerpPTVtvOutClearBtn();
				 ptvto.VerifyMyerpTVModule();
				 ptvto.VerifyMyerpPTVtvoutListForm();
				 ptvto.VerifyMyerpPTVtvoutListConsumerNum();
				 ptvto.VerifyMyerpPTVtvOutSelectDprReceived();
				 ptvto.VerifyMyerpPTVtvOutSelectCylenderReceivedBy();
				 ptvto.VerifyMyerpPTVtvOutTotalDepositAmount();
				 ptvto.VerifyMyerpPTVtvOutSelectState();
				 ptvto.VerifyMyerpPTVtvOutSubmitBtn();
				 
				 
			}
		}