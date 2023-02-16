package com.lpg.qa.accountsPages;

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
	@FindBy(xpath="//input[@id='rdoBank']")private WebElement retiobtn;
	@FindBy(xpath="//select[@id='ddlBank_cash']")private WebElement selectbank;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnGetdata']")private WebElement getdata;
	@FindBy(xpath="//input[@id='txtClr_Date0']")private WebElement clrdatesel;
	@FindBy(xpath="//input[@id='txtClr_Date1']")private WebElement clrdatesel1;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbutton;
	@FindBy(xpath="//input[@id='rdoDate']")private WebElement retiobtn1;
	
	//initialization
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
	public void verifyMyerpAccounts() {
		Assert.assertTrue(accounts.isEnabled(),"Accounts is enable");
		Reporter.log("verifyMyerpaccounts",true);
		accounts.click();
	}
	public void verifyMyerpBankReconciliation() {
		Assert.assertTrue(bankreconciliation.isEnabled(),"BankReconciliation is enable");
		Reporter.log("verifyMyerpbankreconciliation",true);
		bankreconciliation.click();
	}
	public void verifyMyerpRetiobtn() {
		Assert.assertTrue(retiobtn.isEnabled(),"Retiobtn is enable");
		Reporter.log("verifyMyerpretiobtn",true);
		retiobtn.click();
	}
	public void selectbank() throws InterruptedException {
		Select sb = new Select(selectbank);
		Thread.sleep(1000);
		Assert.assertTrue(selectbank.isDisplayed(),"selectbank is  displayed");
		Assert.assertFalse(selectbank.isSelected());
		sb.selectByVisibleText("IDBI BANK");
	}
	public void verifyMyerpClearbtn() {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void selectbank1() throws InterruptedException {
		Select sb = new Select(selectbank);
		Thread.sleep(1000);
		Assert.assertTrue(selectbank.isDisplayed(),"selectbank1 is  displayed");
		Assert.assertFalse(selectbank.isSelected());
		sb.selectByVisibleText("IDBI BANK");
	}
	public void verifyMyerpGetdata() {
		Assert.assertTrue(getdata.isEnabled(),"Getdata is enable");
		Reporter.log("verifyMyerpgetdata",true);
		getdata.click();
	}
	public void verifyMyerpClrdatesel() {
		Assert.assertTrue(clrdatesel.isEnabled(),"Clrdatesel is enable");
		Reporter.log("verifyMyerpclrdatesel",true);
		clrdatesel.sendKeys("16-12-2022");
	}
	public void verifyMyerpClrdatesel1() {
		Assert.assertTrue(clrdatesel.isEnabled(),"Clrdatesel1 is enable");
		Reporter.log("verifyMyerpclrdatesel",true);
		clrdatesel.sendKeys("16-12-2022");
	}
	public void verifyMyerpSubmitbutton() {
		Assert.assertTrue(submitbutton.isEnabled(),"Submitbutton is enable");
		Reporter.log("verifyMyerpsubmitbutton",true);
		submitbutton.click();
	}
	public void verifyMyerpRetiobtn1() {
		Assert.assertTrue(retiobtn.isEnabled(),"Retiobtn is enable");
		Reporter.log("verifyMyerpretiobtn",true);
		retiobtn.click();
	}

}
