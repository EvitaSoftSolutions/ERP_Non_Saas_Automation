package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.NewLedgers;



public class NewLedgersTest extends LpgTestBase{

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
	public void NewLegersPageTest() throws InterruptedException {
		NewLedgers nl=new NewLedgers(LpgTestBase.driver); 
		
		nl.setup(driver);
		
		nl.VerifyMyerpMasterModule();
		nl.VerifyMyerpAccountMaster();
		nl.VerifyMyerpNewLedgersForm();
		
		nl.VerifyMyerpNameOfLedgers();
		nl.VerifyMyerpSelectGroup();
		nl.VerifyMyerpAliasname();
		nl.VerifyMyerpDate();
		nl.VerifyMyerpSaveBtn();
		nl.VerifyMyerpSaveOKBtn();
		
		nl.VerifyMyerpNameOfLedgers1();
		nl.VerifyMyerpSelectGroup1();
		nl.VerifyMyerpAliasname1();
		nl.VerifyMyerpDate1();
		nl.VerifyMyerpSaveBtn1();
		nl.VerifyMyerpSaveOKBtn1();
		
		nl.VerifyMyerpNameOfLedgers2();
		nl.VerifyMyerpSelectGroup2();
		nl.VerifyMyerpAliasname2();
		nl.VerifyMyerpDate2();
		nl.VerifyMyerpSaveBtn2();
		nl.VerifyMyerpSaveOKBtn2();
		
		nl.VerifyMyerpNameOfLedgers3();
		nl.VerifyMyerpSelectGroup3();
		nl.VerifyMyerpAliasname3();
		nl.VerifyMyerpDate3();
		nl.VerifyMyerpSaveBtn3();
		nl.VerifyMyerpSaveOKBtn3();
		
		nl.VerifyMyerpNameOfLedgers4();
		nl.VerifyMyerpSelectGroup4();
		nl.VerifyMyerpAliasname4();
		nl.VerifyMyerpDate4();
		nl.VerifyMyerpSaveBtn4();
		nl.VerifyMyerpSaveOKBtn4();
		
		nl.VerifyMyerpNameOfLedgers5();
		nl.VerifyMyerpSelectGroup5();
		nl.VerifyMyerpAliasname5();
		nl.VerifyMyerpDate5();
		nl.VerifyMyerpSaveBtn5();
		nl.VerifyMyerpSaveOKBtn5();
		
		nl.VerifyMyerpNameOfLedgers6();
		nl.VerifyMyerpSelectGroup6();
		nl.VerifyMyerpAliasname6();
		nl.VerifyMyerpDate6();
		nl.VerifyMyerpSaveBtn6();
		nl.VerifyMyerpSaveOKBtn6();
		
	}
}
		
