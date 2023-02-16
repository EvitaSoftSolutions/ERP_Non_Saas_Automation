package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class ServicesForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::ul/child::li[2]/a")private WebElement accountmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagenavigataion;
	@FindBy(xpath="//a[text()='Services']")private WebElement services;
	@FindBy(xpath="//input[@id='txtService_Description']")private WebElement description;
	@FindBy(xpath="//input[@id='txtDisplay_Title']")private WebElement title;
	@FindBy(xpath="//input[@id='txtAliasName']")private WebElement aliasname;
	@FindBy(xpath="//input[@id='txtService_Cost']")private WebElement servicescost;
	@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement selectcompany;
	@FindBy(xpath="//select[@id='ddlType']")private WebElement selecttype;
	@FindBy(xpath="//input[@id='txtHSNCODE']")private WebElement hsncode;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement activebtn;
	@FindBy(xpath="//input[@id='chkTax']")private WebElement isgst;
	@FindBy(xpath="//button[@id='btnUpdateGST']")private WebElement fillgstdetail;
	@FindBy(xpath="//input[@id='txtTaxRate_1']")private WebElement cgst;
	@FindBy(xpath="//input[@id='txtTaxRate_2']")private WebElement sgst;
	@FindBy(xpath="//button[@id='btnSaveTax']")private WebElement savebtn;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy (xpath="//button[@class='confirm']") private WebElement cpupdateokbtn;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement  cpexportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar; 
	
	
	//initialization
		public ServicesForm(WebDriver driver) {
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
		public void verifyMyerpPageNavigataion() {
			Assert.assertTrue(pagenavigataion.isEnabled(),"PageNavigataion is enable");
			Reporter.log("verifyMyerppagenavigataion",true);
			pagenavigataion.click();
		}
		public void verifyMyerpServices() {
			Assert.assertTrue(services.isEnabled(),"Services is enable");
			Reporter.log("verifyMyerpservices",true);
			services.click();
		}
		public void verifyMyerpdescription() {
			Assert.assertTrue(description.isEnabled(),"description is enable");
			Reporter.log("verifyMyerpdescription",true);
			description.sendKeys("gov100");
		}
		public void verifyMyerpTitle() {
			Assert.assertTrue(title.isEnabled(),"Title is enable");
			Reporter.log("verifyMyerptitle",true);
			title.sendKeys("gov100");
		}
		public void verifyMyerpaliasname() {
			Assert.assertTrue(aliasname.isEnabled(),"aliasname is enable");
			Reporter.log("verifyMyerpaliasname",true);
			aliasname.sendKeys("gov100");
		}
		public void verifyMyerpServicesCost() {
			Assert.assertTrue(servicescost.isEnabled(),"ServicesCost is enable");
			Reporter.log("verifyMyerpservicescost",true);
			servicescost.sendKeys("100");
		}
		public void SelectCompany() throws InterruptedException {
			Select sc = new Select(selectcompany);
			Thread.sleep(1000);
			Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is  displayed");
			Assert.assertFalse(selectcompany.isSelected());
			sc.selectByVisibleText("ANITA GAS SERVICES");
		}
		public void SelectType() throws InterruptedException {
			Select sc = new Select(selecttype);
			Thread.sleep(1000);
			Assert.assertFalse(selecttype.isDisplayed(),"SelectType is  displayed");
			Assert.assertFalse(selecttype.isSelected());
			sc.selectByVisibleText("NON-REFUNDABLE-INCOME");
		}
		public void verifyMyerpHSNcode() {
			Assert.assertTrue(hsncode.isEnabled(),"HSNcode is enable");
			Reporter.log("verifyMyerpv",true);
			hsncode.sendKeys("stamp01");
		}
		public void verifyMyerpActivebtn() {
			Assert.assertTrue(activebtn.isEnabled(),"Activebtn is enable");
			Reporter.log("verifyMyerpactivebtn",true);
			activebtn.click();
		}
		public void verifyMyerpIsgst() {
			Assert.assertTrue(isgst.isEnabled(),"Isgst is enable");
			Reporter.log("verifyMyerpisgst",true);
			isgst.click();
		}
		public void verifyMyerpFillgstdetail() {
			Assert.assertTrue(fillgstdetail.isEnabled(),"Fillgstdetail is enable");
			Reporter.log("verifyMyerpfillgstdetail",true);
			fillgstdetail.click();
		}
		public void verifyMyerpCGST() {
			Assert.assertTrue(cgst.isEnabled(),"CGST is enable");
			Reporter.log("verifyMyerpcgst",true);
			cgst.sendKeys("0");
		}
		public void verifyMyerpSGST() {
			Assert.assertTrue(sgst.isEnabled(),"SGST is enable");
			Reporter.log("verifyMyerpsgst",true);
			sgst.sendKeys("0");
		}
		public void verifyMyerpSavebtn() {
			Assert.assertTrue(savebtn.isEnabled(),"Savebtn is enable");
			Reporter.log("verifyMyerpsavebtn",true);
			savebtn.click();
		}
		public void verifyMyerpClearbtn() throws InterruptedException {
		
			Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
			Reporter.log("verifyMyerpclearbtn",true);
			clearbtn.click();
			Thread.sleep(600);
		}
		public void verifyMyerpdescription1() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(description.isEnabled(),"description is enable");
			Reporter.log("verifyMyerpdescription",true);
			description.sendKeys("ServentDuty100");
		}
		public void verifyMyerpTitle1() {
			Assert.assertTrue(title.isEnabled(),"Title is enable");
			Reporter.log("verifyMyerptitle",true);
			title.sendKeys("Servent Duty");
		}
		public void verifyMyerpaliasname1() {
			Assert.assertTrue(aliasname.isEnabled(),"aliasname is enable");
			Reporter.log("verifyMyerpaliasname",true);
			aliasname.sendKeys("Servent Duty");
		}
		public void verifyMyerpServicesCost1() {
			Assert.assertTrue(servicescost.isEnabled(),"ServicesCost is enable");
			Reporter.log("verifyMyerpservicescost",true);
			servicescost.sendKeys("300");
		}
		public void SelectCompany1() throws InterruptedException {
			Select sc = new Select(selectcompany);
			Thread.sleep(1000);
			Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is  displayed");
			Assert.assertFalse(selectcompany.isSelected());
			sc.selectByVisibleText("ANITA GAS SERVICES");
		}
		public void SelectType1() throws InterruptedException {
			Select sc = new Select(selecttype);
			Thread.sleep(1000);
			Assert.assertFalse(selecttype.isDisplayed(),"SelectType is  displayed");
			Assert.assertFalse(selecttype.isSelected());
			sc.selectByVisibleText("NON-REFUNDABLE-INCOME");
		}
		public void verifyMyerpHSNcode1() {
			Assert.assertTrue(hsncode.isEnabled(),"HSNcode is enable");
			Reporter.log("verifyMyerpv",true);
			hsncode.sendKeys("stamp01");
		}
		public void verifyMyerpActivebtn1() {
			Assert.assertTrue(activebtn.isEnabled(),"Activebtn is enable");
			Reporter.log("verifyMyerpactivebtn",true);
			activebtn.click();
		}
		public void verifyMyerpSubmitbtn() {
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
		}
		public void verifyMyerpOkbtn() {
			Assert.assertTrue(okbtn.isEnabled(),"Okbtn is enable");
			Reporter.log("verifyMyerpokbtn",true);
			okbtn.click();
		}
		public void VerifyandClickonPSearchbar1() throws InterruptedException {
	    	  Thread.sleep(500);
	    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
	    	  Reporter.log(" verifyMyerp pcsearchbar", true);
	    	  pcsearchbar.click(); 
	    	  pcsearchbar.clear();
	    	  pcsearchbar.sendKeys("Servent Duty");
	    	  
	    	 }
		public void verifyMyerpEditbtn() {
			Assert.assertTrue(editbtn.isEnabled(),"Editbtn is enable");
			Reporter.log("verifyMyerpeditbtn",true);
			editbtn.click();
		}
		public void verifyMyerpConfirmbtn() {
			Assert.assertTrue(confirmbtn.isEnabled(),"Confirmbtn is enable");
			Reporter.log("verifyMyerpconfirmbtn",true);
			confirmbtn.click();
		}
		public void verifyMyerpTitle2() {
			Assert.assertTrue(title.isEnabled(),"Title is enable");
			Reporter.log("verifyMyerptitle",true);
			title.click();
			title.clear();
			title.sendKeys("OFFICE DUTY");
		}
		public void verifyMyerpaliasname2() {
			Assert.assertTrue(aliasname.isEnabled(),"aliasname is enable");
			Reporter.log("verifyMyerpaliasname",true);
			aliasname.click();
			aliasname.clear();
			aliasname.sendKeys("OFFICE DUTY");
		}
		public void verifyMyerpServicesCost2() {
			Assert.assertTrue(servicescost.isEnabled(),"ServicesCost is enable");
			Reporter.log("verifyMyerpservicescost",true);
			servicescost.click();
			servicescost.clear();
			servicescost.sendKeys("200");
		}
		
		public void verifyMyerpUpdatebtn() {
			Assert.assertTrue(updatebtn.isEnabled(),"Updatebtn is enable");
			Reporter.log("verifyMyerpupdatebtn",true);
			updatebtn.click();
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
	    	  pcsearchbar.sendKeys("OFFICE DUTY");
	    	  
	    	 }
		

}
