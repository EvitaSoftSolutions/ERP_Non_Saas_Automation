package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.Servicespageform;


public class Servicespagetest extends LpgTestBase{

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
	public void ServicespageTest() throws InterruptedException{
		Servicespageform sf= new Servicespageform(LpgTestBase.driver);
		/*
		 * sf.verifyMyerpagancycode(); sf.verifyMyerpusrname();
		 * sf.verifyMyerppassword(); sf.verifyMyerploginbtn();
		 */
		sf.setup(driver);
		sf.verifyMyerpMasterModule();
		sf.verifyMyerpGeneralMaster();
		sf.verifyMyerpPageNavigation();
		sf.verifyMyerpServices();

		sf.verifyMyerpServiceDescription(); sf.verifyMyerpServicestitle();
		sf.verifyMyerpServicesAlias(); sf.verifyMyerpServicescost();
		sf.verifyMyerpselectcom(); sf.verifyMyerpSelectselecttype();
		sf.verifyMyerpServiceshsncod(); sf.verifyMyerpServicesactiv();
		sf.verifyMyerpServicesisgst(); sf.verifyMyerpUpdateGst();
		sf.verifyMyerpGstTextrate1(); sf.verifyMyerpGstTestRate2();
		sf.verifyMyerpSaveGstbtn(); sf.VerifyMyerpClearBtn1();
		sf.verifyMyerpServiceDescription(); sf.verifyMyerpServicestitle();
		sf.verifyMyerpServicesAlias(); sf.verifyMyerpServicescost();
		sf.verifyMyerpselectcom(); sf.verifyMyerpSelectselecttype();
		sf.verifyMyerpServiceshsncod(); sf.verifyMyerpServicesactiv();
		sf.verifyMyerpServicesisgst(); sf.verifyMyerpUpdateGst();
		sf.verifyMyerpGstTextrate1(); sf.verifyMyerpGstTestRate2();
		sf.verifyMyerpSaveGstbtn(); sf.verifyMyerpSubmit(); sf.verifyMyerpOKButton();
		sf.VerifyandClickonPSearchbar1(); sf.verifyMyerpEditbutton();
		sf.verifyMyerpConfirmbutton(); sf.verifyMyerpServiceDescription1();
		sf.verifyMyerpServicestitle1(); sf.verifyMyerpselectcom1();
		sf.verifyMyerpSelectselecttype1(); sf.verifyMyerpServiceshsncod1();
		sf.verifyMyerpexportbtn(); sf.VerifyandClickonPSearchbar2();



		sf.verifyMyerpServiceDescription2(); sf.verifyMyerpServicestitle2();
		sf.verifyMyerpServicesAlias2(); sf.verifyMyerpServicescost2();
		sf.verifyMyerpselectcom2(); sf.verifyMyerpSelectselecttype2();
		sf.verifyMyerpServiceshsncod2(); sf.verifyMyerpServicesactiv2();
		sf.verifyMyerpServicesisgst2(); sf.verifyMyerpUpdateGst2();
		sf.verifyMyerpGstTextrate2(); sf.verifyMyerpGstTestRate22();
		sf.verifyMyerpDate2();
		sf.verifyMyerpSaveGstbtn2(); sf.verifyMyerpSubmit2();
		sf.verifyMyerpOKButton2(); sf.VerifyandClickonPSearchbar22();


		sf.verifyMyerpServiceDescription3();
		sf.verifyMyerpServicestitle3();
		sf.verifyMyerpServicesAlias3();
		sf.verifyMyerpServicescost3();
		sf.verifyMyerpselectcom3();
		sf.verifyMyerpSelectselecttype3();
		sf.verifyMyerpServiceshsncod3();
		sf.verifyMyerpServicesactiv3();
		sf.verifyMyerpServicesisgst3();
		sf.verifyMyerpUpdateGst3();
		sf.verifyMyerpGstTextrate3();
		sf.verifyMyerpGstTestRate33();
		sf.verifyMyerpDate3();
		sf.verifyMyerpSaveGstbtn3();
		sf.verifyMyerpSubmit3();
		sf.verifyMyerpOKButton3();
		sf.VerifyandClickonPSearchbar33();



	}
}
