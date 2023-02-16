package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.UpdateStockForm;


public class UpdateStockTest extends LpgTestBase{

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
	public void UpdateStocktest() throws InterruptedException{
		UpdateStockForm us=new UpdateStockForm(LpgTestBase.driver);
		us.verifyMyerpagancycode();
		us.verifyMyerpusrname();
		us.verifyMyerppassword();
		us.verifyMyerploginbtn();
		us.verifyMyerpMaster();
		us.verifyMyerpAccountMaster();
		us.verifyMyerpPageNavigataion();
		us.verifyMyerpUpdateStock();
		us.SelectGodown();
		us.verifyMyerpSlectDate();
		us.verifyMyerpGetdata();
		us.verifyMyerpChengeOpefull();
		us.verifyMyerpSubmitBtn();
		us.SelectGodown1();
		us.verifyMyerpSlectDate1();
		us.verifyMyerpGetdata1();
		
	}
}
