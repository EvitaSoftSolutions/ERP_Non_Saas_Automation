package com.lpg.qa.accountsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class PaymentVoucherReferencingForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Accounts']")private WebElement accounts;
	@FindBy(xpath="//a[text()=' Payment Voucher Referencing']")private WebElement pamentreferencing;
	@FindBy(xpath="//select[@id='ddlType']")private WebElement selecttyp;
	@FindBy(xpath="//select[@id='ddlReftype']")private WebElement selectreftyp;
	@FindBy(xpath="//input[@id='txtaccount']")private WebElement accountahead;
	@FindBy(xpath="//select[@id='ddlDocID']")private WebElement nothingselect;
	@FindBy(xpath="//input[@id='txtAmtToAdj']")private WebElement amount;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clear;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement save;
	
	//initialization
		public PaymentVoucherReferencingForm(WebDriver driver) {
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
		public void verifyMyerpPamentreferencing() {
			Assert.assertTrue(pamentreferencing.isEnabled(),"Pamentreferencing is enable");
			Reporter.log("verifyMyerppamentreferencing",true);
			pamentreferencing.click();
		}
		public void Selecttyp() throws InterruptedException {
			Select sc = new Select(selecttyp);
			Thread.sleep(1000);
			Assert.assertFalse(selecttyp.isDisplayed(),"Selecttyp is  displayed");
			Assert.assertFalse(selecttyp.isSelected());
			sc.selectByVisibleText("Debit Note");
		}
		public void Selectreftyp() throws InterruptedException {
			Select sc = new Select(selectreftyp);
			Thread.sleep(1000);
			Assert.assertFalse(selectreftyp.isDisplayed(),"Selectreftyp is  displayed");
			Assert.assertFalse(selectreftyp.isSelected());
			sc.selectByVisibleText("Other Purchase Bill");
		}
		public void verifyMyerpAccountahead() {
			Assert.assertTrue(accountahead.isEnabled(),"Accountahead is enable");
			Reporter.log("verifyMyerpaccountahead",true);
			accountahead.click();
			accountahead.sendKeys("BPCL : 2200020");
		}
		public void Nothingselect() throws InterruptedException {
			Select sc = new Select(nothingselect);
			Thread.sleep(1000);
			Assert.assertFalse(nothingselect.isDisplayed(),"Nothingselect is  displayed");
			Assert.assertFalse(nothingselect.isSelected());
			sc.selectByVisibleText("2200002****14/12/2022****200002****BPCL");
		}
		public void verifyMyerpAmount() {
			Assert.assertTrue(amount.isEnabled(),"Amount is enable");
			Reporter.log("verifyMyerpamount",true);
			amount.sendKeys("-5255");;
		}
		public void verifyMyerpClear() {
			Assert.assertTrue(clear.isEnabled(),"Clear is enable");
			Reporter.log("verifyMyerpclear",true);
			clear.click();
		}

}
