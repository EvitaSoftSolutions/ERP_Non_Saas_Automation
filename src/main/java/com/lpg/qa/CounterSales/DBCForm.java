package com.lpg.qa.CounterSales;

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
	@FindBy(xpath="//input[@id='txtSrvUnitCost']")private WebElement unitcost;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	
	//initialization
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
	public void verifyMyerpCounterSales() {
		Assert.assertTrue(countersales.isEnabled(),"CounterSales is enable");
		Reporter.log("verifyMyerpcountersales",true);
		countersales.click();
	}
	public void verifyMyerpClickDbc() {
		Assert.assertTrue(clickdbc.isEnabled(),"ClickDbc is enable");
		Reporter.log("verifyMyerpclickdbc",true);
		clickdbc.click();
	}
	public void verifyMyerpConsumerNumber() {
		Assert.assertTrue(consumernumber.isEnabled(),"ConsumerNumber is enable");
		Reporter.log("verifyMyerpconsumernumber",true);
		consumernumber.sendKeys("520");
	}
	public void verifyMyerpSearchbtn() {
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
	public void verifyMyerpCashPayment() {
		Assert.assertTrue(cashpayment.isEnabled(),"CashPayment is enable");
		Reporter.log("verifyMyerpcashpayment",true);
		cashpayment.sendKeys("1000");
	}
	public void verifyMyerpProduct() {
		Assert.assertTrue(product.isEnabled(),"Product is enable");
		Reporter.log("verifyMyerpproduct",true);
		product.sendKeys("14.2 KG");
	}
	public void verifyMyerpUnitcost() {
		Assert.assertTrue(unitcost.isEnabled(),"Unitcost is enable");
		Reporter.log("verifyMyerpunitcost",true);
		unitcost.sendKeys("20");
	}
	public void verifyMyerpSubmitbtn() {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
}
