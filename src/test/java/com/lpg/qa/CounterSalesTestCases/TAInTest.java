package com.lpg.qa.CounterSalesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.CounterSales.TAInForm;


public class TAInTest extends LpgTestBase{

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
	public void TAInpagetest() throws InterruptedException{
		TAInForm ta=new TAInForm(LpgTestBase.driver);
		ta.verifyMyerpagancycode();
		ta.verifyMyerpusrname();
		ta.verifyMyerppassword();
		ta.verifyMyerploginbtn();
		ta.verifyMyerpCounterSales();
		ta.verifyMyerpTransferAdvice();
		ta.verifyMyerpConsumerGstin();
		ta.verifyMyerpDocSerialNo();
		ta.verifyMyerpConsumerno();
		ta.ConsumerType();
		ta.ConnectionCategory();
		ta.ProductSelect();
		ta.verifyMyerpRegistratonNo();
		ta.verifyMyerpConsumerName();
		ta.verifyMyerpAddress();
		ta.verifyMyerpEnterCity();
		ta.State();
		ta.District();
		ta.Tehsil();
		ta.verifyMyerpcontact();
		ta.verifyMyerpEmail();
		ta.verifyMyerpPredistCode();
		ta.verifyMyerpPreconSumerNo();
		ta.PredocType();
		ta.verifyMyerpNumberofcyl();
		ta.verifyMyerpNumberofDpr();
		ta.verifyMyerpRemarks();
		ta.verifyMyerpclearbtn();
		ta.verifyMyerpConsumerGstin1();
		ta.verifyMyerpDocSerialNo1();
		ta.verifyMyerpConsumerno1();
		ta.ConsumerType1();
		ta.ConnectionCategory1();
		ta.ProductSelect1();
		ta.verifyMyerpRegistratonNo1();
		ta.verifyMyerpConsumerName1();
		ta.verifyMyerpAddress1();
		ta.verifyMyerpEnterCity1();
		ta.State1();
		ta.District1();
		ta.Tehsil1();
		ta.verifyMyerpcontact1();
		ta.verifyMyerpEmail1();
		ta.verifyMyerpPredistCode1();
		ta.verifyMyerpPreconSumerNo1();
		ta.PredocType1();
		ta.verifyMyerpNumberofcyl1();
		ta.verifyMyerpNumberofDpr1();
		ta.verifyMyerpRemarks1();
		
		
	}
}
