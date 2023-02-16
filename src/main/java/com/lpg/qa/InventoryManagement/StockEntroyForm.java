package com.lpg.qa.InventoryManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class StockEntroyForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Inventory Management']")private WebElement inventorymanagement;
	@FindBy(xpath="//a[text()=' Stock Entry']")private WebElement stockentry;
	@FindBy(xpath="//select[@id='ddlGodownID']")private WebElement godownin;
	@FindBy(xpath="//select[@id='ddlProductID']")private WebElement productid;
	@FindBy(xpath="//input[@id='txtOpeningFull']")private WebElement openingfull;
	@FindBy(xpath="//input[@id='txtOpeningEmpty']")private WebElement openingempty;
	@FindBy(xpath="//input[@id='txtDefective']")private WebElement defective;
	@FindBy(xpath="//input[@id='txtCredit']")private WebElement credit;
	@FindBy(xpath="//input[@id='txtMinStock']")private WebElement minstock;
	@FindBy(xpath="//input[@id='txtStockOpeningValuation']")private WebElement valuavtion;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	//initialization
			public StockEntroyForm(WebDriver driver) {
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
			public void verifyMyerpStockentry() {
				Assert.assertTrue(stockentry.isEnabled(),"Stockentry is enable");
				Reporter.log("verifyMyerpstockentry",true);
				stockentry.click();
			}
			public void Godownin() throws InterruptedException {
    			Select sc = new Select(godownin);
    			Thread.sleep(1000);
    			Assert.assertFalse(godownin.isDisplayed(),"Godownin is  displayed");
    			Assert.assertFalse(godownin.isSelected());
    			sc.selectByVisibleText("VIRAR");
			}
			public void Productid() throws InterruptedException {
    			Select sc = new Select(productid);
    			Thread.sleep(1000);
    			Assert.assertFalse(productid.isDisplayed(),"Productid is  displayed");
    			Assert.assertFalse(productid.isSelected());
    			sc.selectByVisibleText("14.2 DOM");
			}
			public void verifyMyerpOpeningfull() {
				Assert.assertTrue(openingfull.isEnabled(),"Openingfull is enable");
				Reporter.log("verifyMyerpopeningfull",true);
				openingfull.sendKeys("12");
			}
			public void verifyMyerpOpeningEmpty() {
				Assert.assertTrue(openingempty.isEnabled(),"OpeningEmpty is enable");
				Reporter.log("verifyMyerpopeningempty",true);
				openingempty.sendKeys("12");
			}
			public void verifyMyerpDefective() {
				Assert.assertTrue(defective.isEnabled(),"Defective is enable");
				Reporter.log("verifyMyerpdefective",true);
				defective.sendKeys("0");
			}
			public void verifyMyerpCredit() {
				Assert.assertTrue(credit.isEnabled(),"Credit is enable");
				Reporter.log("verifyMyerpcredit",true);
				credit.sendKeys("0");
			}
			public void verifyMyerpMinstock() {
				Assert.assertTrue(minstock.isEnabled(),"Minstock is enable");
				Reporter.log("verifyMyerpminstock",true);
				minstock.sendKeys("0");
			}
			public void verifyMyerpValuavtion() {
				Assert.assertTrue(valuavtion.isEnabled(),"Valuavtion is enable");
				Reporter.log("verifyMyerpvaluavtion",true);
				valuavtion.sendKeys("120");
			}
			public void verifyMyerpClearbtn() {
				Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
				Reporter.log("verifyMyerpclearbtn",true);
				clearbtn.click();
			}
			public void Godownin1() throws InterruptedException {
    			Select sc = new Select(godownin);
    			Thread.sleep(1000);
    			Assert.assertFalse(godownin.isDisplayed(),"Godownin is  displayed");
    			Assert.assertFalse(godownin.isSelected());
    			sc.selectByVisibleText("VIRAR");
			}
			public void Productid1() throws InterruptedException {
    			Select sc = new Select(productid);
    			Thread.sleep(1000);
    			Assert.assertFalse(productid.isDisplayed(),"Productid is  displayed");
    			Assert.assertFalse(productid.isSelected());
    			sc.selectByVisibleText("14.2 DOM");
			}
			public void verifyMyerpOpeningfull1() {
				Assert.assertTrue(openingfull.isEnabled(),"Openingfull is enable");
				Reporter.log("verifyMyerpopeningfull",true);
				openingfull.sendKeys("12");
			}
			public void verifyMyerpOpeningEmpty1() {
				Assert.assertTrue(openingempty.isEnabled(),"OpeningEmpty is enable");
				Reporter.log("verifyMyerpopeningempty",true);
				openingempty.sendKeys("12");
			}
			public void verifyMyerpDefective1() {
				Assert.assertTrue(defective.isEnabled(),"Defective is enable");
				Reporter.log("verifyMyerpdefective",true);
				defective.sendKeys("0");
			}
			public void verifyMyerpCredit1() {
				Assert.assertTrue(credit.isEnabled(),"Credit is enable");
				Reporter.log("verifyMyerpcredit",true);
				credit.sendKeys("0");
			}
			public void verifyMyerpMinstock1() {
				Assert.assertTrue(minstock.isEnabled(),"Minstock is enable");
				Reporter.log("verifyMyerpminstock",true);
				minstock.sendKeys("0");
			}
			public void verifyMyerpValuavtion1() {
				Assert.assertTrue(valuavtion.isEnabled(),"Valuavtion is enable");
				Reporter.log("verifyMyerpvaluavtion",true);
				valuavtion.sendKeys("120");
			}
			public void verifyMyerpSubmitbtn() {
				Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
				Reporter.log("verifyMyerpsubmitbtn",true);
				submitbtn.click();
			}
			


	
}
