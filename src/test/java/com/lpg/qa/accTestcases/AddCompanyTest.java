package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.AddCompany;


	public class AddCompanyTest extends LpgTestBase{

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
				public void AddCompanyPageTest() throws InterruptedException {
					AddCompany ac=new AddCompany(LpgTestBase.driver); 
					
					ac.verifyMyerpagancycode();
					ac.verifyMyerpUserid();
					ac.verifyMyerpPassword();
					ac.VerifyandClickonMyerpLoginBtn();
					ac.VerifyMyerpMasterModule();
					ac.VerifyMyerpAccountMasterModule();
					ac.VerifyMyerpAddCompanyForm();
					ac.VerifyMyerpACFirstName();
					ac.VerifyMyerpACLastName();
					ac.VerifyMyerpACOContanctNumber();
					ac.VerifyMyerpACOEmail();
					ac.VerifyMyerpACCompanyName();
					ac.VerifyMyerpACCompanyCode();
					ac.VerifyMyerpACCity();
					ac.VerifyMyerpACEmail();
					ac.VerifyMyerpACContanctNum1();
					ac.VerifyMyerpACAddress1();
					ac.VerifyMyerpACPanNumber();
					ac.VerifyMyerpACGSTINNumber();
					ac.VerifyACActiveCHKBtn();
					ac.VerifyMyerpBClearBtn();
					ac.VerifyMyerpACFirstName();
					ac.VerifyMyerpACLastName();
					ac.VerifyMyerpACOContanctNumber();
					ac.VerifyMyerpACOEmail();
					ac.VerifyMyerpACCompanyName();
					ac.VerifyMyerpACCompanyCode();
					ac.VerifyMyerpACCity();
					ac.VerifyMyerpACEmail();
					ac.VerifyMyerpACContanctNum1();
					ac.VerifyMyerpACAddress1();
					ac.VerifyMyerpACPanNumber();
					ac.VerifyMyerpACGSTINNumber();
					ac.VerifyACActiveCHKBtn();
					ac.VerifyMyerpACSubmitBtn();
					ac.VerifyMyerpACSubmitOKBtn();
					ac.VerifyandClickonPSearchbar1();
					ac.VerifyMyerACBEditBtn();
					ac.VerifyMyerpACYesUpdateBtn();
					ac.VerifyMyerpACCompanyName2();
					ac.VerifyMyerpACCompanyCode2();
					ac.VerifyMyerpACUpdateBtn();
					ac.VerifyMyerpACUpdateokBtn();
					ac.VerifyMyerpACExportBtn();
					ac.VerifyandClickonPSearchbar2();
					
					
				
				}
			
	}



