package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.AccountGroupMaster;


public class AccountGroupMasterTest extends LpgTestBase{

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
	public void AccountGroupMasterPageTest() throws InterruptedException {
		AccountGroupMaster agm=new AccountGroupMaster(LpgTestBase.driver); 
		
		agm.verifyMyerpagancycode();
		agm.verifyMyerpUserid();
		agm.verifyMyerpPassword();
		agm.VerifyandClickonMyerpLoginBtn();
		agm.VerifyMyerpMasterModule();
		agm.VerifyMyerpAccountMasterModule();
		agm.VerifyMyerpAccountGroupMasterForm();
		agm.VerifyMyerpAccountGroupDescription();
		agm.AGMSelectPPrimaryandSecondary();
		agm.AGMSelectType();
		agm.SelectAGMEffect();
		agm.VerifyMyerpAMGClearBtn();
	   agm.VerifyMyerpAccountGroupDescription();
		agm.AGMSelectPPrimaryandSecondary();
		agm.AGMSelectType();
		agm.SelectAGMEffect();
		agm.VerifyMyerpAMGSaveBtn();
		agm.VerifyMyepAletPopupOkbtn();
		agm.VerifyandClickonPSearchbar1();
		agm.VerifyMyerpAccountGroupDescription();
		agm.AGMSelectPPrimaryandSecondary();
		agm.AGMSelectType();
		agm.SelectAGMEffect();
		agm.VerifyMyerpAMGNewBtn();
		agm.VerifyMyerpAccountGroupDescription();
		agm.AGMSelectPPrimaryandSecondary();
		agm.AGMSelectType();
		agm.SelectAGMEffect();
		agm.VerifyMyerpAMGFindBtn();
		agm.VerifyMyerpAccountGroupDescription();
		agm.AGMSelectPPrimaryandSecondary();
		agm.AGMSelectType();
		agm.SelectAGMEffect();
		agm.VerifyMyerpAMGExitBtn();
		agm.VerifyMyerpAGMEditBtn();
		agm.VerifyMyerpAGMYesUpdateBtn();
		agm.VerifyMyerpAccountGroupDescription1();
		agm.AGMSelectPPrimaryandSecondary1();
		agm.VerifyMyerpAGMUpdateBtn();
		agm.VerifyMyerpAGMUpdateokBtn();
		agm.VerifyMyerpAGLExportBtn();
        agm.VerifyandClickonPSearchbar2();
		
	}
}
