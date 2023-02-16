package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class AddCompany {
		@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
		@FindBy (xpath="//input[@id='password-field']") private WebElement password;
		@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
		@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;  
		@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[2]/a") private WebElement accountmaster;
		@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[5]/td[2]/a") private WebElement addcompanyform; 
		@FindBy (xpath="//input[@id='txtFirstName']") private WebElement acfirstname;
		@FindBy (xpath="//input[@id='txtLastName']") private WebElement aclastname;
		@FindBy (xpath="//input[@id='txtOwnerContact']") private WebElement acocontanctnumber;
		@FindBy (xpath="//input[@id='txtOwnerEmail']") private WebElement accoemail;
		@FindBy (xpath="//input[@id='txtCompanyName']") private WebElement accompanyname;
		@FindBy (xpath="//input[@id='txtCompanyCode']") private WebElement accompanycode;
		@FindBy (xpath="//input[@id='txtCity']") private WebElement accity;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement acemail;
		@FindBy (xpath="//input[@id='txtContact1']") private WebElement accontanctnum1;
		@FindBy (xpath="//input[@id='txtAddress_1']") private WebElement acaddress1;
		@FindBy (xpath="//input[@id='txtPAN_Number']") private WebElement acpannumber;
		@FindBy (xpath="//input[@id='txtGSTIN_Number']") private WebElement acgstinnumber;
		@FindBy (xpath="//input[@id='chkActive']") private WebElement acactivechkbtn;
		@FindBy (xpath="//button[@id='btnclear']") private WebElement acclearbtn;
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement acsubmitbtn;
		@FindBy (xpath="//button[text()='OK']") private WebElement acsubmitokbtn;
		@FindBy (xpath="//a[@id='btnEdit']") private WebElement aceditbtn;
		@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement acyesupdatebtn;
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement acupdatebtn;
		@FindBy (xpath="//button[text()='OK']") private WebElement acupdateokbtn;
		@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement acexportbtn;
		@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
		
		// initialization
		public AddCompany(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

			// usage
			public void VerifyandClickonMyerpLoginwithoutBtn1() {
				 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
				 Assert.assertEquals("please enter valid agancycode","please enter valid userid","please enter valid password");
				 Reporter.log(" verifyMyerplogin",true);
				login.click();
			}
			
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
			public void VerifyMyerpAccountMasterModule() {
				 Assert.assertTrue(accountmaster.isEnabled(),"accountmaster Module field is enabled");		 
				 Reporter.log("verifyMyerpaccountmaster", true);
				 accountmaster.click(); 
			}
			public void VerifyMyerpAddCompanyForm() {
				 Assert.assertTrue(addcompanyform.isEnabled(),"addcompanyform field is enabled");		 
				 Reporter.log("verifyMyerpaddcompanyform", true);
				 addcompanyform.click(); 
			}
			
			public void VerifyMyerpACFirstName() {
				 Assert.assertTrue(acfirstname.isEnabled(),"acfirstname  field is enabled");		 
				 Reporter.log("verifyMyerpacfirstname", true);
				 acfirstname.click(); 
				 acfirstname.sendKeys("Maya");
			}
			public void VerifyMyerpACLastName() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(aclastname.isEnabled(),"aclastname  field is enabled");		 
				 Reporter.log("verifyMyerpaclastname", true);
				 aclastname.click(); 
				 aclastname.sendKeys("Patil");
			}
			public void VerifyMyerpACOContanctNumber() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(acocontanctnumber.isEnabled(),"acocontanctnumber  field is enabled");		 
				 Reporter.log("verifyMyerpacocontanctnumber", true);
				 acocontanctnumber.click(); 
				 acocontanctnumber.sendKeys("8889455456");
			}
			
			public void VerifyMyerpACOEmail() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(accoemail.isEnabled(),"accoemail field is enabled");		 
				 Reporter.log("verifyMyerpaccoemail", true);
				 accoemail.click(); 
				 accoemail.sendKeys("mayamote90@gmail.com");
			}
			public void VerifyMyerpACCompanyName() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(accompanyname.isEnabled(),"accompanyname field is enabled");		 
				 Reporter.log("verifyMyerpaccompanyname", true);
				 accompanyname.click(); 
				 accompanyname.sendKeys("Anita New Gas");
			}
			public void VerifyMyerpACCompanyCode() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(accompanycode.isEnabled(),"accompanycode field is enabled");		 
				 Reporter.log("verifyMyerpaccompanycode", true);
				 accompanycode.click(); 
				 accompanycode.sendKeys("1022");
			}
			public void VerifyMyerpACCity() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(accity.isEnabled(),"accity field is enabled");		 
				 Reporter.log("verifyMyerpaccity", true);
				 accity.click(); 
				 accity.sendKeys("Pune");
			}
			public void VerifyMyerpACEmail() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(acemail.isEnabled(),"acemail field is enabled");		 
				 Reporter.log("verifyMyerpacemail", true);
				 acemail.click(); 
				 acemail.sendKeys("mayamote90@gmail.com");
			}
			public void VerifyMyerpACContanctNum1() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(accontanctnum1.isEnabled(),"accontanctnum1 field is enabled");		 
				 Reporter.log("verifyMyerpaccontanctnum1", true);
				 accontanctnum1.click(); 
				 accontanctnum1.sendKeys("9881637862");
			}
			public void VerifyMyerpACAddress1() {
				 Assert.assertTrue(acaddress1.isEnabled(),"acaddress1 field is enabled");		 
				 Reporter.log("verifyMyerpacaddress1", true);
				 acaddress1.click(); 
				 acaddress1.sendKeys("Pune");
			}
			public void VerifyMyerpACPanNumber() {
				 Assert.assertTrue(acpannumber.isEnabled(),"acpannumber field is enabled");		 
				 Reporter.log("verifyMyerpacpannumber", true);
				 acpannumber.click(); 
				 acpannumber.sendKeys("PSSQ562333");
			}
			public void VerifyMyerpACGSTINNumber() {
				 Assert.assertTrue(acgstinnumber.isEnabled(),"acgstinnumber field is enabled");		 
				 Reporter.log("verifyMyerpacgstinnumber", true);
				 acgstinnumber.click(); 
				 acgstinnumber.sendKeys("fghkgj5688888888888");
			}
			
		
			public void VerifyACActiveCHKBtn() {
				 Assert.assertTrue(acactivechkbtn.isEnabled(),"acactivechkbtn btn is enabled");
				 Reporter.log(" verifyMyerpacactivechkbtn", true);
				 acactivechkbtn.click();
			}
			
			public void VerifyMyerpBClearBtn() {
				 Assert.assertTrue(acclearbtn.isEnabled(),"acclearbtn form field is enabled");		 
				 Reporter.log("verifyMyerpacclearbtn", true);
				 acclearbtn.click(); 
				
			}
			
			public void VerifyMyerpACSubmitBtn() {
				 Assert.assertTrue(acsubmitbtn.isEnabled(),"acsubmitbtn form field is enabled");		 
				 Reporter.log("verifyMyerpacsubmitbtn", true);
				 acsubmitbtn.click();
			}
			public void VerifyMyerpACSubmitOKBtn() {
				 Assert.assertTrue(acsubmitokbtn.isEnabled(),"acsubmitokbtn form field is enabled");		 
				 Reporter.log("verifyMyerpacsubmitokbtn", true);
				 acsubmitokbtn.click(); 
			}
			public void VerifyandClickonPSearchbar1() throws InterruptedException {
		    	  Thread.sleep(500);
		    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp pcsearchbar", true);
		    	  pcsearchbar.click(); 
		    	  pcsearchbar.clear();
		    	  pcsearchbar.sendKeys("Maya Patil");
		    	  
		    	  Thread.sleep(500);
		    	  }
			
			public void VerifyMyerACBEditBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(aceditbtn.isEnabled(),"aceditbtn field is enabled");		 
				 Reporter.log("verifyMyerpaceditbtn", true);
				 Assert.assertFalse(aceditbtn.isSelected());
				 aceditbtn.click(); 
			}
			public void VerifyMyerpACYesUpdateBtn() throws InterruptedException {
				Thread.sleep(700);
				 Assert.assertTrue(acyesupdatebtn.isEnabled(),"acyesupdatebtn field is enabled");		 
				 Reporter.log("verifyMyerpacyesupdatebtn", true);
				 Assert.assertFalse(acyesupdatebtn.isSelected());
				 acyesupdatebtn.click();
				
			}
			public void VerifyMyerpACCompanyName2() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(accompanyname.isEnabled(),"accompanyname field is enabled");		 
				 Reporter.log("verifyMyerpaccompanyname", true);
				 accompanyname.click(); 
				 accompanyname.clear();
				 accompanyname.sendKeys("Swapna Infra");
			}
			public void VerifyMyerpACCompanyCode2() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(accompanycode.isEnabled(),"accompanycode field is enabled");		 
				 Reporter.log("verifyMyerpaccompanycode", true);
				 accompanycode.click(); 
				 accompanycode.clear();
				 accompanycode.sendKeys("10287");
			}
			public void VerifyMyerpACUpdateBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(acupdatebtn.isEnabled(),"acupdatebtn field is enabled");		 
				 Reporter.log("verifyMyerpacupdatebtn", true);
				 Assert.assertFalse(acupdatebtn.isSelected());
				 acupdatebtn.click(); 
			}
			public void VerifyMyerpACUpdateokBtn() throws InterruptedException {
				Thread.sleep(100);
				 Assert.assertTrue(acupdateokbtn.isEnabled(),"acupdateokbtn field is enabled");		 
				 Reporter.log("verifyMyerpacupdateokbtn", true);
				 Assert.assertFalse(acupdateokbtn.isSelected());
				 acupdateokbtn.click(); 
			}
			public void VerifyMyerpACExportBtn() throws InterruptedException {
				Thread.sleep(200);
				 Assert.assertTrue(acexportbtn.isEnabled(),"acexportbtn field is enabled");		 
				 Reporter.log("verifyMyerpacexportbtn", true);
				 Assert.assertFalse(acexportbtn.isSelected());
				 acexportbtn.click();
			}
			public void VerifyandClickonPSearchbar2() throws InterruptedException {
		    	  Thread.sleep(500);
		    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp pcsearchbar", true);
		    	  pcsearchbar.click(); 
		    	  pcsearchbar.clear();
		    	  pcsearchbar.sendKeys("Swapna Infra");
		    	  
		    	  Thread.sleep(500);
		    	  }
			
	      

			
}
