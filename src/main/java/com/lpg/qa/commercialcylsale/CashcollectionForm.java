package com.lpg.qa.commercialcylsale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class CashcollectionForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Commercial Cyl. Sales']")private WebElement commercialcylsale;
	@FindBy(xpath="//a[text()=' Cash Collection']")private WebElement cashcollection;
	@FindBy(xpath="//select[@id='ddlDeliveryMan']")private WebElement deliveryman;
	@FindBy(xpath="//select[@id='ddlParty']")private WebElement selectparty;
	@FindBy(xpath="//input[@id='txtChallanNo']")private WebElement challanno;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement modeofpayment;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	//initialization
			public CashcollectionForm(WebDriver driver) {
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
			public void verifyMyerpCashcollection() {
				Assert.assertTrue(cashcollection.isEnabled(),"Cashcollection is enable");
				Reporter.log("verifyMyerpcashcollection",true);
				cashcollection.click();
			}
			public void Deliveryman() throws InterruptedException {
				Select sc = new Select(deliveryman);
				Thread.sleep(1000);
				Assert.assertFalse(deliveryman.isDisplayed(),"Deliveryman is  displayed");
				Assert.assertFalse(deliveryman.isSelected());
				sc.selectByVisibleText("RAJU/SHYAM");
			}
			public void Selectparty() throws InterruptedException {
				Select sc = new Select(selectparty);
				Thread.sleep(1000);
				Assert.assertFalse(selectparty.isDisplayed(),"Selectparty is  displayed");
				Assert.assertFalse(selectparty.isSelected());
				sc.selectByVisibleText("MUMBAI FRESH");
			}
			public void verifyMyerpChallanno() {
				Assert.assertTrue(challanno.isEnabled(),"Challanno is enable");
				Reporter.log("verifyMyerpchallanno",true);
				challanno.sendKeys("219018");
			}
			public void ModeofPayment() throws InterruptedException {
				Select sc = new Select(modeofpayment);
				Thread.sleep(1000);
				Assert.assertFalse(modeofpayment.isDisplayed(),"ModeofPayment is  displayed");
				Assert.assertFalse(modeofpayment.isSelected());
				sc.selectByVisibleText("CASH");
			}
			public void verifyMyerpCashAmount() {
				Assert.assertTrue(cashamount.isEnabled(),"CashAmount is enable");
				Reporter.log("verifyMyerpcashamount",true);
				cashamount.sendKeys("70000");
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
			public void Selectparty1() throws InterruptedException {
				Select sc = new Select(selectparty);
				Thread.sleep(1000);
				Assert.assertFalse(selectparty.isDisplayed(),"Selectparty is  displayed");
				Assert.assertFalse(selectparty.isSelected());
				sc.selectByVisibleText("MUMBAI FRESH");
			}
			public void verifyMyerpChallanno1() {
				Assert.assertTrue(challanno.isEnabled(),"Challanno is enable");
				Reporter.log("verifyMyerpchallanno",true);
				challanno.sendKeys("219018");
			}
			public void ModeofPayment1() throws InterruptedException {
				Select sc = new Select(modeofpayment);
				Thread.sleep(1000);
				Assert.assertFalse(modeofpayment.isDisplayed(),"ModeofPayment is  displayed");
				Assert.assertFalse(modeofpayment.isSelected());
				sc.selectByVisibleText("CASH");
			}
			public void verifyMyerpCashAmount1() {
				Assert.assertTrue(cashamount.isEnabled(),"CashAmount is enable");
				Reporter.log("verifyMyerpcashamount",true);
				cashamount.sendKeys("70000");
			}
			public void verifyMyerpSubmitbtn() {
				Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
				Reporter.log("verifyMyerpsubmitbtn",true);
				submitbtn.click();
			}

}
