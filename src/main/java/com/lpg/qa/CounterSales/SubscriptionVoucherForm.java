package com.lpg.qa.CounterSales;

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
	@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement consumerno;
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
	
	
	//initialization
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
				invoiceno.sendKeys("1345");
			}
			public void verifyMyerpGstIn() {
				Assert.assertTrue(gstin.isEnabled(),"GstIN is enable");
				Reporter.log("verifyMyerpgstin",true);
				gstin.sendKeys("087aaqfa0320d1z");
			}
			public void verifyMyerpDomesticserno() {
				Assert.assertTrue(domesticserno.isEnabled(),"Domesticserno is enable");
				Reporter.log("verifyMyerpdomesticserno",true);
				domesticserno.sendKeys("1009");
			}
			public void verifyMyerpSvno() {
				Assert.assertTrue(svno.isEnabled(),"Svno is enable");
				Reporter.log("verifyMyerpsvno",true);
				svno.sendKeys("1078");
			}
			public void verifyMyerpConsumerno() {
				Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
				Reporter.log("verifyMyerpconsumerno",true);
				consumerno.sendKeys("420");
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
				registration.sendKeys("100011");
			}
			public void verifyMyerponsumerName() {
				Assert.assertTrue(consumername.isEnabled(),"ConsumerName is enable");
				Reporter.log("verifyMyerpconsumername",true);
				consumername.sendKeys("MAYA VYAS");
			}
			public void verifyMyerpContact() {
				Assert.assertTrue(contact.isEnabled(),"Contact is enable");
				Reporter.log("verifyMyerpcontact",true);
				contact.sendKeys("9934678349");
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
				bluebookno.sendKeys("191");
			}
			public void verifyMyerpEmail() {
				Assert.assertTrue(email.isEnabled(),"Email is enable");
				Reporter.log("verifyMyerpemail",true);
				email.sendKeys("maya123@gmail.com");
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
				cashamount.sendKeys("2000");
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
				invoiceno.sendKeys("18855");
			}
			public void verifyMyerpGstIn1() {
				Assert.assertTrue(gstin.isEnabled(),"GstIN is enable");
				Reporter.log("verifyMyerpgstin",true);
				gstin.sendKeys("29aaqfa0320d1z3");
			}
			public void verifyMyerpDomesticserno1() {
				Assert.assertTrue(domesticserno.isEnabled(),"Domesticserno is enable");
				Reporter.log("verifyMyerpdomesticserno",true);
				domesticserno.sendKeys("1009");
			}
			public void verifyMyerpSvno1() {
				Assert.assertTrue(svno.isEnabled(),"Svno is enable");
				Reporter.log("verifyMyerpsvno",true);
				svno.sendKeys("1080");
			}
			public void verifyMyerpConsumerno1() {
				Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
				Reporter.log("verifyMyerpconsumerno",true);
				consumerno.sendKeys("530");
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
			public void verifyMyerpRegistration1() {
				Assert.assertTrue(registration.isEnabled(),"Registration is enable");
				Reporter.log("verifyMyerpregistration",true);
				registration.sendKeys("100011");
			}
			public void verifyMyerponsumerName1() {
				Assert.assertTrue(consumername.isEnabled(),"ConsumerName is enable");
				Reporter.log("verifyMyerpconsumername",true);
				consumername.sendKeys("MAYA VYAS");
			}
			public void verifyMyerpContact1() {
				Assert.assertTrue(contact.isEnabled(),"Contact is enable");
				Reporter.log("verifyMyerpcontact",true);
				contact.sendKeys("9884678349");
			}
			public void verifyMyerpAddress1() {
				Assert.assertTrue(address.isEnabled(),"Address is enable");
				Reporter.log("verifyMyerpaddress",true);
				address.sendKeys("VIRAR");
			}
			public void verifyMyerpCity1() {
				Assert.assertTrue(city.isEnabled(),"City is enable");
				Reporter.log("verifyMyerpcity",true);
				city.sendKeys("VIRAR");
			}
			public void verifyMyerpBlueBookno1() {
				Assert.assertTrue(bluebookno.isEnabled(),"BlueBookno is enable");
				Reporter.log("verifyMyerpbluebookno",true);
				bluebookno.sendKeys("191");
			}
			public void verifyMyerpEmail1() {
				Assert.assertTrue(email.isEnabled(),"Email is enable");
				Reporter.log("verifyMyerpemail",true);
				email.sendKeys("charu12300@gmail.com");
			}
			public void ModeofPayment1() throws InterruptedException {
    			Select mp = new Select(modeofpayment);
    			Thread.sleep(1000);
    			Assert.assertFalse(modeofpayment.isDisplayed(),"ModeofPayment is  displayed");
    			Assert.assertFalse(modeofpayment.isSelected());
    			mp.selectByVisibleText("CASH");
			}
			public void verifyMyerpCashAmount1() {
				Assert.assertTrue(cashamount.isEnabled(),"CashAmount is enable");
				Reporter.log("verifyMyerpcashamount",true);
				cashamount.sendKeys("2000");
			}
			public void verifyMyerpProduct1() {
				Assert.assertTrue(product.isEnabled(),"Product is enable");
				Reporter.log("verifyMyerpproduct",true);
				product.sendKeys("14.2 DOM");
			}
			public void verifyMyerpUnitcost() {
				Assert.assertTrue(unitcost.isEnabled(),"Unitcost is enable");
				Reporter.log("verifyMyerpunitcost",true);
				unitcost.sendKeys("12");
			}
			public void verifyMyerpSubmitbtn() {
				Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
				Reporter.log("verifyMyerpsubmitbtn",true);
				submitbtn.click();
			}

}
