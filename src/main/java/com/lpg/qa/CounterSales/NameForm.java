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

public class NameForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Name Change']")private WebElement namechange;
	@FindBy(xpath="//input[@id='txtConsumerNoSearch']")private WebElement consumerno;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement searchbtn;
	@FindBy(xpath="//input[@id='txtGSTIN']")private WebElement gstin;
	@FindBy(xpath="//input[@id='txtDocNo']")private WebElement docserno;
	@FindBy(xpath="//input[@id='txtNewConsumerName']")private WebElement newconsumername;
	@FindBy(xpath="//input[@id='txtCity']")private WebElement entercity;
	@FindBy(xpath="//select[@id='ddlstate']")private WebElement state;
	@FindBy(xpath="//select[@id='ddldistrict']")private WebElement district;
	@FindBy(xpath="//select[@id='ddlTahsil']")private WebElement tehasil;
	@FindBy(xpath="//input[@id='txtPostDistributorCode']")private WebElement distributorcode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement email;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement modeofpayment;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//input[@id='txtService']")private WebElement service;
	@FindBy(xpath="//input[@id='txtSrvQunatity']")private WebElement srvquantity;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//input[@id='btnback']")private WebElement ubackbtn;
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/form/section[1]/h1/a")private WebElement unamechangeform;
	@FindBy(xpath="//input[@id='txtMDLDocumentNo']")private WebElement udocno;
	@FindBy(xpath="//button[@id='btnMDLGet']")private WebElement ugetdatabtn;
	@FindBy(xpath="//input[@id='txtPrevConsumerName']")private WebElement prevoiusconsumername;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement usubmitbtn;







	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public NameForm(WebDriver driver) {
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
	public void verifyMyerpNamechange() {
		Assert.assertTrue(namechange.isEnabled(),"Namechange is enable");
		Reporter.log("verifyMyerpnamechange",true);
		namechange.click();
	}
	public void verifyMyerpConsumerno() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("1414");
	}
	public void verifyMyerpSearchbtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(searchbtn.isEnabled(),"Searchbtn is enable");
		Reporter.log("verifyMyerpsearchbtn",true);
		searchbtn.click();
	}
	public void verifyMyerpGstin() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(gstin.isEnabled(),"Gstin is enable");
		Reporter.log("verifyMyerpgstin",true);
		gstin.sendKeys("34567");
	}
	public void verifyMyerpDocserno() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(docserno.isEnabled(),"Docserno is enable");
		Reporter.log("verifyMyerpdocserno",true);
		docserno.sendKeys("1076767");
	}
	public void verifyMyerpNewConsumerName() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(newconsumername.isEnabled(),"NewConsumerName is enable");
		Reporter.log("verifyMyerpnewconsumername",true);
		newconsumername.clear();
		newconsumername.sendKeys("Rohit Saksena");
	}
	public void verifyMyerpEntercity() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(entercity.isEnabled(),"Entercity is enable");
		Reporter.log("verifyMyerpentercity",true);
		entercity.sendKeys("Nalasopara");
	}
	public void State() throws InterruptedException {
		Select sc = new Select(state);
		Thread.sleep(1500);
		Assert.assertFalse(state.isDisplayed(),"State is  displayed");
		Assert.assertFalse(state.isSelected());
		sc.selectByVisibleText("MAHARASHTRA");
	}
	public void District() throws InterruptedException {
		Select sc = new Select(district);
		Thread.sleep(2000);
		Assert.assertFalse(district.isDisplayed(),"District is  displayed");
		Assert.assertFalse(district.isSelected());
		sc.selectByVisibleText("Palghar");
	}
	public void Tehasil() throws InterruptedException {
		Select sc = new Select(tehasil);
		Thread.sleep(1000);
		Assert.assertFalse(tehasil.isDisplayed(),"Tehasil is  displayed");
		Assert.assertFalse(tehasil.isSelected());
		sc.selectByVisibleText("Vasai");
	}
	public void verifyMyerpDistributorcode() {
		Assert.assertTrue(distributorcode.isEnabled(),"Distributorcode is enable");
		Reporter.log("verifyMyerpdistributorcode",true);
		distributorcode.sendKeys("1086767");
	}
	public void verifyMyerpEmail() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(email.isEnabled(),"Email is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("rsaksena23@gmail.com");
	}
	public void Modeofpayment() throws InterruptedException {
		Select sc = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"Modeofpayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashamount() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cashamount.isEnabled(),"Cashamount is enable");
		Reporter.log("verifyMyerpcashamount",true);
		cashamount.sendKeys("1000");
	}
	public void verifyMyerpService() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(service.isEnabled(),"Service is enable");
		Reporter.log("verifyMyerpservice",true);
		service.sendKeys("STAMP DUTY");
	}
	public void verifyMyerpSrvquantity() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(srvquantity.isEnabled(),"Srvquantity is enable");
		Reporter.log("verifyMyerpsrvquantity",true);
		srvquantity.clear();
		srvquantity.sendKeys("12");
	}
	public void verifyMyerpClearbtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(1000);
		if (isAlertPresent6(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent6(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(1000);
			Alert al=driver.switchTo().alert();
			Thread.sleep(3500); 
			al.accept(); 
			 Thread.sleep(3000);
			 al.accept();
			 return true; }
		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch blocks
			u.printStackTrace(); } return false;


	}
	public void verifyMyerpubackbtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(ubackbtn.isEnabled(),"ubackbtn is enable");
		Reporter.log("verifyMyerpubackbtn",true);
		ubackbtn.click();
		Thread.sleep(3000);
	}
	public void verifyMyerpunamechangeform() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(unamechangeform.isEnabled(),"unamechangeform is enable");
		Reporter.log("verifyMyepunamechangeform",true);
		unamechangeform.click();
	}
	public void verifyMyerpupdatedocno() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(udocno.isEnabled(),"udocno is enable");
		Reporter.log("verifyMyerpudocno",true);
		udocno.click();
		udocno.sendKeys("2200022");
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
	public void verifyMyerpUCashamount1() {

		Reporter.log("verifyMyerpcashamount",true);
		cashamount.clear();
		cashamount.sendKeys("4000");
	}
	public void verifyMyerpUSubmitbtn() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn find is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(2000);
		if (isAlertPresent5(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent5(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);
			Alert al=driver.switchTo().alert();
			Thread.sleep(3000); 
			al.accept(); 
			Thread.sleep(3800);
			al.accept();
			return true; }
		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch blocks
			u.printStackTrace(); } return false;


	}
	public void verifyMyerpUprevoiusconsumername() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(prevoiusconsumername.isEnabled(),"prevoiusconsumername find is enable");
		Reporter.log("verifyMyerpprevoiusconsumername",true);
		prevoiusconsumername.clear();
		prevoiusconsumername.sendKeys("hetal patil");
	}
	

}


