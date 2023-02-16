package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.ServicesForm;



public class ServicesTest extends LpgTestBase{

	WebDriver driver;

	// Open browser ==> Test Registration page ==> close the browser.
	
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}
	
	@Test
	public void Servicestest() throws InterruptedException{
		ServicesForm sf=new ServicesForm(LpgTestBase.driver);
		sf.verifyMyerpagancycode();
		sf.verifyMyerpusrname();
		sf.verifyMyerppassword();
		sf.verifyMyerploginbtn();
		sf.verifyMyerpMaster();
		sf.verifyMyerpAccountMaster();
		sf.verifyMyerpPageNavigataion(); 
		sf.verifyMyerpServices();
		sf.verifyMyerpdescription();
		sf.verifyMyerpTitle();
		sf.verifyMyerpaliasname();
		sf.verifyMyerpServicesCost();
		sf.SelectCompany();
		sf.SelectType();
		sf.verifyMyerpHSNcode();
		sf.verifyMyerpActivebtn();
		sf.verifyMyerpIsgst();
		sf.verifyMyerpFillgstdetail();
		sf.verifyMyerpCGST();
		sf.verifyMyerpSGST();
		sf.verifyMyerpSavebtn();
		sf.verifyMyerpClearbtn();
		sf.verifyMyerpdescription1();
		sf.verifyMyerpTitle1();
		sf.verifyMyerpaliasname1();
		sf.verifyMyerpServicesCost1();
		sf.SelectCompany1();
		sf.SelectType1();
		sf.verifyMyerpHSNcode1();
		sf.verifyMyerpActivebtn1();
		sf.verifyMyerpSubmitbtn();
		sf.verifyMyerpOkbtn();
		sf.VerifyandClickonPSearchbar1();
		sf.verifyMyerpEditbtn();
		sf.verifyMyerpConfirmbtn();
		sf.verifyMyerpTitle2();
		sf.verifyMyerpServicesCost2();
		sf.verifyMyerpUpdatebtn();
		//sf.VerifyMyerpCPUpdateokBtn();
		sf.VerifyMyerpTExportBtn();
		sf.verifyMyerpServicesCost2();
		
	}
}
