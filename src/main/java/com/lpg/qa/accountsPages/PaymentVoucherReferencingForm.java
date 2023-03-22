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
	@FindBy(xpath="//*[@id=\"ui-id-1\"]/li")private WebElement accountahead1;
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/form/section[2]/div/div/div/div")private WebElement boxbody;
	@FindBy(xpath="//select[@id='ddlDocID']")private WebElement nothingselect;
	@FindBy(xpath="//input[@id='txtAmtToAdj']")private WebElement amount;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clear;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement save;

	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
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
	public void verifyMyerpAccountahead() throws InterruptedException {
		Assert.assertTrue(accountahead.isEnabled(),"Accountahead is enable");
		Reporter.log("verifyMyerpaccountahead",true);
		accountahead.click();
		accountahead.sendKeys(" ");
		accountahead1.click();
		boxbody.click();
		Thread.sleep(500);
	}

	public void Nothingselect() throws InterruptedException {
		Select sc = new Select(nothingselect);
		Thread.sleep(1000);
		Assert.assertFalse(nothingselect.isDisplayed(),"Nothingselect is  displayed");
		Assert.assertFalse(nothingselect.isSelected());
		sc.selectByVisibleText("2300001****14/03/2023****200001****BPCL");
	}
	public void verifyMyerpAmount() {
		Assert.assertTrue(amount.isEnabled(),"Amount is enable");
		Reporter.log("verifyMyerpamount",true);
		amount.sendKeys("-1000");;
	}
	public void verifyMyerpClear() {
		Assert.assertTrue(clear.isEnabled(),"Clear is enable");
		Reporter.log("verifyMyerpclear",true);
		clear.click();
	}
	public void VerifyandClickonMyerpVRSaveBtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(save.isEnabled(),"savebtn form is enabled");
		Reporter.log("savebtn", true);
		save.click();
		Thread.sleep(2000);
		if (isAlertPresent7(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent7(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(1000);
			return true; }

		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}

} 
