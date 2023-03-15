package com.lpg.qa.CommercialcylsaleTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.commercialcylsale.SaleEmptyReceivedForm;

public class SaleEmptyReceivedTest extends LpgTestBase {

	WebDriver driver;

	// Open browser ==> Test Registration page ==> close the browser.

	@BeforeClass
	public void setup() {
		driver = intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
//		TestBase.driver.close();
	}

	@Test
	public void SaleEmptyReceivedtest() throws InterruptedException {
		SaleEmptyReceivedForm se = new SaleEmptyReceivedForm(LpgTestBase.driver);
		
		/*
		 * se.verifyMyerpagancycode(); se.verifyMyerpusrname();
		 * se.verifyMyerppassword(); se.verifyMyerploginbtn();
		 * 
		 */
		se.setup(driver);
		se.verifyMyerpCommercialcylsale();
		se.verifyMyerpSalempyreceived();
		/*
		 * se.Deliveryman(); se.Party(); se.verifyMyerpChallanno();
		 * se.verifyMyerpConsumerno(); se.Delivarymode(); se.Selectarea(); se.Product();
		 * se.verifyMyerpsellingprice(); se.verifyMyerpFullqty();
		 * se.verifyMyerpEmptycylReceived(); se.Modeofpayment();
		 * se.verifyMyerpCashamount(); se.verifyMyerpClearbtn();
		 */
		  
			
			  se.Deliveryman1(); se.Party1(); se.verifyMyerpChallanno1();
			  se.verifyMyerpConsumerno1(); se.Delivarymode1(); se.Selectarea1();
			  se.Product1(); se.verifyMyerpsellingprice(); se.verifyMyerpFullqty1();
			  se.verifyMyerpEmptycylReceived1(); se.Modeofpayment1();
			  se.verifyMyerpCashamount1(); se.verifyMyerpSubmitbtn();
			  
			  
				/*
				 * se.verifyMyerpreceivedemptycyonly(); se.verifyMyerpEDeliveryman();
				 * se.verifyMyerpEParty(); se.verifyMyerpEChallanno(); se.verifyMyerpEProduct();
				 * se.verifyMyerpEEmptycylReceived(); se.verifyMyerpEModeofpayment();
				 * se.verifyMyerpECashamount(); se.verifyMyerpSubmitbtn();
				 * 
				 * 
				 * 
				 * se.Deliveryman2(); se.Party2(); se.verifyMyerpChallanno2();
				 * se.verifyMyerpConsumerno2(); se.Delivarymode2(); se.Selectarea2();
				 * se.Product2(); se.verifyMyerpsellingprice(); se.verifyMyerpFullqty2();
				 * se.verifyMyerpEmptycylReceived(); se.Modeofpayment2();
				 * se.verifyMyerpCashamount2(); se.verifyMyerpSubmitbtn();
				 * 
				 * 
				 * se.verifyMyerpreceivedemptycyonly2(); se.verifyMyerpEDeliveryman2();
				 * se.verifyMyerpEParty2(); se.verifyMyerpEChallanno2();
				 * se.verifyMyerpEProduct2(); se.verifyMyerpEEmptycylReceived2();
				 * se.verifyMyerpEModeofpayment2(); se.verifyMyerpECashamount2();
				 * se.verifyMyerpSubmitbtn();
				 * 
				 * 
				 * 
				 * se.Deliveryman3(); se.Party3(); se.verifyMyerpChallanno3();
				 * se.verifyMyerpConsumerno3(); se.Delivarymode3(); se.Selectarea3();
				 * se.Product3(); se.verifyMyerpsellingprice(); se.verifyMyerpFullqty3();
				 * se.verifyMyerpEmptycylReceived3(); se.Modeofpayment3();
				 * se.verifyMyerpCashamount3(); se.verifyMyerpSubmitbtn();
				 * 
				 * 
				 * se.verifyMyerpeceivedemptycyonly3(); se.verifyMyerpEDeliveryman3();
				 * se.verifyMyerpEParty3(); se.verifyMyerpEChallanno3();
				 * se.verifyMyerpEProduct3(); se.verifyMyerpEEmptycylReceived3();
				 * se.verifyMyerpEModeofpayment3(); se.verifyMyerpECashamount3();
				 * se.verifyMyerpSubmitbtn();
				 * 
				 * 
				 * se.Deliveryman4(); se.Party4(); se.verifyMyerpChallanno4();
				 * se.verifyMyerpConsumerno4(); se.Delivarymode4(); se.Selectarea4();
				 * se.Product4(); se.verifyMyerpsellingprice(); se.verifyMyerpFullqty4();
				 * se.verifyMyerpEmptycylReceived4(); se.Modeofpayment4();
				 * se.verifyMyerpCashamount4(); se.verifyMyerpSubmitbtn();
				 * 
				 * se.verifyMyerpreceivedemptycyonly4(); se.verifyMyerpEDeliveryman4();
				 * se.verifyMyerpEParty4(); se.verifyMyerpEChallanno4();
				 * se.verifyMyerpEProduct4(); se.verifyMyerpEEmptycylReceived4();
				 * se.verifyMyerpEModeofpayment4(); se.verifyMyerpECashamount4();
				 * se.verifyMyerpSubmitbtn();
				 * 
				 */

		se.verifyMyerpCommercialcylsalel();
		se.verifyMyerpComsalelist();
		se.Deliverymanname();
		se.verifyMyerpComsaleDate();
		se.verifyMyerpSubmitbtnlist();
		// se.verifyMyerpEditbtn();
		// se.verifyMyerpDelete();

	}
}
