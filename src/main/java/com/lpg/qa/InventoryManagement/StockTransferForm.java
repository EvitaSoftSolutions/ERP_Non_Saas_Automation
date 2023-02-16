package com.lpg.qa.InventoryManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class StockTransferForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Inventory Management']")private WebElement inventorymanagement;
	@FindBy(xpath="//a[text()=' Stock Transfer']")private WebElement stocktransfer;
	@FindBy(xpath="//select[@id='ddlFrmGodownID']")private WebElement fromgodown;
	@FindBy(xpath="//select[@id='ddlToGodownID']")private WebElement togodown;
	@FindBy(xpath="//select[@id='ddlProductID']")private WebElement product;
	@FindBy(xpath="//input[@id='txtOpeningFull']")private WebElement transferfullcyl;
	@FindBy(xpath="//input[@id='txtOpeningEmpty']")private WebElement transferemptycyl;
	@FindBy(xpath="//input[@id='txtDefective']")private WebElement transferdefectivecyl;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	//initialization
			public StockTransferForm(WebDriver driver) {
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
			public void verifyMyerpStockTransfer() {
				Assert.assertTrue(stocktransfer.isEnabled(),"StockTransfer is enable");
				Reporter.log("verifyMyerpstocktransfer",true);
				stocktransfer.click();
			}
			public void Fromgodown() throws InterruptedException {
    			Select sc = new Select(fromgodown);
    			Thread.sleep(1000);
    			Assert.assertFalse(fromgodown.isDisplayed(),"Fromgodown is  displayed");
    			Assert.assertFalse(fromgodown.isSelected());
    			sc.selectByVisibleText("VIRAR");
			}
			public void Togodown() throws InterruptedException {
    			Select sc = new Select(togodown);
    			Thread.sleep(1000);
    			Assert.assertFalse(togodown.isDisplayed(),"Togodown is  displayed");
    			Assert.assertFalse(togodown.isSelected());
    			sc.selectByVisibleText("VIRAR WEST");
			}
			public void Product() throws InterruptedException {
    			Select sc = new Select(product);
    			Thread.sleep(1000);
    			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
    			Assert.assertFalse(product.isSelected());
    			sc.selectByVisibleText("14.2 DOM");
			}
			public void verifyMyerpTransferfullcyl() {
				Assert.assertTrue(transferfullcyl.isEnabled(),"Transferfullcyl is enable");
				Reporter.log("verifyMyerptransferfullcyl",true);
				transferfullcyl.sendKeys("12");
			}
			public void verifyMyerpTransferEmptycyl() {
				Assert.assertTrue(transferemptycyl.isEnabled(),"TransferEmptycyl is enable");
				Reporter.log("verifyMyerptransferemptycyl",true);
				transferemptycyl.sendKeys("12");
			}
			public void verifyMyerpTransferDefectivecyl() {
				Assert.assertTrue(transferdefectivecyl.isEnabled(),"TransferDefectivecyl is enable");
				Reporter.log("verifyMyerptransferdefectivecyl",true);
				transferdefectivecyl.sendKeys("0");
			}
			public void verifyMyerpClearbtn() {
				Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
				Reporter.log("verifyMyerpclearbtn",true);
				clearbtn.click();
			}
			public void Fromgodown1() throws InterruptedException {
    			Select sc = new Select(fromgodown);
    			Thread.sleep(1000);
    			Assert.assertFalse(fromgodown.isDisplayed(),"Fromgodown is  displayed");
    			Assert.assertFalse(fromgodown.isSelected());
    			sc.selectByVisibleText("VIRAR");
			}
			public void Togodown1() throws InterruptedException {
    			Select sc = new Select(togodown);
    			Thread.sleep(1000);
    			Assert.assertFalse(togodown.isDisplayed(),"Togodown is  displayed");
    			Assert.assertFalse(togodown.isSelected());
    			sc.selectByVisibleText("VIRAR WEST");
			}
			public void Product1() throws InterruptedException {
    			Select sc = new Select(product);
    			Thread.sleep(1000);
    			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
    			Assert.assertFalse(product.isSelected());
    			sc.selectByVisibleText("14.2 DOM");
			}
			public void verifyMyerpTransferfullcyl1() {
				Assert.assertTrue(transferfullcyl.isEnabled(),"Transferfullcyl is enable");
				Reporter.log("verifyMyerptransferfullcyl",true);
				transferfullcyl.sendKeys("12");
			}
			public void verifyMyerpTransferEmptycyl1() {
				Assert.assertTrue(transferemptycyl.isEnabled(),"TransferEmptycyl is enable");
				Reporter.log("verifyMyerptransferemptycyl",true);
				transferemptycyl.sendKeys("12");
			}
			public void verifyMyerpTransferDefectivecyl1() {
				Assert.assertTrue(transferdefectivecyl.isEnabled(),"TransferDefectivecyl is enable");
				Reporter.log("verifyMyerptransferdefectivecyl",true);
				transferdefectivecyl.sendKeys("0");
			}
			public void verifyMyerpsubmitbtn() {
				Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is enable");
				Reporter.log("verifyMyerpsubmitbtn",true);
				submitbtn.click();
			}

}
