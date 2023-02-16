package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

	public class Designation {
		
		@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
		@FindBy (xpath="//input[@id='password-field']") private WebElement password;
		@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
		@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
		//@FindBy (xpath="//input[@id='btnback']") private WebElement back;
		@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;
		@FindBy (xpath="//a[text()='Designation']") private WebElement designation;
		@FindBy (xpath="//input[@id='txtDesignationName']") private WebElement designationname;
		@FindBy (xpath="//input[@id='txtShortName']") private WebElement shortname;
		@FindBy (xpath="//input[@id='chkActive']") private WebElement designationactivecheckbox;
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement designationsubmitbtn;
		@FindBy (xpath="//*[@id=\"tblmain_paginate\"]/ul/li[8]/a") private WebElement designationlist; 
		@FindBy (xpath="//button[@id='btnclear']") private WebElement designationclearbtn;
		@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement alreadyexistalertokbtn;
		@FindBy (xpath="//*[@id=\"btnEdit\"]/i") private WebElement designationeditbtn;
		@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement designationyesupdateitbtn;
		@FindBy (xpath="//button[text()='Update']") private WebElement designationupdatebtn;
		@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement designationupdatedmsgok;  
		@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement designationexportbtn;
		@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement searchsubmitdesignation;
		
		
		// initialization
		public Designation(WebDriver driver) {
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
		
		public void VerifyMyerpMasterModule() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(master.isEnabled(),"Master Module field is enabled");		 
			 Reporter.log("verifyMyerpMasterModule", true);
			 master.click(); 
		}
		public void VerifyMyerpGenralMasterModule() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(genralmaster.isEnabled(),"GenralMaster Module field is enabled");		 
			 Reporter.log("verifyMyerpGenralMasterModule", true);
			 genralmaster.click(); 
		}
		public void VerifyDesignationform() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(designation.isEnabled(),"Designationform sfield is enabled");		 
			 Reporter.log("verifyMyerpdesignation", true);
			 designation.click(); 
		}
		
		public void VerifyDesignationName1() throws InterruptedException {
			Thread.sleep(500);				
			 Assert.assertTrue(designationname.isEnabled(),"designation name field is enabled");		 
			 Reporter.log("verifyMyerpDesignationName", true);
			 designationname.click(); 
			 designationname.sendKeys("BOSS");
			 
		}
			 
	  public void VerifyShortName1() throws InterruptedException {
		  Thread.sleep(500);
		     Assert.assertTrue(shortname.isEnabled(),"shortname  field is enabled");		 
			 Reporter.log("verifyMyerpShortname", true);
			 shortname.click(); 
			 shortname.sendKeys("BOSS");
			 }
	 public void VerifyDesignationActiveCheckbox1() throws InterruptedException {
		 Thread.sleep(500);
		     Assert.assertTrue(designationactivecheckbox.isEnabled(),"designation active checkbox  field is enabled");		 
			 Reporter.log("verifyMyerpdesignationactivecheckbox", true);
			 designationactivecheckbox.click(); 
			 
			 }
	 
	 public void VerifyDesignationClearbtn() throws InterruptedException {
		 Thread.sleep(500);
		     Assert.assertTrue(designationclearbtn.isEnabled(),"Clear btn is enabled");		 
			 Reporter.log("verifyMyerpClearbtn", true);
			 designationclearbtn.click(); 
	 }
		 
		public void VerifyDesignationName() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(designationname.isEnabled(),"designation name field is enabled");		 
			 Reporter.log("verifyMyerpDesignationName", true);
			 designationname.click(); 
			 designationname.sendKeys("BOSS");
			 
		}
			 
	   public void VerifyShortName() throws InterruptedException {
		   Thread.sleep(500);
		     Assert.assertTrue(shortname.isEnabled(),"shortname  field is enabled");		 
			 Reporter.log("verifyMyerpShortname", true);
			 shortname.click(); 
			 shortname.sendKeys("BOSS");
			 }
	  public void VerifyDesignationActiveCheckbox() throws InterruptedException {
		  Thread.sleep(500);
		     Assert.assertTrue(designationactivecheckbox.isEnabled(),"designation active checkbox  field is enabled");		 
			 Reporter.log("verifyMyerpdesignationactivecheckbox", true);
			 designationactivecheckbox.click(); 
			 
			 }
	  public void VerifyDesignationSubmitbtn() throws InterruptedException {
		  Thread.sleep(500);
		     Assert.assertTrue(designationsubmitbtn.isEnabled(),"designation submit btn is enabled");		 
			 Reporter.log("verifyMyerpdesignationsubmitbtn", true);
			 designationsubmitbtn.click();
			 }
	  public void Verifyalreadyexistalertokbtn() throws InterruptedException { 
		  Thread.sleep(500);
		   Assert.assertTrue(alreadyexistalertokbtn.isEnabled(),"alreadyexistalertok btn is enabled");		 
			 Reporter.log("verifyMyerpalreadyexistalertokbtn", true);
			 alreadyexistalertokbtn.click();
			  }
	  public void VerifyDesignationEditbtn() throws InterruptedException {
		  Thread.sleep(500);
			 
		     Assert.assertTrue(designationeditbtn.isEnabled(),"designation edit btn is enabled");		 
			 Reporter.log("verifyMyerpdesignationeditbtn", true);
			 designationeditbtn.click(); 
	   }
          
	  public void VerifyDesignationYesupdateitbtn() throws InterruptedException {
		  Thread.sleep(2000);
		     Assert.assertTrue(designationyesupdateitbtn.isEnabled(),"designationyesupdateitbtn is enabled");		 
			 Reporter.log("verifyMyerpdesignationyesupdateitbtn", true);
			 designationyesupdateitbtn.click(); 
	   }
	  public void VerifyUpdateShortName11() throws InterruptedException {
		  Thread.sleep(500);
		     Assert.assertTrue(shortname.isEnabled(),"shortname  field is enabled");		 
			 Reporter.log("verifyMyerpShortname", true);
			 shortname.click(); 
			 shortname.clear();
			 shortname.sendKeys("Senior Boss");
			 }       
	  public void VerifydesignationUpdatebtn() throws InterruptedException {
		  Thread.sleep(500);
			 
		     Assert.assertTrue(designationupdatebtn.isEnabled(),"designationupdatebtn is enabled");		 
			 Reporter.log("verifyMyerpdesignationupdatebtn", true);
			 designationupdatebtn.click(); 
	   }
	 
	  public void VerifyDesignationupdatedmsgok() {
			 
		     Assert.assertTrue(designationupdatebtn.isEnabled(),"designationupdatedmsgok is enabled");		 
			 Reporter.log("verifyMyerpdesignationupdatedmsgok", true);
			 designationupdatedmsgok.click(); 
	   }
	  public void VerifyDesignatiosearchoption() throws InterruptedException {
		  Thread.sleep(500);
			 
		     Assert.assertTrue(searchsubmitdesignation.isEnabled(),"searchsubmitdesignation btn is enabled");		 
			 Reporter.log("verifyMyerpsearchsubmitdesignation", true);
			 searchsubmitdesignation.click(); 
			 searchsubmitdesignation.sendKeys("Senior Boss");
			 searchsubmitdesignation.click();
	   }
	  
	  public void VerifyDesignationexportbtn() throws InterruptedException {
			 
		  Thread.sleep(500);
		     Assert.assertTrue(designationexportbtn.isEnabled(),"designation export btn is enabled");		 
			 Reporter.log("verifyMyerpdesignationexportbtn", true);
			 designationexportbtn.click(); 
	   }
	  public void VerifyDesignatiosearchoption1() throws InterruptedException {
		  Thread.sleep(500);
			 
		     Assert.assertTrue(searchsubmitdesignation.isEnabled(),"searchsubmitdesignation btn is enabled");		 
			 Reporter.log("verifyMyerpsearchsubmitdesignation", true);
			 searchsubmitdesignation.click(); 
			 searchsubmitdesignation.clear();
			 searchsubmitdesignation.sendKeys("BOSS");
			 searchsubmitdesignation.click();
	   }

}
