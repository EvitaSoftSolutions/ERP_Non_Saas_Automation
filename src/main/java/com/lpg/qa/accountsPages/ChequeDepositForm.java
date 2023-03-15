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

public class ChequeDepositForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Accounts']")private WebElement accounts;
	@FindBy(xpath="//a[text()=' Cheque Deposit']")private WebElement chequedeposit;
	@FindBy (xpath="//select[@id='ddlBank']") private WebElement selectbank;
	@FindBy(xpath="//input[@id='Transdate']")private WebElement selectdate;  
	@FindBy(xpath="//input[@id='txtPara1']")private WebElement clearingradiobtn;
	@FindBy(xpath="//input[@id='txtPara2']")private WebElement transferradiobtn;
	@FindBy(xpath="//*[@id=\"btnShow\"]")private WebElement showbtn;
	@FindBy(xpath="//*[@id=\"btnPrint\"]")private WebElement printbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;

	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public ChequeDepositForm(WebDriver driver) {
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
		Thread.sleep(1500);
		Assert.assertTrue(accounts.isEnabled(),"Accounts is enable");
		Reporter.log("verifyMyerpaccounts",true);
		accounts.click();
	}
	public void verifyMyerpChequedeposit() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(chequedeposit.isEnabled(),"Chequedeposit is enable");
		Reporter.log("verifyMyerpchequedeposit",true);
		chequedeposit.click();
		Thread.sleep(1000);
	}
	public void VerifyMyerpPVSelectBank()  throws InterruptedException {
		Thread.sleep(1000);
		Select alss = new Select(selectbank);
		Assert.assertTrue(selectbank.isDisplayed(),"selectbank is displayed");
		Assert.assertFalse(selectbank.isSelected());
		Thread.sleep(800);
		alss.selectByVisibleText("STATE BANK OF INDIA");
		Thread.sleep(800);
	}
	public void VerifyMyerpSelectdate() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(selectdate.isEnabled(),"selectdate field is enabled");		 
		Reporter.log("verifyMyerpselectdate", true);
		selectdate.click(); 
		selectdate.clear();
		selectdate.sendKeys("6/03/2023");

	}

	public void VerifyandClickonMyerpClearingRadioBtn() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(clearingradiobtn.isEnabled(),"clearingradiobtn is enabled");
		Reporter.log(" verifyMyerpclearingradiobtn", true);
		clearingradiobtn.click();

	}
	public void VerifyandClickonMyerpTransferRadioBtn() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(transferradiobtn.isEnabled(),"transferradiobtn is enabled");
		Reporter.log(" verifyMyerptransferradiobtn", true);
		transferradiobtn.click();
	}
	public void VerifyandClickonMyerpshowbtnBtn() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(showbtn.isEnabled(),"showbtn is enabled");
		Reporter.log(" verifyMyerpshowbtn", true);
		showbtn.click();
		showbtn.click();
		Thread.sleep(1000);
	}
	public void VerifyandClickonMyerpPrintBtn() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(printbtn.isEnabled(),"printbtn is enabled");
		Reporter.log(" verifyMyerpprintbtn", true);
		printbtn.click();
		Thread.sleep(1000);
	}
	public void VerifyandClickonMyerpsubmitbtn() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is enabled");
		Reporter.log(" verifyMyerpsubmitbtn", true);
		submitbtn.click();
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