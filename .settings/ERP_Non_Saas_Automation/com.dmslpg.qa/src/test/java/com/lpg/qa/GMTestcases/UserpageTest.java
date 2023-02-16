package com.lpg.qa.GMTestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.Userpageform;



public class UserpageTest extends LpgTestBase{


	// Open browser ==> Test Registration page ==> ==>close the browser.

	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//		TestBase.driver.close();
	}

	@Test
	public void Userpagetest() throws InterruptedException{
		Userpageform uf = new Userpageform(LpgTestBase.driver);
		/*
		 * uf.verifyMyerpagancycode(); uf.verifyMyerpusrname();
		 * uf.verifyMyerppassword(); uf.verifyMyerploginbtn();
		 */
		uf.setup(driver);
		uf.verifyMyerpMasterModule();
		uf.verifyMyerpGeneralMaster();
		uf.verifyMyerpPageNavigation();
		uf.verifyMyerpUserMaster();
		uf.verifyMyerpSelectEmployee1(); 
		uf.verifyMyerpSelectUserType();
		uf.verifyMyerpSelectCompany(); 
		uf.verifyMyerpUseridname();
		uf.verifyMyerpUserpass();
		uf.verifyMyerpUseremail();
		uf.verifyMyerpUserMob(); 
		uf.verifyMyerpcheckboxcl(); 
		uf.VerifyClearBtn();
		uf.verifyMyerpSelectEmployee1();
		uf.verifyMyerpSelectUserType();
		uf.verifyMyerpSelectCompany(); 
		uf.verifyMyerpUseridname();
		uf.verifyMyerpUserpass(); 
		uf.verifyMyerpUseremail(); 
		uf.verifyMyerpUserMob();
		uf.verifyMyerpcheckboxcl();
		uf.verifyMyerpsubmitbtn();
		uf.VerifySubmitOKBtn();
		uf.VerifyandClickonPSearchbar1();
		uf.VerifyEditBtn();
		uf.VerifyYesUpdateItBtn(); 
		uf.verifyMyerpSelectUserType1();
		uf.verifyMyerpUseremail1(); 
		uf.verifyMyerpUserMob1(); 
		uf.VerifyPUpdateBtn();
		uf.VerifyUpdateOKBtn();
		uf.VerifyExportBtn();
		uf.VerifyandClickonPSearchbar2();

		uf.verifyMyerpSelectEmployee3();
		uf.verifyMyerpSelectUserType3();
		uf.verifyMyerpSelectCompany3();
		uf.verifyMyerpUseridname3();
		uf.verifyMyerpUserpass3();
		uf.verifyMyerpUseremail3();
		uf.verifyMyerpUserMob3();
		uf.verifyMyerpcheckboxcl3();
		uf.verifyMyerpsubmitbtn3();
		uf.VerifySubmitOKBtn3();
		uf.VerifyandClickonPSearchbar3();




	}
}
