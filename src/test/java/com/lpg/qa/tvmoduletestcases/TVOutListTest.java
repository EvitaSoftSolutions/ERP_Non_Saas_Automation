
package com.lpg.qa.tvmoduletestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.tvmodules.TVOutList;



		public class TVOutListTest  extends LpgTestBase{

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
			public void  TVOutListPageTest() throws InterruptedException {
				TVOutList tvto=new  TVOutList(LpgTestBase.driver); 
				
				 tvto.verifyMyerpagancycode();
				 tvto.verifyMyerpUserid();
				 tvto.verifyMyerpPassword();
				 tvto.VerifyandClickonMyerpLoginBtn();
				 tvto.VerifyMyerpTVModule();
				 tvto.VerifyMyerpTVtvoutListForm();
				 tvto.VerifyMyerpTVtvoutListConsumerNum();
				 tvto.VerifyMyerpTVtvOutClearBtn();
				 tvto.VerifyMyerpTVModule();
				 tvto.VerifyMyerpTVtvoutListForm();
				 tvto.VerifyMyerpTVtvoutListConsumerNum();
				 tvto.VerifyMyerpTVtvOutSubmitBtn();
				 
				 
				 
			}
		}