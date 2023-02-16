package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Userpageform {
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena;
	@FindBy(xpath="//a[text()='User']")private WebElement usermaster;
	@FindBy(xpath="//select[@id='ddlEmp_Code']")private WebElement selectempy;
	@FindBy(xpath="//select[@id='ddlUser_Type']")private WebElement selectusertyp;
	@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement selectcomp;
	@FindBy(xpath="//input[@id='txtUserName']")private WebElement useridname;
	@FindBy(xpath="//input[@id='password-field']")private WebElement userpass;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement useremail;
	@FindBy(xpath="//input[@id='txtMobileNo']")private WebElement usermob;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement checkboxcl; 
	@FindBy (xpath="//button[@id='btnclear']") private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement cdpsubmitokbtn;
	@FindBy (xpath="//a[@id='btnEdit']") private WebElement cdpebtnedit;
	@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement cdpbtnyesupdateit;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement cdpupdatebtn;
	@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement cdpupdateokbtn;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement cdpbtnexport;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar; 


	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public Userpageform(WebDriver driver) {
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
	public void verifyMyerpMasterModule() {
		Assert.assertTrue(master.isEnabled()," Mastermodule is enable");
		Reporter.log("verifyMyerpmastermodule",true);
		master.click();
	}
	public void verifyMyerpGeneralMaster() {
		Assert.assertTrue(generalmaster.isEnabled(),"GeneralMaster is Enable");
		Reporter.log("verifyMyerpgeneralmaster",true);
		generalmaster.click();

	}
	public void verifyMyerpPageNavigation() {
		Assert.assertTrue(pagena.isEnabled(),"PageNavigation is Enable");
		Reporter.log("verifyMyerppagena",true);
		pagena.click();

	}
	public void verifyMyerpUserMaster() {
		Assert.assertTrue(usermaster.isEnabled(),"Usermaster is Enable");
		Reporter.log("verifyMyerpusermaster",true);
		usermaster.click();

	}
	public void verifyMyerpSelectEmployee() throws InterruptedException {
		Thread.sleep(1000);
		Select sc = new Select(selectempy);
		Thread.sleep(800);
		Assert.assertFalse(selectempy.isDisplayed(),"selectempy is displayed");
		Assert.assertFalse(selectempy.isSelected());
		sc.selectByVisibleText("PARI  PATEL : Manager");

	}
	public void verifyMyerpSelectEmployee1() throws InterruptedException {
		Thread.sleep(1000);
		Select sc = new Select(selectempy);
		Thread.sleep(1000);
		Assert.assertFalse(selectempy.isDisplayed(),"selectempy is displayed");
		Assert.assertFalse(selectempy.isSelected());
		sc.selectByVisibleText("NAMRAT BJBJHJ MBMNNM : USER");

	}

	public void verifyMyerpSelectUserType() throws InterruptedException {
		Thread.sleep(400);
		Select su = new Select(selectusertyp);
		Thread.sleep(1000);
		Assert.assertTrue(selectusertyp.isDisplayed(),"SelectUserType is displayed");
		Assert.assertFalse(selectusertyp.isSelected());
		su.selectByVisibleText("Web");

	}
	public void verifyMyerpSelectCompany() throws InterruptedException {
		Select su = new Select(selectcomp);
		Thread.sleep(1000);
		Assert.assertFalse(selectcomp.isDisplayed(),"SelectCompany is displayed");
		Assert.assertFalse(selectcomp.isSelected());
		su.selectByVisibleText("ANITA GAS SERVICES");

	}
	public void verifyMyerpUseridname()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(useridname.isEnabled(),"Useridname is Enable");
		Reporter.log("verifyMyerpuseridname",true);
		useridname.sendKeys("reeta");

	}
	public void verifyMyerpUserpass()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(userpass.isEnabled(),"Userpass is Enable");
		Reporter.log("verifyMyerpuserpass",true);
		userpass.sendKeys("reeta@123");

	}
	public void verifyMyerpUseremail()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(useremail.isEnabled(),"Useremail is Enable");
		Reporter.log("verifyMyerpuseremail",true);
		useremail.sendKeys("reeta123@gmail.com");

	}
	public void verifyMyerpUserMob()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(usermob.isEnabled(),"UserMob is Enable");
		Reporter.log("verifyMyerpusermob",true);
		usermob.sendKeys("9891908087"); 

	}
	public void verifyMyerpcheckboxcl()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(checkboxcl.isEnabled(),"Checkboxcl is Enable");
		Reporter.log("verifyMyerpcheckboxcl",true);
		checkboxcl.click();

	}
	public void VerifyClearBtn()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(clearbtn.isEnabled(),"clearbtn is enabled");
		Reporter.log(" verifyMyerpclearbtn", true);
		clearbtn.click();
	}

	public void verifyMyerpsubmitbtn()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is Enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();

	}
	public void VerifySubmitOKBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cdpsubmitokbtn.isEnabled(),"cdpsubmitokbtn is enabled");
		Reporter.log(" verifyMyerpcdpsubmitokbtn", true);
		cdpsubmitokbtn.click();
	}
	public void VerifyandClickonPSearchbar1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("maya");

		Thread.sleep(500);
	}
	public void VerifyEditBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cdpebtnedit.isEnabled(),"cdpebtnedit is enabled");
		Reporter.log(" verifyMyerpcdpebtnedit", true);
		cdpebtnedit.click();
	}
	public void VerifyYesUpdateItBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cdpbtnyesupdateit.isEnabled(),"cdpbtnyesupdateit is enabled");
		Reporter.log(" verifyMyerpcdpbtnyesupdateit", true);
		cdpbtnyesupdateit.click();
	}
	public void verifyMyerpSelectUserType1() throws InterruptedException {
		Select su = new Select(selectusertyp);
		Thread.sleep(1000);
		Assert.assertTrue(selectusertyp.isDisplayed(),"SelectUserType is displayed");
		Assert.assertFalse(selectusertyp.isSelected());
		su.selectByVisibleText("Both");

	}
	public void verifyMyerpUserMob1()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(usermob.isEnabled(),"UserMob is Enable");
		Reporter.log("verifyMyerpusermob",true);
		usermob.clear();
		usermob.sendKeys("8961275687"); 

	}public void verifyMyerpUseremail1()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(useremail.isEnabled(),"Useremail is Enable");
		Reporter.log("verifyMyerpuseremail",true);
		useremail.clear();
		useremail.sendKeys("reeeta1230@gmail.com");

	}

	public void VerifyPUpdateBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cdpupdatebtn.isEnabled(),"cdpupdatebtn is enabled");
		Reporter.log(" verifyMyerpcdpupdatebtn", true);
		cdpupdatebtn.click();
	}
	public void VerifyUpdateOKBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cdpupdateokbtn.isEnabled(),"cdpupdateokbtnis enabled");
		Reporter.log(" verifyMyerpcdpupdateokbtn", true);
		cdpupdateokbtn.click();
	}
	public void VerifyExportBtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cdpbtnexport.isEnabled(),"cdpbtnexport is enabled");
		Reporter.log(" verifyMyerpcdpbtnexport", true);
		cdpbtnexport.click();
	}



	public void VerifyandClickonPSearchbar2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("reeta Both");

		Thread.sleep(500);
	}


}
