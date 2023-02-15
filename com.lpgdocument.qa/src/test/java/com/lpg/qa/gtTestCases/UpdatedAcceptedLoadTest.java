package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.UpdatedAcceptedLoad;



public  class UpdatedAcceptedLoadTest extends LpgTestBase{
	WebDriver driver;
	   
	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
	//	LpgTestBase.driver.close();
	}	
	
			@Test
			public void UpdatedAcceptedLoadPageTest() throws InterruptedException {
				UpdatedAcceptedLoad ptvto=new  UpdatedAcceptedLoad(LpgTestBase.driver); 
				/*
				 * ptvto.verifyMyerpagancycode(); ptvto.verifyMyerpUserid();
				 * ptvto.verifyMyerpPassword(); ptvto.VerifyandClickonMyerpLoginBtn();
				 */
				ptvto.setup(driver);
				 ptvto.VerifyandClickonMyerpGodownTransactionModule();
				 ptvto.VerifyandClickonMyerpGTUpdatedAccepteLoadForm();
				 ptvto.VerifyandClickonMyerpGTInvoiceNumber();
				 ptvto.VerifyandClickonMyerpUALSearchButton();
				 ptvto.VerifyandClickonMyerpASelectProduct();
				 ptvto.VerifyandClickonMyerpASubmitBtnProduct();
					
				 ptvto.VerifyandClickonMyerpGTInvoiceNumber();
				 ptvto.VerifyandClickonMyerpUALSearchButton();
				 ptvto.VerifyandClickonMyerpASelectProduct();
				 ptvto.VerifyandClickonMyerpDeleteBtnProduct();
				 

			}
		}