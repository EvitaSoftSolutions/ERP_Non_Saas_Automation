package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class NewLedgers {
	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;  
	@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[2]/a") private WebElement accountmaster;
	@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[1]/td[2]/a") private WebElement newledgresform;
	@FindBy (xpath="//a[text()='Click Here...']") private WebElement nlclickhrebtn;
	@FindBy (xpath="//div[@id='bck']") private WebElement nlbackebtn;
	@FindBy (xpath="//a[text()='Click to download sample xls file']") private WebElement nlctdsxfiletext;
	@FindBy (xpath="//input[@class='filestyle']") private WebElement nlchoosefile;
	@FindBy (xpath="//button[@class='btn btn-primary waves-effect waves-light']") private WebElement nluploadbtn;
	@FindBy (xpath="//input[@id='txtNameOfLedger']") private WebElement nlnameofledger;
	@FindBy (xpath="//select[@id='ddlGroup']") private WebElement nlselectgroup;
	@FindBy (xpath="//input[@id='txtAlias']") private WebElement nlaliasname;
	@FindBy (xpath="//button[@id='btnClear']") private WebElement nlclearbtn;
	@FindBy (xpath="//button[@id='btnSave']") private WebElement nlsavebtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement nlsaveokbtn;
	@FindBy (xpath="//button[@id='btnGet']") private WebElement nlgetlist;
	@FindBy (xpath="//a[@id='btnEdit']") private WebElement nleditbtn;
	@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement nlyesupdatebtn;
	@FindBy (xpath="//*[@id=\"btnSave\"]") private WebElement nlupdatebtn;
	@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement nlupdateokbtn;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement nlexportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	
	
	// initialization
	public NewLedgers(WebDriver driver) {
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
		public void VerifyMyerpNewLedgersForm() {
			 Assert.assertTrue(newledgresform.isEnabled(),"newledgresform Module field is enabled");		 
			 Reporter.log("verifyMyerpnewledgresform", true);
			 newledgresform.click(); 
		}
		public void VerifyMyerpNewLedgersClickHereTextbtn() {
			 Assert.assertTrue(nlclickhrebtn.isEnabled(),"nlclickhrebtn Module field is enabled");		 
			 Reporter.log("verifyMyerpnlclickhrebtn", true);
			 nlclickhrebtn.click(); 
		}
		public void VerifyMyerpNewLedgersBackbtn() {
			 Assert.assertTrue(nlclickhrebtn.isEnabled(),"nlclickhrebtn Module field is enabled");		 
			 Reporter.log("verifyMyerpnlclickhrebtn", true);
			 nlclickhrebtn.click(); 
		}
		public void VerifyMyerpNLDXLSFILE() {
			 Assert.assertTrue(nlctdsxfiletext.isEnabled(),"nlctdsxfiletext Module field is enabled");		 
			 Reporter.log("verifyMyerpnlctdsxfiletext", true);
			 nlctdsxfiletext.click(); 
		}
		public void VerifyMyerpNLChooseFILE() {
			 Assert.assertTrue(nlchoosefile.isEnabled(),"nlchoosefile Module field is enabled");		 
			 Reporter.log("verifyMyerpnlchoosefile", true);
			 nlchoosefile.sendKeys("C:\\Users\\YOGESH\\Downloads\\SS.xlsx");
		}
		public void VerifyMyerpUploadBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nluploadbtn.isEnabled(),"nluploadbtn Module field is enabled");		 
			 Reporter.log("verifyMyerpnluploadbtn", true);
			 nluploadbtn.click();
		}
		public void VerifyMyerpNLNameOfLedgers() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nlnameofledger.isEnabled(),"nlnameofledger Module field is enabled");		 
			 Reporter.log("verifyMyerpnlnameofledger", true);
			 nlnameofledger.click();
			 nlnameofledger.sendKeys("Raju 5001");
			 
		}
		public void NLSelectGroup() throws InterruptedException {
			Select sc = new Select(nlselectgroup);
			Thread.sleep(1000);
			Assert.assertFalse(nlselectgroup.isDisplayed(),"nlselectgroup is displayed");
			Assert.assertFalse(nlselectgroup.isSelected());
			sc.selectByVisibleText("CURRENT ASSETS");
		}
		public void VerifyMyerpNLAliasOfLedgers() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nlaliasname.isEnabled(),"nlaliasname field is enabled");		 
			 Reporter.log("verifyMyerpnlaliasname", true);
			 nlaliasname.click();
			 nlaliasname.sendKeys("Raju 5001");
			 
		}
		public void VerifyMyerClearBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nlclearbtn.isEnabled(),"nlclearbtn field is enabled");		 
			 Reporter.log("verifyMyerpnlclearbtn", true);
			 nlclearbtn.click();
		}
		public void VerifyMyerNLSaveBtn() throws InterruptedException {
			Thread.sleep(400);
			 Assert.assertTrue(nlsavebtn.isEnabled(),"nlsavebtn field is enabled");		 
			 Reporter.log("verifyMyerpnlsavebtn", true);
			 nlsavebtn.click();
		}
		public void VerifyMyerpNLSaveOKBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nlsaveokbtn.isEnabled(),"nlsaveokbtn  field is enabled");		 
			 Reporter.log("verifyMyerpnlsaveokbtn", true);
			 nlsaveokbtn.click();
		}
		public void VerifyandClickonPSearchbar() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("Raju 5001");
	    	  
	    	  Thread.sleep(500);
	    	  }
		public void VerifyMyerpNLGetListBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nlgetlist.isEnabled(),"nlgetlist  field is enabled");		 
			 Reporter.log("verifyMyerpnlgetlist", true);
			 nlgetlist.click();
			
		}
		
		public void VerifyMyerpNLEditBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nleditbtn.isEnabled(),"nleditbtn field is enabled");		 
			 Reporter.log("verifyMyerpnleditbtn", true);
			 Assert.assertFalse(nleditbtn.isSelected());
			 nleditbtn.click(); 
		}
		public void VerifyMyerpNLYesUpdateBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nlyesupdatebtn.isEnabled(),"nlyesupdatebtn field is enabled");		 
			 Reporter.log("verifyMyerpnlyesupdatebtn", true);
			 Assert.assertFalse(nlyesupdatebtn.isSelected());
			 nlyesupdatebtn.click();
			 Thread.sleep(1000);
		}

public void VerifyMyerpNLNameOfLedgers1() throws InterruptedException {
	Thread.sleep(500);
	 Assert.assertTrue(nlnameofledger.isEnabled(),"nlnameofledger Module field is enabled");		 
	 Reporter.log("verifyMyerpnlnameofledger", true);
	 nlnameofledger.click();
	 nlnameofledger.clear();
	 nlnameofledger.sendKeys("PEET 4012");
	 
}
		public void VerifyMyerpNLUpdateBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nlupdatebtn.isEnabled(),"nlupdatebtn field is enabled");		 
			 Reporter.log("verifyMyerpnlupdatebtn", true);
			 Assert.assertFalse(nlupdatebtn.isSelected());
			 nlupdatebtn.click(); 
			 Thread.sleep(100);
		}
		public void VerifyMyerpNLUpdateokBtn() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nlupdateokbtn.isEnabled(),"nlupdateokbtn field is enabled");		 
			 Reporter.log("verifyMyerpnlupdateokbtn", true);
			 Assert.assertFalse(nlupdateokbtn.isSelected());
			 nlupdateokbtn.click(); 
		}
		public void VerifyMyerpNLExportBtn() throws InterruptedException {
			Thread.sleep(100);
			 Assert.assertTrue(nlexportbtn.isEnabled(),"nlexportbtn field is enabled");		 
			 Reporter.log("verifyMyerpnlexportbtn", true);
			 Assert.assertFalse(nlexportbtn.isSelected());
		}
		public void VerifyandClickonPSearchbar2() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("PEET 4012");
	    	  
	    	  Thread.sleep(500);
	    	  }
		
}         

