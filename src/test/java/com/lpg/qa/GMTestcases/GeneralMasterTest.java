package com.lpg.qa.GMTestcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.GeneralMaster;



public class GeneralMasterTest  extends LpgTestBase{

	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//	TestBase.driver.close();
	}


	@Test(priority=1)
	public void ProductPageTest() throws InterruptedException {
		GeneralMaster pr=new GeneralMaster(LpgTestBase.driver);  
		/*
		 * pr.verifyMyerpagancycode(); pr.verifyMyerpUserid(); pr.verifyMyerpPassword();
		 * pr.VerifyandClickonMyerpLoginBtn();
		 */
		pr.setup(driver);
		pr.VerifyMyerpMasterModule();
		pr.VerifyMyerpGenralMasterModule();

		/*
		 * //product pr.VerifyMyerpProductform(); pr.VerifyMyerProductname();
		 * pr.VerifyMyerProductcode(); pr.VerifyMyerProductDesc();
		 * pr.setselectunitofmeasurement(); pr.setselectproductcategory();
		 * pr.setselectinventorymethod(); pr.VerifyMyerIsGST();
		 * pr.VerifyMyerpTaxDetails(); pr.VerifyMyerpHSNCode(); pr.VerifyMyerpPName();
		 * pr.VerifyMyerpPCGST(); pr.VerifyMyerpdate(); pr.VerifyMyerpPTaxSavebtn();
		 * pr.VerifyMyerpPActiveCheckbox(); pr.VerifyMyerpPSubmitBtn();
		 * pr.VerifyMyerpPSubmitBtnOK();
		 * 
		 * pr.VerifyMyerProductName1(); pr.VerifyMyerProductcode1();
		 * pr.VerifyMyerProductDesc1(); pr.setselectunitofmeasurement1();
		 * pr.setselectproductcategory1(); pr.setselectinventorymethod1();
		 * pr.VerifyMyerIsGST1(); pr.VerifyMyerpTaxDetails1(); pr.VerifyMyerpHSNCode1();
		 * pr.VerifyMyerpPName1(); pr.VerifyMyerpPCGST1(); pr.VerifyMyerpdate1();
		 * pr.VerifyMyerpPTaxSavebtn1(); pr.VerifyMyerpPActiveCheckbox1();
		 * pr.VerifyMyerpProductSubmitBtn1(); pr.VerifyMyerpPSubmitBtnOK1();
		 * 
		 * pr.VerifyMyerProductname2(); pr.VerifyMyerProductcode2();
		 * pr.VerifyMyerProductDesc2(); pr.setselectunitofmeasurement2();
		 * pr.setselectProductcategory2(); pr.setselectinventorymethod2();
		 * pr.VerifyMyerIsGST2(); pr.VerifyMyerpTaxDetails2(); pr.VerifyMyerpHSNCode2();
		 * pr.VerifyMyerpPName2(); pr.VerifyMyerpPCGST2(); pr.verifyMyerpDate2();
		 * pr.VerifyMyerpPTaxSavebtn2(); pr.VerifyMyerpPActiveCheckbox2();
		 * pr.VerifyMyerpProductSubmitBtn2(); pr.VerifyMyerpPSubmitBtnOK2();
		 * 
		 * pr.VerifyMyerproductname3(); pr.VerifyMyerProductcode3();
		 * pr.VerifyMyerProductDesc3(); pr.setselectunitofmeasurement3();
		 * pr.setselectproductcategory3(); pr.setselectinventorymethod3();
		 * pr.VerifyMyerIsGST3(); pr.VerifyMyerpTaxDetails3(); pr.VerifyMyerpHSNCode3();
		 * pr.VerifyMyerpPName3(); pr.VerifyMyerpPCGST3(); pr.verifyMyerpDate3();
		 * pr.VerifyMyerpPTaxSavebtn3(); pr.VerifyMyerpPActiveCheckbox3();
		 * pr.VerifyMyerpProductSubmitBtn3(); pr.VerifyMyerpPSubmitBtnOK3();
		 * 
		 * pr.VerifyMyerProductName4(); pr.VerifyMyerProductcode4();
		 * pr.VerifyMyerProductDesc4(); pr.setselectunitofmeasurement4();
		 * pr.setselectproductcategory4(); pr.setselectinventorymethod4();
		 * pr.VerifyMyerIsGST4(); pr.VerifyMyerpTaxDetails4(); pr.VerifyMyerpHSNCode4();
		 * pr.VerifyMyerpPName4(); pr.VerifyMyerpPCGST4(); pr.VerifyMyerpdate4();
		 * pr.VerifyMyerpPTaxSavebtn4(); pr.VerifyMyerpPActiveCheckbox4();
		 * pr.VerifyMyerpProductSubmitBtn4(); pr.VerifyMyerpPSubmitBtnOK4();
		 * pr.VerifyMyerpBackbtn();
		 * 
		 */
		//product rate slab		
		pr.VerifyMyerpProductRSlab(); 
		/*
		 * pr.setselectproduct(); pr.setselectarea(); pr.VerifyMyerpProductrate();
		 * pr.VerifyMyerpprdouctmrp(); pr.VerifyMyerpPurchasDeposit();
		 * pr.VerifyMyerpProductDate(); //pr.selectcompany();
		 * pr.VerifyMyerpProductActiveBtn(); pr.VerifyMyerpProductSubmitBtn();
		 */
		/*
		 * pr.setselectproduct1(); pr.setselectarea1(); pr.VerifyMyerpProductrate1();
		 * pr.VerifyMyerpprdouctmrp1(); pr.VerifyMyerpProductDeposit1();
		 * pr.VerifyMyerpProductDate1(); //pr.selectcompany1();
		 * pr.VerifyMyerpProductActiveBtn1(); pr.VerifyMyerpProductSubmitBtn1();
		 */

		pr.setselectproduct2(); 
		pr.setselectarea2(); 
		pr.VerifyMyerpProductRate2();
		pr.VerifyMyerpprdouctmrp2(); 
		pr.VerifyMyerpProductDeposit2();
		pr.VerifyMyerpProductDate2(); 
		//pr.selectcompany2();
		pr.VerifyMyerpProductActiveBtn2(); 
		pr.VerifyMyerpProductSubmitBtn2();

		pr.setselectproduct3(); 
		pr.setselectarea3(); 
		pr.VerifyMyerpProductrate3();
		pr.VerifyMyerpprdouctmrp3();
		pr.VerifyMyerpPurchasDeposit3();
		pr.VerifyMyerpProductDate3(); 
		//pr.selectcompany3();
		pr.VerifyMyerpProductActiveBtn3(); 
		pr.VerifyMyerpProductSubmitBtn3();

		pr.setselectproduct4(); 
		pr.setselectarea4(); 
		pr.VerifyMyerpProductrate4();
		pr.VerifyMyerpprdouctmrp4(); 
		pr.VerifyMyerpPurchasDeposit4();
		pr.VerifyMyerpProductDate4(); 
		//pr.selectcompany4();
		pr.VerifyMyerpProductActiveBtn4(); 
		pr.VerifyMyerpProductSubmitBtn4();
		pr.VerifyMyerpBackbtn1();

		pr.VerifyMyerpSupplier(); 
		//pr.selectcompany();
		pr.VerifyMyerpSupcompanyCode(); 
		pr.VerifyMyerpSupplierName();
		pr.SelectGroup(); 
		pr.VerifyMyerpSupplierContandDetial();
		pr.VerifyMyerpSupplierAddress1(); 
		pr.SelectState(); 
		pr.SelectDestrict();
		pr.SelectTahasil();
		pr.VeryFymyerpCity(); 
		pr.VeryFymyerppincode1();
		pr.VeryFymyerpgstinnumber();
		pr.VeryFymyerppannumber();
		pr.VeryFymyerptdscategory();
		pr.VerifyMyerpOpeningdate();
		pr.VerifyMyerpSupplierActveChk(); 
		pr.VerifyMyerpSupplierSubmitBtn();
		pr.VerifyMyerpSupplierSubmiOKBtn();
		pr.VerifyMyerpBackbtn2();
		pr.verifyMyerpPageNavigation();

		//Employee Form
		pr.VerifyMyerpEmployeeForm(); 
		pr.VerifyMyerpEmployeeFirstName(); 
		pr.VerifyMyerpEmployeeLastName();
		//pr.ESelectCompany(); 
		pr.ESelectDesignation();
		pr.VerifyMyerpPersonalContanctNumber();
		pr.VerifyMyerpoficialcontanctnumber(); 
		pr.VerifyMyerpEmailId();
		pr.VerifyMyerpAddress1(); 
		pr.VerifyMyerpSelectState();
		pr.VerifyMyerpSelectDistrict(); 
		pr.voidVerifyMyerpSelectTehsil();
		pr.VerifyMyerpEnterCity(); 
		pr.VerifyMyerpPincode(); 
		pr.VerifyMyerpBasicPay();
		pr.VerifyMyerpDOB(); 
		pr.VerifyMyerpJoiningDate();
		pr.VerifyMyerpEmployeeActiveCHK(); 
		pr.VerifyMyerpEmployeeSubmitBtn();
		pr.VerifyMyerpEmployeeSubmitOKBtn();

		pr.VerifyMyerpEmployeeFirstName3();
		pr.VerifyMyerpEmployeeLastName3();
		//pr.ESelectCompany3(); 
		pr.ESelectDesignation3();
		pr.VerifyMyerppersonalcontanctnumber3();
		pr.VerifyMyerpoficialcontanctnumber3();
		pr.VerifyMyerpEmailId3();
		pr.VerifyMyerpAddress3();
		pr.VerifyMyerpSelectState3();
		pr.VerifyMyerpSelectDistrict3(); 
		pr.voidVerifyMyerpSelectTehsil3();
		pr.VerifyMyerpEnterCity3(); 
		pr.VerifyMyerpPincode3();
		pr.VerifyMyerpBasicPay3();
		pr.VerifyMyerpDOB3();
		pr.VerifyMyerpJoiningDate3(); 
		pr.VerifyMyerpEmployeeActiveCHK3();
		pr.VerifyMyerpEmployeeSubmitBtn3();
		pr.VerifyMyerpEmployeeSubmitOKBtn3();

		pr.VerifyMyerpEmployeeFirstName4(); 
		pr.VerifyMyerpEmployeeLastName4();
		//pr.ESelectCompany4(); 
		pr.ESelectDesignation4();
		pr.VerifyMyerppersonalcontanctnumber4();
		pr.VerifyMyerpoficialcontanctnumber4(); 
		pr.VerifyMyerpEmailId4();
		pr.VerifyMyerpAddress4(); 
		pr.VerifyMyerpSelectState4();
		pr.VerifyMyerpSelectDistrict4();
		pr.voidVerifyMyerpSelectTehsil4();
		pr.VerifyMyerpEnterCity4();
		pr.VerifyMyerpPincode4();
		pr.VerifyMyerpBasicPay4(); 
		pr.VerifyMyerpDOB4();
		pr.VerifyMyerpJoiningDate4(); 
		pr.VerifyMyerpEmployeeActiveCHK4();
		pr.VerifyMyerpEmployeeSubmitBtn4();
		pr.VerifyMyerpEmployeeSubmitOKBtn4();

		pr.VerifyMyerpEmployeeFirstName5(); 
		pr.VerifyMyerpEmployeeLastName5();
		//pr.ESelectCompany5(); pr.ESelectDesignation5();
		pr.VerifyMyerppersonalcontanctnumber5();
		pr.VerifyMyerpOficialcontanctnumber5();
		pr.VerifyMyerpEmailId5();
		pr.VerifyMyerpAddress5(); 
		pr.VerifyMyerpSelectState5();
		pr.VerifyMyerpSelectDistrict5(); 
		pr.voidVerifyMyerpSelectTehsil5();
		pr.VerifyMyerpEnterCity5(); 
		pr.VerifyMyerpPincode5();
		pr.VerifyMyerpBasicPay5();
		pr.VerifyMyerpDOB5();
		pr.VerifyMyerpJoiningDate5(); 
		pr.VerifyMyerpEmployeeActiveCHK5();
		pr.VerifyMyerpEmployeeSubmitBtn5(); 
		pr.VerifyMyerpEmployeeSubmitOKBtn5();
		pr.VerifyMyerpBackbtn6(); 
		pr.verifyMyerpPageNavigation1();


		//Transporter Form
		pr.VerifyMyerpTransporterForm(); 
		//pr.TSelectCompany();
		pr.VerifyMyerpTcompanyCode(); 
		pr.VerifyMyerpTName();
		pr.TSelectGroup();
		pr.VerifyMyerpTCategory();
		pr.VerifyMyerpTContandDetial();
		pr.VerifyMyerpTAddress();
		pr.VerifyMyerpTSelectCity();
		pr.VerifyMyerpTActveChk(); 
		pr.VerifyMyerpTSubmitBtn();
		pr.VerifyMyerpTSubmiOKBtn();
		pr.VerifyMyerpBackbtn4();

		//Vehicle
		pr.verifyMyerpVehicleMaster(); 
		pr.verifyMyerpTransporterName();
		pr.verifyMyerpVehicleNo(); 
		pr.verifyMyerpModelYear();
		pr.verifyMyerpInsuranceFromDate(); 
		pr.verifyMyerpInsuranceToDate();
		pr.verifyMyerpSelectdriver(); 
		pr.verifyMyerpCheckBox();
		pr.verifyMyerpsubmitbtn(); 
		pr.verifyMyerpOKButton();
		pr.VerifyMyerpBackbtn3();

		//commercial Party From
		pr.VerifyMyerpCommercialPartyForm(); 
		pr.VerifyMyerpConsumerNumber(); 
		pr.VerifyMyerpCPBusinessname();
		pr.VerifyMyerpCPSelectBusinessType(); 
		pr.VerifyMyerpCPSelectGroup();
		pr.VerifyMyerpCPAddress(); 
		pr.VerifyMyerpCPSelectState();
		pr.VerifyMyerpbillingtype1(); 
		pr.VerifyMyerpCPActivechk();
		pr.VerifyMyerpCPProduct();
		pr.VerifyMyerpCPPQantity();
		pr.VerifyMyerpCPPOpeningCycle(); 
		pr.VerifyMyerpCPSubmitBtn();

		pr.VerifyMyerpConsumerNumber2();
		pr.VerifyMyerpCPBusinessname2();
		pr.VerifyMyerpCPSelectBusinessType2(); 
		pr.VerifyMyerpCPSelectGroup2();
		pr.VerifyMyerpCPAddress2(); 
		pr.VerifyMyerpCPSelectState2();
		pr.VerifyMyerpbillingtype2();
		pr.VerifyMyerpCPActivechk2();
		pr.VerifyMyerpCPProduct2(); 
		pr.VerifyMyerpCPPQantity2();
		pr.VerifyMyerpCPPOpeningCycle2(); 
		pr.VerifyMyerpCPSubmitBtn2();

		pr.VerifyMyerpConsumerNumber3();
		pr.VerifyMyerpCPBusinessname3();
		pr.VerifyMyerpCPSelectBusinessType3(); 
		pr.VerifyMyerpCPSelectGroup3();
		pr.VerifyMyerpCPAddress3(); 
		pr.VerifyMyerpCPSelectState3();
		pr.VerifyMyerpbillingtype3(); 
		pr.VerifyMyerpCPActivechk3();
		pr.VerifyMyerpCPProduct3(); 
		pr.VerifyMyerpCPPQantity3();
		pr.VerifyMyerpCPPOpeningCycle3(); 
		pr.VerifyMyerpCPSubmitBtn3();

		pr.VerifyMyerpConsumerNumber4(); 
		pr.VerifyMyerpCPBusinessname4();
		pr.VerifyMyerpCPSelectBusinessType4(); 
		pr.VerifyMyerpCPSelectGroup4();
		pr.VerifyMyerpCPAddress4(); 
		pr.VerifyMyerpCPSelectState4();
		pr.VerifyMyerpbillingtype4();
		pr.VerifyMyerpCPActivechk4();
		pr.VerifyMyerpCPProduct4(); 
		pr.VerifyMyerpCPPQantity4();
		pr.VerifyMyerpCPPOpeningCycle4(); 
		pr.VerifyMyerpCPSubmitBtn4();

		pr.VerifyMyerpConsumerNumber5();
		pr.VerifyMyerpCPBusinessname5();
		pr.VerifyMyerpCPSelectBusinessType5(); 
		pr.VerifyMyerpCPSelectGroup5();
		pr.VerifyMyerpCPAddress5(); 
		pr.VerifyMyerpCPSelectState5();
		pr.VerifyMyerpbillingtype5(); 
		pr.VerifyMyerpCPActivechk5();
		pr.VerifyMyerpCPProduct5(); 
		pr.VerifyMyerpCPPQantity5();
		pr.VerifyMyerpCPPOpeningCycle5(); 
		pr.VerifyMyerpCPSubmitBtn5();
		pr.VerifyMyerpBackbtn5(); 
		pr.verifyMyerpPageNavigation3();

		//Services Form
		pr.verifyMyerpServices();
		pr.verifyMyerpServiceDescription();
		pr.verifyMyerpServicestitle();
		pr.verifyMyerpServicesAlias();
		pr.verifyMyerpServicescost(); 
		pr.verifyMyerpselectcom();
		pr.verifyMyerpSelecttype(); 
		pr.verifyMyerpServiceshsncod();
		pr.verifyMyerpServicesactiv(); 
		pr.verifyMyerpServicesisgst();
		pr.verifyMyerpUpdateGst(); 
		pr.verifyMyerpGstTextrate1();
		pr.verifyMyerpGstTestRate2();
		pr.verifyMyerpDate();
		pr.verifyMyerpSaveGstbtn(); 
		pr.verifyMyerpSubmit();
		pr.verifyMyerpOKButton4();

		pr.verifyMyerpServiceDescription2();
		pr.verifyMyerpServicestitle2();
		pr.verifyMyerpServicesAlias2(); 
		pr.verifyMyerpServicescost2();
		pr.verifyMyerpselectcom2();
		pr.verifyMyerpSelectselecttype2();
		pr.verifyMyerpServiceshsncod2();
		pr.verifyMyerpServicesactiv2();
		pr.verifyMyerpServicesisgst2();
		pr.verifyMyerpUpdateGst2();
		pr.verifyMyerpGstTextrate2();
		pr.verifyMyerpGstTestRate22();
		pr.verifyMyerpDate2(); 
		pr.verifyMyerpSaveGstbtn2(); 
		pr.verifyMyerpSubmit2();
		pr.verifyMyerpOKButton2();

		pr.verifyMyerpServiceDescription3();
		pr.verifyMyerpServicestitle3();
		pr.verifyMyerpServicesAlias3(); 
		pr.verifyMyerpServicescost3();
		pr.verifyMyerpselectcom3();
		pr.verifyMyerpSelectselecttype3();
		pr.verifyMyerpServiceshsncod3(); 
		pr.verifyMyerpServicesactiv3();
		pr.verifyMyerpServicesisgst3(); 
		pr.verifyMyerpUpdateGst3();
		pr.verifyMyerpGstTextrate3(); 
		pr.verifyMyerpGstTestRate33();
		pr.verifyMyerpDate3(); 
		pr.verifyMyerpSaveGstbtn3(); 
		pr.verifyMyerpSubmit3();
		pr.verifyMyerpOKButton3(); 
		pr.VerifyMyerpBackbtn7();
		pr.verifyMyerpPageNavigation2();

		//Godown Transaction Form
		pr.verifyMyerpGodownTransaction(); 
		pr.verifyMyerpGodownName();
		pr.verifyMyerpGodownAddress();
		pr.verifyMyerpCheckActive();
		pr.verifyMyerpSubmitBtn22(); 
		pr.verifyMyerpOKButton22();


		pr.verifyMyerpGodownName1();
		pr.verifyMyerpGodownAddress1();
		pr.verifyMyerpCheckActive1();
		pr.verifyMyerpSubmitBtn1();
		pr.verifyMyerpOKButton1(); 
		pr.VerifyMyerpBackbtn8();
		pr.verifyMyerpPageNavigation5();

		//User Form	
		pr.verifyMyerpUserMaster(); 
		pr.verifyMyerpSelectEmployee();
		pr.verifyMyerpSelectUserType(); 
		pr.verifyMyerpSelectCompany();
		pr.verifyMyerpUseridname(); 
		pr.verifyMyerpUserpass();
		pr.verifyMyerpUseremail();
		pr.verifyMyerpUserMob();
		pr.verifyMyerpcheckboxcl(); 
		pr.verifyMyerpsubmitbtn();
	//	pr.VerifySubmitOKBtn();

		pr.verifyMyerpSelectEmployee2();
		pr.verifyMyerpSelectUserType2();
		//pr.verifyMyerpSelectCompany2();
		pr.verifyMyerpUseridname2();
		pr.verifyMyerpUserpass2();
		//pr.verifyMyerpUseremail2();
		//pr.verifyMyerpUserMob2();
		pr.verifyMyerpcheckboxcl2();
		pr.verifyMyerpsubmitbtn2();
		//pr.VerifySubmitOKBtn2();
		
		pr.verifyMyerpSelectEmployee4(); 
		pr.verifyMyerpSelectUserType4();
		pr.verifyMyerpSelectCompany4(); 
		pr.verifyMyerpUseridname4();
		pr.verifyMyerpUserpass4(); 
		//uf.verifyMyerpUseremail4();
		//uf.verifyMyerpUserMob4(); 
		pr.verifyMyerpcheckboxcl4();
		pr.verifyMyerpsubmitbtn4(); 
	//	pr.VerifySubmitOKBtn4();
		pr.VerifyandClickonPSearchbar4();

		pr.verifyMyerpSelectEmployee5(); 
		pr.verifyMyerpSelectUserType5();
		//uf.verifyMyerpSelectCompany5(); 
		pr.verifyMyerpUseridname5();
		pr.verifyMyerpUserpass5(); 
		//uf.verifyMyerpUseremail5();
		//uf.verifyMyerpUserMob5(); 
		pr.verifyMyerpcheckboxcl5();
		pr.verifyMyerpsubmitbtn5();
	//	pr.VerifySubmitOKBtn5();
		pr.VerifyandClickonPSearchbar5();






	}
}