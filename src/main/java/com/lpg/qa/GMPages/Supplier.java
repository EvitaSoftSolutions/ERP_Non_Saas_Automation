 package com.lpg.qa.GMPages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
	import org.testng.Reporter;

	public class Supplier  {
		@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
		@FindBy (xpath="//input[@id='password-field']") private WebElement password;
		@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
		@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
	    @FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;
	    @FindBy (xpath="//a[text()='Supplier']") private WebElement supplier;
	    @FindBy (xpath="//select[@id='ddlCompanyID']") private WebElement selectcompany;
	    @FindBy (xpath="//input[@id='txtSupplierCompanyCode']") private WebElement supcompanycode;
	    @FindBy (xpath="//input[@id='txtSupplierName']") private WebElement sname;
	    @FindBy (xpath="//select[@id='ddlGroup']") private WebElement selectgroup;
	    @FindBy (xpath="//input[@id='txtContactDetail']") private WebElement scontanctdetail;
	    @FindBy (xpath="//input[@id='txtAddress1']") private WebElement saddress1;
	    @FindBy (xpath="//select[@id='ddlstate']") private WebElement selectstate;
	    @FindBy (xpath="//input[@id='chkActive']") private WebElement sactivechk;
	    @FindBy (xpath="//button[@id='btnclear']") private WebElement sclearbtn;
	    @FindBy (xpath="//button[@id='btnSubmit']") private WebElement ssubmitbtn;
	    @FindBy (xpath="//button[text()='OK']") private WebElement ssubmitok;
	    @FindBy (xpath="//a[@id='btnEdit']") private WebElement seditbtn;
	    @FindBy (xpath="//button[text()='Yes, update it!']") private WebElement syesupdateitbtn;
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement supdatebtn;
		@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement supdatedmsgok;  
		@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement sexportbtn;
		@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	    
	    // initialization
	    		public Supplier(WebDriver driver) {
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
	    		public void VerifyMyerpSupplier() throws InterruptedException {
	    			Thread.sleep(500);
	    			 Assert.assertTrue(supplier.isEnabled(),"supplier field is enabled");		 
	    			 Reporter.log("verifyMyerpsupplier", true);
	    			 supplier.click(); 
	    		}
	    		
	    		public void SelectCompany() throws InterruptedException {
	    			Select sc = new Select(selectcompany);
	    			Thread.sleep(1000);
	    			Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
	    			Assert.assertFalse(selectcompany.isSelected());
	    			sc.selectByVisibleText("ANITA GAS SERVICES");
	    		}
       
	    		
	    		public void VerifyMyerpSsupcompanyCode() throws InterruptedException {
	    			Thread.sleep(500);
	    			 Assert.assertTrue(supcompanycode.isEnabled(),"supcompanycode field is enabled");		 
	    			 Reporter.log("verifyMyerpsupcompanycode", true);
	    			 supcompanycode.click(); 
	    			 supcompanycode.sendKeys("1005");
	    		}
	    		public void VerifyMyerpSupplierName() throws InterruptedException {
	    			Thread.sleep(500);
	    			 Assert.assertTrue(sname.isEnabled(),"sname field is enabled");		 
	    			 Reporter.log("verifyMyerpsuppliername", true);
	    			 sname.click();
	    			 sname.sendKeys("pritesh");
	    		}

	    		public void SelectGroup() throws InterruptedException {
	    			Select sc = new Select(selectgroup);
	    			Thread.sleep(1000);
	    			Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
	    			Assert.assertFalse(selectgroup.isSelected());
	    			sc.selectByVisibleText("SUNDRY CREDITORS");
	    		}
	    		public void VerifyMyerpSupplierContandDetial() throws InterruptedException {
	    			Thread.sleep(500);
	    			 Assert.assertTrue(scontanctdetail.isEnabled(),"scontanctdetail field is enabled");		 
	    			 Reporter.log("verifyMyerpscontanctdetail", true);
	    			 scontanctdetail.click(); 
	    			 scontanctdetail.sendKeys("9878754324");
	    		}
	    		public void VerifyMyerpSupplierAddress1() throws InterruptedException {
	    			Thread.sleep(500);
	    			 Assert.assertTrue(saddress1.isEnabled(),"saddress1 field is enabled");		 
	    			 Reporter.log("verifyMyerpsaddress1", true);
	    			 saddress1.click(); 
	    			 saddress1.sendKeys("PUNE");
	    		}
	    		
	    		public void SelectState() throws InterruptedException {
	    			Select ss = new Select(selectstate);
	    			Thread.sleep(1000);
	    			Assert.assertFalse(selectstate.isDisplayed(),"selectstate is displayed");
	    			Assert.assertFalse(selectstate.isSelected());
	    			ss.selectByVisibleText("ASSAM");
	    		}
	    			public void VerifyMyerpSupplierActveChk() throws InterruptedException {
	    				Thread.sleep(500);
		    			 Assert.assertTrue(sactivechk.isEnabled(),"sactivechk field is enabled");		 
		    			 Reporter.log("verifyMyerpsactivechk", true);
		    			 sactivechk.click(); 
		    		}
	    			
		    		public void VerifyMyerpSupplierClearBtn() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(sclearbtn.isEnabled(),"sclearbtn field is enabled");		 
		    			 Reporter.log("verifyMyerpsclearbtn", true);
		    			 sclearbtn.click(); 
		    		}
		    		
		    		public void SelectCompany1() throws InterruptedException {
		    			Select sc = new Select(selectcompany);
		    			Thread.sleep(1000);
		    			Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
		    			Assert.assertFalse(selectcompany.isSelected());
		    			sc.selectByVisibleText("ANITA GAS SERVICES");
		    		}
	       
		    		
		    		public void VerifyMyerpSsupcompanyCode1() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(supcompanycode.isEnabled(),"supcompanycode field is enabled");		 
		    			 Reporter.log("verifyMyerpsupcompanycode", true);
		    			 supcompanycode.click(); 
		    			 supcompanycode.sendKeys("1006");
		    		}
		    		public void VerifyMyerpSupplierName1() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(sname.isEnabled(),"sname field is enabled");		 
		    			 Reporter.log("verifyMyerpsuppliername", true);
		    			 sname.click(); 
		    			 sname.sendKeys("RIYA");
		    		}
		    		

		    		public void SelectGroup1() throws InterruptedException {
		    			Select sc = new Select(selectgroup);
		    			Thread.sleep(1000);
		    			Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
		    			Assert.assertFalse(selectgroup.isSelected());
		    			sc.selectByVisibleText("SUNDRY CREDITORS");
		    		}
		    		public void VerifyMyerpSupplierContandDetial1() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(scontanctdetail.isEnabled(),"scontanctdetail field is enabled");		 
		    			 Reporter.log("verifyMyerpscontanctdetail", true);
		    			 scontanctdetail.click(); 
		    			 scontanctdetail.sendKeys("9878754329");
		    			 
		    		}
		    		public void VerifyMyerpSupplierAddress11() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(saddress1.isEnabled(),"saddress1 field is enabled");		 
		    			 Reporter.log("verifyMyerpsaddress1", true);
		    			 saddress1.click(); 
		    			 saddress1.sendKeys("PUNE");		 
		    		}
		    		
		    		public void SelectState1() throws InterruptedException {
		    			Select ss = new Select(selectstate);
		    			Thread.sleep(1000);
		    			Assert.assertFalse(selectstate.isDisplayed(),"selectstate is displayed");
		    			Assert.assertFalse(selectstate.isSelected());
		    			ss.selectByVisibleText("ASSAM");
		    		}
		    			public void VerifyMyerpSupplierActveChk1() throws InterruptedException {
		    				Thread.sleep(500);
			    			 Assert.assertTrue(sactivechk.isEnabled(),"sactivechk field is enabled");		 
			    			 Reporter.log("verifyMyerpsactivechk", true);
			    			 sactivechk.click(); 
			    		}
		    		
		    		public void VerifyMyerpSupplierSubmitBtn() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(ssubmitbtn.isEnabled(),"ssubmitbtn field is enabled");		 
		    			 Reporter.log("verifyMyerpsupplierssubmitbtn", true);
		    			 ssubmitbtn.click(); 
		    		}
		    		public void VerifyMyerpSupplierSubmiOKBtn() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(ssubmitok.isEnabled(),"ssubmitok field is enabled");		 
		    			 Reporter.log("verifyMyerpssubmitok", true);
		    			 Assert.assertFalse(ssubmitok.isSelected());
		    			 ssubmitok.click(); 
		    		}
		    		public void VerifyandClickonPSearchbar1() throws InterruptedException {
		  	    	  Thread.sleep(500);
		  	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		  	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
		  	    	  pcsearchbar.click(); 
		  	    	  pcsearchbar.clear();
		  	    	  pcsearchbar.sendKeys("RIYA");
		  	    	  Thread.sleep(500);
		  	    	  }
		    		
		    		public void VerifyMyerpSupplierEditBtn() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(seditbtn.isEnabled(),"seditbtn field is enabled");		 
		    			 Reporter.log("verifyMyerpsseditbtn", true);
		    			 Assert.assertFalse(seditbtn.isSelected());
		    			 seditbtn.click(); 
		    		}
		    		public void VerifyMyerpSupplierYesUpdateBtn() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(syesupdateitbtn.isEnabled(),"syesupdateitbtn field is enabled");		 
		    			 Reporter.log("verifyMyerpsyesupdateitbtn", true);
		    			 Assert.assertFalse(syesupdateitbtn.isSelected());
		    			 syesupdateitbtn.click(); 
		    		}
		    		public void VerifyMyerpSupplierName2() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(sname.isEnabled(),"sname field is enabled");		 
		    			 Reporter.log("verifyMyerpsuppliername", true);
		    			 sname.click();
		    			 sname.clear();
		    			 sname.sendKeys("Sonu Patel");
		    		}
		    		public void SelectGroup2() throws InterruptedException {
		    			Select sc = new Select(selectgroup);
		    			Thread.sleep(1000);
		    			Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
		    			Assert.assertFalse(selectgroup.isSelected());
		    			sc.selectByVisibleText("SUNDRY CREDITORS FOR EXPENSES");
		    		}
		    		
		    		public void VerifyMyerpSupplierUpdateBtn() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(supdatebtn.isEnabled(),"supdatebtn field is enabled");		 
		    			 Reporter.log("verifyMyerpsupdatebtn", true);
		    			 Assert.assertFalse(supdatebtn.isSelected());
		    			 supdatebtn.click(); 
		    		}
		    		public void VerifyMyerpSupplierUpdateokBtn() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(supdatedmsgok.isEnabled(),"supdatedmsgok field is enabled");		 
		    			 Reporter.log("verifyMyerpsupdatedmsgok", true);
		    			 Assert.assertFalse(supdatedmsgok.isSelected());
		    			 supdatedmsgok.click(); 
		    		}
		    		public void VerifyandClickonPSearchbar2() throws InterruptedException {
			  	    	  Thread.sleep(500);
			  	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
			  	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
			  	    	  pcsearchbar.click(); 
			  	    	  pcsearchbar.clear();
			  	    	  pcsearchbar.sendKeys("Sonu Patel");
			  	    	  Thread.sleep(500);
			  	    	  }
		    		public void VerifyMyerpSupplierExportBtn() throws InterruptedException {
		    			Thread.sleep(500);
		    			 Assert.assertTrue(sexportbtn.isEnabled(),"sexportbtn field is enabled");		 
		    			 Reporter.log("verifyMyerpsexportbtn", true);
		    			 Assert.assertFalse(sexportbtn.isSelected());
		    		}
		    		
		    		
}             
	
	
