package com.lpg.qa.gtTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GodownTransaction.XMIList;


 public class XMIListTest  extends LpgTestBase{

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
			public void XMIListPageTest() throws InterruptedException {
				XMIList xmil=new  XMIList(LpgTestBase.driver); 
				
				xmil.verifyMyerpagancycode();
				xmil.verifyMyerpUserid();
				xmil.verifyMyerpPassword();
				xmil.VerifyandClickonMyerpLoginBtn();
				xmil.VerifyandClickonMyerpGodownTransactionModule();
				xmil.VerifyandClickonMyerpGTXMIForm();
				xmil.VerifyandClickonMyerpGTXMIErvNyumber();
				xmil.VerifyandClickonMyerpGTXMIInvoiceNumber();
				xmil.VerifyandClickonMyerpGTXMISubmitBtn();
				
			
				 
				 }
		}
