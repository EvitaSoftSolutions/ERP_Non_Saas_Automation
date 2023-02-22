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

public class TvinForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Transfer Voucher (TV) In']")private WebElement tvinlogin;
	@FindBy(xpath="//input[@id='txtInvoiceNo']")private WebElement invoiceno;
	@FindBy(xpath="//input[@id='txtGSTIN']")private WebElement consumergstin;
	@FindBy(xpath="//input[@id='txtDocNo']")private WebElement documentserialno;
	@FindBy(xpath="//input[@id='txtSVNo']")private WebElement svno;
	@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement consumerno;
	@FindBy(xpath="//select[@id='ddlConsumerType']")private WebElement consumertype;
	@FindBy(xpath="//select[@id='ddlArea']")private WebElement selectarea;
	@FindBy(xpath="//select[@id='ddlConnectionCategory']")private WebElement connectioncategory;
	@FindBy(xpath="//input[@id='txtRegistrationNo']")private WebElement registrationno;
	@FindBy(xpath="//input[@id='txtConsumerName']")private WebElement consumername;
	@FindBy(xpath="//input[@id='txtAddress']")private WebElement adress;
	@FindBy(xpath="//input[@id='txtCity']")private WebElement entercity;
	@FindBy(xpath="//input[@id='txtContact']")private WebElement contact;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement email;
	@FindBy(xpath="//input[@id='txtPreDistributerCode']")private WebElement predistibutorcode;
	@FindBy(xpath="//input[@id='txtPreConsumerNo']")private WebElement preconsumerno;
	@FindBy(xpath="//select[@id='ddlPreDocType']")private WebElement predocumenttype;
	@FindBy(xpath="//input[@id='txtPreOilCompany']")private WebElement preoilcompany;
	@FindBy(xpath="//input[@id='txtBlueBookNo']")private WebElement bluebookno;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement modeofpayment;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//input[@id='txtProduct']")private WebElement product;
	@FindBy(xpath="//input[@id='txtPrdQunatity']")private WebElement quantity;
	@FindBy(xpath="//input[@id='txtSrvUnitCost']")private WebElement unitcost;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/form/section[1]/h1/a")private WebElement updatetvinform;
	@FindBy(xpath="//input[@id='txtUMDLDocumentNo']")private WebElement updatedocno;
	@FindBy(xpath="//button[@id='btnUMDLGet']")private WebElement ugetdatabtn;
	@FindBy(xpath="//input[@id='imgServiceRemove_2']")private WebElement uremoveservice;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement usubmitbtn;
	@FindBy(xpath="//input[@id='btnback']")private WebElement ubackbtn; 
	@FindBy(xpath="//select[@id='ddlCompanyService_1']")private WebElement selectcompany;
	@FindBy(xpath="//input[@id='txtService_1']")private WebElement uservicetextbox1;
	@FindBy(xpath="//input[@id='txtSrvQunatity_1']")private WebElement quantitytextbox1;
	@FindBy(xpath="//input[@id='txtSrvUnitCost_1']")private WebElement unitcost2;
	@FindBy(xpath="//input[@id='txtService_3']")private WebElement uservicetextbox3;
	@FindBy(xpath="//input[@id='txtSrvUnitCost_3']")private WebElement unitcost3;
	@FindBy(xpath="//input[@id='imgServiceRemove_1']")private WebElement uremoveservice1;
	@FindBy(xpath="//input[@id='imgServiceRemove_2']")private WebElement uremoveservice2;
	@FindBy(xpath="//input[@id='imgServiceRemove_3']")private WebElement uremoveservice3;
	@FindBy(xpath="//input[@id='imgServiceRemove_4']")private WebElement uremoveservice4;

	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public TvinForm(WebDriver driver) {
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
	public void verifyMyerpTvinlogin() {
		Assert.assertTrue(countersales.isEnabled(),"Tvinlogin is enable");
		Reporter.log("verifyMyerptvinlogin",true);
		tvinlogin.click();
	}
	public void verifyMyerpInvoiceno() {
		Assert.assertTrue(invoiceno.isEnabled(),"Invoiceno is enable");
		Reporter.log("verifyMyerpinvoiceno",true);
		invoiceno.sendKeys("20921");
	}
	public void verifyMyerpConsumergstin() {
		Assert.assertTrue(consumergstin.isEnabled(),"Consumergstin is enable");
		Reporter.log("verifyMyerpconsumergstin",true);
		consumergstin.sendKeys("12azad1713ba1d4");
	}
	public void verifyMyerpDocumentserialno() {
		Assert.assertTrue(documentserialno.isEnabled(),"Documentserialno is enable");
		Reporter.log("verifyMyerpdocumentserialno",true);
		documentserialno.sendKeys("9201");
	}
	public void verifyMyerpSvno() {
		Assert.assertTrue(svno.isEnabled(),"Svno is enable");
		Reporter.log("verifyMyerpsvno",true);
		svno.sendKeys("58781");
	}
	public void verifyMyerpconsumerno() {
		Assert.assertTrue(consumerno.isEnabled(),"consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("8921");
	}
	public void SelectConsumertype() throws InterruptedException {
		Select sc = new Select(consumertype);
		Thread.sleep(1000);
		Assert.assertFalse(consumertype.isDisplayed(),"Consumertype is  displayed");
		Assert.assertFalse(consumertype.isSelected());
		sc.selectByVisibleText("DOMESTIC");
	}
	public void SelectArea() throws InterruptedException {
		Select sc = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"SelectArea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		sc.selectByVisibleText("VIRAR");
	}
	public void Connectioncategory() throws InterruptedException {
		Select sc = new Select(connectioncategory);
		Thread.sleep(1000);
		Assert.assertFalse(connectioncategory.isDisplayed(),"Connectioncategory is  displayed");
		Assert.assertFalse(connectioncategory.isSelected());
		sc.selectByVisibleText("VIP");
	}
	public void verifyMyerpRegistrationno() {
		Assert.assertTrue(registrationno.isEnabled(),"Registrationno is enable");
		Reporter.log("verifyMyerpregistrationno",true);
		registrationno.sendKeys("28109");
	}
	public void verifyMyerpconsumername() {
		Assert.assertTrue(consumername.isEnabled(),"consumername is enable");
		Reporter.log("verifyMyerpconsumername",true);
		consumername.sendKeys("mufidali");
	}
	public void verifyMyerpAdress() {
		Assert.assertTrue(adress.isEnabled(),"Adress is enable");
		Reporter.log("verifyMyerpadress",true);
		adress.sendKeys("VIRAR");
	}
	public void verifyMyerpEntercity() {
		Assert.assertTrue(entercity.isEnabled(),"EnterCity is enable");
		Reporter.log("verifyMyerpentercity",true);
		entercity.sendKeys("VIRAR");
	}
	public void verifyMyerpContact() {
		Assert.assertTrue(contact.isEnabled(),"Contact is enable");
		Reporter.log("verifyMyerpcontact",true);
		contact.sendKeys("7691203546");
	}
	public void verifyMyerpEmail() {
		Assert.assertTrue(email.isEnabled(),"Email is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("mufida903@gmail.com");
	}
	public void verifyMyerpPredistibutorcode() {
		Assert.assertTrue(predistibutorcode.isEnabled(),"Predistibutorcode is enable");
		Reporter.log("verifyMyerppredistibutorcode",true);
		predistibutorcode.sendKeys("762200");
	}
	public void verifyMyerpPreconsumerno() {
		Assert.assertTrue(preconsumerno.isEnabled(),"Preconsumerno is enable");
		Reporter.log("verifyMyerppreconsumerno",true);
		preconsumerno.sendKeys("47010");
	}
	public void Predocumenttype() throws InterruptedException {
		Select sc = new Select(predocumenttype);
		Thread.sleep(1000);
		Assert.assertFalse(predocumenttype.isDisplayed(),"Predocumenttype is  displayed");
		Assert.assertFalse(predocumenttype.isSelected());
		sc.selectByVisibleText("ADHAR CARD");
	}
	public void verifyMyerpPreoilcompany() {
		Assert.assertTrue(preoilcompany.isEnabled(),"Preoilcompany is enable");
		Reporter.log("verifyMyerppreoilcompany",true);
		preoilcompany.sendKeys("BPCL");
	}
	public void verifyMyerpBluebookno() {
		Assert.assertTrue(bluebookno.isEnabled(),"Bluebookno is enable");
		Reporter.log("verifyMyerpbluebookno",true);
		bluebookno.sendKeys("6289");
	}
	public void Modeofpayment() throws InterruptedException {
		Select sc = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"Modeofpayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashAmount() {
		Assert.assertTrue(cashamount.isEnabled(),"CashAmount is enable");
		Reporter.log("verifyMyerpcashamount",true);
		cashamount.sendKeys("1000");
	}
	public void verifyMyerpProduct() {
		Assert.assertTrue(product.isEnabled(),"product is enable");
		Reporter.log("verifyMyerpproduct",true);
		product.sendKeys("14.2 KG");
	}
	public void verifyMyerpQuantity() {
		Assert.assertTrue(quantity.isEnabled(),"Quantity is enable");
		Reporter.log("verifyMyerpquantity",true);
		quantity.clear();
		quantity.sendKeys("2");
	}
	public void verifyMyerpUnitcost() {
		Assert.assertTrue(unitcost.isEnabled(),"Unitcost is enable");
		Reporter.log("verifyMyerpunitcost",true);
		unitcost.sendKeys("120");
	}
	public void verifyMyerpClearbtn() {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void verifyMyerpInvoiceno1() {
		Assert.assertTrue(invoiceno.isEnabled(),"Invoiceno is enable");
		Reporter.log("verifyMyerpinvoiceno",true);
		invoiceno.sendKeys("87601");
	}
	public void verifyMyerpConsumergstin1() {
		Assert.assertTrue(consumergstin.isEnabled(),"Consumergstin is enable");
		Reporter.log("verifyMyerpconsumergstin",true);
		consumergstin.sendKeys("971azad1019ba45d");
	}
	public void verifyMyerpDocumentserialno1() {
		Assert.assertTrue(documentserialno.isEnabled(),"Documentserialno is enable");
		Reporter.log("verifyMyerpdocumentserialno",true);
		documentserialno.sendKeys("009281");
	}
	public void verifyMyerpSvno1() {
		Assert.assertTrue(svno.isEnabled(),"Svno is enable");
		Reporter.log("verifyMyerpsvno",true);
		svno.sendKeys("9878");
	}
	public void verifyMyerpconsumerno1() {
		Assert.assertTrue(consumerno.isEnabled(),"consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("2342");
	}
	public void SelectConsumertype1() throws InterruptedException {
		Select sc = new Select(consumertype);
		Thread.sleep(1000);
		Assert.assertFalse(consumertype.isDisplayed(),"Consumertype is  displayed");
		Assert.assertFalse(consumertype.isSelected());
		sc.selectByVisibleText("DOMESTIC");
	}
	public void SelectArea1() throws InterruptedException {
		Select sc = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"SelectArea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		sc.selectByVisibleText("VIRAR");
	}
	public void Connectioncategory1() throws InterruptedException {
		Select sc = new Select(connectioncategory);
		Thread.sleep(1000);
		Assert.assertFalse(connectioncategory.isDisplayed(),"Connectioncategory is  displayed");
		Assert.assertFalse(connectioncategory.isSelected());
		sc.selectByVisibleText("VIP");
	}
	public void verifyMyerpRegistrationno1() {
		Assert.assertTrue(registrationno.isEnabled(),"Registrationno is enable");
		Reporter.log("verifyMyerpregistrationno",true);
		registrationno.sendKeys("7858979");
	}
	public void verifyMyerpconsumername1() {
		Assert.assertTrue(consumername.isEnabled(),"consumername is enable");
		Reporter.log("verifyMyerpconsumername",true);
		consumername.sendKeys("mufidali");
	}
	public void verifyMyerpAdress1() {
		Assert.assertTrue(adress.isEnabled(),"Adress is enable");
		Reporter.log("verifyMyerpadress",true);
		adress.sendKeys("VIRAR");
	}
	public void verifyMyerpEntercity1() {
		Assert.assertTrue(entercity.isEnabled(),"EnterCity is enable");
		Reporter.log("verifyMyerpentercity",true);
		entercity.sendKeys("VIRAR");
	}
	public void verifyMyerpContact1() {
		Assert.assertTrue(contact.isEnabled(),"Contact is enable");
		Reporter.log("verifyMyerpcontact",true);
		contact.sendKeys("8291983546");
	}
	public void verifyMyerpEmail1() {
		Assert.assertTrue(email.isEnabled(),"Email is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("mufida0413@gmail.com");
	}
	public void verifyMyerpPredistibutorcode1() {
		Assert.assertTrue(predistibutorcode.isEnabled(),"Predistibutorcode is enable");
		Reporter.log("verifyMyerppredistibutorcode",true);
		predistibutorcode.clear();
		predistibutorcode.sendKeys("12138");
	}
	public void verifyMyerpPreconsumerno1() {
		Assert.assertTrue(preconsumerno.isEnabled(),"Preconsumerno is enable");
		Reporter.log("verifyMyerppreconsumerno",true);
		preconsumerno.clear();
		preconsumerno.sendKeys("26574");
	}
	public void Predocumenttype1() throws InterruptedException {
		Select sc = new Select(predocumenttype);
		Thread.sleep(1000);
		Assert.assertFalse(predocumenttype.isDisplayed(),"Predocumenttype is  displayed");
		Assert.assertFalse(predocumenttype.isSelected());
		sc.selectByVisibleText("ADHAR CARD");
	}
	public void verifyMyerpPreoilcompany1() {
		Assert.assertTrue(preoilcompany.isEnabled(),"Preoilcompany is enable");
		Reporter.log("verifyMyerppreoilcompany",true);
		preoilcompany.sendKeys("BPCL");
	}
	public void verifyMyerpBluebookno1() {
		Assert.assertTrue(bluebookno.isEnabled(),"Bluebookno is enable");
		Reporter.log("verifyMyerpbluebookno",true);
		bluebookno.sendKeys("8327");
	}
	public void Modeofpayment1() throws InterruptedException {
		Select sc = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"Modeofpayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashAmount1() {
		Assert.assertTrue(cashamount.isEnabled(),"CashAmount is enable");
		Reporter.log("verifyMyerpcashamount",true);
		cashamount.sendKeys("1000");
	}
	public void verifyMyerpProduct1() {
		Assert.assertTrue(product.isEnabled(),"product is enable");
		Reporter.log("verifyMyerpproduct",true);
		product.sendKeys("14.2 KG");
	}
	public void verifyMyerpQuantity1() {
		Assert.assertTrue(quantity.isEnabled(),"Quantity is enable");
		Reporter.log("verifyMyerpquantity",true);
		quantity.clear();
		quantity.sendKeys("2");
	}
	public void verifyMyerpUnitcost1() {
		Assert.assertTrue(unitcost.isEnabled(),"Unitcost is enable");
		Reporter.log("verifyMyerpunitcost",true);
		unitcost.sendKeys("120");
	}
	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(1000);
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
			Thread.sleep(2000);
			al.accept();
			return true; }
		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}
	public void verifyMyerpubackbtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(ubackbtn.isEnabled(),"ubackbtn is enable");
		Reporter.log("verifyMyerpubackbtn",true);
		ubackbtn.click();
		Thread.sleep(3000);
	}
	public void verifyMyerpupdatetvinform() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(updatetvinform.isEnabled(),"updatetvinform is enable");
		Reporter.log("verifyMyerpupdatetvinform",true);
		updatetvinform.click();
	}
	public void verifyMyerpupdatedocno() throws InterruptedException {
		Assert.assertTrue(updatedocno.isEnabled(),"updatedocno is enable");
		Reporter.log("verifyMyerpupdatedocno",true);
		updatedocno.click();
		updatedocno.sendKeys("2200010");
	}
	public void verifyMyerpugetdatabtn() throws InterruptedException {
		Assert.assertTrue(ugetdatabtn.isEnabled(),"ugetdatabtn is enable");
		Reporter.log("verifyMyerpugetdatabtn",true);
		ugetdatabtn.click();
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
			Thread.sleep(800);
			return true; }

		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}
	public void verifyMyerpUPreOilCompany() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(preoilcompany.isEnabled(),"preoilcompany is enable");
		Reporter.log("verifyMyerppreoilcompany",true);
		preoilcompany.click();
		preoilcompany.clear();
		preoilcompany.sendKeys("BPCL");
	}
	public void verifyMyerpUremoveservice() throws InterruptedException {
		Assert.assertTrue(uremoveservice.isEnabled(),"uremoveservice is enable");
		Reporter.log("verifyMyerpuremoveservice",true);
		uremoveservice.click();
	}
	public void SelectCompany() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertTrue(selectcompany.isDisplayed(),"selectcompany is  displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void verifyMyerpuservicetextbox1() throws InterruptedException {
		Assert.assertTrue(uservicetextbox1.isEnabled(),"uservicetextbox1 is enable");
		Reporter.log("verifyMyerpuremoveservice1",true);
		uservicetextbox1.clear();
		uservicetextbox1.sendKeys("STAMP DUTY");
	}
	public void verifyMyerpquantitytextbox1() throws InterruptedException {
		Assert.assertTrue(quantitytextbox1.isEnabled(),"quantitytextbox1 is enable");
		Reporter.log("verifyMyerpquantitytextbox1",true);
		quantitytextbox1.clear();
		quantitytextbox1.sendKeys("2");
	}
	public void verifyMyerpunitcost1() throws InterruptedException {
		Assert.assertTrue(unitcost2.isEnabled(),"unitcost2 is enable");
		Reporter.log("verifyMyerpunitcost2",true);
		unitcost2.clear();
		unitcost2.sendKeys("120");
	}

	public void verifyMyerpuservicetextbox3() throws InterruptedException {
		Assert.assertTrue(uservicetextbox3.isEnabled(),"uservicetextbox3 is enable");
		Reporter.log("verifyMyerpuremoveservice3",true);
		uservicetextbox3.clear();
		uservicetextbox3.sendKeys("MECHANICAL SERVICE");
	}
	public void verifyMyerpquantitytextbox3() throws InterruptedException {
		Assert.assertTrue(quantitytextbox1.isEnabled(),"quantitytextbox1 is enable");
		Reporter.log("verifyMyerpquantitytextbox1",true);
		quantitytextbox1.clear();
		quantitytextbox1.sendKeys("2");
	}
	public void verifyMyerpuremoveservice1() throws InterruptedException {
		Assert.assertTrue(uremoveservice1.isEnabled(),"uremoveservice1 is enable");
		Reporter.log("verifyMyerpuremoveservice1",true);
		uremoveservice1.click();		
	}
	public void verifyMyerpuremoveservice2() throws InterruptedException {
		Assert.assertTrue(uremoveservice2.isEnabled(),"uremoveservice2 is enable");
		Reporter.log("verifyMyerpuremoveservice2",true);
		uremoveservice2.click();
	}
	public void verifyMyerpuremoveservice3() throws InterruptedException {
		Assert.assertTrue(uremoveservice3.isEnabled(),"uremoveservice3 is enable");
		Reporter.log("verifyMyerpuremoveservice3",true);
		uremoveservice3.click();
	}
	public void verifyMyerpuremoveservice4() throws InterruptedException {
		Assert.assertTrue(uremoveservice4.isEnabled(),"uremoveservice4 is enable");
		Reporter.log("verifyMyerpuremoveservice4",true);
		uremoveservice4.clear();
	}
	public void verifyMyerpunitcost3() throws InterruptedException {
		Assert.assertTrue(unitcost3.isEnabled(),"unitcost3 is enable");
		Reporter.log("verifyMyerpunitcost3",true);
		unitcost3.clear();
	}


	public void verifyMyerpUSubmitbtn() throws InterruptedException {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(800);
		if (isAlertPresent3(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent3(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);
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
}