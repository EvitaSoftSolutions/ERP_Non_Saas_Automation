package com.lpg.qa.commercialcylsale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class SaleEmptyReceivedForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Commercial Cyl. Sales']")private WebElement commercialcylsale;
	@FindBy(xpath="//a[text()=' Sale/Empty Received']")private WebElement salempyreceived;
	@FindBy(xpath="//select[@id='ddlDeliveryMan']")private WebElement deliveryman;
	@FindBy(xpath="//select[@id='ddlParty']")private WebElement party;
	@FindBy(xpath="//input[@id='txtChallanNo']")private WebElement challanno;
	@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement consumerno;
	@FindBy(xpath="//select[@id='ddlDelMode']")private WebElement delivarymode;
	@FindBy(xpath="//select[@id='ddlArea']")private WebElement selectarea;
	@FindBy(xpath="//select[@id='ddlProduct']")private WebElement product;
	@FindBy(xpath="//input[@id='txtFullQty']")private WebElement fullqty;
	@FindBy(xpath="//input[@id='txtEmptyCylRecived']")private WebElement emptycylreceived;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement modeofpayment;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	
	//initialization
		public SaleEmptyReceivedForm(WebDriver driver) {
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
		public void verifyMyerpCommercialcylsale() {
			Assert.assertTrue(commercialcylsale.isEnabled(),"Commercialcylsale is enable");
			Reporter.log("verifyMyerpcommercialcylsale",true);
			commercialcylsale.click();
		}
		public void verifyMyerpSalempyreceived() {
			Assert.assertTrue(salempyreceived.isEnabled(),"Salempyreceived is enable");
			Reporter.log("verifyMyerpsalempyreceived",true);
			salempyreceived.click();
		}
		public void Deliveryman() throws InterruptedException {
			Select sc = new Select(deliveryman);
			Thread.sleep(1000);
			Assert.assertFalse(deliveryman.isDisplayed(),"Deliveryman is  displayed");
			Assert.assertFalse(deliveryman.isSelected());
			sc.selectByVisibleText("RAJU/SHYAM");
		}
		public void Party() throws InterruptedException {
			Select sc = new Select(party);
			Thread.sleep(1000);
			Assert.assertFalse(party.isDisplayed(),"Party is  displayed");
			Assert.assertFalse(party.isSelected());
			sc.selectByVisibleText("MUMBAI FRESH");
		}
		public void verifyMyerpChallanno() {
			Assert.assertTrue(challanno.isEnabled(),"Challanno is enable");
			Reporter.log("verifyMyerpcahllanno",true);
			challanno.sendKeys("890456");
		}
		public void verifyMyerpConsumerno() {
			Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
			Reporter.log("verifyMyerpconsumerno",true);
			consumerno.sendKeys("12012");
		}
		public void Delivarymode() throws InterruptedException {
			Select sc = new Select(delivarymode);
			Thread.sleep(1000);
			Assert.assertFalse(delivarymode.isDisplayed(),"Delivarymode is  displayed");
			Assert.assertFalse(delivarymode.isSelected());
			sc.selectByVisibleText("Tempo");
		}
		public void Selectarea() throws InterruptedException {
			Select sc = new Select(selectarea);
			Thread.sleep(1000);
			Assert.assertFalse(selectarea.isDisplayed(),"Selectarea is  displayed");
			Assert.assertFalse(selectarea.isSelected());
			sc.selectByVisibleText("VIRAR");
		}
		public void Product() throws InterruptedException {
			Select sc = new Select(product);
			Thread.sleep(1000);
			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
			Assert.assertFalse(product.isSelected());
			sc.selectByVisibleText("19 KG COM");
		}
		public void verifyMyerpFullqty() {
			Assert.assertTrue(fullqty.isEnabled(),"Fullqty is enable");
			Reporter.log("verifyMyerpfullqty",true);
			fullqty.sendKeys("12");
		}
		public void verifyMyerpEmptycylReceived() {
			Assert.assertTrue(emptycylreceived.isEnabled(),"EmptycylReceived is enable");
			Reporter.log("verifyMyerpemptycylreceived",true);
			emptycylreceived.sendKeys("12012");
		}
		public void Modeofpayment() throws InterruptedException {
			Select sc = new Select(modeofpayment);
			Thread.sleep(1000);
			Assert.assertFalse(modeofpayment.isDisplayed(),"Modeofpayment is  displayed");
			Assert.assertFalse(modeofpayment.isSelected());
			sc.selectByVisibleText("CASH");
		}
		public void verifyMyerpCashamount() {
			Assert.assertTrue(cashamount.isEnabled(),"Cashamount is enable");
			Reporter.log("verifyMyerpempcashamount",true);
			cashamount.sendKeys("12000");
		}
		public void verifyMyerpClearbtn() {
			Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
			Reporter.log("verifyMyerpclearbtn",true);
			clearbtn.click();
		}
		public void Deliveryman1() throws InterruptedException {
			Select sc = new Select(deliveryman);
			Thread.sleep(1000);
			Assert.assertFalse(deliveryman.isDisplayed(),"Deliveryman is  displayed");
			Assert.assertFalse(deliveryman.isSelected());
			sc.selectByVisibleText("RAJU/SHYAM");
		}
		public void Party1() throws InterruptedException {
			Select sc = new Select(party);
			Thread.sleep(1000);
			Assert.assertFalse(party.isDisplayed(),"Party is  displayed");
			Assert.assertFalse(party.isSelected());
			sc.selectByVisibleText("MUMBAI FRESH");
		}
		public void verifyMyerpChallanno1() {
			Assert.assertTrue(challanno.isEnabled(),"Challanno is enable");
			Reporter.log("verifyMyerpcahllanno",true);
			challanno.sendKeys("890456");
		}
		public void verifyMyerpConsumerno1() {
			Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
			Reporter.log("verifyMyerpconsumerno",true);
			consumerno.sendKeys("12012");
		}
		public void Delivarymode1() throws InterruptedException {
			Select sc = new Select(delivarymode);
			Thread.sleep(1000);
			Assert.assertFalse(delivarymode.isDisplayed(),"Delivarymode is  displayed");
			Assert.assertFalse(delivarymode.isSelected());
			sc.selectByVisibleText("Tempo");
		}
		public void Selectarea1() throws InterruptedException {
			Select sc = new Select(selectarea);
			Thread.sleep(1000);
			Assert.assertFalse(selectarea.isDisplayed(),"Selectarea is  displayed");
			Assert.assertFalse(selectarea.isSelected());
			sc.selectByVisibleText("VIRAR");
		}
		public void Product1() throws InterruptedException {
			Select sc = new Select(product);
			Thread.sleep(1000);
			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
			Assert.assertFalse(product.isSelected());
			sc.selectByVisibleText("19 KG COM");
		}
		public void verifyMyerpFullqty1() {
			Assert.assertTrue(fullqty.isEnabled(),"Fullqty is enable");
			Reporter.log("verifyMyerpfullqty",true);
			fullqty.sendKeys("12");
		}
		public void verifyMyerpEmptycylReceived1() {
			Assert.assertTrue(emptycylreceived.isEnabled(),"EmptycylReceived is enable");
			Reporter.log("verifyMyerpemptycylreceived",true);
			emptycylreceived.sendKeys("12012");
		}
		public void Modeofpayment1() throws InterruptedException {
			Select sc = new Select(modeofpayment);
			Thread.sleep(1000);
			Assert.assertFalse(modeofpayment.isDisplayed(),"Modeofpayment is  displayed");
			Assert.assertFalse(modeofpayment.isSelected());
			sc.selectByVisibleText("CASH");
		}
		public void verifyMyerpCashamount1() {
			Assert.assertTrue(cashamount.isEnabled(),"Cashamount is enable");
			Reporter.log("verifyMyerpempcashamount",true);
			cashamount.sendKeys("12000");
		}
		public void verifyMyerpSubmitbtn() {
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
		}

}
