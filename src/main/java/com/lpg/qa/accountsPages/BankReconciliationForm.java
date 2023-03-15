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

public class BankReconciliationForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Accounts']")private WebElement accounts;
	@FindBy(xpath="//a[text()=' Bank Reconciliation']")private WebElement bankreconciliation;
	@FindBy(xpath="//input[@id='rdoBank']")private WebElement bankwiseunclear;
	@FindBy(xpath="//select[@id='ddlBank_cash']")private WebElement selectbank;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnGetdata']")private WebElement getdata;
	@FindBy(xpath="//input[@id='txtClr_Date0']")private WebElement clrdatesel;
	@FindBy(xpath="//input[@id='txtClr_Date1']")private WebElement clrdatesel1;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbutton;

	@FindBy(xpath="//input[@id='rdoDate']")private WebElement datewiseunclear;
	@FindBy(xpath="//input[@id='frmdate']")private WebElement selectformdate;
	@FindBy(xpath="//input[@id='todate']")private WebElement selecttodate;
	@FindBy(xpath="//input[@id='txtClr_Date0']")private WebElement clrdatesel2;

	@FindBy(xpath="//input[@id='rdoCheque']")private WebElement chequenowise;
	@FindBy(xpath="//input[@id='txtChqueNo']")private WebElement chequeno;
	
	@FindBy(xpath="//input[@id='rdoUpdate']")private WebElement UpdateDetailclear;
	@FindBy(xpath="//input[@id='frmdate']")private WebElement selectformdate1;
	@FindBy(xpath="//input[@id='todate']")private WebElement selecttodate1;
	@FindBy(xpath="//input[@id='txtClr_Date0']")private WebElement clrdatese3;


	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public BankReconciliationForm(WebDriver driver) {
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
		Thread.sleep(800);
		Assert.assertTrue(accounts.isEnabled(),"Accounts is enable");
		Reporter.log("verifyMyerpaccounts",true);
		accounts.click();
	}
	public void verifyMyerpBankReconciliation() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(bankreconciliation.isEnabled(),"BankReconciliation is enable");
		Reporter.log("verifyMyerpbankreconciliation",true);
		bankreconciliation.click();
	}
	public void verifyMyerpBankWiseunclear() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(bankwiseunclear.isEnabled(),"bankwiseunclear is enable");
		Reporter.log("verifyMyerpbankwiseunclear",true);
		bankwiseunclear.click();
	}
	public void selectbank() throws InterruptedException {
		Thread.sleep(800);
		Select sb = new Select(selectbank);
		Thread.sleep(1000);
		Assert.assertTrue(selectbank.isDisplayed(),"selectbank is  displayed");
		Assert.assertFalse(selectbank.isSelected());
		sb.selectByVisibleText("STATE BANK OF INDIA");
	}
	public void verifyMyerpClearbtn() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void selectbank1() throws InterruptedException {
		Thread.sleep(800);
		Select sb = new Select(selectbank);
		Thread.sleep(1000);
		Assert.assertTrue(selectbank.isDisplayed(),"selectbank1 is  displayed");
		Assert.assertFalse(selectbank.isSelected());
		sb.selectByVisibleText("STATE BANK OF INDIA");
	}
	public void verifyMyerpGetdata() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(getdata.isEnabled(),"Getdata is enable");
		Reporter.log("verifyMyerpgetdata",true);
		getdata.click();
	}
	public void verifyMyerpClrdatesel() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(clrdatesel.isEnabled(),"Clrdatesel is enable");
		Reporter.log("verifyMyerpclrdatesel",true);
		clrdatesel.clear();
		clrdatesel.sendKeys("10-03-2023");
	}
	public void verifyMyerpClrdatesel1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(clrdatesel1.isEnabled(),"Clrdatesel1 is enable");
		Reporter.log("verifyMyerpclrdatesel1",true);
		clrdatesel1.sendKeys("10-03-2023");
	}
	public void verifyMyerpSubmitbutton() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(submitbutton.isEnabled(),"Submitbutton is enable");
		Reporter.log("verifyMyerpsubmitbutton",true);
		submitbutton.click();
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
	public void verifyMyerpDateWiseUnclear() {
		Assert.assertTrue(datewiseunclear.isEnabled(),"datewiseunclear is enable");
		Reporter.log("verifyMyerpdatewiseunclear",true);
		datewiseunclear.click();
	}
	public void verifyMyerpselectformdate() {
		Assert.assertTrue(selectformdate.isEnabled(),"selectformdate is enable");
		Reporter.log("verifyMyerpselectformdate",true);
		selectformdate.click();
		selectformdate.clear();
		selectformdate.sendKeys("6/03/2023");
	}
	public void verifyMyerpClrdatesel2() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(clrdatesel2.isEnabled(),"Clrdatesel2 is enable");
		Reporter.log("verifyMyerpclrdatese2",true);
		clrdatesel2.click();
	}
	
	public void verifyMyerpChequeNoWise() {
		Assert.assertTrue(chequenowise.isEnabled(),"chequenowise is enable");
		Reporter.log("verifyMyerpchequenowise",true);
		chequenowise.click();
	}
	public void verifyMyerpchequeno() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(chequeno.isEnabled(),"chequeno is enable");
		Reporter.log("verifyMyerpchequeno",true);
		chequeno.sendKeys("200001");

	}
	
	public void verifyMyerpUpdateDetailclear() {
		Assert.assertTrue(UpdateDetailclear.isEnabled(),"UpdateDetailclear is enable");
		Reporter.log("verifyMyerpUpdateDetailclear",true);
		UpdateDetailclear.click();
	}
	public void verifyMyerpselectformdate1() {
		Assert.assertTrue(selectformdate1.isEnabled(),"selectformdate1 is enable");
		Reporter.log("verifyMyerpselectformdate1",true);
		selectformdate1.click();
		selectformdate1.clear();
		selectformdate1.sendKeys("6/03/2023");
	}
	public void verifyMyerpselecttodate1() {
		Assert.assertTrue(selecttodate1.isEnabled(),"selecttodate1 is enable");
		Reporter.log("verifyMyerpselecttodate1",true);
		selecttodate1.click();
		selecttodate1.clear();
		selecttodate1.sendKeys("10/03/2023");
	}
	public void verifyMyerpClrdatesel3() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(clrdatese3.isEnabled(),"clrdatese3 is enable");
		Reporter.log("verifyMyerpclrdatese3",true);
		clrdatese3.click();
		clrdatese3.clear();
	}
}
