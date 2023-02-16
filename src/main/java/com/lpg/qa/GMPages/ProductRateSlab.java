package com.lpg.qa.GMPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class ProductRateSlab {
		
		@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
		@FindBy (xpath="//input[@id='password-field']") private WebElement password;
		@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
		@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
	    @FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;
	    @FindBy (xpath="//a[text()='Product Rate Slab']") private WebElement productrateslab;
	    @FindBy (xpath="//select[@id='ddlProductCode']") private WebElement selectproduct;
	    @FindBy (xpath="//select[@id=\"ddlArea\"]") private WebElement selectarea;
	    @FindBy (xpath="//input[@id='txtPurchaseRate']") private WebElement purchaserate;
	    @FindBy (xpath="//input[@id='txtProductMRP']") private WebElement purchasemrp;
	    @FindBy (xpath="//input[@id='txtProductDeposite']") private WebElement productdeposit;
	    @FindBy (xpath="//input[@id='datepicker']") private WebElement productdate;
	    @FindBy (xpath="//select[@id='ddlCompanyID']") private WebElement selectcompany;
	    @FindBy (xpath="//input[@id='chkActive']") private WebElement pactivechk; 
	    @FindBy (xpath="//button[@id='btnclear']") private WebElement pclearbtn;
	    @FindBy (xpath="//button[@id='btnSubmit']") private WebElement psubmitbtn;
	    @FindBy (xpath="//a[@id='btnEdit']") private WebElement peditbtn;
	    @FindBy (xpath="//button[text()='Yes, update it!']") private WebElement pyesupdateitbtn;
	    @FindBy (xpath="//button[@id='btnSubmit']") private WebElement pupdatebtn;
	    @FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement  pexportbtn;
	    @FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	    
	    
	    
		// initialization
	    WebDriver driver;
		 public void setup(WebDriver driver) 
		 {
			 this.driver=driver;
		 }
		public ProductRateSlab(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

			// usage
			
		public void verifyMyerpagancycode() {
			 Assert.assertTrue(agancycode.isEnabled(),"agancycode field is enabled");
			 Reporter.log("verifyMyerpagancycode", true);
			 agancycode.sendKeys("ERP_00001");
		}
		public void verifyMyerpUserid() {
			 Assert.assertTrue(userid.isEnabled(),"uerid field is enabled");
			 Reporter.log("verifyMyerpUserid", true);
			 userid.sendKeys("admin");
		}
		public void verifyMyerpPassword() {
			 Assert.assertTrue(password.isEnabled(),"passwordfield is enabled");
			 Reporter.log(" verifyMyerpPassword", true);
			 password.sendKeys("admin@123");
		}
		
		public void VerifyandClickonMyerpLoginBtn() {
			 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
			 Reporter.log(" verifyMyerplogin", true);
			 login.click();
		}
		
		public void VerifyMyerpMasterModule() {
			 Assert.assertTrue(master.isEnabled(),"Master Module field is enabled");		 
			 Reporter.log("verifyMyerpMasterModule", true);
			 master.click(); 
		}
		public void VerifyMyerpGenralMasterModule() {
			 Assert.assertTrue(genralmaster.isEnabled(),"GenralMaster Module field is enabled");		 
			 Reporter.log("verifyMyerpGenralMasterModule", true);
			 genralmaster.click(); 
		}
		public void VerifyMyerpProductRSlab() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(productrateslab.isEnabled(),"productrateslab field is enabled");		 
			 Reporter.log("verifyMyerpproductrateslab", true);
			 productrateslab.click(); 
		}
		public void setselectproduct() throws InterruptedException {
			Select sp = new Select(selectproduct);
			Thread.sleep(1000);
			Assert.assertFalse(selectproduct.isDisplayed(),"selectproduct is  displayed");
			Assert.assertFalse(selectproduct.isSelected());
			sp.selectByVisibleText("13 KG COMM");
		}
		public void setselectarea() throws InterruptedException {
			
			Select sp = new Select(selectarea);
			Thread.sleep(1000);
			Assert.assertFalse(selectarea.isDisplayed(),"selectproduct is  displayed");
			Assert.assertFalse(selectarea.isSelected());
			sp.selectByVisibleText("VIRAR");
		}
		public void VerifyMyerpPurchaseRate() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(purchaserate.isEnabled(),"purchaserate field is enabled");		 
			 Reporter.log("verifyMyerppurchaserate", true);
			 purchaserate.click(); 
			 purchaserate.sendKeys("280");
		}
		public void VerifyMyerpPurchaseMRP() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(purchasemrp.isEnabled(),"purchasemrp field is enabled");		 
			 Reporter.log("verifyMyerppurchasemrp", true);
			 purchasemrp.click(); 
			 purchasemrp.sendKeys("300");
			 
		}
		public void VerifyMyerpPurchasDeposit() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(purchasemrp.isEnabled(),"productdeposit field is enabled");		 
			 Reporter.log("verifyMyerproductdeposit", true);
			 productdeposit.click(); 
			 productdeposit.sendKeys("500");
			 
		}
		public void VerifyMyerpProductDate() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(productdate.isEnabled(),"productdate field is enabled");		 
			 Reporter.log("verifyMyerproductdate", true);
			 productdate.click(); 
			 productdate.sendKeys("31/01/2023");
			 
		}
		public void selectcompany() throws InterruptedException {
			Select sc = new Select(selectcompany);
			Thread.sleep(1000);
			Assert.assertTrue(selectcompany.isDisplayed(),"selectcompany is displayed");
			Assert.assertFalse(selectcompany.isSelected());
			sc.selectByVisibleText("ANITA GAS SERVICES");
		}
		public void VerifyMyerpProductActiveBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
			 Reporter.log("verifyMyerppactivechk", true);
			 pactivechk.click(); 
			 
		}
		public void VerifyMyerpProductClearBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(pclearbtn.isEnabled(),"pclearbtn field is enabled");		 
			 Reporter.log("verifyMyerppactivechk", true);
			 pclearbtn.click(); 
			 
		}
		
		
		public void setselectproduct1() throws InterruptedException {
			Select sp = new Select(selectproduct);
			Thread.sleep(1000);
			Assert.assertFalse(selectproduct.isDisplayed(),"selectproduct is  displayed");
			Assert.assertFalse(selectproduct.isSelected());
			sp.selectByVisibleText("13 KG COMM");
		}
		public void setselectarea1() throws InterruptedException {
			Select sp = new Select(selectarea);
			Thread.sleep(1000);
			Assert.assertFalse(selectarea.isDisplayed(),"selectproduct is  displayed");
			Assert.assertFalse(selectarea.isSelected());
			sp.selectByVisibleText("VIRAR");
		}
		public void VerifyMyerpPurchaseRate1() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(purchaserate.isEnabled(),"purchaserate field is enabled");		 
			 Reporter.log("verifyMyerppurchaserate", true);
			 purchaserate.click(); 
			 purchaserate.sendKeys("250");
		}
		public void VerifyMyerpPurchaseMRP1() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(purchasemrp.isEnabled(),"purchasemrp field is enabled");		 
			 Reporter.log("verifyMyerppurchasemrp", true);
			 purchasemrp.click(); 
			 purchasemrp.sendKeys("280");
			 
		}
		public void VerifyMyerpPurchasDeposit1() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(purchasemrp.isEnabled(),"productdeposit field is enabled");		 
			 Reporter.log("verifyMyerproductdeposit", true);
			 productdeposit.click(); 
			 productdeposit.sendKeys("500");
			 
		}
		public void VerifyMyerpProductDate1() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(productdate.isEnabled(),"productdate field is enabled");		 
			 Reporter.log("verifyMyerproductdate", true);
			 productdate.click(); 
			 productdate.sendKeys("31/01/2023");
			 
		}
	
		public void selectcompany1() throws InterruptedException {
			Select sc = new Select(selectcompany);
			Thread.sleep(1000);
			Assert.assertTrue(selectcompany.isDisplayed(),"selectcompany is displayed");
			Assert.assertFalse(selectcompany.isSelected());
			sc.selectByVisibleText("ANITA GAS SERVICES");
		}
		public void VerifyMyerpProductActiveBtn1() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
			 Reporter.log("verifyMyerppactivechk", true);
			 pactivechk.click(); 
			 
		}
		public void VerifyMyerpProductSubmitBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
			 Reporter.log("verifyMyerppsubmitbtn", true);
			 psubmitbtn.click(); 
			 
		}
		public void VerifyandClickonPSearchbar() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("31 Jan 2023");
	    	  Thread.sleep(500);
	    	  }
		public void VerifyMyerpProductEditBtn() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(peditbtn.isEnabled(),"peditbtn field is enabled");		 
			 Reporter.log("verifyMyerppeditbtn", true);
			 peditbtn.click(); 
			 
		}
		public void VerifyMyerpPYesUpdateBtnBtn() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(pyesupdateitbtn.isEnabled(),"pyesupdateitbtn field is enabled");		 
			 Reporter.log("verifyMyerppyesupdateitbtn", true);
			 pyesupdateitbtn.click(); 
			 
		}
		public void VerifyMyerpPurchaseRate2() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(purchaserate.isEnabled(),"purchaserate field is enabled");		 
			 Reporter.log("verifyMyerppurchaserate", true);
			 purchaserate.click(); 
			 purchaserate.clear();
			 purchaserate.sendKeys("220");
		}
		public void VerifyMyerpPurchaseMRP2() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(purchasemrp.isEnabled(),"purchasemrp field is enabled");		 
			 Reporter.log("verifyMyerppurchasemrp", true);
			 purchasemrp.click(); 
			 purchasemrp.clear();
			 purchasemrp.sendKeys("250");
		}
			 
		public void VerifyMyerpProductUpdateBtn() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(pupdatebtn.isEnabled(),"pupdatebtn field is enabled");		 
			 Reporter.log("verifyMyerpppupdatebtn", true);
			 pupdatebtn.click(); 
			 
		}
		public void VerifyMyerpPRSExportBtn() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(pexportbtn.isEnabled(),"pexportbtn field is enabled");		 
			 Reporter.log("verifyMyerppexportbtn", true);
			 pexportbtn.click(); 
			 
		}
		public void VerifyandClickonPSearchbar2() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("31 Jan 2023");
	    	  Thread.sleep(500);
	    	  }
		
		
		
		
		
		
		
		
}