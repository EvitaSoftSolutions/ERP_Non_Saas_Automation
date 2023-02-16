package com.lpg.qa.accTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.accpages.OpeningStockForm;


public class OpeningStockTest extends LpgTestBase{

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
	public void OpeningStocktest() throws InterruptedException{
		OpeningStockForm os=new OpeningStockForm(LpgTestBase.driver);
		os.verifyMyerpagancycode();
		os.verifyMyerpusrname();
		os.verifyMyerppassword();
		os.verifyMyerploginbtn();
		os.verifyMyerpMaster();
		os.verifyMyerpAccountMaster();
		os.verifyMyerpOpeningStock();
		os.Godown();
		os.Product();
		os.verifyMyerpFromDate();
		os.verifyMyerpOpeningFull();
		os.verifyMyerpOpeningEmpty();
		os.verifyMyerpDefective();
		os.verifyMyerpCredit();
		os.verifyMyerpMinStock();
		os.verifyMyerpOpeningValuation();
		os.verifyMyerpClearbtn();
		os.Godown1();
		os.Product1();
		os.verifyMyerpFromDate1();
		os.verifyMyerpOpeningFull1();
		os.verifyMyerpOpeningEmpty1();
		os.verifyMyerpDefective1();
		os.verifyMyerpCredit1();
		os.verifyMyerpMinStock1();
		os.verifyMyerpOpeningValuation1();
		os.verifyMyerpSubmitbtn();
		os.verifyMyerpRetiobutton();
		os.Godown2();
		os.Product2();
		os.verifyMyerpFromDate2();
		os.verifyMyerpStockOpeningValuation();
		os.CompanySelect();
		os.verifyMyerpOpeningQty();
		os.verifyMyerpClearbtn1();
		os.Godown3();
		os.Product3();
		os.verifyMyerpFromDate3();
		os.verifyMyerpStockOpeningValuation1();
		os.CompanySelect1();
		os.verifyMyerpOpeningQty1();
		os.verifyMyerpSubmitbtn1();
	}	
}
