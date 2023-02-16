package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class OpeningStockForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::ul/child::li[2]/a")private WebElement accountmaster;
	@FindBy(xpath="//a[text()='Opening Stock']")private WebElement openingstock;
	@FindBy(xpath="//select[@id='ddlGodownID']")private WebElement godown;
	@FindBy(xpath="//select[@id='ddlProductID']")private WebElement product;
	@FindBy(xpath="//input[@id='Fromdate']")private WebElement fromdate;
	@FindBy(xpath="//input[@id='txtOpeningFull']")private WebElement openingfull;
	@FindBy(xpath="//input[@id='txtOpeningEmpty']")private WebElement openingempty;
	@FindBy(xpath="//input[@id='txtDefective']")private WebElement defective;
	@FindBy(xpath="//input[@id='txtCredit']")private WebElement credit;
	@FindBy(xpath="//input[@id='txtMinStock']")private WebElement minstock;
	@FindBy(xpath="//input[@id='txtStockOpeningValuation']")private WebElement openingvaluation;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//input[@id='rdoOther']")private WebElement retiobutton;
	@FindBy(xpath="//input[@id='txtStockOpeningValuation']")private WebElement stockopeningvaluation;
	@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement companyselect;
	@FindBy(xpath="//input[@id='txtotherprodOpeningQty']")private WebElement openingqty;
	
	//initialization
			public OpeningStockForm(WebDriver driver) {
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
			public void verifyMyerpAccountMaster() {
				Assert.assertTrue(accountmaster.isEnabled(),"AccountMaster is enable");
				Reporter.log("verifyMyerpaccountmaster",true);
				accountmaster.click();
			}
			public void verifyMyerpOpeningStock() {
				Assert.assertTrue(openingstock.isEnabled(),"OpeningStock is enable");
				Reporter.log("verifyMyerpopeningstock",true);
				openingstock.click();
			}
			public void Godown() throws InterruptedException {
    			Select sc = new Select(godown);
    			Thread.sleep(1000);
    			Assert.assertFalse(godown.isDisplayed(),"Godown is  displayed");
    			Assert.assertFalse(godown.isSelected());
    			sc.selectByVisibleText("VIRAR WEST");
			}
			public void Product() throws InterruptedException {
    			Select sc = new Select(product);
    			Thread.sleep(1000);
    			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
    			Assert.assertFalse(product.isSelected());
    			sc.selectByVisibleText("14.2 DOM");
			}
			public void verifyMyerpFromDate() {
				Assert.assertTrue(fromdate.isEnabled(),"FromDate is enable");
				Reporter.log("verifyMyerpfromdate",true);
				fromdate.sendKeys("01/12/2022");
			}
			public void verifyMyerpOpeningFull() {
				Assert.assertTrue(openingfull.isEnabled(),"OpeningFull is enable");
				Reporter.log("verifyMyerpopeningfull",true);
				openingfull.sendKeys("15");
			}
			public void verifyMyerpOpeningEmpty() {
				Assert.assertTrue(openingempty.isEnabled(),"OpeningEmpty is enable");
				Reporter.log("verifyMyerpopeningempty",true);
				openingempty.sendKeys("15");
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
			public void verifyMyerpMinStock() {
				Assert.assertTrue(minstock.isEnabled(),"MinStock is enable");
				Reporter.log("verifyMyerpminstock",true);
				minstock.sendKeys("5");
			}
			public void verifyMyerpOpeningValuation() {
				Assert.assertTrue(openingvaluation.isEnabled(),"OpeningValuation is enable");
				Reporter.log("verifyMyerpopeningvaluation",true);
				openingvaluation.sendKeys("20");
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
    			sc.selectByVisibleText("VIRAR WEST");
			}
			public void Product1() throws InterruptedException {
    			Select sc = new Select(product);
    			Thread.sleep(1000);
    			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
    			Assert.assertFalse(product.isSelected());
    			sc.selectByVisibleText("14.2 DOM");
			}
			public void verifyMyerpFromDate1() {
				Assert.assertTrue(fromdate.isEnabled(),"FromDate is enable");
				Reporter.log("verifyMyerpfromdate",true);
				fromdate.sendKeys("01/12/2022");
			}
			public void verifyMyerpOpeningFull1() {
				Assert.assertTrue(openingfull.isEnabled(),"OpeningFull is enable");
				Reporter.log("verifyMyerpopeningfull",true);
				openingfull.sendKeys("15");
			}
			public void verifyMyerpOpeningEmpty1() {
				Assert.assertTrue(openingempty.isEnabled(),"OpeningEmpty is enable");
				Reporter.log("verifyMyerpopeningempty",true);
				openingempty.sendKeys("15");
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
			public void verifyMyerpMinStock1() {
				Assert.assertTrue(minstock.isEnabled(),"MinStock is enable");
				Reporter.log("verifyMyerpminstock",true);
				minstock.sendKeys("5");
			}
			public void verifyMyerpOpeningValuation1() {
				Assert.assertTrue(openingvaluation.isEnabled(),"OpeningValuation is enable");
				Reporter.log("verifyMyerpopeningvaluation",true);
				openingvaluation.sendKeys("20");
			}
			public void verifyMyerpSubmitbtn() {
				Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
				Reporter.log("verifyMyerpsubmitbtn",true);
				submitbtn.click();
			}
			public void verifyMyerpRetiobutton() {
				Assert.assertTrue(retiobutton.isEnabled(),"Retiobutton is enable");
				Reporter.log("verifyMyerpretiobutton",true);
				retiobutton.click();
			}
			public void Godown2() throws InterruptedException {
    			Select sc = new Select(godown);
    			Thread.sleep(1000);
    			Assert.assertFalse(godown.isDisplayed(),"Godown is  displayed");
    			Assert.assertFalse(godown.isSelected());
    			sc.selectByVisibleText("VIRAR WEST");
			}
			public void Product2() throws InterruptedException {
    			Select sc = new Select(product);
    			Thread.sleep(1000);
    			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
    			Assert.assertFalse(product.isSelected());
    			sc.selectByVisibleText("SRT PIPE");
			}
			public void verifyMyerpFromDate2() {
				Assert.assertTrue(fromdate.isEnabled(),"FromDate is enable");
				Reporter.log("verifyMyerpfromdate",true);
				fromdate.sendKeys("01/12/2022");
			}
			public void verifyMyerpStockOpeningValuation() {
				Assert.assertTrue(stockopeningvaluation.isEnabled(),"StockOpeningValuation is enable");
				Reporter.log("verifyMyerpstockopeningvaluation",true);
				stockopeningvaluation.sendKeys("01/12/2022");
			}
			public void CompanySelect() throws InterruptedException {
    			Select cs = new Select(companyselect);
    			Thread.sleep(1000);
    			Assert.assertFalse(companyselect.isDisplayed(),"CompanySelect is  displayed");
    			Assert.assertFalse(companyselect.isSelected());
    			cs.selectByVisibleText("ANITA GAS SERVICES");
			}
			public void verifyMyerpOpeningQty() {
				Assert.assertTrue(openingqty.isEnabled(),"OpeningQty is enable");
				Reporter.log("verifyMyerpopeningqty",true);
				openingqty.sendKeys("10");
			}
			public void verifyMyerpClearbtn1() {
				Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
				Reporter.log("verifyMyerpclearbtn",true);
				clearbtn.click();
			}
			public void Godown3() throws InterruptedException {
    			Select sc = new Select(godown);
    			Thread.sleep(1000);
    			Assert.assertFalse(godown.isDisplayed(),"Godown is  displayed");
    			Assert.assertFalse(godown.isSelected());
    			sc.selectByVisibleText("VIRAR WEST");
			}
			public void Product3() throws InterruptedException {
    			Select sc = new Select(product);
    			Thread.sleep(1000);
    			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
    			Assert.assertFalse(product.isSelected());
    			sc.selectByVisibleText("SRT PIPE");
			}
			public void verifyMyerpFromDate3() {
				Assert.assertTrue(fromdate.isEnabled(),"FromDate is enable");
				Reporter.log("verifyMyerpfromdate",true);
				fromdate.sendKeys("01/12/2022");
			}
			public void verifyMyerpStockOpeningValuation1() {
				Assert.assertTrue(stockopeningvaluation.isEnabled(),"StockOpeningValuation is enable");
				Reporter.log("verifyMyerpstockopeningvaluation",true);
				stockopeningvaluation.sendKeys("01/12/2022");
			}
			public void CompanySelect1() throws InterruptedException {
    			Select cs = new Select(companyselect);
    			Thread.sleep(1000);
    			Assert.assertFalse(companyselect.isDisplayed(),"CompanySelect is  displayed");
    			Assert.assertFalse(companyselect.isSelected());
    			cs.selectByVisibleText("ANITA GAS SERVICES");
			}
			public void verifyMyerpOpeningQty1() {
				Assert.assertTrue(openingqty.isEnabled(),"OpeningQty is enable");
				Reporter.log("verifyMyerpopeningqty",true);
				openingqty.sendKeys("10");
			}
			public void verifyMyerpSubmitbtn1() {
				Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
				Reporter.log("verifyMyerpsubmitbtn",true);
				submitbtn.click();
			}
}
