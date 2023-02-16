package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class BillingTypeForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::ul/child::li[2]/a")private WebElement accountmaster;
	@FindBy(xpath="//a[text()='Billing Type Master']")private WebElement billingtyp;
	@FindBy(xpath="//input[@id='txtBillingType']")private WebElement typename;
	@FindBy(xpath="//input[@id='txtNoOfDays']")private WebElement nooftype;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement checkactive;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement btnclear;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbutton;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbutton;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy (xpath="//button[@class='confirm']") private WebElement cpupdateokbtn;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement  cpexportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar; 
	
	
	//initialization
		public BillingTypeForm(WebDriver driver) {
			PageFactory.initElements(driver,this);
			}

	//usage
		
		public void verifyMyerpagancycode() {
			Assert.assertTrue(agancycode.isEnabled(),"agancycode find is enable");
			Reporter.log("verifyMyerpagancycode",true);
			agancycode.sendKeys("ERP_00001");
			
		}
		public void verifyMyerpusrname() {
			Assert.assertTrue(userid.isEnabled(),"username find is enable");
			Reporter.log("verifyMyerpUserid",true);
			userid.sendKeys("admin");
		}
		public void verifyMyerppassword() {
			Assert.assertTrue(password.isEnabled(),"password find is enable");
			Reporter.log("verifyMyerppassword",true);
			password.sendKeys("admin@123");
		}
		public void verifyMyerploginbtn() {
			Assert.assertTrue(login.isEnabled(),"loginbtn is enable");
			Reporter.log("verifyMyerplogin",true);
			login.click();
		}
		public void verifyMyerpMaster() {
			Assert.assertTrue(master.isEnabled(),"Master is enable");
			Reporter.log("verifyMyerpmaster",true);
			master.click();
		}
		public void verifyMyerpAccountMaster() {
			Assert.assertTrue(accountmaster.isEnabled(),"AccountMaster is enable");
			Reporter.log("verifyMyerpaccountmaster",true);
			accountmaster.click();
		}
		public void verifyMyerpBillingType() {
			Assert.assertTrue(billingtyp.isEnabled(),"BillingType is enable");
			Reporter.log("verifyMyerpbillingtyp",true);
			billingtyp.click();
		}
		public void verifyMyerpTypeName() {
			Assert.assertTrue(typename.isEnabled(),"TypeName is enable");
			Reporter.log("verifyMyerptypename",true);
			typename.sendKeys("Eight Days");
		}
		public void verifyMyerpNoofType() {
			Assert.assertTrue(nooftype.isEnabled(),"NoofType is enable");
			Reporter.log("verifyMyerpnooftype",true);
			nooftype.sendKeys("12");
		}
		public void verifyMyerpCheckActive() {
			Assert.assertTrue(checkactive.isEnabled(),"CheckActive is enable");
			Reporter.log("verifyMyerpcheckactive",true);
			checkactive.click();
		}
		public void verifyMyerpButtonclear() {
			Assert.assertTrue(btnclear.isEnabled(),"Buttonclear is enable");
			Reporter.log("verifyMyerpbtnclear",true);
			btnclear.click();
		}
		public void verifyMyerpTypeName1() {
			Assert.assertTrue(typename.isEnabled(),"TypeName is enable");
			Reporter.log("verifyMyerptypename",true);
			typename.sendKeys("Eight Days");
		}
		public void verifyMyerpNoofType1() {
			Assert.assertTrue(nooftype.isEnabled(),"NoofType is enable");
			Reporter.log("verifyMyerpnooftype",true);
			nooftype.sendKeys("12");
		}
		public void verifyMyerpCheckActive1() {
			Assert.assertTrue(checkactive.isEnabled(),"CheckActive is enable");
			Reporter.log("verifyMyerpcheckactive",true);
			checkactive.click();
		}
		public void verifyMyerpSubmitbutton() {
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbutton is enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
		}
		public void verifyMyerpOkButton() {
			Assert.assertTrue(okbutton.isEnabled(),"OkButton is enable");
			Reporter.log("verifyMyerpokbutton",true);
			okbutton.click();
		}
		public void VerifyandClickonPSearchbar1() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("Eight Days");
	    	  
	    	 }
		public void verifyMyerpEditButton() {
			Assert.assertTrue(editbutton.isEnabled(),"EditButton is enable");
			Reporter.log("verifyMyerpeditbutton",true);
			editbutton.click();
		}
		public void verifyMyerpConfirmBtn() {
			Assert.assertTrue(confirmbtn.isEnabled(),"ConfirmBtn is enable");
			Reporter.log("verifyMyerpconfirmbtn",true);
			confirmbtn.click();
		}
		public void verifyMyerpTypeName2() {
			Assert.assertTrue(typename.isEnabled(),"TypeName is enable");
			Reporter.log("verifyMyerptypename",true);
			typename.clear();
			typename.sendKeys("Seven Days");
		}
		public void verifyMyerpNoofType2() {
			Assert.assertTrue(nooftype.isEnabled(),"NoofType is enable");
			Reporter.log("verifyMyerpnooftype",true);
			nooftype.clear();
			nooftype.sendKeys("7");
		}
		
		public void verifyMyerpCheckActive2() {
			Assert.assertTrue(checkactive.isEnabled(),"CheckActive is enable");
			Reporter.log("verifyMyerpcheckactive",true);
			checkactive.click();
		}
		public void verifyMyerpUpdateBtn() {
			Assert.assertTrue(updatebtn.isEnabled(),"UpdateBtn is enable");
			Reporter.log("verifyMyerpupdatebtn",true);
			updatebtn.click();
		}
		public void verifyMyerpOkButton1() {
			Assert.assertTrue(okbutton.isEnabled(),"OkButton is enable");
			Reporter.log("verifyMyerpokbutton",true);
			okbutton.click();
		}

		public void VerifyMyerpCPUpdateokBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(cpupdateokbtn.isEnabled(),"cpupdateokbtn field is enabled");		 
			 Reporter.log("verifyMyerpcpupdateokbtn", true);
			 Assert.assertFalse(cpupdateokbtn.isSelected());
			 cpupdateokbtn.click(); 
		}
		public void VerifyMyerpTExportBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(cpexportbtn.isEnabled(),"cpexportbtn field is enabled");		 
			 Reporter.log("verifyMyerpcpexportbtn", true);
			 Assert.assertFalse(cpexportbtn.isSelected());
			 cpexportbtn.click();
		}
		public void VerifyandClickonPSearchbar3() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("Seven Days");
	    	  
	    	 }


}
