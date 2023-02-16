package com.lpg.qa.InventoryManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class StockUpdateForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Inventory Management']")private WebElement inventorymanagement;
	@FindBy(xpath="//a[text()=' Stock Update']")private WebElement stockupdate;
	@FindBy(xpath="//input[@id='datepicker']")private WebElement selectdate;
	@FindBy(xpath="//select[@id='ddlGodownID']")private WebElement godown;
	@FindBy(xpath="//button[@id='btnGetdata']")private WebElement getdata;
	@FindBy(xpath="//input[@id='txtOpeningFull']")private WebElement openingfull;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	//initialization
	public StockUpdateForm(WebDriver driver) {
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
	public void verifyMyerpstockupdate() {
		Assert.assertTrue(stockupdate.isEnabled(),"stockupdate is enable");
		Reporter.log("verifyMyerpstockupdate",true);
		stockupdate.click();
	}
	public void verifyMyerpselectdate() {
		Assert.assertTrue(selectdate.isEnabled(),"selectdate is enable");
		Reporter.log("verifyMyerpselectdate",true);
		selectdate.clear();
		selectdate.sendKeys("01/12/2022");;
	}
	public void Godown() throws InterruptedException {
		Select sc = new Select(godown);
		Thread.sleep(1000);
		Assert.assertFalse(godown.isDisplayed(),"Godown is  displayed");
		Assert.assertFalse(godown.isSelected());
		sc.selectByVisibleText("VIRAR WEST");
	}
	public void verifyMyerpgetdata() {
		Assert.assertTrue(getdata.isEnabled(),"getdata is enable");
		Reporter.log("verifyMyerpgetdata",true);
		getdata.click();
	}
	public void verifyMyerpopeningfull() {
		Assert.assertTrue(openingfull.isEnabled(),"openingfull is enable");
		Reporter.log("verifyMyerpopeningfull",true);
		openingfull.sendKeys("12");
	}
	public void verifyMyerpsubmitbtn() {
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}

}
