package com.lpg.qa.PurchasePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class PurchaseForme {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//span[text()='Purchase']")private WebElement purchasemodule;
	@FindBy(xpath="//a[text()=' Purchase']")private WebElement purchase;
	@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement compselect;
	@FindBy(xpath="//input[@id='txtInvoiceNumber']")private WebElement invoicenumber;
	@FindBy(xpath="//input[@id='txtERVNumber']")private WebElement ervnumber;
	@FindBy(xpath="//select[@id='ddlGodownID']")private WebElement selgodown;
	@FindBy(xpath="//select[@id='ddlSupplierID']")private WebElement supplierid;
	@FindBy(xpath="//input[@id='txtDelivery_Address']")private WebElement delivadd;
	@FindBy(xpath="//input[@id='txtShipment_Doc_no']")private WebElement sipmdocno;
	@FindBy(xpath="//input[@id='txtDeliveryNumber']")private WebElement deliverynumber;
	@FindBy(xpath="//select[@id='ddlVehicalID']")private WebElement vehicleselect;
	@FindBy(xpath="//textarea[@id='txtNarration']")private WebElement narration;
	@FindBy(xpath="//input[@id='txtAccount']")private WebElement account;
	@FindBy(xpath="//input[@id='txtProduct']")private WebElement product;
	@FindBy(xpath="//input[@id='txtQunatity']")private WebElement qty;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	
	//initialization
			public PurchaseForme(WebDriver driver) {
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
			public void verifyMyerpPurchase() {
				Assert.assertTrue(purchase.isEnabled(),"Purchase is enable");
				Reporter.log("verifyMyerppurchase",true);
				purchase.click();
			}
			public void CompSelect1() throws InterruptedException {
    			Select sc = new Select(compselect);
    			Thread.sleep(1000);
    			Assert.assertFalse(compselect.isDisplayed(),"CompSelect is  displayed");
    			Assert.assertFalse(compselect.isSelected());
    			sc.selectByVisibleText("ANITA GAS SERVICES");
			}
			public void verifyMyerpInvoiceNumber1() {
				Assert.assertTrue(invoicenumber.isEnabled(),"InvoiceNumber is enable");
				Reporter.log("verifyMyerpinvoicenumber",true);
				invoicenumber.sendKeys("1109");
			}
			public void verifyMyerERVnumber1() {
				Assert.assertTrue(ervnumber.isEnabled(),"ERVnumber is enable");
				Reporter.log("verifyMyerpervnumber",true);
				ervnumber.sendKeys("9011");
			}
			public void SelGodown1() throws InterruptedException {
    			Select sc = new Select(selgodown);
    			Thread.sleep(1000);
    			Assert.assertFalse(selgodown.isDisplayed(),"SelGodown is  displayed");
    			Assert.assertFalse(selgodown.isSelected());
    			sc.selectByVisibleText("VIRAR WEST");
			}
			public void Supplierid1() throws InterruptedException {
    			Select sc = new Select(supplierid);
    			Thread.sleep(1000);
    			Assert.assertFalse(supplierid.isDisplayed(),"Supplierid is  displayed");
    			Assert.assertFalse(supplierid.isSelected());
    			sc.selectByVisibleText("SUP_ROHIT_40");
			}
			public void verifyMyerpDeleveryAddress1() {
				Assert.assertTrue(delivadd.isEnabled(),"DeleveryAddress is enable");
				Reporter.log("verifyMyerpdelivadd",true);
				delivadd.sendKeys("VIRAR WEST");
			}
			public void verifyMyerpSipmdocno1() {
				Assert.assertTrue(sipmdocno.isEnabled(),"Sipmdocno is enable");
				Reporter.log("verifyMyerpsipmdocno",true);
				sipmdocno.sendKeys("1343");
			}
			public void verifyMyerpDeliveryNumber1() {
				Assert.assertTrue(deliverynumber.isEnabled(),"DeliveryNumber is enable");
				Reporter.log("verifyMyerpdeliverynumber",true);
				deliverynumber.sendKeys("12");
			}
			public void VehicleSelect1() throws InterruptedException {
    			Select sc = new Select(vehicleselect);
    			Thread.sleep(1000);
    			Assert.assertFalse(vehicleselect.isDisplayed(),"VehicleSelect is  displayed");
    			Assert.assertFalse(vehicleselect.isSelected());
    			sc.selectByVisibleText("MH 04 AA 1111");
			}
			public void verifyMyerpNarration1() {
				Assert.assertTrue(narration.isEnabled(),"Narration is enable");
				Reporter.log("verifyMyerpnarration",true);
				narration.sendKeys("being ");
			}
			public void verifyMyerpAccount1() {
				Assert.assertTrue(account.isEnabled(),"Account is enable");
				Reporter.log("verifyMyerpaccount",true);
				account.sendKeys("PURCHASE : 300005");
			}
			public void verifyMyerpProduct1() {
				Assert.assertTrue(product.isEnabled(),"Product is enable");
				Reporter.log("verifyMyerpproduct",true);
				product.sendKeys("14.2 DOM");
			}
			public void verifyMyerpClearbtn() {
				Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
				Reporter.log("verifyMyerpclearbtn",true);
				clearbtn.click();
			}
			public void CompSelect() throws InterruptedException {
    			Select sc = new Select(compselect);
    			Thread.sleep(1000);
    			Assert.assertFalse(compselect.isDisplayed(),"CompSelect is  displayed");
    			Assert.assertFalse(compselect.isSelected());
    			sc.selectByVisibleText("ANITA GAS SERVICES");
			}
			public void verifyMyerpInvoiceNumber() {
				Assert.assertTrue(invoicenumber.isEnabled(),"InvoiceNumber is enable");
				Reporter.log("verifyMyerpinvoicenumber",true);
				invoicenumber.sendKeys("1109");
			}
			public void verifyMyerERVnumber() {
				Assert.assertTrue(ervnumber.isEnabled(),"ERVnumber is enable");
				Reporter.log("verifyMyerpervnumber",true);
				ervnumber.sendKeys("9011");
			}
			public void SelGodown() throws InterruptedException {
    			Select sc = new Select(selgodown);
    			Thread.sleep(1000);
    			Assert.assertFalse(selgodown.isDisplayed(),"SelGodown is  displayed");
    			Assert.assertFalse(selgodown.isSelected());
    			sc.selectByVisibleText("VIRAR WEST");
			}
			public void Supplierid() throws InterruptedException {
    			Select sc = new Select(supplierid);
    			Thread.sleep(1000);
    			Assert.assertFalse(supplierid.isDisplayed(),"Supplierid is  displayed");
    			Assert.assertFalse(supplierid.isSelected());
    			sc.selectByVisibleText("SUP_ROHIT_40");
			}
			public void verifyMyerpDeleveryAddress() {
				Assert.assertTrue(delivadd.isEnabled(),"DeleveryAddress is enable");
				Reporter.log("verifyMyerpdelivadd",true);
				delivadd.sendKeys("VIRAR WEST");
			}
			public void verifyMyerpSipmdocno() {
				Assert.assertTrue(sipmdocno.isEnabled(),"Sipmdocno is enable");
				Reporter.log("verifyMyerpsipmdocno",true);
				sipmdocno.sendKeys("1343");
			}
			public void verifyMyerpDeliveryNumber() {
				Assert.assertTrue(deliverynumber.isEnabled(),"DeliveryNumber is enable");
				Reporter.log("verifyMyerpdeliverynumber",true);
				deliverynumber.sendKeys("12");
			}
			public void VehicleSelect() throws InterruptedException {
    			Select sc = new Select(vehicleselect);
    			Thread.sleep(1000);
    			Assert.assertFalse(vehicleselect.isDisplayed(),"VehicleSelect is  displayed");
    			Assert.assertFalse(vehicleselect.isSelected());
    			sc.selectByVisibleText("MH 04 AA 1111");
			}
			public void verifyMyerpNarration() {
				Assert.assertTrue(narration.isEnabled(),"Narration is enable");
				Reporter.log("verifyMyerpnarration",true);
				narration.sendKeys("being ");
			}
			public void verifyMyerpAccount() {
				Assert.assertTrue(account.isEnabled(),"Account is enable");
				Reporter.log("verifyMyerpaccount",true);
				account.sendKeys("PURCHASE : 300005");
			}
			public void verifyMyerpProduct() {
				Assert.assertTrue(product.isEnabled(),"Product is enable");
				Reporter.log("verifyMyerpproduct",true);
				product.sendKeys("14.2 DOM");
			}
			public void verifyMyerpQTY() {
				Assert.assertTrue(qty.isEnabled(), "QTY is enable");
				Reporter.log("verifyMyerpqty",true);
				qty.sendKeys("1");
			}
			public void verifyMyerpSubmitbtn() {
				Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
				Reporter.log("verifyMyerpsubmitbtn",true);
				submitbtn.click();
			}
			

}
