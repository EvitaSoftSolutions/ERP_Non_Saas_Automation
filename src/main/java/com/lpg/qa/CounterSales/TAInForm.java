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

public class TAInForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Transfer Advise (TA) In']")private WebElement transferadvice;
	@FindBy(xpath="//input[@id='txtGSTIN']")private WebElement consumergstin;
	@FindBy(xpath="//input[@id='txtDocNo']")private WebElement docserialno;
	@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement consumerno;
	@FindBy(xpath="//select[@id='ddlConsumerType']")private WebElement consumertype;
	@FindBy(xpath="//select[@id='ddlConnectionCategory']")private WebElement connectioncategory;
	@FindBy(xpath="//select[@id='ddlProductID']")private WebElement productselect;
	@FindBy(xpath="//input[@id='txtRegistrationNo']")private WebElement registratonno;
	@FindBy(xpath="//input[@id='txtConsumerName']")private WebElement consumername;
	@FindBy(xpath="//input[@id='txtAddress']")private WebElement address;
	@FindBy(xpath="//input[@id='txtCity']")private WebElement entercity;
	@FindBy(xpath="//select[@id='ddlstate']")private WebElement state;
	@FindBy(xpath="//select[@id='ddldistrict']")private WebElement district;
	@FindBy(xpath="//select[@id='ddlTahsil']")private WebElement tehsil;
	@FindBy(xpath="//input[@id='txtContact']")private WebElement contact;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement email;
	@FindBy(xpath="//input[@id='txtPreDistributerCode']")private WebElement predistcode;
	@FindBy(xpath="//input[@id='txtPreConsumerNo']")private WebElement preconsumerno;
	@FindBy(xpath="//select[@id='ddlPreDocType']")private WebElement predoctype;
	@FindBy(xpath="//input[@id='txtNumberofCylinder']")private WebElement numberofcyl;
	@FindBy(xpath="//input[@id='txtNumberofDPR']")private WebElement numberofdpr;
	@FindBy(xpath="//input[@id='txtRemarks']")private WebElement remarks;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
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
	@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement consumerno1;
	@FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn; 
	@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/div/section[2]/div/div/div/div") private WebElement body;



	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public TAInForm(WebDriver driver) {
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
		Thread.sleep(1000);
		Assert.assertTrue(countersales.isEnabled(),"CounterSales is enable");
		Reporter.log("verifyMyerpcountersales",true);
		countersales.click();
	}
	public void verifyMyerpTransferAdvice() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(transferadvice.isEnabled(),"TransferAdvice is enable");
		Reporter.log("verifyMyerptransferadvice",true);
		transferadvice.click();
	}
	public void verifyMyerpConsumerGstin() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(consumergstin.isEnabled(),"ConsumerGstin is enable");
		Reporter.log("verifyMyerpconsumergstin",true);
		consumergstin.sendKeys("12asdf124df1as");
	}
	public void verifyMyerpDocSerialNo() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(docserialno.isEnabled(),"DocSerialNo is enable");
		Reporter.log("verifyMyerpdocserialno",true);
		docserialno.sendKeys("50030");
	}
	public void verifyMyerpConsumerno() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("2011");
	}
	public void ConsumerType() throws InterruptedException {
		Select ct= new Select(consumertype);
		Thread.sleep(1000);
		Assert.assertFalse(consumertype.isDisplayed(),"ConsumerType is  displayed");
		Assert.assertFalse(consumertype.isSelected());
		ct.selectByVisibleText("DOMESTIC");
	}
	public void ConnectionCategory() throws InterruptedException {
		Select cc= new Select(connectioncategory);
		Thread.sleep(1000);
		Assert.assertFalse(connectioncategory.isDisplayed(),"ConnectionCategory is  displayed");
		Assert.assertFalse(connectioncategory.isSelected());
		cc.selectByVisibleText("VIP");
	}
	public void ProductSelect() throws InterruptedException {
		Select ps= new Select(productselect);
		Thread.sleep(1000);
		Assert.assertFalse(productselect.isDisplayed(),"ProductSelect is  displayed");
		Assert.assertFalse(productselect.isSelected());
		ps.selectByVisibleText("14.2 DOM");
	}
	public void verifyMyerpRegistratonNo() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(registratonno.isEnabled(),"RegistratonNo is enable");
		Reporter.log("verifyMyerpregistratonno",true);
		registratonno.sendKeys("7483");
	}
	public void verifyMyerpConsumerName() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(consumername.isEnabled(),"ConsumerName is enable");
		Reporter.log("verifyMyerpconsumername",true);
		consumername.sendKeys("Ganesh sonar");
	}
	public void verifyMyerpAddress() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(address.isEnabled(),"Address is enable");
		Reporter.log("verifyMyerpaddress",true);
		address.sendKeys("VIRAR");
	}
	public void verifyMyerpEnterCity() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(entercity.isEnabled(),"EnterCity is enable");
		Reporter.log("verifyMyerpentercity",true);
		entercity.sendKeys("VIRAR");
	}
	public void State() throws InterruptedException {
		Select s = new Select(state);
		Thread.sleep(1000);
		Assert.assertFalse(state.isDisplayed(),"State is  displayed");
		Assert.assertFalse(state.isSelected());
		s.selectByVisibleText("MAHARASHTRA");
	}
	public void District() throws InterruptedException {
		Select d = new Select(district);
		Thread.sleep(1000);
		Assert.assertFalse(district.isDisplayed(),"District is  displayed");
		Assert.assertFalse(district.isSelected());
		d.selectByVisibleText("Palghar");
	}
	public void Tehsil() throws InterruptedException {
		Select t = new Select(tehsil);
		Thread.sleep(1000);
		Assert.assertFalse(tehsil.isDisplayed(),"tehsil is  displayed");
		Assert.assertFalse(tehsil.isSelected());
		t.selectByVisibleText("Vasai");
	}
	public void verifyMyerpcontact() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(contact.isEnabled(),"contact is enable");
		Reporter.log("verifyMyerpcontact",true);
		contact.sendKeys("8970873496");
	}
	public void verifyMyerpEmail() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(email.isEnabled(),"Email is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("ganeshsonar123@gmail.com");
	}
	public void verifyMyerpPredistCode() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(predistcode.isEnabled(),"PredistCode is enable");
		Reporter.log("verifyMyerppredistcode",true);
		predistcode.sendKeys("21451");
	}
	public void verifyMyerpPreconSumerNo() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(preconsumerno.isEnabled(),"PreconSumerNo is enable");
		Reporter.log("verifyMyerppreconsumerno",true);
		preconsumerno.sendKeys("8978");
	}
	public void PredocType() throws InterruptedException {
		Select pt = new Select(predoctype);
		Thread.sleep(1000);
		Assert.assertFalse(predoctype.isDisplayed(),"PredocType is  displayed");
		Assert.assertFalse(predoctype.isSelected());
		pt.selectByVisibleText("DOMESTIC");
	}
	public void verifyMyerpNumberofcyl() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(numberofcyl.isEnabled(),"Numberofcyl is enable");
		Reporter.log("verifyMyerpnumberofcyl",true);
		numberofcyl.sendKeys("2");
	}
	public void verifyMyerpNumberofDpr() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(numberofdpr.isEnabled(),"NumberofDpr is enable");
		Reporter.log("verifyMyerpnumberofdpr",true);
		numberofdpr.sendKeys("1");
	}
	public void verifyMyerpRemarks() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(remarks.isEnabled(),"Remarks is enable");
		Reporter.log("verifyMyerpremarks",true);
		remarks.sendKeys("VERY GOOD");
	}
	public void verifyMyerpclearbtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(clearbtn.isEnabled(),"clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void verifyMyerpConsumerGstin1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(consumergstin.isEnabled(),"ConsumerGstin is enable");
		Reporter.log("verifyMyerpconsumergstin",true);
		consumergstin.sendKeys("19asdf1234df1as");
	}
	public void verifyMyerpDocSerialNo1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(docserialno.isEnabled(),"DocSerialNo is enable");
		Reporter.log("verifyMyerpdocserialno",true);
		docserialno.sendKeys("20090");
	}
	public void verifyMyerpConsumerno1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("2011");
	}
	public void ConsumerType1() throws InterruptedException {
		Select ct = new Select(consumertype);
		Thread.sleep(1000);
		Assert.assertFalse(consumertype.isDisplayed(),"ConsumerType is  displayed");
		Assert.assertFalse(consumertype.isSelected());
		ct.selectByVisibleText("DOMESTIC");
	}
	public void ConnectionCategory1() throws InterruptedException {
		Select cc = new Select(connectioncategory);
		Thread.sleep(1000);
		Assert.assertFalse(connectioncategory.isDisplayed(),"ConnectionCategory is  displayed");
		Assert.assertFalse(connectioncategory.isSelected());
		cc.selectByVisibleText("VIP");
	}
	public void ProductSelect1() throws InterruptedException {
		Select ps = new Select(productselect);
		Thread.sleep(1000);
		Assert.assertFalse(productselect.isDisplayed(),"ProductSelect is  displayed");
		Assert.assertFalse(productselect.isSelected());
		ps.selectByVisibleText("14.2 DOM");
	}
	public void verifyMyerpRegistratonNo1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(registratonno.isEnabled(),"RegistratonNo is enable");
		Reporter.log("verifyMyerpregistratonno",true);
		registratonno.sendKeys("3743");
	}
	public void verifyMyerpConsumerName1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(consumername.isEnabled(),"ConsumerName is enable");
		Reporter.log("verifyMyerpconsumername",true);
		consumername.sendKeys("Ganesh sonar");
	}
	public void verifyMyerpAddress1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(address.isEnabled(),"Address is enable");
		Reporter.log("verifyMyerpaddress",true);
		address.sendKeys("VIRAR");
	}
	public void verifyMyerpEnterCity1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(entercity.isEnabled(),"EnterCity is enable");
		Reporter.log("verifyMyerpentercity",true);
		entercity.sendKeys("VIRAR");
	}
	public void State1() throws InterruptedException {
		Select s = new Select(state);
		Thread.sleep(1000);
		Assert.assertFalse(state.isDisplayed(),"State is  displayed");
		Assert.assertFalse(state.isSelected());
		s.selectByVisibleText("MAHARASHTRA");
	}
	public void District1() throws InterruptedException {
		Select d = new Select(district);
		Thread.sleep(1000);
		Assert.assertFalse(district.isDisplayed(),"District is  displayed");
		Assert.assertFalse(district.isSelected());
		d.selectByVisibleText("Palghar");
	}
	public void Tehsil1() throws InterruptedException {
		Select t = new Select(tehsil);
		Thread.sleep(1000);
		Assert.assertFalse(tehsil.isDisplayed(),"tehsil is  displayed");
		Assert.assertFalse(tehsil.isSelected());
		t.selectByVisibleText("Vasai");
	}
	public void verifyMyerpcontact1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(contact.isEnabled(),"contact is enable");
		Reporter.log("verifyMyerpcontact",true);
		contact.sendKeys("8979923456");
	}
	public void verifyMyerpEmail1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(email.isEnabled(),"Email is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("ganeshsonar123@gmail.com");
	}
	public void verifyMyerpPredistCode1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(predistcode.isEnabled(),"PredistCode is enable");
		Reporter.log("verifyMyerppredistcode",true);
		predistcode.sendKeys("213451");
	}
	public void verifyMyerpPreconSumerNo1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(preconsumerno.isEnabled(),"PreconSumerNo is enable");
		Reporter.log("verifyMyerppreconsumerno",true);
		preconsumerno.sendKeys("8678");
	}
	public void PredocType1() throws InterruptedException {
		Select pt = new Select(predoctype);
		Thread.sleep(1000);
		Assert.assertFalse(predoctype.isDisplayed(),"PredocType is  displayed");
		Assert.assertFalse(predoctype.isSelected());
		pt.selectByVisibleText("DOMESTIC");
	}
	public void verifyMyerpNumberofcyl1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(numberofcyl.isEnabled(),"Numberofcyl is enable");
		Reporter.log("verifyMyerpnumberofcyl",true);
		numberofcyl.sendKeys("2");
	}
	public void verifyMyerpNumberofDpr1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(numberofdpr.isEnabled(),"NumberofDpr is enable");
		Reporter.log("verifyMyerpnumberofdpr",true);
		numberofdpr.sendKeys("1");
	}
	public void verifyMyerpRemarks1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(remarks.isEnabled(),"Remarks is enable");
		Reporter.log("verifyMyerpremarks",true);
		remarks.sendKeys("VERY GOOD");
	}
	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(500);

		if (isAlertPresent3(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent3(WebDriver driver) throws
	InterruptedException { 
		try {
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 

			return true; }
		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); 
		} return false;

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
		if (isAlertPresent1(driver)) { 
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
		if (isAlertPresent3(driver)) { System.out.println("alert is present");

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




