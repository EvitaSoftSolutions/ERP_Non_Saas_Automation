package com.lpg.qa.CounterSales;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class SubscriptionVoucherForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Subscription Voucher']")private WebElement subscriptionvoucher;
	@FindBy(xpath="//input[@id='txtInvoiceNo']")private WebElement invoiceno;
	@FindBy(xpath="//input[@id='txtGSTIN']")private WebElement gstin;
	@FindBy(xpath="//input[@id='txtDocNo']")private WebElement domesticserno;
	@FindBy(xpath="//input[@id='txtSVNo']")private WebElement svno;
	@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement sconsumerno;
	@FindBy(xpath="//select[@id='ddlConsumerType']")private WebElement seldconsumertype;
	@FindBy(xpath="//select[@id='ddlArea']")private WebElement areaselect;
	@FindBy(xpath="//select[@id='ddlConnectionCategory']")private WebElement connectioncategory;
	@FindBy(xpath="//input[@id='txtRegistrationNo']")private WebElement registration;
	@FindBy(xpath="//input[@id='txtConsumerName']")private WebElement consumername;
	@FindBy(xpath="//input[@id='txtContact']")private WebElement contact;
	@FindBy(xpath="//input[@id='txtAddress']")private WebElement address;
	@FindBy(xpath="//input[@id='txtCity']")private WebElement city;
	@FindBy(xpath="//input[@id='txtBlueBookNo']")private WebElement bluebookno;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement email;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement modeofpayment;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//input[@id='txtProduct']")private WebElement product;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//input[@id='txtSrvUnitCost']")private WebElement unitcost;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//*[@id=\"tblmain\"]/tbody/tr/td[5]/a[1]")private WebElement viewreport;
	@FindBy(xpath="//*[@id=\"tblmain\"]/tbody/tr/td[5]/a[2]")private WebElement print; 
	@FindBy(xpath="//input[@id='btnback']")private WebElement btnback;
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/form/section[1]/h1/a")private WebElement updatesubscriptionvoucherform;
	@FindBy(xpath="//input[@id='txtMDLDocumentNo']")private WebElement documentno; 
	@FindBy(xpath="//button[@id='btnMDLGet']")private WebElement ugetdatabtn;
	@FindBy(xpath="//*[@id=\"txtService_3\"]")private WebElement  utextservice3;
	@FindBy(xpath="//*[@id=\"txtService_4\"]")private WebElement  utextservice4;
	@FindBy(xpath="//*[@id=\"txtSrvUnitCost_3\"]")private WebElement utxtunitcost3;
	@FindBy(xpath="//*[@id=\"txtSrvUnitCost_4\"]")private WebElement utxtunitcost4;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement uupdate;
	@FindBy(xpath="//button[@id='btnDelete']")private WebElement deletebtn;

	@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement gerneralreport; 
	@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[8]/a") private WebElement counterinvoicedetails;
	@FindBy(xpath="//select[@id='ddlCompanyCode']")private WebElement iselectcomp;
	@FindBy (xpath="//input[@id='txtCounterSaleId']") private WebElement countersaleinvoiceno;
	@FindBy (xpath="//button[@id='btnGetdata']") private WebElement igetdatabtn; 
	@FindBy (xpath="//button[@id='btnPrint']") private WebElement printinvoicebtn; 

	@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[7]/a") private WebElement contersaleregister; 
	@FindBy (xpath="//input[@id='FromDate']") private WebElement selectdate;
	@FindBy (xpath="//input[@id='ToDate']") private WebElement todate;
	@FindBy(xpath="//select[@id='ddlCompanyCode']")private WebElement selectcomp;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement selectpaymentmode; 
	@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement consumerno;
	@FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn; 
	@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/div/section[2]/div/div/div/div") private WebElement body;



	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public SubscriptionVoucherForm(WebDriver driver) {
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
	public void verifyMyerpCounterSales() {
		Assert.assertTrue(countersales.isEnabled(),"CounterSales is enable");
		Reporter.log("verifyMyerpcountersales",true);
		countersales.click();
	}
	public void verifyMyerpSubscriptionVoucher() {
		Assert.assertTrue(subscriptionvoucher.isEnabled(),"SubscriptionVoucher is enable");
		Reporter.log("verifyMyerpsubscriptionvoucher",true);
		subscriptionvoucher.click();

	}
	public void verifyMyerpInvoiceno() {
		Assert.assertTrue(invoiceno.isEnabled(),"Invoiceno is enable");
		Reporter.log("verifyMyerpinvoiceno",true);
		invoiceno.sendKeys("88593");

	}
	public void verifyMyerpGstIn() {
		Assert.assertTrue(gstin.isEnabled(),"GstIN is enable");
		Reporter.log("verifyMyerpgstin",true);
		gstin.sendKeys("98aaghja0320d1");
	}
	public void verifyMyerpDomesticserno() {
		Assert.assertTrue(domesticserno.isEnabled(),"Domesticserno is enable");
		Reporter.log("verifyMyerpdomesticserno",true);
		domesticserno.sendKeys("7799");
	}
	public void verifyMyerpSvno() {
		Assert.assertTrue(svno.isEnabled(),"Svno is enable");
		Reporter.log("verifyMyerpsvno",true);
		svno.sendKeys("17799");
	}
	public void verifyMyerpConsumerno() {
		Assert.assertTrue(sconsumerno.isEnabled(),"sConsumerno is enable");
		Reporter.log("verifyMyerpsconsumerno",true);
		sconsumerno.sendKeys("77720");
	}
	public void SelDconsumertype() throws InterruptedException {
		Select dt = new Select(seldconsumertype);
		Thread.sleep(1000);
		Assert.assertFalse(seldconsumertype.isDisplayed(),"SelDconsumertype is  displayed");
		Assert.assertFalse(seldconsumertype.isSelected());
		dt.selectByVisibleText("DOMESTIC");
	}
	public void AreaSelect() throws InterruptedException {
		Select as = new Select(areaselect);
		Thread.sleep(1000);
		Assert.assertFalse(areaselect.isDisplayed(),"AreaSelect is  displayed");
		Assert.assertFalse(areaselect.isSelected());
		as.selectByVisibleText("VIRAR");
	}
	public void ConnectionCategory() throws InterruptedException {
		Select cc = new Select(connectioncategory);
		Thread.sleep(1000);
		Assert.assertFalse(connectioncategory.isDisplayed(),"ConnectionCategory is  displayed");
		Assert.assertFalse(connectioncategory.isSelected());
		cc.selectByVisibleText("VIP");
	}
	public void verifyMyerpRegistration() {
		Assert.assertTrue(registration.isEnabled(),"Registration is enable");
		Reporter.log("verifyMyerpregistration",true);
		registration.sendKeys("44011");
	}
	public void verifyMyerponsumerName() {
		Assert.assertTrue(consumername.isEnabled(),"ConsumerName is enable");
		Reporter.log("verifyMyerpconsumername",true);
		consumername.sendKeys("MAHI VYAS");
	}
	public void verifyMyerpContact() {
		Assert.assertTrue(contact.isEnabled(),"Contact is enable");
		Reporter.log("verifyMyerpcontact",true);
		contact.sendKeys("9839928399");
	}
	public void verifyMyerpAddress() {
		Assert.assertTrue(address.isEnabled(),"Address is enable");
		Reporter.log("verifyMyerpaddress",true);
		address.sendKeys("VIRAR");
	}
	public void verifyMyerpCity() {
		Assert.assertTrue(city.isEnabled(),"City is enable");
		Reporter.log("verifyMyerpcity",true);
		city.sendKeys("VIRAR");
	}
	public void verifyMyerpBlueBookno() {
		Assert.assertTrue(bluebookno.isEnabled(),"BlueBookno is enable");
		Reporter.log("verifyMyerpbluebookno",true);
		bluebookno.sendKeys("134909");
	}
	public void verifyMyerpEmail() {
		Assert.assertTrue(email.isEnabled(),"Email is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("perrta1230@gmail.com");
	}
	public void ModeofPayment() throws InterruptedException {
		Select mp = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"ModeofPayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		mp.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashAmount() {
		Assert.assertTrue(cashamount.isEnabled(),"CashAmount is enable");
		Reporter.log("verifyMyerpcashamount",true);
		cashamount.sendKeys("204450");
	}
	public void verifyMyerpProduct() {
		Assert.assertTrue(product.isEnabled(),"Product is enable");
		Reporter.log("verifyMyerpproduct",true);
		product.sendKeys("14.2 DOM");
	}
	public void verifyMyerpClearbtn() {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void verifyMyerpInvoiceno1() {
		Assert.assertTrue(invoiceno.isEnabled(),"Invoiceno is enable");
		Reporter.log("verifyMyerpinvoiceno",true);
		invoiceno.sendKeys("45655");
	}
	public void verifyMyerpGstIn1() {
		Assert.assertTrue(gstin.isEnabled(),"GstIN is enable");
		Reporter.log("verifyMyerpgstin",true);
		gstin.sendKeys("56aaq20d1z3");
	}
	public void verifyMyerpDomesticserno1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(domesticserno.isEnabled(),"Domesticserno is enable");
		Reporter.log("verifyMyerpdomesticserno",true);
		domesticserno.sendKeys("10125");
	}
	public void verifyMyerpSvno1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(svno.isEnabled(),"Svno is enable");
		Reporter.log("verifyMyerpsvno",true);
		svno.sendKeys("15420");
	}
	public void verifyMyerpConsumerno1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(sconsumerno.isEnabled(),"sconsumerno is enable");
		Reporter.log("verifyMyerpsconsumerno",true);
		sconsumerno.sendKeys("25670");
	}
	public void SelDconsumertype1() throws InterruptedException {
		Select dt = new Select(seldconsumertype);
		Thread.sleep(1000);
		Assert.assertFalse(seldconsumertype.isDisplayed(),"SelDconsumertype is  displayed");
		Assert.assertFalse(seldconsumertype.isSelected());
		dt.selectByVisibleText("DOMESTIC");
	}
	public void AreaSelect1() throws InterruptedException {
		Select as = new Select(areaselect);
		Thread.sleep(1000);
		Assert.assertFalse(areaselect.isDisplayed(),"AreaSelect is  displayed");
		Assert.assertFalse(areaselect.isSelected());
		as.selectByVisibleText("VIRAR");
	}
	public void ConnectionCategory1() throws InterruptedException {
		Select cc = new Select(connectioncategory);
		Thread.sleep(1000);
		Assert.assertFalse(connectioncategory.isDisplayed(),"ConnectionCategory is  displayed");
		Assert.assertFalse(connectioncategory.isSelected());
		cc.selectByVisibleText("VIP");
	}
	public void verifyMyerpRegistration1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(registration.isEnabled(),"Registration is enable");
		Reporter.log("verifyMyerpregistration",true);
		registration.sendKeys("134561");
	}
	public void verifyMyerponsumerName1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(consumername.isEnabled(),"ConsumerName is enable");
		Reporter.log("verifyMyerpconsumername",true);
		consumername.sendKeys("MAHI VYAS");
	}
	public void verifyMyerpContact1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(contact.isEnabled(),"Contact is enable");
		Reporter.log("verifyMyerpcontact",true);
		contact.sendKeys("7037538349");
	}
	public void verifyMyerpAddress1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(address.isEnabled(),"Address is enable");
		Reporter.log("verifyMyerpaddress",true);
		address.sendKeys("VIRAR");
	}
	public void verifyMyerpCity1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(city.isEnabled(),"City is enable");
		Reporter.log("verifyMyerpcity",true);
		city.sendKeys("VIRAR");
	}
	public void verifyMyerpBlueBookno1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(bluebookno.isEnabled(),"BlueBookno is enable");
		Reporter.log("verifyMyerpbluebookno",true);
		bluebookno.sendKeys("10899");
	}
	public void verifyMyerpEmail1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(email.isEnabled(),"Email is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("mahi1230@gmail.com");
	}
	public void ModeofPayment1() throws InterruptedException {
		Select mp = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"ModeofPayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		mp.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashAmount1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(cashamount.isEnabled(),"CashAmount is enable");
		Reporter.log("verifyMyerpcashamount",true);
		cashamount.sendKeys("25110");
	}
	public void verifyMyerpProduct1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(product.isEnabled(),"Product is enable");
		Reporter.log("verifyMyerpproduct",true);
		product.sendKeys("14.2 DOM");
	}
	public void verifyMyerpUnitcost() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(unitcost.isEnabled(),"Unitcost is enable");
		Reporter.log("verifyMyerpunitcost",true);
		unitcost.clear();
		unitcost.sendKeys("100");
	}

	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		Thread.sleep(2000);
		submitbtn.click();
		if (isAlertPresent(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent(WebDriver driver) throws
	InterruptedException { 
		try {
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(2000);
			al.accept();
			return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}
	public void verifyMyerpViewReport() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(viewreport.isEnabled(),"viewreport is enable");
		Reporter.log("verifyMyerviewreport",true);
		viewreport.click();
		Thread.sleep(800);
		Assert.assertTrue(btnback.isEnabled(),"btnback is enable");
		Reporter.log("verifyMyerbtnback",true);
		btnback.click();

	}
	public void verifyMyerpPrint() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(print.isEnabled(),"print is enable");
		Reporter.log("verifyMyerpprint",true);
		print.click();
		Thread.sleep(200);
		if (isAlertPresent1(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent1(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(200);
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}
	public void verifyMyerpUpdateSunscriptionVoucherForm() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(updatesubscriptionvoucherform.isEnabled(),"updatesubscriptionvoucherform is enable");
		Reporter.log("verifyMyerpupdatesubscriptionvoucherform",true);
		updatesubscriptionvoucherform.click();
	}
	public void verifyMyerpDocumentno() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(documentno.isEnabled(),"documentno is enable");
		Reporter.log("verifyMyerpdocumentno",true);
		documentno.click();
		documentno.sendKeys("2200045");
	}
	public void verifyMyerpGetDataBtn() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(ugetdatabtn.isEnabled(),"ugetdatabtn is enable");
		Reporter.log("verifyMyerpugetdatabtn",true);
		ugetdatabtn.click();
		if (isAlertPresent2(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent2(WebDriver driver) throws
	InterruptedException { 
		try {
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(2000); 
			return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}
	public void verifyMyerpUTXTSERVICE3() throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertTrue(utextservice3.isEnabled(),"utextservice3 is enable");
		Reporter.log("verifyMyerputextservice3",true);
		utextservice3.click();
		utextservice3.sendKeys("ADVERTISEMENT CHARGES");
		Thread.sleep(2000);
	}

	public void verifyMyerpUTXTSERVICE4() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(utextservice4.isEnabled(),"utextservice4 is enable");
		Reporter.log("verifyMyerputextservice4",true);
		utextservice4.click();
		utextservice4.sendKeys("INTERNET CHARGES");
		Thread.sleep(2000);
	} 
	public void verifyMyerpUTXTUNITCost3() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(utxtunitcost3.isEnabled(),"utxtunitcost3 is enable");
		Reporter.log("verifyMyerutxtunitcost3",true);
		utxtunitcost3.click();
		utxtunitcost3.sendKeys("120");
		Thread.sleep(2000);
	} 
	public void verifyMyerpUTXTUNITCost4() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(utxtunitcost4.isEnabled(),"utxtunitcost4 is enable");
		Reporter.log("verifyMyerutxtunitcost3",true);
		utxtunitcost4.click();
		utxtunitcost4.sendKeys("120");
		Thread.sleep(2000);
	} 

	public void verifyMyerpUpdatesubmitBtn() throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertTrue(uupdate.isEnabled(),"uupdate is enable");
		Reporter.log("verifyMyerpuupdate",true);
		uupdate.click();
		Thread.sleep(2000);
		if (isAlertPresent3(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent3(WebDriver driver) throws
	InterruptedException { 
		try {
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(2000);
			al.accept();

			return true; 
		}
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}

	public void verifyMyerpDeleteBtn() throws InterruptedException {
		Thread.sleep(2000);
		btnback.click();
		Thread.sleep(2000);
		Assert.assertTrue(deletebtn.isEnabled(),"deletebtn is enable");
		Reporter.log("verifyMyerpdeletebtn",true);
		deletebtn.click();
		if (isAlertPresent4(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent4(WebDriver driver) throws
	InterruptedException { 
		try {
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(2000);
			al.accept();
			return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}

	public void VerifyandClickonMyerpGeneralReport() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(gerneralreport.isEnabled(),"gerneralreport is enabled");
		Reporter.log(" verifyMyerpgerneralreport", true);
		gerneralreport.click();
	}
	public void VerifyandClickonMyerpConterInvoiceDetails() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(counterinvoicedetails.isEnabled(),"counterinvoicedetails is enabled");
		Reporter.log(" verifyMyerpcounterinvoicedetails", true);
		counterinvoicedetails.click();
	}

	public void verifyMyerpCSelectCompany() throws InterruptedException {
		Select su = new Select(selectcomp);
		Thread.sleep(1000);
		Assert.assertFalse(iselectcomp.isDisplayed(),"iSelectCompany is displayed");
		Assert.assertFalse(iselectcomp.isSelected());
		su.selectByVisibleText("ANITA GAS SERVICES");

	}

	public void VerifyandClickonMyerpCounterSaleVoucherNumber() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(countersaleinvoiceno.isEnabled(),"purchasebillno is enabled");
		Reporter.log(" verifyMyerppurchasebillno", true);
		countersaleinvoiceno.click();
		countersaleinvoiceno.sendKeys("2200042");

	}
	public void VerifyandClickonMyerpGetdataBtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(igetdatabtn.isEnabled(),"igetdatabtn is enabled");
		Reporter.log(" verifyMyerpgetdatabtn", true);
		igetdatabtn.click();

	}
	public void VerifyandClickonMyerpPrintInvoiceBtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(printinvoicebtn.isEnabled(),"printinvoicebtn is enabled");
		Reporter.log(" verifyMyerprintinvoicebtn", true);
		printinvoicebtn.click();

	}
	public void VerifyandClickonMyerpCSIDGeneralReport() throws InterruptedException { 
		Thread.sleep(1000);
		Assert.assertTrue(gerneralreport.isEnabled(),"gerneralreport is enabled");
		Reporter.log(" verifyMyerpgerneralreport", true);
		gerneralreport.click();
	}
	public void VerifyandClickonMyerpCountersaleRegister() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(contersaleregister.isEnabled(),"contersaleregister is enabled");
		Reporter.log(" verifyMyerpcontersaleregister", true);
		contersaleregister.click();
	}
	public void VerifyandClickonMyerpPlaseFromSelectDate() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(selectdate.isEnabled(),"selectdate is enabled");
		Reporter.log(" verifyMyerpselectdate", true);
		selectdate.click();
		selectdate.clear();
		selectdate.sendKeys("7/01/2023");
		body.click();
		Thread.sleep(500);
	}
	public void VerifyandClickonMyerpPlaseToSelectDate() throws InterruptedException {
		Assert.assertTrue(selectdate.isEnabled(),"selectdate is enabled");
		Reporter.log(" verifyMyerpselectdate", true);
		selectdate.click();
		selectdate.clear();
		selectdate.sendKeys("8/01/2023");
		body.click();
		Thread.sleep(500);
	}

	public void verifyMyerpSelectCompany() throws InterruptedException {
		Select su = new Select(selectcomp);
		Thread.sleep(1000);
		Assert.assertFalse(selectcomp.isDisplayed(),"SelectCompany is displayed");
		Assert.assertFalse(selectcomp.isSelected());
		su.selectByVisibleText("ANITA GAS SERVICES");

	}
	public void verifyMyerpSelectPaymentMode() throws InterruptedException {
		Select su = new Select(selectpaymentmode);
		Thread.sleep(1000);
		Assert.assertFalse(selectpaymentmode.isDisplayed(),"selectpaymentmode is displayed");
		Assert.assertFalse(selectpaymentmode.isSelected());
		su.selectByVisibleText("CASH");

	}

	public void VerifyandClickonMyerpConsumerNumber() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(consumerno.isEnabled(),"consumerno is enabled");
		Reporter.log(" verifyMyerpconsumerno", true);
		consumerno.click();
		consumerno.sendKeys("59820");

	}
	public void VerifyandClickonMyerpCSRGetdataBtn() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
		Reporter.log(" verifyMyerpgetdatabtn", true);
		getdatabtn.click();
		getdatabtn.click();
	}
}
