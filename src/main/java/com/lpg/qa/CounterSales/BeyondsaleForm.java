package com.lpg.qa.CounterSales;

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
	
	//initialization
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
		consumernumbersearch.sendKeys("9011");
	}
	public void verifyMyerpSubmitBtnClick() {
		Assert.assertTrue(submitbtnclick.isEnabled(),"SubmitBtnClick is enable");
		Reporter.log("verifyMyerpsubmitbtnclick",true);
		submitbtnclick.click();
	}
	public void verifyMyerpInvoiceno() {
		Assert.assertTrue(invoiceno.isEnabled(),"Invoiceno is enable");
		Reporter.log("verifyMyerpinvoiceno",true);
		invoiceno.sendKeys("29010");
	}
	public void verifyMyerpGstin() {
		Assert.assertTrue(gstin.isEnabled(),"gstin is enable");
		Reporter.log("verifyMyerpgstin",true);
		gstin.sendKeys("12abcd1234ab12d");
	}
	public void verifyMyerpDistributercode() {
		Assert.assertTrue(distributercode.isEnabled(),"Distributercode is enable");
		Reporter.log("verifyMyerpdistributercode",true);
		distributercode.sendKeys("234516");
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
		sc.selectByVisibleText("Palghar");
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
		email.sendKeys("rahul123@gmial.com");
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
		product.sendKeys("GAS STOVE");
	}
	public void verifyMyerpClearbtn() {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn find is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void verifyMyerpConsumerNumberSearch1() {
		Assert.assertTrue(consumernumbersearch.isEnabled(),"ConsumerNumberSearch is enable");
		Reporter.log("verifyMyerpconsumernumbersearch",true);
		consumernumbersearch.sendKeys("9011");
	}
	public void verifyMyerpSubmitBtnClick1() {
		Assert.assertTrue(submitbtnclick.isEnabled(),"SubmitBtnClick is enable");
		Reporter.log("verifyMyerpsubmitbtnclick",true);
		submitbtnclick.click();
	}
	public void verifyMyerpInvoiceno1() {
		Assert.assertTrue(invoiceno.isEnabled(),"Invoiceno is enable");
		Reporter.log("verifyMyerpinvoiceno",true);
		invoiceno.sendKeys("29010");
	}
	public void verifyMyerpGstin1() {
		Assert.assertTrue(gstin.isEnabled(),"gstin is enable");
		Reporter.log("verifyMyerpgstin",true);
		gstin.sendKeys("12abcd1234ab12d");
	}
	public void verifyMyerpDistributercode1() {
		Assert.assertTrue(distributercode.isEnabled(),"Distributercode is enable");
		Reporter.log("verifyMyerpdistributercode",true);
		distributercode.sendKeys("234516");
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
		email.sendKeys("rahul123@gmial.com");
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
		cashamount.sendKeys("2000");
	}
	public void verifyMyerpProduct1() {
		Assert.assertTrue(product.isEnabled(),"Product find is enable");
		Reporter.log("verifyMyerpproduct",true);
		product.sendKeys("GAS STOVE");
	}
	public void verifyMyerpSubmitbtn() {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn find is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}

}
