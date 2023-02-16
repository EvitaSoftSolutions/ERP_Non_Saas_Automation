package com.lpg.qa.GMTestcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.Product;



    public class ProductTest  extends LpgTestBase{

		WebDriver driver;
	   
		@BeforeClass
		public void setup() {
			intializeBrowser("chrome");
		}
		
		@AfterClass
		public void teardown() {
		//	TestBase.driver.close();
		}
		
		
		@Test(priority=1)
		public void ProductPageTest() throws InterruptedException {
			Product pr=new Product(LpgTestBase.driver);  
			/*
			 * pr.verifyMyerpagancycode(); pr.verifyMyerpUserid(); pr.verifyMyerpPassword();
			 * pr.VerifyandClickonMyerpLoginBtn();
			 */
			pr.setup(driver);
			pr.VerifyMyerpMasterModule();
			pr.VerifyMyerpGenralMasterModule();
			pr.VerifyMyerpProductForm();
			pr.VerifyMyerProductname();
			pr.VerifyMyerProductcode();
			pr.VerifyMyerProductDesc();
			pr.setselectunitofmeasurement();
			pr.setselectproductcategory();
			pr.setselectinventorymethod();
			pr.VerifyMyerIsGST();
			pr.VerifyMyerpTaxDetails();
			pr.VerifyMyerpHSNCode();
			pr.VerifyMyerpPName();
			pr.VerifyMyerpPCGST();
			pr.VerifyMyerpPTaxSavebtn();
			pr.VerifyMyerpPActiveCheckbox();
			pr.VerifyMyerpPSubmitBtn();
			pr.VerifyMyerpPSubmitBtnOK();
			pr.VerifyMyerProductname1();
			pr.VerifyMyerProductcode1();
			pr.VerifyMyerProductDesc1();
			pr.setselectunitofmeasurement1();
			pr.setselectproductcategory1();
			pr.setselectinventorymethod1();
			pr.VerifyMyerIsGST1();
			pr.VerifyMyerpTaxDetails1();
			pr.VerifyMyerpHSNCode1();
			pr.VerifyMyerpPName1();
			pr.VerifyMyerpPCGST1();
			pr.VerifyMyerpPTaxSavebtn1();
			pr.VerifyMyerpPActiveCheckbox1();
			pr.VerifyMyerpPSubmitBtn1();
			pr.VerifyMyerpPSubmitBtnOK1();
			pr.VerifyMyerProductname2();
			pr.VerifyMyerProductcode2();
			pr.VerifyMyerProductDesc2();
			pr.setselectunitofmeasurement2();
			pr.setselectproductcategory2();
			pr.setselectinventorymethod2();
			pr.VerifyMyerIsGST2();
			pr.VerifyMyerpTaxDetails2();
			pr.VerifyMyerpHSNCode2();
			pr.VerifyMyerpPName2();
			pr.VerifyMyerpPCGST2();
			pr.VerifyMyerpPTaxSavebtn2();
			pr.VerifyMyerpPActiveCheckbox2();
			pr.VerifyMyerpPSubmitBtn2();
			pr.VerifyMyerpPSubmitBtnOK2();
			pr.VerifyMyerProductname3();
			pr.VerifyMyerProductcode3();
			pr.VerifyMyerProductDesc3();
			pr.setselectunitofmeasurement3();
			pr.setselectproductcategory3();
			pr.setselectinventorymethod3();
			pr.VerifyMyerIsGST3();
			pr.VerifyMyerpTaxDetails3();
			pr.VerifyMyerpHSNCode3();
			pr.VerifyMyerpPName3();
			pr.VerifyMyerpPCGST3();
			pr.VerifyMyerpPTaxSavebtn3();
			pr.VerifyMyerpPActiveCheckbox3();
			pr.VerifyMyerpPSubmitBtn3();
			pr.VerifyMyerpPSubmitBtnOK3();
			pr.VerifyMyerProductname4();
			pr.VerifyMyerProductcode4();
			pr.VerifyMyerProductDesc4();
			pr.setselectunitofmeasurement4();
			pr.setselectproductcategory4();
			pr.setselectinventorymethod4();
			pr.VerifyMyerIsGST4();
			pr.VerifyMyerpTaxDetails4();
			pr.VerifyMyerpHSNCode4();
			pr.VerifyMyerpPName4();
			pr.VerifyMyerpPCGST4();
			pr.VerifyMyerpPTaxSavebtn4();
			pr.VerifyMyerpPActiveCheckbox4();
			pr.VerifyMyerpPSubmitBtn4();
			pr.VerifyMyerpPSubmitBtnOK4();
			pr.VerifyMyerpPClearBtnBtn();
			pr.VerifyMyerpPEditBtn();
			pr.VerifyMyerpPYesUpdateItBtn();
			pr.VerifyMyerProductcode2();
			pr.VerifyMyerProductDesc2();
			pr.VerifyMyerpPUpdateBtn();
			pr.VerifyMyerpPUpdateOKBtn();
			pr.VerifyandClickonPSearchbar3();
			pr.VerifyMyerpPExportBtn();
			
		}
    }