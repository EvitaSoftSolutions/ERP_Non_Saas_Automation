
package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Transporter {
	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
	@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;
	@FindBy (xpath="//a[text()='Transporter']") private WebElement transporter;
	@FindBy (xpath="//select[@id='ddlCompanyID']") private WebElement selectcompany;
	@FindBy (xpath="//input[@id='txtTransporterCode']") private WebElement tcode;
	@FindBy (xpath="//input[@id='txtTransporterName']") private WebElement tname;
	@FindBy (xpath="//select[@id='ddlGroup']") private WebElement selectgroup;
	@FindBy (xpath="//select[@id='ddlCategory']") private WebElement tselectcategory;
	@FindBy (xpath="//input[@id='txtContactDetail']") private WebElement tcontanctdetail;
	@FindBy (xpath="//input[@id='txtAddress1']") private WebElement taddress1;
	@FindBy (xpath="//input[@id='txtCity']") private WebElement tselectcity;
	@FindBy (xpath="//input[@id='chkActive']") private WebElement tactivechk;
	@FindBy (xpath="//button[@id='btnclear']") private WebElement tclearbtn;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement tsubmitbtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement tsubmitok;
	@FindBy (xpath="//a[@id='btnEdit']") private WebElement teditbtn;
	@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement tyesupdateitbtn;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement tupdatebtn;
	@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement tupdatedmsgok;  
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement texportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;   	



	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public Transporter(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// usage

	public void verifyMyerpagancycode() {
		Assert.assertTrue(agancycode.isEnabled(),"agancycode field is enabled");
		Reporter.log("verifyMyerpagancycode", true);
		agancycode.sendKeys("ERP_00001");
	}
	public void verifyMyerpUserid() {
		Assert.assertTrue(userid.isEnabled(),"uerid field is enabled");
		Reporter.log("verifyMyerpUserid", true);
		userid.sendKeys("admin");
	}
	public void verifyMyerpPassword() {
		Assert.assertTrue(password.isEnabled(),"passwordfield is enabled");
		Reporter.log(" verifyMyerpPassword", true);
		password.sendKeys("admin@123");
	}

	public void VerifyandClickonMyerpLoginBtn() {
		Assert.assertTrue(login.isEnabled(),"login btn is enabled");
		Reporter.log(" verifyMyerplogin", true);
		login.click();
	}

	public void VerifyMyerpMasterModule() {
		Assert.assertTrue(master.isEnabled(),"Master Module field is enabled");		 
		Reporter.log("verifyMyerpMasterModule", true);
		master.click(); 
	}
	public void VerifyMyerpGenralMasterModule() {
		Assert.assertTrue(genralmaster.isEnabled(),"GenralMaster Module field is enabled");		 
		Reporter.log("verifyMyerpGenralMasterModule", true);
		genralmaster.click(); 
	}
	public void VerifyMyerpTransporterForm() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(transporter.isEnabled(),"transporter form field is enabled");		 
		Reporter.log("verifyMyerptransporter", true);
		transporter.click(); 
	}

	public void TSelectCompany() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}

	public void VerifyMyerpTcompanyCode() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tcode.isEnabled(),"tcompanycode field is enabled");		 
		Reporter.log("verifyMyerptcompanycode", true);


	}
	public void VerifyMyerpTName() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tname.isEnabled(),"tname field is enabled");		 
		Reporter.log("verifyMyerptname", true);
		tname.click();
		tname.sendKeys("SwapnYog Industry");
	}

	public void TSelectGroup() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertTrue(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("SUNDRY DEBTORS");
	}

	public void VerifyMyerpTCategory() throws InterruptedException {
		Select sc = new Select(tselectcategory);
		Thread.sleep(1000);
		Assert.assertTrue(tselectcategory.isDisplayed(),"tselectcategory is displayed");
		Assert.assertFalse(tselectcategory.isSelected());
		sc.selectByVisibleText("Company");
	}

	public void VerifyMyerpTContandDetial() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tcontanctdetail.isEnabled(),"tcontanctdetail field is enabled");		 
		Reporter.log("verifyMyerptcontanctdetail", true);
		tcontanctdetail.click(); 
		tcontanctdetail.sendKeys("75647673567");
	}
	public void VerifyMyerpTAddress() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(taddress1.isEnabled(),"taddress1 field is enabled");		 
		Reporter.log("verifyMyerptaddress1", true);
		taddress1.click(); 
		taddress1.sendKeys("PUNE");		 
	}
	public void VerifyMyerpTSelectCity() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tselectcity.isEnabled(),"tselectcity field is enabled");		 
		Reporter.log("verifyMyerptselectcity", true);
		tselectcity.click(); 
		tselectcity.sendKeys("PUNE");		 
	}

	public void VerifyMyerpTActveChk() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tactivechk.isEnabled(),"tactivechk field is enabled");		 
		Reporter.log("verifyMyerptactivechk", true);
		tactivechk.click(); 
	}
	public void VerifyMyerpTClearBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tclearbtn.isEnabled(),"tclearbtn field is enabled");		 
		Reporter.log("verifyMyerptclearbtn", true);
		tclearbtn.click(); 
	}

	public void TSelectCompany1() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}

	public void VerifyMyerpTcompanyCode1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tcode.isEnabled(),"tcompanycode field is enabled");		 
		Reporter.log("verifyMyerptcompanycode", true);
		tcode.click(); 
		tcode.sendKeys("40725");
	}
	public void VerifyMyerpTName1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tname.isEnabled(),"tname field is enabled");		 
		Reporter.log("verifyMyerptname", true);
		tname.click();
		tname.sendKeys("YogMaya Industry");
	}

	public void TSelectGroup1() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertTrue(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("SUNDRY DEBTORS");
	}

	public void VerifyMyerpTCategory1() throws InterruptedException {
		Select sc = new Select(tselectcategory);
		Thread.sleep(1000);
		Assert.assertTrue(tselectcategory.isDisplayed(),"tselectcategory is displayed");
		Assert.assertFalse(tselectcategory.isSelected());
		sc.selectByVisibleText("Company");
	}

	public void VerifyMyerpTContandDetial1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tcontanctdetail.isEnabled(),"tcontanctdetail field is enabled");		 
		Reporter.log("verifyMyerptcontanctdetail", true);
		tcontanctdetail.click(); 
		tcontanctdetail.sendKeys("7875129034");
	}
	public void VerifyMyerpTAddress1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(taddress1.isEnabled(),"taddress1 field is enabled");		 
		Reporter.log("verifyMyerptaddress1", true);
		taddress1.click(); 
		taddress1.sendKeys("PUNE");		 
	}
	public void VerifyMyerpTSelectCity1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tselectcity.isEnabled(),"tselectcity field is enabled");		 
		Reporter.log("verifyMyerptselectcity", true);
		tselectcity.click(); 
		tselectcity.sendKeys("PUNE");		 
	}

	public void VerifyMyerpTActveChk1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tactivechk.isEnabled(),"tactivechk field is enabled");		 
		Reporter.log("verifyMyerptactivechk", true);
		tactivechk.click(); 
	}

	public void VerifyMyerpTSubmitBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tsubmitbtn.isEnabled(),"tsubmitbtn field is enabled");		 
		Reporter.log("verifyMyerpsupplie rtsubmitbtn", true);
		tsubmitbtn.click(); 
	}
	public void VerifyMyerpTSubmiOKBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tsubmitok.isEnabled(),"tsubmitok field is enabled");		 
		Reporter.log("verifyMyerptsubmitok", true);
		Assert.assertFalse(tsubmitok.isSelected());
		tsubmitok.click(); 
	}
	public void VerifyandClickonPSearchbar1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("YogMaya Industry");
		Thread.sleep(500);
	}
	public void VerifyMyerpTEditBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(teditbtn.isEnabled(),"teditbtn field is enabled");		 
		Reporter.log("verifyMyerptseditbtn", true);
		Assert.assertFalse(teditbtn.isSelected());
		teditbtn.click(); 
	}
	public void VerifyMyerpTYesUpdateBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tyesupdateitbtn.isEnabled(),"tyesupdateitbtn field is enabled");		 
		Reporter.log("verifyMyerptyesupdateitbtn", true);
		Assert.assertFalse(tyesupdateitbtn.isSelected());
		tyesupdateitbtn.click(); 
	}

	public void VerifyMyerpTName2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tname.isEnabled(),"tname field is enabled");		 
		Reporter.log("verifyMyerptname", true);
		tname.clear();
		tname.click();
		tname.sendKeys("SHaha INDUSTRY");
	}
	public void TSelectGroup2() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertTrue(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("FAN INSURENCE");
	}
	public void VerifyMyerpTUpdateBtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(tupdatebtn.isEnabled(),"tupdatebtn field is enabled");		 
		Reporter.log("verifyMyerptupdatebtn", true);
		Assert.assertFalse(tupdatebtn.isSelected());
		tupdatebtn.click(); 
	}
	public void VerifyMyerpTUpdateokBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tupdatedmsgok.isEnabled(),"tupdatedmsgok field is enabled");		 
		Reporter.log("verifyMyerptupdatedmsgok", true);
		Assert.assertFalse(tupdatedmsgok.isSelected());
		tupdatedmsgok.click(); 
	}
	public void VerifyMyerpTExportBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(texportbtn.isEnabled(),"texportbtn field is enabled");		 
		Reporter.log("verifyMyerptexportbtn", true);
		Assert.assertFalse(texportbtn.isSelected());
		texportbtn.click();
	}
	public void VerifyandClickonPSearchbar2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("SHaha INDUSTRY");

		Thread.sleep(500);
	}


}
