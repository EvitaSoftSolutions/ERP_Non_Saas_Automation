package com.lpg.qa.GMPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Employee {

	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
	@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;
	@FindBy (xpath="//a[text()='Employee']") private WebElement employeeform; 
	@FindBy (xpath="//input[@id='txtFname']") private WebElement efname;
	@FindBy (xpath="//input[@id='txtLname']") private WebElement elname;
	@FindBy (xpath="//select[@id='ddlCompanyID']") private WebElement selectcompany;
	@FindBy (xpath="//input[@id='male']") private WebElement eselectgendermale;
	@FindBy (xpath="//input[@id='female']") private WebElement eselectgenderfemale;
	@FindBy (xpath="//select[@id='ddlDesignation']") private WebElement eselectdesignation;;
	@FindBy (xpath="//input[@id='chkActive']") private WebElement eactivechk;
	@FindBy (xpath="//button[text()='Clear']") private WebElement ebtnclear;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement ebtnsubmit;
	@FindBy (xpath="//button[text()='OK']") private WebElement ebtnsubmitok;
	@FindBy (xpath="//a[@id='btnEdit']") private WebElement ebtnedit;
	@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement ebtnyesupdateit;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement eupdatebtn;
	@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement eupdateokbtn;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement ebtnexport;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;  





	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public Employee(WebDriver driver) {
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
	public void VerifyMyerpEmployeeForm() {
		Assert.assertTrue(employeeform.isEnabled()," employeeform field is enabled");		 
		Reporter.log("verifyMyerp employeeform", true);
		employeeform.click(); 
	}
	public void VerifyMyerpEmployeeFirstName() {
		Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
		Reporter.log("verifyMyerp employeefname", true);
		efname.click();
		efname.sendKeys("David");
	}
	public void VerifyMyerpEmployeeLastName() {
		Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
		Reporter.log("verifyMyerp elname", true);
		elname.click();
		elname.sendKeys("Patel");
	}
	public void ESelectCompany() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void setEmpPageGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			eselectgendermale.click();
		}else if(gender.equalsIgnoreCase("female")) {
			eselectgenderfemale.click();
		}else {
			System.out.println("The wrong input selected by user");
		}
	}
	public void ESelectDesignation() throws InterruptedException {
		Select sc = new Select(eselectdesignation);
		Thread.sleep(1000);
		Assert.assertFalse(eselectdesignation.isDisplayed(),"eselect designation is not displayed");
		Assert.assertFalse(eselectdesignation.isSelected());
		sc.selectByVisibleText("Manager");
	}
	public void VerifyMyerpEmployeeActiveCHK() {
		Assert.assertTrue(eactivechk.isEnabled()," eactivechk field is enabled");		 
		Reporter.log("verifyMyerp eactivechk", true);
		eactivechk.click(); 

	}
	public void VerifyMyerpEmployeeClearBtn() {
		Assert.assertTrue(ebtnclear.isEnabled()," ebtnclear field is enabled");
		Reporter.log("verifyMyerp ebtnclear", true);
		ebtnclear.click();

	}

	public void VerifyMyerpEmployeeFirstName1() {
		Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
		Reporter.log("verifyMyerp employeefname", true);
		efname.click(); 
		efname.sendKeys("vasim");
	}
	public void VerifyMyerpEmployeeLastName1() {
		Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
		Reporter.log("verifyMyerp elname", true);
		elname.click(); 
		elname.sendKeys("Patel");
	}
	public void ESelectCompany1() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void setEmpPageGender1(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			eselectgendermale.click();
		}else if(gender.equalsIgnoreCase("female")) {
			eselectgenderfemale.click();
		}else {
			System.out.println("The wrong input selected by user");
		}
	}
	public void ESelectDesignation1() throws InterruptedException {
		Select sc = new Select(eselectdesignation);
		Thread.sleep(1000);
		Assert.assertFalse(eselectdesignation.isDisplayed(),"eselect designation is not displayed");
		Assert.assertFalse(eselectdesignation.isSelected());
		sc.selectByVisibleText("Manager");
	}
	public void VerifyMyerpEmployeeActiveCHK1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(eactivechk.isEnabled()," eactivechk field is enabled");		 
		Reporter.log("verifyMyerp eactivechk", true);
		eactivechk.click(); 

	}
	public void VerifyMyerpEmployeeSubmitBtn() {
		Assert.assertTrue(ebtnsubmit.isEnabled(),"ebtnsubmitfield is enabled");		 
		Reporter.log("verifyMyerp ebtnsubmit", true);
		ebtnsubmit.click(); 

	}
	public void VerifyMyerpEmployeeSubmitOKBtn() {
		Assert.assertTrue(ebtnsubmitok.isEnabled(),"ebtnsubmitok is enabled");		 
		Reporter.log("verifyMyerp ebtnsubmitok", true);
		ebtnsubmitok.click();

	}
	public void VerifyandClickonPSearchbar1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("Vasim");
	}
	public void VerifyMyerpEmployeeEditBtn() {
		Assert.assertTrue(ebtnedit.isEnabled()," ebtnedit is enabled");		 
		Reporter.log("verifyMyerp  ebtnedit", true);
		ebtnedit.click();

	}
	public void VerifyMyerpEmployeeYesUpdateItBtn() throws InterruptedException {
		Assert.assertTrue(ebtnyesupdateit.isEnabled(),"ebtnyesupdateit is enabled");		 
		Reporter.log("verifyMyerp ebtnyesupdateit", true);
		ebtnyesupdateit.click();
		Thread.sleep(500);

	}
	public void VerifyMyerpEmployeeFirstName2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
		Reporter.log("verifyMyerp employeefname", true);
		efname.click();
		efname.clear();
		efname.sendKeys("Swaraj");
	}
	public void VerifyMyerpEmployeeLastName2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
		Reporter.log("verifyMyerp elname", true);
		elname.click(); 
		elname.clear();
		elname.sendKeys("Patel");
	}
	public void ESelectDesignation2() throws InterruptedException {
		Select sc = new Select(eselectdesignation);
		Thread.sleep(1000);
		Assert.assertFalse(eselectdesignation.isDisplayed(),"eselect designation is not displayed");
		Assert.assertFalse(eselectdesignation.isSelected());
		sc.selectByVisibleText("Manager");
	}
	public void VerifyMyerpEmployeeUpdateBtn() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(eupdatebtn.isEnabled(),"eupdatebtn is enabled");		 
		Reporter.log("verifyMyerp eupdatebtn", true);
		eupdatebtn.click();

	}
	public void VerifyMyerpEmployeeUpdateOKBtn() {
		Assert.assertTrue(eupdateokbtn.isEnabled(),"eupdateokbtn is enabled");		 
		Reporter.log("verifyMyerp eupdateokbtn", true);
		eupdateokbtn.click();

	}
	public void VerifyandClickonPSearchbar2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("Swaraj");
	}
	public void VerifyMyerpEmployeeExportBtn() {
		Assert.assertTrue(ebtnexport.isEnabled(),"ebtnexport is enabled");		 
		Reporter.log("verifyMyerp ebtnexport", true);
		ebtnexport.click();

	}	
}

