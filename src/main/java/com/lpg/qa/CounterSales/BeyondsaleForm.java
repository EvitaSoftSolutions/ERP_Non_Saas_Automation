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

public class BeyondsaleForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Beyond Sale']")private WebElement beyondsale;
	@FindBy(xpath="//input[@id='txtConsumerNoSearch']")private WebElement consumernumbersearch;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement submitbtnclick;
	@FindBy(xpath="//input[@id='txtInvoiceNo']")private WebElement invoiceno;
	@FindBy(xpath="//input[@id='txtGSTIN']")private WebElement gstin;
	@FindBy(xpath="//input[@id='txtDistributerCode']")private WebElement distributercode;
	@FindBy(xpath="//select[@id='ddlstate']")private WebElement state;
	@FindBy(xpath="//select[@id='ddldistrict']")private WebElement district;
	@FindBy(xpath="//select[@id='ddlTahsil']")private WebElement tahsil;
	@FindBy(xpath="//input[@id='txtCity']")private WebElement entercity;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement email;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement modeofpayment;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//input[@id='txtProduct']")private WebElement product;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//input[@id='btnback']")private WebElement ubackbtn; 
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/form/section[1]/h1/a")private WebElement updatebeyondsale;
	@FindBy(xpath="//input[@id='txtMDLDocumentNo']")private WebElement updatedocno;
	@FindBy(xpath="//button[@id='btnMDLGet']")private WebElement ugetdatabtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement usubmit;
	
	
	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public BeyondsaleForm(WebDriver driver) {
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
	public void verifyMyerpBeyondsale() {
		Assert.assertTrue(beyondsale.isEnabled(),"Beyondsale is enable");
		Reporter.log("verifyMyerpbeyondsale",true);
		beyondsale.click();
	}
	public void verifyMyerpConsumerNumberSearch() {
		Assert.assertTrue(consumernumbersearch.isEnabled(),"ConsumerNumberSearch is enable");
		Reporter.log("verifyMyerpconsumernumbersearch",true);
		consumernumbersearch.sendKeys("3434");
	}
	public void verifyMyerpSubmitBtnClick() {
		Assert.assertTrue(submitbtnclick.isEnabled(),"SubmitBtnClick is enable");
		Reporter.log("verifyMyerpsubmitbtnclick",true);
		submitbtnclick.click();
	}
	public void verifyMyerpInvoiceno() {
		Assert.assertTrue(invoiceno.isEnabled(),"Invoiceno is enable");
		Reporter.log("verifyMyerpinvoiceno",true);
		invoiceno.clear();
		invoiceno.sendKeys("12921");
	}
	public void verifyMyerpGstin() {
		Assert.assertTrue(gstin.isEnabled(),"gstin is enable");
		Reporter.log("verifyMyerpgstin",true);
		gstin.clear();
		gstin.sendKeys("1gsa45743877665gjn");
	}
	public void verifyMyerpDistributercode() {
		Assert.assertTrue(distributercode.isEnabled(),"Distributercode is enable");
		Reporter.log("verifyMyerpdistributercode",true);
		distributercode.clear();
		distributercode.sendKeys("45921");
	}
	public void State() throws InterruptedException {
		Select sc = new Select(state);
		Thread.sleep(1000);
		Assert.assertFalse(state.isDisplayed(),"State is  displayed");
		Assert.assertFalse(state.isSelected());
		sc.selectByVisibleText("MAHARASHTRA");
	}
	public void District() throws InterruptedException {
		Select sc = new Select(district);
		Thread.sleep(1000);
		Assert.assertFalse(district.isDisplayed(),"District is  displayed");
		Assert.assertFalse(district.isSelected());
		sc.selectByVisibleText("palghar");
	}
	public void Tahsil() throws InterruptedException {
	Select sc = new Select(tahsil);
		Thread.sleep(1000);
		Assert.assertFalse(tahsil.isDisplayed(),"Tahsil is  displayed");
		Assert.assertFalse(tahsil.isSelected());
		sc.selectByVisibleText("Vasai");
	}
	public void verifyMyerpEntercity() {
		Assert.assertTrue(entercity.isEnabled(),"Entercity is enable");
		Reporter.log("verifyMyerpentercity",true);
		entercity.sendKeys("Nalasopara");
	}
	public void verifyMyerpEmail() {
		Assert.assertTrue(email.isEnabled(),"Email find is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("rahui123@gmial.com");
	}
	public void ModeofPayment() throws InterruptedException {
		Select sc = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"ModeofPayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashamount() {
		Assert.assertTrue(cashamount.isEnabled(),"Cashamount find is enable");
		Reporter.log("verifyMyerpcashamount",true);
		cashamount.sendKeys("2000");
	}
	public void verifyMyerpProduct() {
		Assert.assertTrue(product.isEnabled(),"Product find is enable");
		Reporter.log("verifyMyerpproduct",true);
		product.sendKeys("SRT PIPE");
	}
	public void verifyMyerpClearbtn() {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn find is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void verifyMyerpConsumerNumberSearch1() {
		Assert.assertTrue(consumernumbersearch.isEnabled(),"ConsumerNumberSearch is enable");
		Reporter.log("verifyMyerpconsumernumbersearch",true);
		consumernumbersearch.sendKeys("3434");
	}
	public void verifyMyerpSubmitBtnClick1() {
		Assert.assertTrue(submitbtnclick.isEnabled(),"SubmitBtnClick is enable");
		Reporter.log("verifyMyerpsubmitbtnclick",true);
		submitbtnclick.click();
	}
	public void verifyMyerpInvoiceno1() {
		Assert.assertTrue(invoiceno.isEnabled(),"Invoiceno is enable");
		Reporter.log("verifyMyerpinvoiceno",true);
		invoiceno.sendKeys("12921");
	}
	public void verifyMyerpGstin1() {
		Assert.assertTrue(gstin.isEnabled(),"gstin is enable");
		Reporter.log("verifyMyerpgstin",true);
		gstin.sendKeys("12abcd0987786ab12d");
	}
	public void verifyMyerpDistributercode1() {
		Assert.assertTrue(distributercode.isEnabled(),"Distributercode is enable");
		Reporter.log("verifyMyerpdistributercode",true);
		distributercode.sendKeys("23476");
	}
	public void State1() throws InterruptedException {
		Select sc = new Select(state);
		Thread.sleep(1000);
		Assert.assertFalse(state.isDisplayed(),"State is  displayed");
		Assert.assertFalse(state.isSelected());
		sc.selectByVisibleText("MAHARASHTRA");
	}
	public void District1() throws InterruptedException {
		Select sc = new Select(district);
		Thread.sleep(1000);
		Assert.assertFalse(district.isDisplayed(),"District is  displayed");
		Assert.assertFalse(district.isSelected());
		sc.selectByVisibleText("Palghar");
	}
	public void Tahsil1() throws InterruptedException {
		Select sc = new Select(tahsil);
		Thread.sleep(1000);
		Assert.assertFalse(tahsil.isDisplayed(),"Tahsil is  displayed");
		Assert.assertFalse(tahsil.isSelected());
		sc.selectByVisibleText("Vasai");
	}
	public void verifyMyerpEntercity1() {
		Assert.assertTrue(entercity.isEnabled(),"Entercity is enable");
		Reporter.log("verifyMyerpentercity",true);
		entercity.sendKeys("Nalasopara");
	}
	public void verifyMyerpEmail1() {
		Assert.assertTrue(email.isEnabled(),"Email find is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("maya123@gmial.com");
	}
	public void ModeofPayment1() throws InterruptedException {
		Select sc = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"ModeofPayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashamount1() {
		Assert.assertTrue(cashamount.isEnabled(),"Cashamount find is enable");
		Reporter.log("verifyMyerpcashamount",true);
		cashamount.sendKeys("6000");
	}
	public void verifyMyerpProduct1() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(product.isEnabled(),"Product find is enable");
		Reporter.log("verifyMyerpproduct",true);
		product.sendKeys("SRT PIPE");
		Thread.sleep(1000);
	}
	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Thread.sleep(12000);
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn find is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(2000);
		if (isAlertPresent3(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); 
		}
		}
	

	public static boolean isAlertPresent3(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(2500);
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
	public void verifyMyerpupdatebeyondsaleform() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(updatebeyondsale.isEnabled(),"updatebeyondsale is enable");
		Reporter.log("verifyMyerpupdatebeyondsale",true);
		updatebeyondsale.click();
	}
	public void verifyMyerpupdatedocno() throws InterruptedException {
		Thread.sleep(800);
		Assert.assertTrue(updatedocno.isEnabled(),"updatedocno is enable");
		Reporter.log("verifyMyerpupdatedocno",true);
		updatedocno.click();
		updatedocno.sendKeys("2200019");
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
		Thread.sleep(700);
		if (isAlertPresent5(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); 
		}
		}
	

	public static boolean isAlertPresent5(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			/*
			 * Thread.sleep(2500); al.accept();
			 */
			return true; }
		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	
	}

	
}