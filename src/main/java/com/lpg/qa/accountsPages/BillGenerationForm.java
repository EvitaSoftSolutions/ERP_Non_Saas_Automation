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

public class BillGenerationForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Accounts']")private WebElement accounts;
	@FindBy(xpath="//a[text()=' Bill Generation']")private WebElement billgenerationdaily;
	@FindBy(xpath="//select[@id='ddlBillingType']")private WebElement billingtypedaily;
	@FindBy(xpath="//input[@id='BillingDate']")private WebElement billingdatedaily;
	@FindBy(xpath="//input[@id='txtInvoiceNo']")private WebElement invoicenum;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;

	@FindBy(xpath="//a[text()=' Bill Generation']")private WebElement billgenerationmonthly;
	@FindBy(xpath="//select[@id='ddlBillingType']")private WebElement billingtypemon;
	@FindBy(xpath="//select[@id='ddlMonth']")private WebElement selectmonthmon;
	@FindBy(xpath="//input[@id='txtYear']")private WebElement selectyearmon;
	@FindBy(xpath="//input[@id='BillingDate']")private WebElement billingdatemon;

	@FindBy(xpath="//a[text()=' Bill Generation']")private WebElement billgenerationforthnight;
	@FindBy(xpath="//select[@id='ddlBillingType']")private WebElement billingtypefn;
	@FindBy(xpath="//select[@id='ddlMonth']")private WebElement selectmonthfn;
	@FindBy(xpath="//input[@id='txtYear']")private WebElement selectyearfn;
	@FindBy(xpath="//input[@id='BillingDate']")private WebElement billinddatefn;

	@FindBy(xpath="//a[text()=' Bill Generation']")private WebElement billgenerationcustom;
	@FindBy(xpath="//select[@id='ddlBillingType']")private WebElement billingtypecustom;
	@FindBy(xpath="//select[@id='ddlParty']")private WebElement selectpartycustom;
	@FindBy(xpath="//input[@id='BillingDate']")private WebElement billinddatecustom;


	@FindBy(xpath="//a[text()=' Bill Generation']")private WebElement billgenerationimmegiate;
	@FindBy(xpath="//select[@id='ddlBillingType']")private WebElement billingtypeimmegiate;
	@FindBy(xpath="//input[@id='BillingDate']")private WebElement billinddateimmegiate;


	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}


	public BillGenerationForm(WebDriver driver) {
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
	public void verifyMyerpAccounts() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(accounts.isEnabled(),"Accounts is enable");
		Reporter.log("verifyMyerpaccounts",true);
		accounts.click();
	}
	public void verifyMyerpBillgenerationDaily() {
		Assert.assertTrue(billgenerationdaily.isEnabled(),"billgenerationdaily is enable");
		Reporter.log("verifyMyerpbillgenerationdaily",true);
		billgenerationdaily.click();
	}

	public void verifyMyerpBillingtypeDaily() throws InterruptedException {
		Select bt = new Select(billingtypedaily);
		Thread.sleep(1000);
		Assert.assertTrue(billingtypedaily.isDisplayed(),"billingtypedaily is  displayed");
		Assert.assertFalse(billingtypedaily.isSelected());
		bt.selectByVisibleText("Daily");
	}
	public void verifyMyerpBillingdatedaily() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(billingdatedaily.isEnabled(),"billingdatedaily is enable");
		Reporter.log("verifyMyerpbillingdatedaily",true);
		billingdatedaily.sendKeys("10/03/2023");
	}
	public void verifyMyerpinvoicenumber() {
		Assert.assertTrue(invoicenum.isEnabled(),"invoicenum is enable");
		Reporter.log("verifyMyerpinvoicenum",true);
		invoicenum.click();
		invoicenum.sendKeys("30001");
	}
	public void verifyMyerpSubmitbtn() throws InterruptedException {  
		Thread.sleep(500);
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		if (isAlertPresent7(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent7(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(1000);
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(1000);
			return true; }

		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}

	public void verifyMyerpclearbtn() {
		Assert.assertTrue(clearbtn.isEnabled(),"clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();

	}



	public void verifyMyerpBillgenerationMonthly() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(billgenerationmonthly.isEnabled(),"billgenerationmonthly is enable");
		Reporter.log("verifyMyerpbillgenerationmonthly",true);
		billgenerationmonthly.click();

	}

	public void verifyMyerpBillingtypemonthly() throws InterruptedException {
		Select bt = new Select(billingtypemon);
		Thread.sleep(1000);
		Assert.assertTrue(billingtypemon.isDisplayed(),"billingtypemon is  displayed");
		Assert.assertFalse(billingtypemon.isSelected());
		bt.selectByVisibleText("Monthly");
	}
	public void verifyMyerpSelectMonth() throws InterruptedException {
		Select bt = new Select(selectmonthmon);
		Thread.sleep(1000);
		Assert.assertTrue(selectmonthmon.isDisplayed(),"selectmonthmon is  displayed");
		Assert.assertFalse(selectmonthmon.isSelected());
		bt.selectByVisibleText("March");
	}
	public void verifyMyerpBillgenerationmonthYear() {
		Assert.assertTrue(selectyearmon.isEnabled(),"selectyearmon is enable");
		Reporter.log("verifyMyerpbillgenerationselectyearmon",true);
		selectyearmon.click();
		selectyearmon.sendKeys("2023");

	}

	public void verifyMyerpBillingdatemon() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(billingdatemon.isEnabled(),"billingdatemon is enable");
		Reporter.log("verifyMyerpbillingdatemon",true);
		billingdatemon.sendKeys("10/03/2023");
	}



	public void verifyMyerpbillgenerationForthNight() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(billgenerationforthnight.isEnabled(),"billgenerationforthnight is enable");
		Reporter.log("verifyMyerpbillgenerationforthnight",true);
		billgenerationforthnight.click();

	}

	public void verifyMyerpbillingtypefn() throws InterruptedException {
		Select bt = new Select(billingtypefn);
		Thread.sleep(1000);
		Assert.assertTrue(billingtypefn.isDisplayed(),"billingtypefn is  displayed");
		Assert.assertFalse(billingtypefn.isSelected());
		bt.selectByVisibleText("FORTHNIGHT");
	}
	public void verifyMyerpSelectMonthFN() throws InterruptedException {
		Select bt = new Select(selectmonthfn);
		Thread.sleep(1000);
		Assert.assertTrue(selectmonthfn.isDisplayed(),"selectmonthfn is  displayed");
		Assert.assertFalse(selectmonthfn.isSelected());
		bt.selectByVisibleText("March");
	}
	public void verifyMyerpBillgenerationmonthYearFN() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(selectyearfn.isEnabled(),"selectyearfn is enable");
		Reporter.log("verifyMyerpselectyearfn",true);
		selectyearfn.click();
		selectyearfn.sendKeys("2023");

	}

	public void verifyMyerpBillinddateFN() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(billinddatefn.isEnabled(),"billinddatefn is enable");
		Reporter.log("verifyMyerpbillinddatefn",true);
		billinddatefn.sendKeys("10/03/2023");
	}

	public void verifyMyerpbillgenerationcustom() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(billgenerationcustom.isEnabled(),"billgenerationcustom is enable");
		Reporter.log("verifyMyerpbillgenerationcustom",true);
		billgenerationcustom.click();

	}
	public void verifyMyerpbillingtypecustom() throws InterruptedException {
		Select bt = new Select(billingtypecustom);
		Thread.sleep(1000);
		Assert.assertTrue(billingtypecustom.isDisplayed(),"billingtypecustom is  displayed");
		Assert.assertFalse(billingtypecustom.isSelected());
		bt.selectByVisibleText("custom");
	}
	public void verifyMyerpselectpartycustom() throws InterruptedException {
		Thread.sleep(1000);
		Select bt = new Select(selectpartycustom);
		Thread.sleep(1000);
		Assert.assertTrue(selectpartycustom.isDisplayed(),"selectpartycustom is  displayed");
		Assert.assertFalse(selectpartycustom.isSelected());
		bt.selectByVisibleText("DINESH DHABA");
	}

	public void verifyMyerpbillinddatecustom() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(billinddatecustom.isEnabled(),"billinddatecustom is enable");
		Reporter.log("verifyMyerpbillinddatecustom",true);
		billinddatecustom.sendKeys("10/03/2023");

	}


	public void verifyMyerpbillgenerationimmegiate() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(billgenerationimmegiate.isEnabled(),"billgenerationimmegiate is enable");
		Reporter.log("verifyMyerpbillgenerationimmegiate",true);
		billgenerationimmegiate.click();

	}
	public void verifyMyerpbillingtypeimmegiate() throws InterruptedException {
		Select bt = new Select(billingtypeimmegiate);
		Thread.sleep(1000);
		Assert.assertTrue(billingtypeimmegiate.isDisplayed(),"billingtypeimmegiate is  displayed");
		Assert.assertFalse(billingtypeimmegiate.isSelected());
		bt.selectByVisibleText("Immediate");
	}

	public void verifyMyerpbillinddateimmegiate() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(billinddateimmegiate.isEnabled(),"billinddateimmegiate is enable");
		Reporter.log("verifyMyerpbillinddateimmegiate",true);
		billinddateimmegiate.sendKeys("10/03/2023");

	}
}