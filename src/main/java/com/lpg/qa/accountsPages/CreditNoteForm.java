package com.lpg.qa.accountsPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class CreditNoteForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Accounts']")private WebElement accounts;
	@FindBy(xpath="//a[text()=' Credit Note']")private WebElement creditnot;
	@FindBy(xpath="//input[@id='txtVoucherNo']")private WebElement voucherno;
	@FindBy(xpath="//input[@id='txtCreditFromAmt']")private WebElement creditledger;
	@FindBy(xpath="//a[@id='ui-id-14']")private WebElement creditledger1;
	@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/section[2]/div/div[1]/div/div") private WebElement boxbody;
	@FindBy(xpath="//input[@id='txtCreditAmount']")private WebElement creditamount;
	@FindBy(xpath="//input[@id='txtaccount']")private WebElement account;
	@FindBy(xpath="//input[@id='txtAmount']")private WebElement amount;
	@FindBy(xpath="//*[@id=\"imgbtnVLAdd\"]")private WebElement plusbtn;
	@FindBy(xpath="//input[@id='txtaccount_1']")private WebElement account1;
	@FindBy(xpath="//input[@id='txtAmount_1']")private WebElement amount1;
	@FindBy(xpath="//*[@id=\"imgbtnVLAdd_1\"]")private WebElement plusbtn1;
	@FindBy(xpath="//input[@id='txtaccount_2']")private WebElement account2;
	@FindBy(xpath="//*[@id=\"txtAmount_2\"]")private WebElement amount2;
	
	@FindBy(xpath="//input[@id='txtGrdNarration']")private WebElement narration;
	@FindBy(xpath="//textarea[@id='txtNarration']")private WebElement narration1;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement newbtn;
	
	@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/section[1]/h1/a[1]") private WebElement updatecreditnote;
	@FindBy (xpath="//input[@id='txtMDLDocumentNo']") private WebElement documentno;
	@FindBy (xpath="//button[@id='btnMDLGet']") private WebElement ugetdatabtn;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement usubmitbtn;
	
	@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[1]/td[2]/a") private WebElement creditnoteregister;
	@FindBy(xpath="//select[@id='ddlCompanyCode']")private WebElement selectcomp;
	@FindBy (xpath="//input[@id='FromDate']") private WebElement fromdate;
	@FindBy (xpath="//input[@id='ToDate']") private WebElement todate;
	@FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn;
	@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/div/section[2]/div/div/div/div") private WebElement body;
	
	
	@FindBy (xpath="//span[text()='Accounts Report']") private WebElement accountreport;
	@FindBy (xpath="//a[text()=' Accounting Reports']") private WebElement accountingreport;
	@FindBy (xpath="//*[@id=\"tblGeneralMasters_paginate\"]/ul/li[3]/a") private WebElement pagenav;
	@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[2]/td[2]/a") private WebElement creditnotenowisereport;
	@FindBy(xpath="//select[@id='ddlCompanyCode']")private WebElement selectcomp1;
	@FindBy (xpath="//input[@id='txtFromDocNo']") private WebElement fromdocno;
	@FindBy (xpath="//input[@id='txtToDocNo']") private WebElement todocno;
    @FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn1;
	
	
	

	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public CreditNoteForm(WebDriver driver) {
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
	public void verifyMyerpAccounts() {
		Assert.assertTrue(accounts.isEnabled(),"Accounts is enable");
		Reporter.log("verifyMyerpaccounts",true);
		accounts.click();
	}
	public void verifyMyerpCreditnot() {
		Assert.assertTrue(creditnot.isEnabled(),"creditnot is enable");
		Reporter.log("verifyMyerpcreditnot",true);
		creditnot.click();
	}
	public void verifyMyerpVoucherno() {
		Assert.assertTrue(voucherno.isEnabled(),"voucherno is enable");
		Reporter.log("verifyMyerpvoucherno",true);
		voucherno.sendKeys("40002");
	}
	public void verifyMyerpCreditledger() throws InterruptedException {
		Assert.assertTrue(creditledger.isEnabled(),"Creditledger is enable");
		Reporter.log("verifyMyerpcreditledger",true);
		creditledger.click();
		creditledger.sendKeys(" ");
		creditledger1.click();
		boxbody.click();
		Thread.sleep(500);
	}
	public void verifyMyerpCreditamount() {
		Assert.assertTrue(creditamount.isEnabled(),"Creditamount is enable");
		Reporter.log("verifyMyerpcreditamount",true);
		creditamount.sendKeys("2200");
	}
	public void verifyMyerpAccount() {
		Assert.assertTrue(account.isEnabled(),"Account is enable");
		Reporter.log("verifyMyerpaccount",true);
		account.sendKeys("SaleDebit : 400008");
	}
	public void verifyMyerpAmount() {
		Assert.assertTrue(amount.isEnabled(),"Amount is enable");
		Reporter.log("verifyMyerpamount",true);
		amount.sendKeys("1864");
	}
	public void verifyMyerpNarration() {
		Assert.assertTrue(narration.isEnabled(),"Narration is enable");
		Reporter.log("verifyMyerpnarration",true);
		narration.sendKeys("being paid to Domestic sale");
	}
		
	public void verifyMyerpPlusbtn() {
		Assert.assertTrue(plusbtn.isEnabled(),"plusbtn is enable");
		Reporter.log("verifyMyerpplusbtn",true);
		plusbtn.click();
	}
	public void verifyMyerpAccount1() {
		Assert.assertTrue(account1.isEnabled(),"account1 is enable");
		Reporter.log("verifyMyerpaccount1",true);
	account1.click();
	account1.sendKeys("CGST OUTPUT : 400005");
	}	
	public void verifyMyerpAmount1() {
		Assert.assertTrue(amount1.isEnabled(),"amount1 is enable");
		Reporter.log("verifyMyerpamount1",true);
		amount1.click();
		amount1.sendKeys("168");
	}
	public void verifyMyerpPlusbtn1() {
		Assert.assertTrue(plusbtn1.isEnabled(),"plusbtn1 is enable");
		Reporter.log("verifyMyerpplusbtn1",true);
		plusbtn1.click();
	}
	public void verifyMyerpAccount2() {
		Assert.assertTrue(account2.isEnabled(),"account2 is enable");
		Reporter.log("verifyMyerpaccount1",true);
	account2.click();
	account2.sendKeys("SGST OUTPUT : 400006");
	}	
	public void verifyMyerpAmount2() {
		Assert.assertTrue(amount2.isEnabled(),"amount2 is enable");
		Reporter.log("verifyMyerpamount2",true);
		amount2.click();
		amount2.sendKeys("168");
	}
	public void verifyMyerpNarration1() {
		Assert.assertTrue(narration1.isEnabled(),"Narration1 is enable");
		Reporter.log("verifyMyerpnarration1",true);
      	narration1.sendKeys("being paid to Domestic sale");
	}
	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(2000);
		if (isAlertPresent4(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent4(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);
			Alert al=driver.switchTo().alert();
			Thread.sleep(1000); 
			al.accept(); 
			Thread.sleep(1000); 
			al.accept(); 
			return true; }
		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}

	public void verifyMyerpNewbtn() {
		Assert.assertTrue(newbtn.isEnabled(),"newbtn is enable");
		Reporter.log("verifyMyerpnewbtn",true);
		newbtn.click();
	}
	

	
	
	
	public void VerifyandClickonMyerpupdatecreditnote() throws InterruptedException {
		Thread.sleep(1000);
		 Assert.assertTrue(updatecreditnote.isEnabled(),"updatecreditnote is enabled");
		 Reporter.log("verifyMyerpupdatecreditnote", true);
		 updatecreditnote.click();
		 
	}

	public void VerifyandClickonMyerpdocumentno() throws InterruptedException {
		Thread.sleep(1000);
      	 Assert.assertTrue(documentno.isEnabled(),"documentno is enabled");
		 Reporter.log("verifyMyerpupdocumentno", true);
		 documentno.click();
		 documentno.sendKeys("2300002");
	}
	public void VerifyandClickonMyerpugetdatabtn() throws InterruptedException {
		 Assert.assertTrue(ugetdatabtn.isEnabled(),"ugetdatabtn is enabled");
		 Reporter.log("verifyMyerpugetdatabtn", true);
		 ugetdatabtn.click();
		 Thread.sleep(2000);
			if (isAlertPresent2(driver)) { System.out.println("alert is present");

			}else
			{ System.out.println("alert is not present"); }
		}

		public static boolean isAlertPresent2(WebDriver driver) throws
		InterruptedException { 
			try {
				Thread.sleep(800);
				Alert al=driver.switchTo().alert();
				Thread.sleep(1000); 
				al.accept(); 
				Thread.sleep(1000); 
				return true; }
			catch (UnhandledAlertException u) 
			{ // TODO Auto-generated catch block
				u.printStackTrace(); } return false;
		}
	public void VerifyandClickonMyerpusubmitbtn() throws InterruptedException {
		Thread.sleep(3000);
		 Assert.assertTrue(usubmitbtn.isEnabled(),"usubmitbtn is enabled");
		 Reporter.log("verifyMyerpusubmitbtn", true);
		 usubmitbtn.click();
		 Thread.sleep(2000);
		 if (isAlertPresent5(driver)) { System.out.println("alert is present");

			}else
			{ System.out.println("alert is not present"); }
		}

		public static boolean isAlertPresent5(WebDriver driver) throws
		InterruptedException { 
			try {
				Thread.sleep(1000);
				Alert al=driver.switchTo().alert();
				Thread.sleep(2000); 
				al.accept(); 
				 Thread.sleep(2000);
				return true; }

			catch (UnhandledAlertException u) 
			{ // TODO Auto-generated catch block
				u.printStackTrace(); } return false;
		}
	
		
		

		
		
		public void VerifyandClickonMyerpAccountReport() throws InterruptedException {
			 Thread.sleep(1000);
			 Assert.assertTrue(accountreport.isEnabled(),"accountreport is enabled");
			 Reporter.log("verifyMyerpaccountreport", true);
			 accountreport.click();
		}
		public void VerifyandClickonMyerpAccountingReport() throws InterruptedException {
			 Thread.sleep(1000);
			 Assert.assertTrue(accountingreport.isEnabled(),"accountingreport is enabled");
			 Reporter.log("verifyMyerpaccountingreport", true);
			 accountingreport.click();
		}
		public void VerifyandClickonMyerpPageNavigation1() {
			 Assert.assertTrue(pagenav.isEnabled(),"pagenav is enabled");
			 Reporter.log("verifyMyerppagenav", true);
			 pagenav.click();
		}
		public void VerifyandClickonMyerpCreditnoteRegisterReport() throws InterruptedException {
			Thread.sleep(600);
			 Assert.assertTrue(creditnoteregister.isEnabled(),"creditnoteregister is enabled");
			 Reporter.log("verifyMyerpcreditnoteregister", true);
			 creditnoteregister.click();
			 
		}
		public void verifyMyerpSelectCompany() throws InterruptedException {
			Select su = new Select(selectcomp);
			Thread.sleep(1000);
			Assert.assertFalse(selectcomp.isDisplayed(),"SelectCompany is displayed");
			Assert.assertFalse(selectcomp.isSelected());
			su.selectByVisibleText("ANITA GAS SERVICES");
		
		}
		
		public void VerifyMyerpFromDate() {
			 Assert.assertTrue(fromdate.isEnabled(),"fromdate field is enabled");		 
			 Reporter.log("verifyMyerpfromdate", true);
			 fromdate.click(); 
			 fromdate.clear();
			 fromdate.sendKeys("18/03/2023");
		}

		public void VerifyMyerpTodate() {
			 Assert.assertTrue(todate.isEnabled(),"todate field is enabled");		 
			 Reporter.log("verifyMyerptodate", true);
			 todate.click(); 
			 todate.clear();
			 todate.sendKeys("18/03/2023");
			 body.click();
		}
		
		public void VerifyandClickonMyerpGetdataBtn() {
			 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
			 Reporter.log(" verifyMyerpgetdatabtn", true);
			 getdatabtn.click();
		
		}
		
		
		public void VerifyandClickonMyerpPageNavigation2() {
			 Assert.assertTrue(pagenav.isEnabled(),"pagenav is enabled");
			 Reporter.log("verifyMyerppagenav", true);
			 pagenav.click();
		}
		
		public void VerifyandClickonMyerpCreditNoteNoWiseReport() throws InterruptedException {
			Thread.sleep(600);
			 Assert.assertTrue(creditnotenowisereport.isEnabled(),"creditnotenowisereport is enabled");
			 Reporter.log("verifyMyerpcreditnotenowisereport", true);
			 creditnotenowisereport.click();
			 
		}
		public void verifyMyerpSelectCompany1() throws InterruptedException {
			Select su = new Select(selectcomp);
			Thread.sleep(1000);
			Assert.assertFalse(selectcomp.isDisplayed(),"SelectCompany is displayed");
			Assert.assertFalse(selectcomp.isSelected());
			su.selectByVisibleText("ANITA GAS SERVICES");
		
		}
		
		public void VerifyMyerpFromDocNo() {
			 Assert.assertTrue(fromdocno.isEnabled(),"fromdocno field is enabled");		 
			 Reporter.log("verifyMyerpfromdocno", true);
			 fromdocno.click(); 
			 fromdocno.clear();
			 fromdocno.sendKeys("2300002");
		}

		public void VerifyMyerpToDocNo() {
			 Assert.assertTrue(todocno.isEnabled(),"todocno field is enabled");		 
			 Reporter.log("verifyMyerptodocno", true);
			 todocno.click(); 
			 todocno.clear();
			 todocno.sendKeys("2300002");
			
		}
		
		public void VerifyandClickonMyerpGetdataBtn1() {
			 Assert.assertTrue(getdatabtn1.isEnabled(),"getdatabtn1 is enabled");
			 Reporter.log(" verifyMyerpgetdatabtn1", true);
			 getdatabtn1.click();
		
		}
}                   
