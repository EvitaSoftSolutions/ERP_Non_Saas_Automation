
package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CommercialDiscountPackage {

	
	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
	@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;
	@FindBy (xpath="//a[text()='Next']") private WebElement cdppagenav1;
	@FindBy (xpath="//a[text()='Next']") private WebElement cdppagenav2;
	@FindBy (xpath="//a[text()='Commercial Discount Package']") private WebElement cdpform;
	@FindBy (xpath="//input[@id='txtDiscountPackageName']") private WebElement cdpname;
	@FindBy (xpath="//input[@id='txtDiscription']") private WebElement cdpdesc;
	@FindBy (xpath="//input[@id='txtDiscountAmt']") private WebElement cdpamount;
	@FindBy (xpath="//button[@id='btnclear']") private WebElement cdpclearbtn;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement cdpsubmitbtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement cdpsubmitokbtn;
	@FindBy (xpath="//a[@id='btnEdit']") private WebElement cdpebtnedit;
	@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement cdpbtnyesupdateit;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement cdpupdatebtn;
	@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement cdpupdateokbtn;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement cdpbtnexport;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar; 
	
	

	// initialization
	public CommercialDiscountPackage(WebDriver driver) {
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
		public void VerifyMyerpGenralMasterModule() {
			 Assert.assertTrue(genralmaster.isEnabled(),"GenralMaster Module field is enabled");		 
			 Reporter.log("verifyMyerpGenralMasterModule", true);
			 genralmaster.click(); 
		}
	
		public void VerifyGenralMasterPageNavigation1() {
			 Assert.assertTrue(cdppagenav1.isEnabled(),"cdppagenav1 is enabled");
			 Reporter.log(" verifyMyerpcdppagenav1", true);
			 cdppagenav1.click();
		}
		public void VerifyGenralMasterPageNavigation2() {
			 Assert.assertTrue(cdppagenav1.isEnabled(),"cdppagenav1 is enabled");
			 Reporter.log(" verifyMyerpcdppagenav1", true);
			 cdppagenav1.click();
		}
		public void VerifyCommercialDiscountPackageForm() {
			 Assert.assertTrue(cdpform.isEnabled(),"cdpformbtn is enabled");
			 Reporter.log(" verifyMyerpcdpform", true);
			 cdpform.click();
		}
		public void VerifyCommercialDiscountPackageName() {
			 Assert.assertTrue(cdpname.isEnabled(),"cdpname is enabled");
			 Reporter.log(" verifyMyerpcdpname", true);
			 cdpname.click();
			 cdpname.sendKeys("HOLI OFFER");
			 
		}
		public void VerifyCommercialDPDiscription() {
			 Assert.assertTrue(cdpdesc.isEnabled(),"cdpdesc is enabled");
			 Reporter.log(" verifyMyerpcdpdesc", true);
			 cdpdesc.click();
			 cdpdesc.sendKeys("HF");
			 
		}
		public void VerifyCommercialDAmount() {
			 Assert.assertTrue(cdpamount.isEnabled(),"cdpamount is enabled");
			 Reporter.log(" verifyMyerp cdpamount", true);
			 cdpamount.click();
			 cdpamount.sendKeys("10");
		}
		public void VerifyCommercialDPClearBtn() {
			 Assert.assertTrue(cdpclearbtn.isEnabled(),"cdpclearbtn is enabled");
			 Reporter.log(" verifyMyerpcdpclearbtn", true);
			 cdpclearbtn.click();
		}
		public void VerifyCommercialDiscountPackageName1() {
			 Assert.assertTrue(cdpname.isEnabled(),"cdpname is enabled");
			 Reporter.log(" verifyMyerpcdpname", true);
			 cdpname.click();
			 cdpname.sendKeys("HOLI OFFER");
			 
		}
		public void VerifyCommercialDPDiscription1() {
			 Assert.assertTrue(cdpdesc.isEnabled(),"cdpdesc is enabled");
			 Reporter.log(" verifyMyerpcdpdesc", true);
			 cdpdesc.click();
			 cdpdesc.sendKeys("HF");
			 
		}
		public void VerifyCommercialDAmount1() {
			 Assert.assertTrue(cdpamount.isEnabled(),"cdpamount is enabled");
			 Reporter.log(" verifyMyerp cdpamount", true);
			 cdpamount.click();
			 cdpamount.sendKeys("10");
		}
		public void VerifyCommercialSubmitBtn() {
	        Assert.assertTrue(cdpsubmitbtn.isEnabled(),"cdpsubmitbtn is enabled");
	        Reporter.log(" verifyMyerpcdpsubmitbtn", true);
	        cdpsubmitbtn.click();
        }
		public void VerifyCommercialSubmitOKBtn() throws InterruptedException {
			Thread.sleep(500);
	        Assert.assertTrue(cdpsubmitokbtn.isEnabled(),"cdpsubmitokbtn is enabled");
	        Reporter.log(" verifyMyerpcdpsubmitokbtn", true);
	        cdpsubmitokbtn.click();
        }
		public void VerifyandClickonPSearchbar1() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("HOLI OFFER");
	    	  
	    	  Thread.sleep(500);
	    	  }
		public void VerifyCDPEditBtn() throws InterruptedException {
			Thread.sleep(500);
	        Assert.assertTrue(cdpebtnedit.isEnabled(),"cdpebtnedit is enabled");
	        Reporter.log(" verifyMyerpcdpebtnedit", true);
	        cdpebtnedit.click();
        }
		public void VerifyCDPYesUpdateItBtn() throws InterruptedException {
			Thread.sleep(500);
	        Assert.assertTrue(cdpbtnyesupdateit.isEnabled(),"cdpbtnyesupdateit is enabled");
	        Reporter.log(" verifyMyerpcdpbtnyesupdateit", true);
	        cdpbtnyesupdateit.click();
        }
		public void VerifyCommercialDiscountPackageName2() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(cdpname.isEnabled(),"cdpname is enabled");
			 Reporter.log(" verifyMyerpcdpname", true);
			 cdpname.click();
			 cdpname.clear();
			 cdpname.sendKeys("Diwali OFFER");
			 
		}
		public void VerifyCommercialDPDiscription2() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(cdpdesc.isEnabled(),"cdpdesc is enabled");
			 Reporter.log(" verifyMyerpcdpdesc", true);
			 cdpdesc.click();
			 cdpdesc.clear();
			 cdpdesc.sendKeys("DF");
			 
		}
		public void VerifyCDPUpdateBtn() throws InterruptedException {
			Thread.sleep(500);
	        Assert.assertTrue(cdpupdatebtn.isEnabled(),"cdpupdatebtn is enabled");
	        Reporter.log(" verifyMyerpcdpupdatebtn", true);
	        cdpupdatebtn.click();
        }
		public void VerifyCDPUpdateOKBtn() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(cdpupdateokbtn.isEnabled(),"cdpupdateokbtnis enabled");
	        Reporter.log(" verifyMyerpcdpupdateokbtn", true);
	        		cdpupdateokbtn.click();
        }
		public void VerifyExportBtn() throws InterruptedException {
			Thread.sleep(1000);
	        Assert.assertTrue(cdpbtnexport.isEnabled(),"cdpbtnexport is enabled");
	        Reporter.log(" verifyMyerpcdpbtnexport", true);
	        cdpbtnexport.click();
        }
		public void VerifyandClickonPSearchbar2() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("DF");
	    	  
	    	  Thread.sleep(500);
	    	  }
        
}
