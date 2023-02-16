package com.lpg.qa.CounterSales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class EmptySaleForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Empty Sale']")private WebElement emptysale;
	@FindBy(xpath="//input[@id='txtInvoiceNo']")private WebElement invoiceno;
	@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement consumerno;
	@FindBy(xpath="//select[@id='ddlConsumerType']")private WebElement consumertype;
	@FindBy(xpath="//input[@id='txtConsumerName']")private WebElement consumername;
	@FindBy(xpath="//input[@id='txtContact']")private WebElement contact;
	@FindBy(xpath="//input[@id='txtAddress']")private WebElement address;
	@FindBy(xpath="//input[@id='txtCity']")private WebElement city;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement email;
	@FindBy(xpath="//input[@id='txtPinCode']")private WebElement pincode;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement modeofpayment;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//input[@id='txtProduct']")private WebElement product;
	@FindBy(xpath="//input[@id='txtPrdQunatity']")private WebElement quantity;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitben;
	
	//initialization
	public EmptySaleForm(WebDriver driver) {
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
	public void verifyMyerpEmptysale() {
		Assert.assertTrue(emptysale.isEnabled(),"Emptysale is enable");
		Reporter.log("verifyMyerpemptysale",true);
		emptysale.click();
	}
	public void verifyMyerpInvoiceno() {
		Assert.assertTrue(invoiceno.isEnabled(),"Invoiceno is enable");
		Reporter.log("verifyMyerpinvoiceno",true);
		invoiceno.sendKeys("210152");
	}
	public void verifyMyerpConsumerno() {
		Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("9012");
	}
	public void Consumertype() throws InterruptedException {
		Select sc = new Select(consumertype);
		Thread.sleep(1000);
		Assert.assertFalse(consumertype.isDisplayed(),"Consumertype is  displayed");
		Assert.assertFalse(consumertype.isSelected());
		sc.selectByVisibleText("DOMESTIC");
	}
	public void verifyMyerpConsumername() {
		Assert.assertTrue(consumername.isEnabled(),"Consumername is enable");
		Reporter.log("verifyMyerpconsumername",true);
		consumername.sendKeys("Sachin");
	}
	public void verifyMyerpContact() {
		Assert.assertTrue(contact.isEnabled(),"Contact is enable");
		Reporter.log("verifyMyerpcontact",true);
		contact.sendKeys("8935267810");
	}
	public void verifyMyerpAddress() {
		Assert.assertTrue(address.isEnabled(),"Address is enable");
		Reporter.log("verifyMyerpaddress",true);
		address.sendKeys("Virar");
	}
	public void verifyMyerpCity() {
		Assert.assertTrue(city.isEnabled(),"City is enable");
		Reporter.log("verifyMyerpcity",true);
		city.sendKeys("Virar");
	}
	public void verifyMyerpEmail() {
		Assert.assertTrue(email.isEnabled(),"Email is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("sachin123@gmail.com");
	}
	public void verifyMyerpPincode() {
		Assert.assertTrue(pincode.isEnabled(),"Pincode is enable");
		Reporter.log("verifyMyerppincode",true);
		pincode.sendKeys("403103");
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
		Assert.assertTrue(product.isEnabled(),"Product is enable");
		Reporter.log("verifyMyerpproduct",true);
		product.sendKeys("14.2 DOM");
	}
	public void verifyMyerpquantity() {
		Assert.assertTrue(quantity.isEnabled(),"quantity is enable");
		Reporter.log("verifyMyerpquantity",true);
		quantity.sendKeys("1");
	}
	public void verifyMyerpClearbtn() {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void verifyMyerpInvoiceno1() {
		Assert.assertTrue(invoiceno.isEnabled(),"Invoiceno is enable");
		Reporter.log("verifyMyerpinvoiceno",true);
		invoiceno.sendKeys("210152");
	}
	public void verifyMyerpConsumerno1() {
		Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("9012");
	}
	public void Consumertype1() throws InterruptedException {
		Select sc = new Select(consumertype);
		Thread.sleep(1000);
		Assert.assertFalse(consumertype.isDisplayed(),"Consumertype is  displayed");
		Assert.assertFalse(consumertype.isSelected());
		sc.selectByVisibleText("DOMESTIC");
	}
	public void verifyMyerpConsumername1() {
		Assert.assertTrue(consumername.isEnabled(),"Consumername is enable");
		Reporter.log("verifyMyerpconsumername",true);
		consumername.sendKeys("Sachin");
	}
	public void verifyMyerpContact1() {
		Assert.assertTrue(contact.isEnabled(),"Contact is enable");
		Reporter.log("verifyMyerpcontact",true);
		contact.sendKeys("8935267810");
	}
	public void verifyMyerpAddress1() {
		Assert.assertTrue(address.isEnabled(),"Address is enable");
		Reporter.log("verifyMyerpaddress",true);
		address.sendKeys("Virar");
	}
	public void verifyMyerpCity1() {
		Assert.assertTrue(city.isEnabled(),"City is enable");
		Reporter.log("verifyMyerpcity",true);
		city.sendKeys("Virar");
	}
	public void verifyMyerpEmail1() {
		Assert.assertTrue(email.isEnabled(),"Email is enable");
		Reporter.log("verifyMyerpemail",true);
		email.sendKeys("sachin123@gmail.com");
	}
	public void verifyMyerpPincode1() {
		Assert.assertTrue(pincode.isEnabled(),"Pincode is enable");
		Reporter.log("verifyMyerppincode",true);
		pincode.sendKeys("403103");
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
		Assert.assertTrue(product.isEnabled(),"Product is enable");
		Reporter.log("verifyMyerpproduct",true);
		product.sendKeys("14.2 DOM");
	}
	public void verifyMyerpquantity1() {
		Assert.assertTrue(quantity.isEnabled(),"quantity is enable");
		Reporter.log("verifyMyerpquantity",true);
		quantity.sendKeys("1");
	}
	public void verifyMyerpSubmitben() {
		Assert.assertTrue(submitben.isEnabled(),"Submitben is enable");
		Reporter.log("verifyMyerpsubmitben",true);
		submitben.click();
	}

}
