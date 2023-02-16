package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.NonSVDetailsReport;


		public class NonSVDetailsReportTest extends LpgTestBase{

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
			public void   NonSVDetailsReportPageTest() throws InterruptedException {
				NonSVDetailsReport ddr=new NonSVDetailsReport(LpgTestBase.driver); 
				 ddr.verifyMyerpagancycode();
				 ddr.verifyMyerpUserid();
				 ddr.verifyMyerpPassword();
				 ddr.VerifyandClickonMyerpLoginBtn();
				 ddr.VerifyandClickonMyerpGeneralReport();
				 ddr.VerifyandClickonMyerpNonSvdetailReport();
				 ddr.VerifyMyerpFromDate();
				 ddr.VerifyMyerpTodate();
				 ddr.VerifyandClickonMyerpGetdataBtn();
				 
				 
			}
		}