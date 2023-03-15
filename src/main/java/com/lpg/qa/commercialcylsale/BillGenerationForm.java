package com.lpg.qa.commercialcylsale;

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
	@FindBy(xpath="//a[text()=' Bill Generation']")private WebElement billgeneration;
	@FindBy(xpath="//select[@id='ddlBillingType']")private WebElement billingtype;
	@FindBy(xpath="//input[@id='BillingDate']")private WebElement billingdate;
	@FindBy(xpath="//input[@id='txtInvoiceNo']")private WebElement invoicenum;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;

	@FindBy (xpath="//*[@id=\"menuReports\"]/a") private WebElement genralreport;
	@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[12]/a") private WebElement commercialcylsaleregister;
	@FindBy (xpath="//input[@id='FromDate']") private WebElement fromdate;
	@FindBy (xpath="//input[@id='ToDate']") private WebElement todate;   
	@FindBy (xpath="//select[@id='ddlDeliveryMan']") private WebElement selectdeliveryman;
	@FindBy (xpath="//select[@id='ddlProduct']") private WebElement selectproduct;
	@FindBy (xpath="//select[@id='ddlParty']") private WebElement selectparty;
	@FindBy (xpath="//Button[@id='btnGetdata']") private WebElement getdatabtn;

	@FindBy(xpath="//span[text()='Commercial Cyl. Sales']")private WebElement commercialcylsale;
	@FindBy(xpath="//a[text()=' Commercial Sale List']")private WebElement comsalelist;
	@FindBy(xpath="//input[@id='Challandate']")private WebElement comsaledate;
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/section[2]/div/div/div/form/div")private WebElement body;
	@FindBy(xpath="//select[@id='ddlDeliveryMan']")private WebElement deliverymanname;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn1;
	@FindBy(xpath="//*[@id=\"tblmain\"]/tbody/tr[1]/td[7]/a")private WebElement cseditbtn;

	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//*[@id=\"btnSubmit\"]")private WebElement submitbtn2;
	@FindBy(xpath="//button[@id='btnCancelled']")private WebElement cancelbillbtn;
	@FindBy(xpath="//button[@id='btnDelete']")private WebElement deletebtn;






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
	public void verifyMyerpBillgeneration() {
		Assert.assertTrue(billgeneration.isEnabled(),"Billgeneration is enable");
		Reporter.log("verifyMyerpbillgeneration",true);
		billgeneration.click();
	}

	public void Billingtype() throws InterruptedException {
		Select bt = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"Billingtype is  displayed");
		Assert.assertFalse(billingtype.isSelected());
		bt.selectByVisibleText("Daily");
	}
	public void verifyMyerpBillingdate() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(billingdate.isEnabled(),"Billingdate is enable");
		Reporter.log("verifyMyerpbillingdate",true);

		billingdate.sendKeys("3/03/2023");
	}
	public void verifyMyerpinvoicenumber() {
		Assert.assertTrue(invoicenum.isEnabled(),"invoicenum is enable");
		Reporter.log("verifyMyerpinvoicenum",true);
		invoicenum.click();
		invoicenum.sendKeys("34896");
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





	public void VerifyMyerpGenralReportModule() throws InterruptedException {
		Thread.sleep(2000); 
		Assert.assertTrue(genralreport.isEnabled(),"genralreport field is enabled");		 
		Reporter.log("verifyMyerpgenralreport", true);
		genralreport.click(); 
	}

	public void VerifyMyerpCommercialCylSaleRegister() throws InterruptedException {
		Thread.sleep(500); 
		Assert.assertTrue(commercialcylsaleregister.isEnabled(),"commercialcylsaleregister field is enabled");		 
		Reporter.log("verifyMyerpcommercialcylsaleregister", true);
		commercialcylsaleregister.click(); 
	}

	public void VerifyMyerpFromDate() throws InterruptedException {
		Thread.sleep(500); 
		Assert.assertTrue(fromdate.isEnabled(),"fromdate field is enabled");		 
		Reporter.log("verifyMyerpfromdate", true);
		fromdate.click(); 
		fromdate.clear();
		fromdate.sendKeys("3/03/2023");
	}

	public void VerifyMyerpTodate() throws InterruptedException {
		Thread.sleep(500); 
		Assert.assertTrue(todate.isEnabled(),"todate field is enabled");		 
		Reporter.log("verifyMyerptodate", true);
		todate.click(); 
		todate.clear();
		todate.sendKeys("3/03/2023");
	}
	public void verifyMyerpSelectDeliveryMan() throws InterruptedException {
		Thread.sleep(500); 
		Select su = new Select(selectdeliveryman);
		Thread.sleep(1000);
		Assert.assertFalse(selectdeliveryman.isDisplayed(),"selectdeliveryman is displayed");
		Assert.assertFalse(selectdeliveryman.isSelected());
		su.selectByVisibleText("DEEPAK PARAMAR");

	}
	public void verifyMyerpSelectProduct() throws InterruptedException {
		Thread.sleep(500); 
		Select su = new Select(selectproduct);
		Thread.sleep(1000);
		Assert.assertFalse(selectproduct.isDisplayed(),"selectdeliveryman is displayed");
		Assert.assertFalse(selectproduct.isSelected());
		su.selectByVisibleText("19 KG");

	}
	public void verifyMyerpSelectParty() throws InterruptedException {
		Thread.sleep(500); 
		Select su = new Select(selectparty);
		Thread.sleep(1000);
		Assert.assertFalse(selectparty.isDisplayed(),"selectparty is displayed");
		Assert.assertFalse(selectparty.isSelected());
		su.selectByVisibleText("SURYA HOTEL");

	}
	public void VerifyandClickonMyerpGetDataBtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
		Reporter.log("verifyMyerpgetdatabtn", true);
		getdatabtn.click();
	}


	public void verifyMyerpCommercialcylsale() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(commercialcylsale.isEnabled(),"Commercialcylsale is enable");
		Reporter.log("verifyMyerpcommercialcylsale",true);
		commercialcylsale.click();
	}
	public void verifyMyerpComsalelist() {
		Assert.assertTrue(comsalelist.isEnabled(),"Comsalelist is enable");
		Reporter.log("verifyMyerpcomsalelist",true);
		comsalelist.click();
	}
	public void verifyMyerpComsaleDate() {
		Assert.assertTrue(comsaledate.isEnabled(),"comsaledate is enable");
		Reporter.log("verifyMyerpcomsaledate",true);
		comsaledate.clear();
		comsaledate.sendKeys("3/03/2023");
		body.click();
	}


	public void Deliverymanname() throws InterruptedException {
		Select sc = new Select(deliverymanname);
		Thread.sleep(1000);
		Assert.assertFalse(deliverymanname.isDisplayed(),"Deliverymanname is  displayed");
		Assert.assertFalse(deliverymanname.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}

	public void verifyMyerpSubmitbtn1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();

	}

	public void verifyMyerpCSEditbtn() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(cseditbtn.isEnabled(),"CSEditbtn is enable");
		Reporter.log("verifyMyerpcseditbtn",true);
		cseditbtn.click();
		//Thread.sleep(3000);
	}
	public void verifyMyerpCashamount() throws InterruptedException {
		//Thread.sleep(5000);
		Assert.assertTrue(cashamount.isEnabled(),"Cashamount is enable");
		Reporter.log("verifyMyerpempcashamount",true);
		cashamount.clear();
		cashamount.sendKeys("8100");
	}
	public void verifyMyerpCScancelbillbtn() throws InterruptedException {
		//Thread.sleep(4000);
		Assert.assertTrue(cancelbillbtn.isEnabled(),"cancelbillbtn is enable");
		Reporter.log("verifyMyerpcscancelbillbtn",true);
		cancelbillbtn.click();
		Thread.sleep(800);
		if (isAlertPresent4(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent4(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);

			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(1200);
			al.accept();
			return true; }

		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}
	
	public void verifyMyerpSubmitbtn2() throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertTrue(submitbtn2.isEnabled(),"submitbtn2 is enable");
		Reporter.log("verifyMyerpsubmitbtn1",true);
		submitbtn2.click();
		Thread.sleep(800);
		if (isAlertPresent2(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent2(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);

			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(1200);
			al.accept();
			return true; }

		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}


}

