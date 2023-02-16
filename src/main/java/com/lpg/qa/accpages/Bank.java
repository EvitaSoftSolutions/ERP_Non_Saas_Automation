package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

	public class Bank {
		@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
		@FindBy (xpath="//input[@id='password-field']") private WebElement password;
		@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
		@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;  
		@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[2]/a") private WebElement accountmaster;
		@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[4]/td[2]/a") private WebElement bankform; 
		@FindBy (xpath="//select[@id='ddlUnderGroup']") private WebElement selectundergroup;
		@FindBy (xpath="//input[@id='txtBank_Code']") private WebElement bankcode;
		@FindBy (xpath="//input[@id='txtDescription']") private WebElement bdescription;
		@FindBy (xpath="//input[@id='txtAccountCode']") private WebElement baccountnumber;
		@FindBy (xpath="//select[@id='ddlAccountType']") private WebElement bsaccounttype;
		@FindBy (xpath="//select[@id='ddlCompanyID']") private WebElement bselectcompany;
		@FindBy (xpath="//input[@id='txtAlias']") private WebElement baliasname;
		@FindBy (xpath="//input[@id='chkActive']") private WebElement bactivechkbtn;
		@FindBy (xpath="//button[@id='btnclear']") private WebElement bcleartbtn;
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement bsubmitbtn;
		@FindBy (xpath="//button[text()='OK']") private WebElement bsubmitokbtn;
		@FindBy (xpath="//a[@id='btnEdit']") private WebElement beditbtn;
		@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement byesupdatebtn;
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement bupdatebtn;
		@FindBy (xpath="//button[text()='OK']") private WebElement bupdateokbtn;
		@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement bexportbtn;
		@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	
		
		// initialization
		public Bank(WebDriver driver) {
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
			public void VerifyMyerpBankForm() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(bankform.isEnabled(),"bankform Module field is enabled");		 
				 Reporter.log("verifyMyerpbankform", true);
				 bankform.click(); 
			}
			public void BankSelectUnderGroup() throws InterruptedException {
				Select bsug = new Select(selectundergroup);
				Thread.sleep(500);
				Assert.assertFalse(selectundergroup.isDisplayed(),"selectundergroup is displayed");
				Assert.assertFalse(selectundergroup.isSelected());
				bsug.selectByVisibleText("CASH IN HAND");
			}
			public void VerifyMyerpBankCode() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(bankcode.isEnabled(),"bankcode  field is enabled");		 
				 Reporter.log("verifyMyerpbankcode", true);
				 bankcode.click(); 
				 bankcode.sendKeys("40014");
			}
			public void VerifyMyerpBankDescripption() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(bdescription.isEnabled(),"bdescription  field is enabled");		 
				 Reporter.log("verifyMyerpbdescription", true);
				 bdescription.click(); 
				 bdescription.sendKeys("SS BANK");
			}
			public void VerifyMyerpBankAccNumber() throws InterruptedException {
				Thread.sleep(500);
				Assert.assertTrue(baccountnumber.isEnabled(),"baccountnumber  field is enabled");		 
				 Reporter.log("verifyMyerpbaccountnumber", true);
				 baccountnumber.click(); 
				 baccountnumber.sendKeys("BKID1435678900908689");
			}
			public void BankSelectAccountType() throws InterruptedException {
				Select bsat = new Select(bsaccounttype);
				Thread.sleep(500);
				Assert.assertFalse(bsaccounttype.isDisplayed(),"bsaccounttype is displayed");
				Assert.assertFalse(bsaccounttype.isSelected());
				bsat.selectByVisibleText("Current");
			}
			public void BankSelectCompany() throws InterruptedException {
				Select bsug = new Select(bselectcompany);
				Thread.sleep(500);
				Assert.assertFalse(bselectcompany.isDisplayed(),"bselectcompany is displayed");
				Assert.assertFalse(bselectcompany.isSelected());
				bsug.selectByVisibleText("ANITA GAS SERVICES");
			}
			public void VerifyMyerpBankAlias() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(baliasname.isEnabled(),"baliasname field is enabled");		 
				 Reporter.log("verifyMyerpbaliasname", true);
				 baliasname.click(); 
				 baliasname.sendKeys("SS BANK");
			}
			public void VerifyBankActiveCHKBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(bactivechkbtn.isEnabled(),"bactivechk btn is enabled");
				 Reporter.log(" verifyMyerpbactivechkbtn", true);
				 bactivechkbtn.click();
			}
			
			public void VerifyMyerpBClearBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(bcleartbtn.isEnabled(),"bcleartbtn form field is enabled");		 
				 Reporter.log("verifyMyerpbcleartbtn", true);
				 bcleartbtn.click(); 
				
			}
			
			public void VerifyMyerpBSubmitBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(bsubmitbtn.isEnabled(),"bsubmitbtn form field is enabled");		 
				 Reporter.log("verifyMyerpbsubmitbtn", true);
				 bsubmitbtn.click();
			}
			public void VerifyMyerpBSubmitOKBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(bsubmitokbtn.isEnabled(),"bsubmitokbtn form field is enabled");		 
				 Reporter.log("verifyMyerpbsubmitokbtn", true);
				 bsubmitokbtn.click(); 
			}
			public void VerifyandClickonPSearchbar1() throws InterruptedException {
		    	  Thread.sleep(500);
		    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp pcsearchbar", true);
		    	  pcsearchbar.click(); 
		    	  pcsearchbar.clear();
		    	  pcsearchbar.sendKeys("SS BANK");
		    	  
		    	  Thread.sleep(500);
		    	  }
			public void VerifyMyerpBEditBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(beditbtn.isEnabled(),"beditbtn field is enabled");		 
				 Reporter.log("verifyMyerpbeditbtn", true);
				 Assert.assertFalse(beditbtn.isSelected());
				 beditbtn.click(); 
			}
			public void VerifyMyerpBYesUpdateBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(byesupdatebtn.isEnabled(),"byesupdatebtn field is enabled");		 
				 Reporter.log("verifyMyerpbyesupdatebtn", true);
				 Assert.assertFalse(byesupdatebtn.isSelected());
				 byesupdatebtn.click();
				 Thread.sleep(1000);
			}
			public void VerifyMyerpBankCode1() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(bankcode.isEnabled(),"bankcode  field is enabled");		 
				 Reporter.log("verifyMyerpbankcode", true);
				 bankcode.click(); 
				 bankcode.clear();
				 bankcode.sendKeys("40034");
			}
			public void VerifyMyerpBankDescripption1() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(bdescription.isEnabled(),"bdescription  field is enabled");		 
				 Reporter.log("verifyMyerpbdescription", true);
				 bdescription.click(); 
				 bdescription.clear();
				 bdescription.sendKeys("SS BANK");
			}
			public void VerifyMyerpBUpdateBtn() throws InterruptedException {
				Thread.sleep(400);
				 Assert.assertTrue(bupdatebtn.isEnabled(),"bupdatebtn field is enabled");		 
				 Reporter.log("verifyMyerpbupdatebtn", true);
				 Assert.assertFalse(bupdatebtn.isSelected());
				 bupdatebtn.click(); 
				 Thread.sleep(100);
			}
			public void VerifyMyerpBUpdateokBtn() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(bupdateokbtn.isEnabled(),"bupdateokbtn field is enabled");		 
				 Reporter.log("verifyMyerpbupdateokbtn", true);
				 Assert.assertFalse(bupdateokbtn.isSelected());
				 bupdateokbtn.click(); 
			}
			public void VerifyMyerpBExportBtn() throws InterruptedException {
				Thread.sleep(600);
				 Assert.assertTrue(bexportbtn.isEnabled(),"bexportbtn field is enabled");		 
				 Reporter.log("verifyMyerpbexportbtn", true);
				 Assert.assertFalse(bexportbtn.isSelected());
				 bexportbtn.click();
			}
			
			public void VerifyandClickonPSearchbar2() throws InterruptedException {
		    	  Thread.sleep(500);
		    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp pcsearchbar", true);
		    	  pcsearchbar.click(); 
		    	  pcsearchbar.clear();
		    	  pcsearchbar.sendKeys("40034");
		    	  
		    	  Thread.sleep(500);
		    	  }

	      

			
}
