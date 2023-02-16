package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.CommercialDelivery;



public class CommercialDeliveryTest  extends LpgTestBase{

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
			public void CommercialDeliveryPageTest() throws InterruptedException {
				CommercialDelivery cd=new  CommercialDelivery(LpgTestBase.driver); 
				
				/*
				 * cd.verifyMyerpagancycode(); cd.verifyMyerpUserid(); cd.verifyMyerpPassword();
				 * cd.VerifyandClickonMyerpLoginBtn();*/
				
				 cd.setup(driver);
				 cd.VerifyandClickonMyerpGodownTransactionModule();
				 cd.VerifyandClickonMyerpGTCommercialDeliveryForm();
				 cd.VerifyMyerpTVSelectGodown();
				 cd.VerifyMyerpTVSelectDeliveryMan();
				 cd.VerifyandClickonMyerpGTSelectProductType();
				 cd.VerifyandClickonMyerpFullCyl();
				 cd.VerifyandClickonMyerpEmptyCyl();
				 cd.VerifyandClickonMyerpGTclearBtn();
				 cd.VerifyMyerpTVSelectGodown();
				 cd.VerifyMyerpTVSelectDeliveryMan();
				 cd.VerifyandClickonMyerpGTSelectProductType();
				 cd.VerifyandClickonMyerpFullCyl();
				 cd.VerifyandClickonMyerpEmptyCyl();
				 cd.VerifyandClickonMyerpGTSubmitBtn();
				 cd.VerifyMyerpGenralReportModule();
				 cd.VerifyMyerpDailyComplaintReport();
				 cd.VerifyMyerpSelectDate();
				 cd.verifyMyerpSelectGodown();;
				 cd.VerifyandClickonMyerpGetDataBtn();
				 cd.VerifyandClickonMyerpGetDataBtn();
				 cd.VerifyandClickonMyerpReportSearchBarBtn();
				 cd.VerifyandClickonMyerpFindBtn();

				 
				 
			}
		}