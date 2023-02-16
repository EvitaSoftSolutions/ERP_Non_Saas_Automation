package com.lpg.qa.CounterSales;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class DBCForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' DBC']")private WebElement clickdbc;
	@FindBy(xpath="//input[@id='txtConsumerNoSearch']")private WebElement consumernumber;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement searchbtn;
	@FindBy(xpath="//input[@id='txtSVNo']")private WebElement svnumber;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement modofpayment;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashpayment;
	@FindBy(xpath="//input[@id='txtProduct']")private WebElement product;
	@FindBy(xpath="//input[@id='txtPrdQunatity']")private WebElement quantity;
	@FindBy(xpath="//input[@id='txtSrvUnitCost']")private WebElement unitcost;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//*[@id=\"tblmain\"]/tbody/tr/td[5]/a[1]")private WebElement viewreport;
	@FindBy(xpath="//*[@id=\"tblmain\"]/tbody/tr/td[5]/a[2]")private WebElement print; 
	@FindBy(xpath="//input[@id='btnback']")private WebElement btnback;
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/form/section[1]/h1/a")private WebElement updatedbcform;
	@FindBy(xpath="//input[@id='txtMDLDocumentNo']")private WebElement documentno; 
	@FindBy(xpath="//button[@id='btnMDLGet']")private WebElement ugetdatabtn;
	@FindBy(xpath="//*[@id=\"imgServiceRemove_6\"]")private WebElement userviceremove;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement uupdate;
	@FindBy(xpath="//*[@id=\"tblmain\"]/tbody/tr/td[5]/a[1]")private WebElement uviewreport;
	@FindBy(xpath="//*[@id=\"tblmain\"]/tbody/tr/td[5]/a[2]")private WebElement uprint; 

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
	public DBCForm(WebDriver driver) {
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
	public void verifyMyerpCounterSales() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(countersales.isEnabled(),"CounterSales is enable");
		Reporter.log("verifyMyerpcountersales",true);
		countersales.click();
	}
	public void verifyMyerpClickDbc() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(clickdbc.isEnabled(),"ClickDbc is enable");
		Reporter.log("verifyMyerpclickdbc",true);
		clickdbc.click();
	}
	public void verifyMyerpConsumerNumber() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(consumernumber.isEnabled(),"ConsumerNumber is enable");
		Reporter.log("verifyMyerpconsumernumber",true);
		consumernumber.sendKeys("666645");
	}
	public void verifyMyerpSearchbtn() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(searchbtn.isEnabled(),"Searchbtn is enable");
		Reporter.log("verifyMyerpsearchbtn",true);
		searchbtn.click();
	}
	public void verifyMyerpSVNumber() {
		Assert.assertTrue(svnumber.isEnabled(),"SVNumber is enable");
		Reporter.log("verifyMyerpsvnumber",true);
		svnumber.sendKeys("417");
	}
	public void ModofPayment() throws InterruptedException {
		Select mp = new Select(modofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modofpayment.isDisplayed(),"ModofPayment is  displayed");
		Assert.assertFalse(modofpayment.isSelected());
		mp.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashPayment() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(cashpayment.isEnabled(),"CashPayment is enable");
		Reporter.log("verifyMyerpcashpayment",true);
		cashpayment.sendKeys("1000");
	}
	public void verifyMyerpProduct() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(product.isEnabled(),"Product is enable");
		Reporter.log("verifyMyerpproduct",true);
		Thread.sleep(200);
		product.sendKeys("14.2 KG");
		Thread.sleep(800);
	}
	public void verifyMyerpQuantity() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(quantity.isEnabled(),"quantity is enable");
		Reporter.log("verifyMyerpquantity",true);
		quantity.sendKeys("12");
	}
	public void verifyMyerpUnitcost() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(unitcost.isEnabled(),"Unitcost is enable");
		Reporter.log("verifyMyerpunitcost",true);
		unitcost.sendKeys("20");
	}
	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
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
		if (isAlertPresent(driver)) { 
			System.out.println("alert is present");
			driver.switchTo().alert().accept();

		}else { System.out.println("alert is not present"); }

	} 
	public void verifyMyerpUpdateDBC() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(updatedbcform.isEnabled(),"updatedbcform is enable");
		Reporter.log("verifyMyerpupdatedbcform",true);
		updatedbcform.click();

	}
	public void verifyMyerpDOCNO() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(documentno.isEnabled(),"documentno is enable");
		Reporter.log("verifyMyerpdocumentno",true);
		documentno.click();
		documentno.sendKeys("2200049");
	}
	public void verifyMyerpGetDataBtn() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(ugetdatabtn.isEnabled(),"getdatabtn is enable");
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

			return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}
	public void verifyMyerpUpdateDBCBtn() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(uupdate.isEnabled(),"uupdate is enable");
		Reporter.log("verifyMyerpuupdate",true);
		Thread.sleep(1000); 
		//	userviceremove.click();
		//	userviceremove.click();
		Thread.sleep(1000); 
		uupdate.click();

		if (isAlertPresent1(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent1(WebDriver driver) throws
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

	public void verifyMyerpUViewReport() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(uviewreport.isEnabled(),"uviewreport is enable");
		Reporter.log("verifyMyeruviewreport",true);
		uviewreport.click();
		Thread.sleep(800);
		String id = driver.getWindowHandle();
		//			 System.out.println(id);

		Thread.sleep(800);
		// for multiple windows.
		// itrate==> get respective window==> switch ==> action 
		Set<String> winds = driver.getWindowHandles();
		Iterator<String> iterate = winds.iterator();
		String first_window = iterate.next();// 1 window is your parent window.
		System.out.println(first_window);
		driver.switchTo().window(first_window);
		Thread.sleep(800);

	}
	public void verifyMyerpUPrint() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(print.isEnabled(),"print is enable");
		Reporter.log("verifyMyerpprint",true);
		print.click();
		Thread.sleep(200);
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
		countersaleinvoiceno.sendKeys("2200049");

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
		Assert.assertTrue(todate.isEnabled(),"todate is enabled");
		Reporter.log(" verifyMyerptodate", true);
		todate.click();
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
		consumerno.sendKeys("666645");

	}
	public void VerifyandClickonMyerpCSRGetdataBtn() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
		Reporter.log(" verifyMyerpgetdatabtn", true);
		getdatabtn.click();
		getdatabtn.click();
	}
}




