package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class UpdateStockForm {
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::ul/child::li[2]/a")private WebElement accountmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagenavigataion;
	@FindBy(xpath="//a[text()='Update Stock']")private WebElement updatestock;
	@FindBy(xpath="//input[@id='datepicker']")private WebElement slectdate;
	@FindBy(xpath="//select[@id='ddlGodownID']")private WebElement selectgodown;
	@FindBy(xpath="//button[@id='btnGetdata']")private WebElement getdata;
	@FindBy(xpath="//input[@id='txtOpeningFull']")private WebElement chengeopefull;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	//initialization
	public UpdateStockForm(WebDriver driver) {
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
	public void verifyMyerpPageNavigataion() {
		Assert.assertTrue(pagenavigataion.isEnabled(),"PageNavigataion is enable");
		Reporter.log("verifyMyerppagenavigataion",true);
		pagenavigataion.click();
	}
	public void verifyMyerpUpdateStock() {
		Assert.assertTrue(updatestock.isEnabled(),"UpdateStock is enable");
		Reporter.log("verifyMyerpupdatestock",true);
		updatestock.click();
	}
	
	public void SelectGodown() throws InterruptedException {
		Select sg = new Select(selectgodown);
		Thread.sleep(1000);
		Assert.assertFalse(selectgodown.isDisplayed(),"SelectGodown is  displayed");
		Assert.assertFalse(selectgodown.isSelected());
		sg.selectByVisibleText("VIRAR WEST");
	}
	public void verifyMyerpSlectDate() {
		Assert.assertTrue(slectdate.isEnabled(),"SlectDate is enable");
		Reporter.log("verifyMyerpslectdate",true);
		slectdate.sendKeys("02/12/2022");
	}
	public void verifyMyerpGetdata() {
		Assert.assertTrue(getdata.isEnabled(),"Getdata is enable");
		Reporter.log("verifyMyerpgetdata",true);
		getdata.click();
	}
	public void verifyMyerpChengeOpefull() {
		Assert.assertTrue(chengeopefull.isEnabled(),"ChengeOpefull is enable");
		Reporter.log("verifyMyerpchengeopefull",true);
		chengeopefull.sendKeys("10");
	}
	public void verifyMyerpSubmitBtn() {
		Assert.assertTrue(submitbtn.isEnabled(),"SubmitBtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void SelectGodown1() throws InterruptedException {
		Select sg = new Select(selectgodown);
		Thread.sleep(1000);
		Assert.assertFalse(selectgodown.isDisplayed(),"SelectGodown is  displayed");
		Assert.assertFalse(selectgodown.isSelected());
		sg.selectByVisibleText("VIRAR WEST");
	}
	public void verifyMyerpSlectDate1() {
		Assert.assertTrue(slectdate.isEnabled(),"SlectDate is enable");
		Reporter.log("verifyMyerpslectdate",true);
		slectdate.sendKeys("02/12/2022");
	}
	public void verifyMyerpGetdata1() {
		Assert.assertTrue(getdata.isEnabled(),"Getdata is enable");
		Reporter.log("verifyMyerpgetdata",true);
		getdata.click();
	}
	
}
