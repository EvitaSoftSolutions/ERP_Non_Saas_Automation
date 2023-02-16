package com.lpg.qa.GMPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ParentProductCategory {
	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
    @FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;
    @FindBy (xpath="//a[text()='Parent Product Category']") private WebElement parentproductcategory;
    @FindBy (xpath="//input[@id='txtCategory_Name']") private WebElement  pcategoryname;
    @FindBy (xpath="//input[@id='chkActive']") private WebElement pactivebtn;
    @FindBy (xpath="//button[@id='btnSubmit']") private WebElement psubmitbtn;
    @FindBy (xpath="//button[@id='btnclear']") private WebElement pclearbtn;
    @FindBy (xpath="//button[text()='OK']") private WebElement psubmitokbtn;
    @FindBy (xpath="//a[@id='btnEdit']") private WebElement peditbtn;   
	@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement yesupdateitbtn;
	@FindBy (xpath="//button[text()='Update']") private WebElement updatebtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement pupdatedok;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement pexportbtn;
	@FindBy (xpath="//li[@id='tblmain_next']") private WebElement ppagenav;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	
    
 // initialization
 		public ParentProductCategory(WebDriver driver) {
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
 		public void VerifyMyerpParentProductCtegoryForm() {
			 Assert.assertTrue( parentproductcategory.isEnabled()," parentproductcategory Module field is enabled");		 
			 Reporter.log("verifyMyerp parentproductcategory", true);
			 parentproductcategory.click(); 
		}
 		public void VerifyMyerpPCategoryName() {
			 Assert.assertTrue(pcategoryname.isEnabled(),"pcategorynamefield is enabled");		 
			 Reporter.log("verifyMyerppcategoryname", true);
			 pcategoryname.click(); 
			 pcategoryname.sendKeys("ALL OIL AND GAS ");
		}
 		public void VerifyMyerpPActiveBtn() {
			 Assert.assertTrue(pactivebtn.isEnabled(),"pactivebtn field is enabled");		 
			 Reporter.log("verifyMyerppactivebtn", true);
			 pactivebtn.click(); 
		}
 		public void VerifyMyerpPClearBtn() {
			 Assert.assertTrue(pclearbtn.isEnabled(),"pclearbtn is enabled");		 
			 Reporter.log("verifyMyerppclearbtn", true);
			 pclearbtn.click(); 
		}
 		
 		public void VerifyMyerpPCategoryName1() throws InterruptedException {
 			Thread.sleep(500);
			 Assert.assertTrue(pcategoryname.isEnabled(),"pcategorynamefield is enabled");		 
			 Reporter.log("verifyMyerppcategoryname", true);
			 pcategoryname.click(); 
			 pcategoryname.sendKeys("BEYOND");
		}
		public void VerifyMyerpPActiveBtn1() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(pactivebtn.isEnabled(),"pactivebtn field is enabled");		 
			 Reporter.log("verifyMyerppactivebtn", true);
			 pactivebtn.click(); 
		}

		public void VerifyMyerpPSubmitBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtnfield is enabled");		 
			 Reporter.log("verifyMyerppsubmitbtn", true);
			 psubmitbtn.click(); 
		}
		public void VerifyMyerpPSubmitOKBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(psubmitokbtn.isEnabled(),"psubmitokbtn is enabled");		 
			 Reporter.log("verifyMyerppsubmitokbtn", true);
			 psubmitokbtn.click(); 
		}
		public void VerifyandClickonPSearchbar1() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("BEYOND");
	    	  Thread.sleep(500);
	    	  }
		public void VerifyMyerpPEditBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(peditbtn.isEnabled(),"peditbtn is enabled");		 
			 Reporter.log("verifyMyerppeditbtn", true);
			 peditbtn.click(); 
		}
		public void VerifyMyerpPYesUpdateitBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(yesupdateitbtn.isEnabled(),"yesupdateitbtn is enabled");		 
			 Reporter.log("verifyMyerpyesupdateitbtn", true);
			 yesupdateitbtn.click(); 
		}
		public void VerifyMyerpPCategoryName2() throws InterruptedException {
 			Thread.sleep(500);
			 Assert.assertTrue(pcategoryname.isEnabled(),"pcategorynamefield is enabled");		 
			 Reporter.log("verifyMyerppcategoryname", true);
			 pcategoryname.click(); 
			 pcategoryname.sendKeys("BEY");
		}
		
		public void VerifyMyerpPUpdateBtn() throws InterruptedException {
			Thread.sleep(500);
	         Assert.assertTrue(updatebtn.isEnabled(),"updatebtn is enabled");		 
			 Reporter.log("verifyMyerppupdatebtn", true);
			 updatebtn.click(); 
		}
		public void VerifyMyerpPUpdateokBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(pupdatedok.isEnabled(),"pupdatedok is enabled");		 
			 Reporter.log("verifyMyerppupdatedok", true);
			 pupdatedok.click(); 
		}
		public void VerifyandClickonPSearchbar2() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("BEY");
	    	  Thread.sleep(500);
	    	  }
		public void VerifyMyerpPExportBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(pexportbtn.isEnabled(),"pexportbtn is enabled");		 
			 Reporter.log("verifyMyerppexportbtn", true);
			 pexportbtn.click(); 
		}
		public void VerifyMyerpPPagenav() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(ppagenav.isEnabled(),"ppagenav is enabled");		 
			 Reporter.log("verifyMyerpppagenav", true);
			 ppagenav.click(); 
			 Thread.sleep(500);
		}
}
