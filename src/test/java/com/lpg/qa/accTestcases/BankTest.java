package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.Bank;



		public class  BankTest  extends LpgTestBase{

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
			public void BankPageTest() throws InterruptedException {
				Bank bt=new Bank(LpgTestBase.driver); 
				
				/*
				 * bt.verifyMyerpagancycode(); bt.verifyMyerpUserid(); bt.verifyMyerpPassword();
				 * bt.VerifyandClickonMyerpLoginBtn();
				 */
				bt.setup(driver);
				bt.VerifyMyerpMasterModule();
				bt.VerifyMyerpAccountMasterModule();
				bt.VerifyMyerpBankForm();
				bt.BankSelectUnderGroup();
				bt.VerifyMyerpBankCode();
				bt.VerifyMyerpBankDescripption();
				bt.VerifyMyerpBankAccNumber();
				bt.BankSelectAccountType();
				bt.BankSelectCompany();
				bt.VerifyMyerpBankAlias();
				bt.VerifyBankActiveCHKBtn();
				bt.VerifyMyerpBClearBtn();
				
				bt.BankSelectUnderGroup();
				bt.VerifyMyerpBankCode();
				bt.VerifyMyerpBankDescripption();
				bt.VerifyMyerpBankAccNumber();
				bt.BankSelectAccountType();
				bt.BankSelectCompany();
				bt.VerifyMyerpBankAlias();
				bt.VerifyMyerpBsr();
				bt.VerifyMyerpAddress();
				bt.VerifyMyerpBranch();
				bt.VerifyMyerpEmail();
				bt.VerifyMyerpManager();
				bt.VerifyMyerpContactperson();
				bt.VerifyMyerpphone();
				bt.VerifyMyerpIfsdcode();
				bt.VerifyBankActiveCHKBtn();
				bt.VerifyMyerpBSubmitBtn();
				bt.VerifyMyerpBSubmitOKBtn();
				bt.VerifyandClickonPSearchbar1();
				bt.VerifyMyerpBEditBtn();
				bt.VerifyMyerpBYesUpdateBtn();
				bt.VerifyMyerpBankCode1();
				bt.VerifyMyerpBankDescripption1();
				bt.VerifyMyerpBUpdateBtn();
				bt.VerifyMyerpBUpdateokBtn();
				bt.VerifyMyerpBExportBtn();
				bt.VerifyandClickonPSearchbar2();
				
				
				
			
			}
		
}
