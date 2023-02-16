package com.lpg.qa.CounterSales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class ConnectionSwapForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Connection Swap']")private WebElement connectionswap;
	@FindBy(xpath="//input[@id='txtConsumer_No']")private WebElement consumerno;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement search;
	@FindBy(xpath="//select[@id='ddlRecieved_At']")private WebElement cylrecieved;
	@FindBy(xpath="//select[@id='ddlProduct2']")private WebElement product;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	//initialization
		public ConnectionSwapForm(WebDriver driver) {
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
		public void verifyMyerpConnectionswap() {
			Assert.assertTrue(connectionswap.isEnabled(),"Connectionswap is enable");
			Reporter.log("verifyMyerpconnectionswap",true);
			connectionswap.click();
		}
		public void verifyMyerpConsumerno() {
			Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
			Reporter.log("verifyMyerpconsumerno",true);
			consumerno.sendKeys("9011");
		}
		public void verifyMyerpSearch() {
			Assert.assertTrue(search.isEnabled(),"Search is enable");
			Reporter.log("verifyMyerpsearch",true);
			search.click();
		}
		public void Cylrecied() throws InterruptedException {
			Select sc = new Select(cylrecieved);
			Thread.sleep(1000);
			Assert.assertFalse(cylrecieved.isDisplayed(),"Cylrecieved is  displayed");
			Assert.assertFalse(cylrecieved.isSelected());
			sc.selectByVisibleText("VIRAR");
		}
		public void Product() throws InterruptedException {
			Select sc = new Select(product);
			Thread.sleep(1000);
			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
			Assert.assertFalse(product.isSelected());
			sc.selectByVisibleText("14.2 DOM");
		}
		public void verifyMyerpClearbtn() {
			Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
			Reporter.log("verifyMyerpclearbtn",true);
			clearbtn.click();
		}
		public void verifyMyerpSearch1() {
			Assert.assertTrue(search.isEnabled(),"Search is enable");
			Reporter.log("verifyMyerpsearch",true);
			search.click();
		}
		public void Cylrecied1() throws InterruptedException {
			Select sc = new Select(cylrecieved);
			Thread.sleep(1000);
			Assert.assertFalse(cylrecieved.isDisplayed(),"Cylrecieved is  displayed");
			Assert.assertFalse(cylrecieved.isSelected());
			sc.selectByVisibleText("VIRAR");
		}
		public void Product1() throws InterruptedException {
			Select sc = new Select(product);
			Thread.sleep(1000);
			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
			Assert.assertFalse(product.isSelected());
			sc.selectByVisibleText("14.2 DOM");
		}
		public void verifyMyerpsubmitbtn() {
			Assert.assertTrue(submitbtn.isEnabled(),"Search is enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
		}

}
