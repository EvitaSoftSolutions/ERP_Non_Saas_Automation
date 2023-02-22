package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.BlockedandUnblokedconsumer;


public class BlockedandUnblokedconsumerTest  extends LpgTestBase{

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}
	
	@Test
	public void BolckedUnlockedconsumerPagetest() throws InterruptedException{
		BlockedandUnblokedconsumer cs=new BlockedandUnblokedconsumer(LpgTestBase.driver);
		/*
		 * cs.verifyMyerpagancycode(); cs.verifyMyerpusrname();
		 * cs.verifyMyerppassword(); cs.verifyMyerploginbtn();
		 */
		cs.setup(driver);
		cs.verifyMyerpCounterSales();
		cs.verifyMyerpBlockeUnblockedConsumer();
		cs.verifyMyerpCounsumerno();
		cs.verifyMyerpSubmitbtn();
	

}
}