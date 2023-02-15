package com.lpg.qa.InventoryManagement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
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
	@FindBy(xpath="//input[@id='rdoOther']")private WebElement otherproduct;
	@FindBy(xpath="//select[@id='ddlGodownID']")private WebElement godown;
	@FindBy(xpath="//select[@id='ddlProductID']")private WebElement product;
	@FindBy(xpath="//input[@id='txtStockOpeningValuation']")private WebElement openingvalue;
	@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement company;
	@FindBy(xpath="//input[@id='txtotherprodOpeningQty']")private WebElement openingqty;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement oclearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement osubmitbtn;

	@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement genralreport;
	@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[2]/a") private WebElement dailycomplaintreport;
	@FindBy (xpath="//input[@id='FromDate']") private WebElement selectdate;
	@FindBy (xpath="//select[@id='ddlGodownID']") private WebElement selectgodowen;
	@FindBy (xpath="//Button[@id='btnGetdata']") private WebElement getdatabtn;


	//initialization

	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
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
		sc.selectByVisibleText("10 KG");
	}
	public void verifyMyerpOpeningfull() {
		Assert.assertTrue(openingfull.isEnabled(),"Openingfull is enable");
		Reporter.log("verifyMyerpopeningfull",true);
		openingfull.clear();
		openingfull.sendKeys("12");
	}
	public void verifyMyerpOpeningEmpty() {
		Assert.assertTrue(openingempty.isEnabled(),"OpeningEmpty is enable");
		Reporter.log("verifyMyerpopeningempty",true);
		openingempty.clear();
		openingempty.sendKeys("12");
	}
	public void verifyMyerpDefective() {
		Assert.assertTrue(defective.isEnabled(),"Defective is enable");
		Reporter.log("verifyMyerpdefective",true);
		defective.clear();
		defective.sendKeys("1");
	}
	public void verifyMyerpCredit() {
		Assert.assertTrue(credit.isEnabled(),"Credit is enable");
		Reporter.log("verifyMyerpcredit",true);
		credit.clear();
		credit.sendKeys("1");
	}
	public void verifyMyerpMinstock() {
		Assert.assertTrue(minstock.isEnabled(),"Minstock is enable");
		Reporter.log("verifyMyerpminstock",true);
		minstock.clear();
		minstock.sendKeys("0");
	}
	public void verifyMyerpValuavtion() {
		Assert.assertTrue(valuavtion.isEnabled(),"Valuavtion is enable");
		Reporter.log("verifyMyerpvaluavtion",true);
		valuavtion.clear();
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
		sc.selectByVisibleText("41.2 KG");
	}
	public void verifyMyerpOpeningfull1() {
		Assert.assertTrue(openingfull.isEnabled(),"Openingfull is enable");
		Reporter.log("verifyMyerpopeningfull",true);
		openingfull.clear();
		openingfull.sendKeys("12");
	}
	public void verifyMyerpOpeningEmpty1() {
		Assert.assertTrue(openingempty.isEnabled(),"OpeningEmpty is enable");
		Reporter.log("verifyMyerpopeningempty",true);
		openingempty.clear();
		openingempty.sendKeys("12");
	}
	public void verifyMyerpDefective1() {
		Assert.assertTrue(defective.isEnabled(),"Defective is enable");
		Reporter.log("verifyMyerpdefective",true);
		defective.clear();
		defective.sendKeys("0");
	}
	public void verifyMyerpCredit1() {
		Assert.assertTrue(credit.isEnabled(),"Credit is enable");
		Reporter.log("verifyMyerpcredit",true);
		credit.clear();
		credit.sendKeys("0");
	}
	public void verifyMyerpMinstock1() {
		Assert.assertTrue(minstock.isEnabled(),"Minstock is enable");
		Reporter.log("verifyMyerpminstock",true);
		minstock.clear();
		minstock.sendKeys("0");
	}
	public void verifyMyerpValuavtion1() {
		Assert.assertTrue(valuavtion.isEnabled(),"Valuavtion is enable");
		Reporter.log("verifyMyerpvaluavtion",true);
		valuavtion.clear();
		valuavtion.sendKeys("120");
	}
	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(1000);
		if (isAlertPresent(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent(WebDriver driver) throws
	InterruptedException { 
		try {
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept();
			return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

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
		sc.selectByVisibleText("SRT PIPE");
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
	public void verifyMyerpopClearbtn() throws InterruptedException {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
		Thread.sleep(800); 
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
		sc.selectByVisibleText("SRT PIPE");
	}
	public void Company1() throws InterruptedException {
		Select sc = new Select(company);
		Thread.sleep(1000);
		Assert.assertFalse(company.isDisplayed(),"Company is  displayed");
		Assert.assertFalse(company.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void verifyMyerpoSubmitbtn() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(1000);
		if (isAlertPresent1(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent1(WebDriver driver) throws
	InterruptedException { 
		try {
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept();
			return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}


	public void VerifyMyerpGenralReportModule() throws InterruptedException {
		Thread.sleep(2000); 
		Assert.assertTrue(genralreport.isEnabled(),"genralreport field is enabled");		 
		Reporter.log("verifyMyerpgenralreport", true);
		genralreport.click(); 
	}

	public void VerifyMyerpDailyComplaintReport() throws InterruptedException {
		Thread.sleep(2000); 
		Assert.assertTrue(dailycomplaintreport.isEnabled(),"dailycomplaintreport field is enabled");		 
		Reporter.log("verifyMyerpdailycomplaintreport", true);
		dailycomplaintreport.click(); 
	}

	public void VerifyMyerpSelectDate() throws InterruptedException {
		Thread.sleep(800); 
		Assert.assertTrue(selectdate.isEnabled(),"selectdate field is enabled");		 
		Reporter.log("verifyMyerpselectdate", true);
		selectdate.click(); 
		selectdate.clear();
		selectdate.sendKeys("7/01/2023");
	}

	public void verifyMyerpSelectGodown() throws InterruptedException {
		Select su = new Select(selectgodowen);
		Thread.sleep(1000);
		Assert.assertFalse(selectgodowen.isDisplayed(),"selectgodown is displayed");
		Assert.assertFalse(selectgodowen.isSelected());
		su.selectByVisibleText("VIRAR");

	}
	public void VerifyandClickonMyerpGetDataBtn() throws InterruptedException {
		Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
		Reporter.log("verifyMyerpgetdatabtn", true);
		getdatabtn.click();
		Thread.sleep(1000);
	}

}



