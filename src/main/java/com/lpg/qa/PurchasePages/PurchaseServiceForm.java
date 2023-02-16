package com.lpg.qa.PurchasePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class PurchaseServiceForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//span[text()='Purchase']")private WebElement purchasemodule;
	@FindBy(xpath="//a[text()=' Purchase Services']")private WebElement purchaseservice;
	@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement selectcompany;
	@FindBy(xpath="//input[@id='txtInvoiceNumber']")private WebElement invoicenumber;
	@FindBy(xpath="//select[@id='ddlSupplierID']")private WebElement supllier;
	@FindBy(xpath="//textarea[@id='txtNarration']")private WebElement narration;
	@FindBy(xpath="//input[@id='txtService']")private WebElement services;
	@FindBy(xpath="//input[@id='txtSrvQunatity']")private WebElement quntity;
	@FindBy(xpath="//input[@id='txtSrvUnitCost']")private WebElement unitcost;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	
	//initialization
	public PurchaseServiceForm(WebDriver driver) {
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
	public void verifyMyerpMaster() {
		Assert.assertTrue(master.isEnabled(),"Master is enable");
		Reporter.log("verifyMyerpmaster",true);
		master.click();
	}
	public void verifyMyerpPurchaseModule() {
		Assert.assertTrue(purchasemodule.isEnabled(),"PurchaseModule is enable");
		Reporter.log("verifyMyerppurchasemodule",true);
		purchasemodule.click();
	}
	public void verifyMyerpPurchaseService() {
		Assert.assertTrue(purchaseservice.isEnabled(),"PurchaseService is enable");
		Reporter.log("verifyMyerppurchaseservice",true);
		purchaseservice.click();
	}
	public void SelectCompany1() throws InterruptedException {
		Select s = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is  displayed");
		Assert.assertFalse(selectcompany.isSelected());
		s.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void verifyMyerpInvoiceNumber1() {
		Assert.assertTrue(invoicenumber.isEnabled(),"InvoiceNumber is enable");
		Reporter.log("verifyMyerpinvoicenumber",true);
		invoicenumber.sendKeys("912");
	}
	public void Supllier1() throws InterruptedException {
		Select sc = new Select(supllier);
		Thread.sleep(1000);
		Assert.assertFalse(supllier.isDisplayed(),"Supllier is  displayed");
		Assert.assertFalse(supllier.isSelected());
		sc.selectByVisibleText("SUP_ROHIT_40");
	}
	public void verifyMyerpNarration1() {
		Assert.assertTrue(narration.isEnabled(),"Narration is enable");
		Reporter.log("verifyMyerpnarration",true);
		narration.sendKeys("being purchase service for supplier rohit");
	}
	public void verifyMyerpServices1() {
		Assert.assertTrue(services.isEnabled(),"Services is enable");
		Reporter.log("verifyMyerpservices",true);
		services.sendKeys("DOMESTIC SALE : 300001");
	}
	public void verifyMyerpQuntity1() {
		Assert.assertTrue(quntity.isEnabled(),"Quntity is enable");
		Reporter.log("verifyMyerpquntity",true);
		quntity.sendKeys("1");
	}
	public void verifyMyerpUnitCost1() {
		Assert.assertTrue(unitcost.isEnabled(),"UnitCost is enable");
		Reporter.log("verifyMyerpunitcost",true);
		unitcost.sendKeys("10");
	}
	public void verifyMyerpClearbtn() {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void SelectCompany() throws InterruptedException {
		Select s = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is  displayed");
		Assert.assertFalse(selectcompany.isSelected());
		s.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void verifyMyerpInvoiceNumber() {
		Assert.assertTrue(invoicenumber.isEnabled(),"InvoiceNumber is enable");
		Reporter.log("verifyMyerpinvoicenumber",true);
		invoicenumber.sendKeys("912");
	}
	public void Supllier() throws InterruptedException {
		Select sc = new Select(supllier);
		Thread.sleep(1000);
		Assert.assertFalse(supllier.isDisplayed(),"Supllier is  displayed");
		Assert.assertFalse(supllier.isSelected());
		sc.selectByVisibleText("SUP_ROHIT_40");
	}
	public void verifyMyerpNarration() {
		Assert.assertTrue(narration.isEnabled(),"Narration is enable");
		Reporter.log("verifyMyerpnarration",true);
		narration.sendKeys("being purchase service for supplier rohit");
	}
	public void verifyMyerpServices() {
		Assert.assertTrue(services.isEnabled(),"Services is enable");
		Reporter.log("verifyMyerpservices",true);
		services.sendKeys("DOMESTIC SALE : 300001");
	}
	public void verifyMyerpQuntity() {
		Assert.assertTrue(quntity.isEnabled(),"Quntity is enable");
		Reporter.log("verifyMyerpquntity",true);
		quntity.sendKeys("1");
	}
	public void verifyMyerpUnitCost() {
		Assert.assertTrue(unitcost.isEnabled(),"UnitCost is enable");
		Reporter.log("verifyMyerpunitcost",true);
		unitcost.sendKeys("10");
	}
	public void verifyMyerpSubmitbtn() {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}

}
