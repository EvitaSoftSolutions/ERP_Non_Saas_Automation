package com.lpg.qa.InventoryManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class StockCheckForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Inventory Management']")private WebElement inventorymanagement;
	@FindBy(xpath="//a[text()=' Stock Check']")private WebElement stockcheck;
	@FindBy(xpath="//select[@id='ddlGodownID']")private WebElement godown;
	@FindBy(xpath="//select[@id='ddlProductID']")private WebElement product;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSearch']")private WebElement submitbtn;
	
	//initialization
		public StockCheckForm(WebDriver driver) {
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
		public void verifyMyerpInventoryManagement() {
			Assert.assertTrue(inventorymanagement.isEnabled(),"InventoryManagement is enable");
			Reporter.log("verifyMyerpinventorymanagement",true);
			inventorymanagement.click();
		}
		public void verifyMyerpStockcheck() {
			Assert.assertTrue(stockcheck.isEnabled(),"Stockcheck is enable");
			Reporter.log("verifyMyerpstockcheck",true);
			stockcheck.click();
		}
		public void Godown() throws InterruptedException {
			Select sc = new Select(godown);
			Thread.sleep(1000);
			Assert.assertFalse(godown.isDisplayed(),"Godown is  displayed");
			Assert.assertFalse(godown.isSelected());
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
		public void Godown1() throws InterruptedException {
			Select sc = new Select(godown);
			Thread.sleep(1000);
			Assert.assertFalse(godown.isDisplayed(),"Godown is  displayed");
			Assert.assertFalse(godown.isSelected());
			sc.selectByVisibleText("VIRAR");
		}
		public void Product1() throws InterruptedException {
			Select sc = new Select(product);
			Thread.sleep(1000);
			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
			Assert.assertFalse(product.isSelected());
			sc.selectByVisibleText("14.2 DOM");
		}
		public void verifyMyerpSubmitbtn() {
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
		}

}
