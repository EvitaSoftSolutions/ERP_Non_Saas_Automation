package com.lpg.qa.InventoryManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class StockEntroyOtherProductForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Inventory Management']")private WebElement inventorymanagement;
	@FindBy(xpath="//a[text()=' Stock Entry']")private WebElement stockentry;
	@FindBy(xpath="//input[@id='rdoOther']")private WebElement otherproduct;
	@FindBy(xpath="//select[@id='ddlGodownID']")private WebElement godown;
	@FindBy(xpath="//select[@id='ddlProductID']")private WebElement product;
	@FindBy(xpath="//input[@id='txtStockOpeningValuation']")private WebElement openingvalue;
	@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement company;
	@FindBy(xpath="//input[@id='txtotherprodOpeningQty']")private WebElement openingqty;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	
	//initialization
	public StockEntroyOtherProductForm(WebDriver driver) {
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
	public void verifyMyerpOtherProduct() {
		Assert.assertTrue(otherproduct.isEnabled(),"OtherProduct is enable");
		Reporter.log("verifyMyerpotherproduct",true);
		otherproduct.click();
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
		sc.selectByVisibleText("GAS STOVE");
	}
	public void verifyMyerpOpeningValue() {
		Assert.assertTrue(openingvalue.isEnabled(),"OpeningValue is enable");
		Reporter.log("verifyMyerpopeningvalue",true);
		openingvalue.sendKeys("200");
	}
	public void Company() throws InterruptedException {
		Select sc = new Select(company);
		Thread.sleep(1000);
		Assert.assertFalse(company.isDisplayed(),"Company is  displayed");
		Assert.assertFalse(company.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void verifyMyerpOpeningqty() {
		Assert.assertTrue(openingqty.isEnabled(),"Openingqty is enable");
		Reporter.log("verifyMyerpopeningqty",true);
		openingqty.sendKeys("150");
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
		sc.selectByVisibleText("GAS STOVE");
	}
	public void Company1() throws InterruptedException {
		Select sc = new Select(company);
		Thread.sleep(1000);
		Assert.assertFalse(company.isDisplayed(),"Company is  displayed");
		Assert.assertFalse(company.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void verifyMyerpSubmitbtn() {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	
	
}
