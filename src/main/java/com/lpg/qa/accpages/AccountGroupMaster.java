package com.lpg.qa.accpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
	
	public class AccountGroupMaster {
		private WebDriver driver;
		
		@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
		@FindBy (xpath="//input[@id='password-field']") private WebElement password;
		@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
		@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;  
		@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[2]/a") private WebElement accountmaster;
		@FindBy (xpath="//a[text()='Accounts Group Master']") private WebElement accountgroupmform;
		@FindBy (xpath="//input[@id='txtGroupDesc']") private WebElement agmgropdescription;
		@FindBy (xpath="//select[@id='ddlprimary_secondary']") private WebElement agmselectps;
		@FindBy (xpath="//select[@id='ddlType']") private WebElement agmselecttype; 
	    @FindBy (xpath="//select[@id='ddlEffects']") private WebElement agmselecteffect;
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement agmsavebtn;
		@FindBy (xpath="//button[@id='btnNew']") private WebElement agmnewbtn;
		@FindBy (xpath="//button[@id='btnExit']") private WebElement agmexitbtn;
		@FindBy (xpath="//button[@id='btnFind']") private WebElement agmfindbtn;
		@FindBy (xpath="//button[@id='btnclear']") private WebElement agmclearbtn;
		@FindBy (xpath="//a[@id='btnEdit']") private WebElement agmeditbtn;
		@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement agmyesupdateitbtn;
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement agmupdatebtn;
		@FindBy (xpath="//a[@id='btnEdit']") private WebElement agmupdateokbtn;
		@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement agmexportbtn;
		@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
		
		
		// initialization
		public AccountGroupMaster(WebDriver driver) {
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
			public void VerifyMyerpAccountGroupMasterForm() {
				 Assert.assertTrue(accountgroupmform.isEnabled(),"accountgroupmform form field is enabled");		 
				 Reporter.log("verifyMyerpaccountgroupmform", true);
				 accountgroupmform.click(); 
			}
			public void VerifyMyerpAccountGroupDescription() {
				 Assert.assertTrue(agmgropdescription.isEnabled(),"agmgropdescription form field is enabled");		 
				 Reporter.log("verifyMyerpagmgropdescription", true);
				 agmgropdescription.click(); 
				 agmgropdescription.sendKeys("Purchase charge");
			}
			public void AGMSelectPPrimaryandSecondary() throws InterruptedException {
				Select ps = new Select(agmselectps);
				Thread.sleep(1000);
				Assert.assertTrue(agmselectps.isDisplayed(),"agmselectps is displayed");
				Assert.assertFalse(agmselectps.isSelected());
				ps.selectByVisibleText("Primary");
			}
			public void AGMSelectType() throws InterruptedException {
				Select st = new Select(agmselecttype);
				Thread.sleep(1000);
				Assert.assertTrue(agmselecttype.isDisplayed(),"selectcompany is displayed");
				Assert.assertFalse(agmselecttype.isSelected());
				st.selectByVisibleText("Assets");
			}
			public void SelectAGMEffect() throws InterruptedException {
				Select se = new Select(agmselecteffect);
				Thread.sleep(1000);
				Assert.assertTrue(agmselecteffect.isDisplayed(),"selectcompany is displayed");
				Assert.assertFalse(agmselecteffect.isSelected());
				se.selectByVisibleText("Balance Sheet");
			}
			public void VerifyMyerpAMGClearBtn() {
				 Assert.assertTrue(agmclearbtn.isEnabled(),"agmclearbtn form field is enabled");		 
				 Reporter.log("verifyMyerpagmagmclearbtn", true);
				 agmclearbtn.click(); 
				
			}
			
			public void VerifyMyerpAMGSaveBtn() {
				 Assert.assertTrue(agmsavebtn.isEnabled(),"agmsavebtn form field is enabled");		 
				 Reporter.log("verifyMyerpagmsavebtn", true);
				 agmsavebtn.click(); 
				
			}
           public void VerifyMyepAletPopupOkbtn() throws InterruptedException {
				
				Thread.sleep(100);
			    Alert al = driver.switchTo().alert();
			    al.accept();
		    }
           public void VerifyandClickonPSearchbar1() throws InterruptedException {
		    	  Thread.sleep(500);
		    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp pcsearchbar", true);
		    	  pcsearchbar.click(); 
		    	  pcsearchbar.clear();
		    	  pcsearchbar.sendKeys("Swapna Infra");
		    	  
		    	  Thread.sleep(500);
		    	  }
			public void VerifyMyerpAMGNewBtn() {
				 Assert.assertTrue(agmnewbtn.isEnabled(),"agmnewbtn form field is enabled");		 
				 Reporter.log("verifyMyerpagmnewbtn", true);
				 agmnewbtn.click(); 
				
			}
			public void VerifyMyerpAMGExitBtn() {
				 Assert.assertTrue(agmexitbtn.isEnabled(),"agmexitbtnform field is enabled");		 
				 Reporter.log("verifyMyerpagmexitbtn", true);
				 agmexitbtn.click(); 
				
			}
			public void VerifyMyerpAMGFindBtn() {
				 Assert.assertTrue(agmfindbtn.isEnabled(),"agmfindbtn form field is enabled");		 
				 Reporter.log("verifyMyerpagmfindbtn", true);
				 agmfindbtn.click(); 
				
			}
			public void VerifyMyerpAGMEditBtn() {
				 Assert.assertTrue(agmeditbtn.isEnabled(),"agmeditbtn field is enabled");		 
				 Reporter.log("verifyMyerpagmeditbtn", true);
				 Assert.assertFalse(agmeditbtn.isSelected());
				 agmeditbtn.click(); 
			}
			public void VerifyMyerpAGMYesUpdateBtn() throws InterruptedException {
				Thread.sleep(100);
				 Assert.assertTrue(agmyesupdateitbtn.isEnabled(),"agmyesupdateitbtn field is enabled");		 
				 Reporter.log("verifyMyerpagmyesupdateitbtn", true);
				 Assert.assertFalse(agmyesupdateitbtn.isSelected());
				 agmyesupdateitbtn.click();
				 Thread.sleep(1000);
			}
			public void VerifyMyerpAccountGroupDescription1() {
				 Assert.assertTrue(agmgropdescription.isEnabled(),"agmgropdescription form field is enabled");		 
				 Reporter.log("verifyMyerpagmgropdescription", true);
				 agmgropdescription.click(); 
				 agmgropdescription.clear();
				 agmgropdescription.sendKeys("Vima charge");
			}
			public void AGMSelectPPrimaryandSecondary1() throws InterruptedException {
				Select ps = new Select(agmselectps);
				Thread.sleep(1000);
				Assert.assertTrue(agmselectps.isDisplayed(),"agmselectps is displayed");
				Assert.assertFalse(agmselectps.isSelected());
				ps.selectByVisibleText("Primary");
			}
			public void VerifyMyerpAGMUpdateBtn() throws InterruptedException {
				Thread.sleep(100);
				 Assert.assertTrue(agmupdatebtn.isEnabled(),"agmupdatebtn field is enabled");		 
				 Reporter.log("verifyMyerpagmupdatebtn", true);
				 Assert.assertFalse(agmupdatebtn.isSelected());
				 agmupdatebtn.click(); 
				 Thread.sleep(100);
			}
			public void VerifyMyerpAGMUpdateokBtn() throws InterruptedException {
				Thread.sleep(100);
				 Assert.assertTrue(agmupdateokbtn.isEnabled(),"agmupdateokbtn field is enabled");		 
				 Reporter.log("verifyMyerpagmupdateokbtn", true);
				 Assert.assertFalse(agmupdateokbtn.isSelected());
				 agmupdateokbtn.click(); 
			}
			public void VerifyMyerpAGLExportBtn() throws InterruptedException {
				Thread.sleep(100);
				 Assert.assertTrue(agmexportbtn.isEnabled(),"agmexportbtn field is enabled");		 
				 Reporter.log("verifyMyerpagmexportbtn", true);
				 Assert.assertFalse(agmexportbtn.isSelected());
				 agmexportbtn.click();
			}
	      
			public void VerifyandClickonPSearchbar2() throws InterruptedException {
		    	  Thread.sleep(500);
		    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp pcsearchbar", true);
		    	  pcsearchbar.click(); 
		    	  pcsearchbar.clear();
		    	  pcsearchbar.sendKeys("Vima charge");
		    	  
		    	  Thread.sleep(500);
		    	  }

			
			
			    
			
			
			
			  
}        
	
