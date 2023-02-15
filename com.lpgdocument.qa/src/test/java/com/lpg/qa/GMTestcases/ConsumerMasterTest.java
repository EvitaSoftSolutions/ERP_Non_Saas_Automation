package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.ConsumerMasterForm;



public class ConsumerMasterTest extends LpgTestBase{

	WebDriver driver;

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
	public void ConsumerMastertest() throws InterruptedException{
		ConsumerMasterForm cm = new ConsumerMasterForm(LpgTestBase.driver);
		/*
		 * cm.verifyMyerpagancycode(); cm.verifyMyerpusrname();
		 * cm.verifyMyerppassword(); cm.verifyMyerploginbtn();
		 */
		cm.setup(driver);
		cm.verifyMyerpMasterModule();
		cm.verifyMyerpGeneralMaster();
		cm.verifyMyerpPageNavigation1();
		cm.verifyMyerpPageNavigation2();
		cm.verifyMyerpConsumerMaster();
		cm.verifyMyerpConsumerName();
		cm.verifyMyerpConsumerNo();
		cm.verifyMyerpAddress();
		cm.verifyMyerpContact();
		cm.verifyMyerpSVNUMBER();
		cm.verifyMyerpDatepicker();
		cm.Product();
		cm.verifyMyerpNoofcyl();
		cm.verifyMyerpBluBookNo();
		cm.verifyMyerpInspectionDate();
		cm.ConsumerType();
		cm.verifyMyerpClearBtn();
		cm.verifyMyerpConsumerName1();
		cm.verifyMyerpConsumerNo1();
		cm.verifyMyerpAddress1();
		cm.verifyMyerpContact1();
		cm.verifyMyerpSVNUMBER1();
		cm.Product1();
		cm.verifyMyerpNoofcyl1();
		cm.verifyMyerpBluBookNo1();
		cm.ConsumerType1();
		cm.verifyMyerpSubmitbtn();
		
	}
}
