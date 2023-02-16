package com.lpg.qa.GMTestcases;
 import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.ProductCategory;


	public class ProductCategoryTest  extends LpgTestBase{

		WebDriver driver;
		   
		@BeforeClass
		public void setup() {
			intializeBrowser("chrome");
		}
		
		@AfterClass
		public void teardown() {
		//	TestBase.driver.close();
		}
		
			
			
			@Test
			public void ProductCategoryPageTest() throws InterruptedException {
				ProductCategory pr=new ProductCategory(LpgTestBase.driver);  
				pr.verifyMyerpagancycode();
				pr.verifyMyerpUserid();
				pr.verifyMyerpPassword();
				pr.VerifyandClickonMyerpLoginBtn();
				pr.VerifyMyerpMasterModule();
				pr.VerifyMyerpGenralMasterModule();
				pr.VerifyMyerpProductCategoryForm();
				pr.VerifyMyerpProductCatName1();
				pr.VerifyMyerpProductDesc1();
				pr.VerifyMyerpProductShortCode1();
				pr.VerifyMyerpProductParentCategory1();
				pr.VerifyMyerpProductActiveCHK1();
				pr.VerifyMyerpProductClearBtn();
				pr.VerifyMyerpProductCatName();
				pr.VerifyMyerpProductDesc();
				pr.VerifyMyerpProductShortCode();
				pr.VerifyMyerpProductParentCategory();
				pr.VerifyMyerpProductActiveCHK();
				pr.VerifyMyerpProductSubmitBtn();
				pr.VerifyMyerpProductSubmitOKBtn();
				pr.VerifyandClickonPSearchbar1();
				pr.VerifyMyerpProductCatEditBtn();
				pr.VerifyMyerpProductCatYesUpdateItBtn();
				pr.VerifyMyerpProductShortCode2();
				pr.VerifyMyerpProductDesc2();
				pr.VerifyMyerpProductCatUpdateBtn();
				pr.VerifyMyerpProductCatUpdateOkBtn();
				pr.VerifyMyerpProductCatExportBtn();
				pr.VerifyandClickonPSearchbar2();
                
}
}