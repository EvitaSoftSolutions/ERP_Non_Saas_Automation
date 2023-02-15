package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.VehicleForm;


public class Vehiclepagetest extends LpgTestBase{
	
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
	public void VehicleTest() throws InterruptedException{
		VehicleForm vm= new VehicleForm(LpgTestBase.driver);
		/*
		 * vm.verifyMyerpagancycode(); vm.verifyMyerpusrname();
		 * vm.verifyMyerppassword(); vm.verifyMyerploginbtn();
		 */
		vm.setup(driver);
		vm.verifyMyerpMasterModule();
		vm.verifyMyerpGeneralMaster();
		vm.verifyMyerpPageNavigation();
		vm.verifyMyerpVehicleMaster();
		vm.verifyMyerpTransporterName();
		vm.verifyMyerpVehicleNo();
		vm.verifyMyerpSelectdriver();
		vm.verifyMyerpCheckBox();
		vm.verifyMyerpClearbutton();
		vm.verifyMyerpTransporterName();
		vm.verifyMyerpVehicleNo();
		vm.verifyMyerpSelectdriver();
		vm.verifyMyerpCheckBox();
		vm.verifyMyerpSubmitBtn();
		vm.verifyMyerpOKButton();
		vm.VerifyandClickonPSearchbar1();
		vm.verifyMyerpEditbutton();
		vm.verifyMyerpConfirmbutton();
		vm.verifyMyerpTransporterName1();
		vm.verifyMyerpVehicleNo1();
		vm.verifyMyerpUpdatebtn();
		vm.verifyMyerpupdateokbtn();
		vm.verifyMyerpexportbtn();
		vm.VerifyandClickonPSearchbar2();


}
}