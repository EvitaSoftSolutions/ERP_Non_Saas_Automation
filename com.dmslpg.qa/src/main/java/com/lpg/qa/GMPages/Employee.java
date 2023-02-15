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
	@FindBy (xpath="//select[@id='ddlDesignation']") private WebElement eselectdesignation;
	@FindBy (xpath="//input[@id='txtPersonalContact']") private WebElement personalcontanctnumber;
	@FindBy (xpath="//input[@id='txtOfficialContact']") private WebElement oficialcontanctnumber;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement emailid;
	@FindBy (xpath="//input[@id='txtAddress1']") private WebElement address1;
	@FindBy (xpath="//select[@id='ddlstate']") private WebElement selectstate;
	@FindBy (xpath="//select[@id='ddldistrict']") private WebElement selectdistrict;
	@FindBy (xpath="//select[@id='ddlTahsil']") private WebElement selecttehsil;
	@FindBy (xpath="//input[@id='txtCity']") private WebElement entercity;
	@FindBy (xpath="//input[@id='txtPinCode']") private WebElement pincode;
	@FindBy (xpath="//input[@id='txtBasicPay']") private WebElement basicpay;
	@FindBy (xpath="//input[@id='datepicker']") private WebElement dob;
	@FindBy (xpath="//input[@id='datepicker_join']") private WebElement joiningdate;

	@FindBy (xpath="//input[@id='chkActive']") private WebElement eactivechk;
	@FindBy (xpath="//button[@id='btnclear']") private WebElement ebtnclear;
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

	public void VerifyMyerpMasterModule() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(master.isEnabled(),"Master Module field is enabled");		 
		Reporter.log("verifyMyerpMasterModule", true);
		master.click(); 
	}
	public void VerifyMyerpGenralMasterModule() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(genralmaster.isEnabled(),"GenralMaster Module field is enabled");		 
		Reporter.log("verifyMyerpGenralMasterModule", true);
		genralmaster.click(); 
	}
	public void VerifyMyerpEmployeeForm() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(employeeform.isEnabled()," employeeform field is enabled");		 
		Reporter.log("verifyMyerp employeeform", true);
		employeeform.click(); 
	}
	public void VerifyMyerpEmployeeFirstName() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
		Reporter.log("verifyMyerp employeefname", true);
		efname.click();
		efname.sendKeys("Manoj");
	}
	public void VerifyMyerpEmployeeLastName() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
		Reporter.log("verifyMyerp elname", true);
		elname.click();
		elname.sendKeys("Kumar");
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
		sc.selectByVisibleText("USER");
	}

	public void VerifyMyerppersonalcontanctnumber() {
		Assert.assertTrue(personalcontanctnumber.isEnabled()," personalcontanctnumber field is enabled");		 
		Reporter.log("verifyMyerp personalcontanctnumber", true);
		personalcontanctnumber.click(); 
		personalcontanctnumber.sendKeys("8828420045");
	}
	public void VerifyMyerpoficialcontanctnumber() {
		Assert.assertTrue(oficialcontanctnumber.isEnabled()," oficialcontanctnumber field is enabled");		 
		Reporter.log("verifyMyerp oficialcontanctnumber", true);
		oficialcontanctnumber.click(); 
		oficialcontanctnumber.sendKeys("8828420045");
	}
	public void VerifyMyerpEmailId() {
		Assert.assertTrue(emailid.isEnabled()," emailid field is enabled");		 
		Reporter.log("verifyMyerp emailid", true);
		emailid.click(); 
		emailid.sendKeys("evitasoft@gmail.com");
	}
	public void VerifyMyerpAddress1() {
		Assert.assertTrue(address1.isEnabled()," address1 field is enabled");		 
		Reporter.log("verifyMyerp address1", true);
		address1.click(); 
		address1.sendKeys("virar");
	}
	public void VerifyMyerpSelectState() throws InterruptedException {
		Select sc = new Select(selectstate);
		Thread.sleep(1000);
		Assert.assertFalse(selectstate.isDisplayed(),"selectstate is displayed");
		Assert.assertFalse(selectstate.isSelected());
		sc.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpSelectDistrict() throws InterruptedException {
		Select sc = new Select(selectdistrict);
		Thread.sleep(1000);
		Assert.assertFalse(selectdistrict.isDisplayed(),"selectdistrict is displayed");
		Assert.assertFalse(selectdistrict.isSelected());
		sc.selectByVisibleText("Palghar");

	}

	public void voidVerifyMyerpSelectTehsil() throws InterruptedException {
		Select sc = new Select(selecttehsil);
		Thread.sleep(1000);
		Assert.assertFalse(selecttehsil.isDisplayed(),"selecttehsil is displayed");
		Assert.assertFalse(selecttehsil.isSelected());
		sc.selectByVisibleText("Vasai");
	}
	public void VerifyMyerpEnterCity() {
		Assert.assertTrue(entercity.isEnabled()," entercity field is enabled");		 
		Reporter.log("verifyMyerpentercity", true);
		entercity.click(); 
		entercity.sendKeys("virar");
	}
	public void VerifyMyerpPincode() {
		Assert.assertTrue(pincode.isEnabled()," pincode field is enabled");		 
		Reporter.log("verifyMyerppincode", true);
		pincode.click(); 
		pincode.sendKeys("401303");
	}
	public void VerifyMyerpBasicPay() {
		Assert.assertTrue(basicpay.isEnabled()," basicpay field is enabled");		 
		Reporter.log("verifyMyerpbasicpay", true);
		basicpay.click(); 
		basicpay.sendKeys("14000");
	}
	public void VerifyMyerpDOB() {
		Assert.assertTrue(dob.isEnabled()," dob field is enabled");		 
		Reporter.log("verifyMyerpdob", true);
		dob.click(); 
		dob.sendKeys("14/06/1994");
	}
	public void VerifyMyerpJoiningDate() {
		Assert.assertTrue(joiningdate.isEnabled()," joiningdate field is enabled");		 
		Reporter.log("verifyMyerpjoiningdate", true);
		joiningdate.click(); 
		joiningdate.sendKeys("01/01/2023");
	}

	public void VerifyMyerpEmployeeActiveCHK() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(eactivechk.isEnabled()," eactivechk field is enabled");		 
		Reporter.log("verifyMyerp eactivechk", true);
		eactivechk.click(); 
		Thread.sleep(500);

	}
	public void VerifyMyerpEmployeeClearBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ebtnclear.isEnabled()," ebtnclear field is enabled");
		Reporter.log("verifyMyerp ebtnclear", true);
		ebtnclear.click();

	}

	public void VerifyMyerpEmployeeFirstName1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
		Reporter.log("verifyMyerp employeefname", true);
		efname.click(); 
		efname.sendKeys("Manoj");
	}
	public void VerifyMyerpEmployeeLastName1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
		Reporter.log("verifyMyerp elname", true);
		elname.click(); 
		elname.sendKeys("Kumar");
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
		sc.selectByVisibleText("USER");
	}
	public void VerifyMyerpEmployeeActiveCHK1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(eactivechk.isEnabled()," eactivechk field is enabled");		 
		Reporter.log("verifyMyerp eactivechk", true);
		eactivechk.click(); 

	}
	public void VerifyMyerpEmployeeSubmitBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ebtnsubmit.isEnabled(),"ebtnsubmitfield is enabled");		 
		Reporter.log("verifyMyerp ebtnsubmit", true);
		ebtnsubmit.click(); 

	}
	public void VerifyMyerpEmployeeSubmitOKBtn() throws InterruptedException {
		Thread.sleep(500);
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
		pcsearchbar.sendKeys("Manoj");
	}
	public void VerifyMyerpEmployeeEditBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ebtnedit.isEnabled()," ebtnedit is enabled");		 
		Reporter.log("verifyMyerp  ebtnedit", true);
		ebtnedit.click();

	}
	public void VerifyMyerpEmployeeYesUpdateItBtn() throws InterruptedException {
		Thread.sleep(500);
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
		efname.sendKeys("Manoj");
	}
	public void VerifyMyerpEmployeeLastName2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
		Reporter.log("verifyMyerp elname", true);
		elname.click(); 
		elname.clear();
		elname.sendKeys("Kumar");
	}
	public void ESelectDesignation2() throws InterruptedException {
		Select sc = new Select(eselectdesignation);
		Thread.sleep(1000);
		Assert.assertFalse(eselectdesignation.isDisplayed(),"eselect designation is not displayed");
		Assert.assertFalse(eselectdesignation.isSelected());
		sc.selectByVisibleText("USER");
	}
	public void VerifyMyerpEmployeeUpdateBtn() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(eupdatebtn.isEnabled(),"eupdatebtn is enabled");		 
		Reporter.log("verifyMyerp eupdatebtn", true);
		eupdatebtn.click();

	}
	public void VerifyMyerpEmployeeUpdateOKBtn() throws InterruptedException {
		Thread.sleep(500);
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
		pcsearchbar.sendKeys("Manoj");
	}
	public void VerifyMyerpEmployeeExportBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ebtnexport.isEnabled(),"ebtnexport is enabled");		 
		Reporter.log("verifyMyerp ebtnexport", true);
		ebtnexport.click();

	}	





	public void VerifyMyerpEmployeeFirstName3() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
		Reporter.log("verifyMyerp employeefname", true);
		efname.click(); 
		efname.sendKeys("Suresh");
	}
	public void VerifyMyerpEmployeeLastName3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
		Reporter.log("verifyMyerp elname", true);
		elname.click(); 
		elname.sendKeys("Mishra");
	}
	public void ESelectCompany3() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void setEmpPageGender3(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			eselectgendermale.click();
		}else if(gender.equalsIgnoreCase("female")) {
			eselectgenderfemale.click();
		}else {
			System.out.println("The wrong input selected by user");
		}
	}
	public void ESelectDesignation3() throws InterruptedException {
		Select sc = new Select(eselectdesignation);
		Thread.sleep(1000);
		Assert.assertFalse(eselectdesignation.isDisplayed(),"eselect designation is not displayed");
		Assert.assertFalse(eselectdesignation.isSelected());
		sc.selectByVisibleText("Driver");
	}

	public void VerifyMyerppersonalcontanctnumber3() {
		Assert.assertTrue(personalcontanctnumber.isEnabled()," personalcontanctnumber field is enabled");		 
		Reporter.log("verifyMyerp personalcontanctnumber", true);
		personalcontanctnumber.click(); 
		personalcontanctnumber.sendKeys("8828420045");
	}
	public void VerifyMyerpoficialcontanctnumber3() {
		Assert.assertTrue(oficialcontanctnumber.isEnabled()," oficialcontanctnumber field is enabled");		 
		Reporter.log("verifyMyerp oficialcontanctnumber", true);
		oficialcontanctnumber.click(); 
		oficialcontanctnumber.sendKeys("8828420045");
	}
	public void VerifyMyerpEmailId3() {
		Assert.assertTrue(emailid.isEnabled()," emailid field is enabled");		 
		Reporter.log("verifyMyerp emailid", true);
		emailid.click(); 
		emailid.sendKeys("evitasoft@gmail.com");
	}
	public void VerifyMyerpAddress3() {
		Assert.assertTrue(address1.isEnabled()," address1 field is enabled");		 
		Reporter.log("verifyMyerp address1", true);
		address1.click(); 
		address1.sendKeys("virar");
	}
	public void VerifyMyerpSelectState3() throws InterruptedException {
		Select sc = new Select(selectstate);
		Thread.sleep(1000);
		Assert.assertFalse(selectstate.isDisplayed(),"selectstate is displayed");
		Assert.assertFalse(selectstate.isSelected());
		sc.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpSelectDistrict3() throws InterruptedException {
		Select sc = new Select(selectdistrict);
		Thread.sleep(1000);
		Assert.assertFalse(selectdistrict.isDisplayed(),"selectdistrict is displayed");
		Assert.assertFalse(selectdistrict.isSelected());
		sc.selectByVisibleText("Palghar");

	}

	public void voidVerifyMyerpSelectTehsil3() throws InterruptedException {
		Select sc = new Select(selecttehsil);
		Thread.sleep(1000);
		Assert.assertFalse(selecttehsil.isDisplayed(),"selecttehsil is displayed");
		Assert.assertFalse(selecttehsil.isSelected());
		sc.selectByVisibleText("Vasai");
	}
	public void VerifyMyerpEnterCity3() {
		Assert.assertTrue(entercity.isEnabled()," entercity field is enabled");		 
		Reporter.log("verifyMyerpentercity", true);
		entercity.click(); 
		entercity.sendKeys("virar");
	}
	public void VerifyMyerpPincode3() {
		Assert.assertTrue(pincode.isEnabled()," pincode field is enabled");		 
		Reporter.log("verifyMyerppincode", true);
		pincode.click(); 
		pincode.sendKeys("401303");
	}
	public void VerifyMyerpBasicPay3() {
		Assert.assertTrue(basicpay.isEnabled()," basicpay field is enabled");		 
		Reporter.log("verifyMyerpbasicpay", true);
		basicpay.click(); 
		basicpay.sendKeys("14000");
	}
	public void VerifyMyerpDOB3() {
		Assert.assertTrue(dob.isEnabled()," dob field is enabled");		 
		Reporter.log("verifyMyerpdob", true);
		dob.click(); 
		dob.sendKeys("14/06/1994");
	}
	public void VerifyMyerpJoiningDate3() {
		Assert.assertTrue(joiningdate.isEnabled()," joiningdate field is enabled");		 
		Reporter.log("verifyMyerpjoiningdate", true);
		joiningdate.click(); 
		joiningdate.sendKeys("01/01/2023");
	}

	public void VerifyMyerpEmployeeActiveCHK3() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(eactivechk.isEnabled()," eactivechk field is enabled");		 
		Reporter.log("verifyMyerp eactivechk", true);
		eactivechk.click(); 

	}
	public void VerifyMyerpEmployeeSubmitBtn3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ebtnsubmit.isEnabled(),"ebtnsubmitfield is enabled");		 
		Reporter.log("verifyMyerp ebtnsubmit", true);
		ebtnsubmit.click(); 

	}
	public void VerifyMyerpEmployeeSubmitOKBtn3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ebtnsubmitok.isEnabled(),"ebtnsubmitok is enabled");		 
		Reporter.log("verifyMyerp ebtnsubmitok", true);
		ebtnsubmitok.click();

	}
	public void VerifyandClickonPSearchbar3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("Suresh");
	}



	public void VerifyMyerpEmployeeFirstName4() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
		Reporter.log("verifyMyerp employeefname", true);
		efname.click(); 
		efname.sendKeys("Ramesh");
	}
	public void VerifyMyerpEmployeeLastName4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
		Reporter.log("verifyMyerp elname", true);
		elname.click(); 
		elname.sendKeys("Sachan");
	}
	public void ESelectCompany4() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void setEmpPageGender4(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			eselectgendermale.click();
		}else if(gender.equalsIgnoreCase("female")) {
			eselectgenderfemale.click();
		}else {
			System.out.println("The wrong input selected by user");
		}
	}
	public void ESelectDesignation4() throws InterruptedException {
		Select sc = new Select(eselectdesignation);
		Thread.sleep(1000);
		Assert.assertFalse(eselectdesignation.isDisplayed(),"eselect designation is not displayed");
		Assert.assertFalse(eselectdesignation.isSelected());
		sc.selectByVisibleText("Domestic Deliveryman");
	}
	public void VerifyMyerppersonalcontanctnumber4() {
		Assert.assertTrue(personalcontanctnumber.isEnabled()," personalcontanctnumber field is enabled");		 
		Reporter.log("verifyMyerp personalcontanctnumber", true);
		personalcontanctnumber.click(); 
		personalcontanctnumber.sendKeys("8828420045");
	}
	public void VerifyMyerpoficialcontanctnumber4() {
		Assert.assertTrue(oficialcontanctnumber.isEnabled()," oficialcontanctnumber field is enabled");		 
		Reporter.log("verifyMyerp oficialcontanctnumber", true);
		oficialcontanctnumber.click(); 
		oficialcontanctnumber.sendKeys("8828420045");
	}
	public void VerifyMyerpEmailId4() {
		Assert.assertTrue(emailid.isEnabled()," emailid field is enabled");		 
		Reporter.log("verifyMyerp emailid", true);
		emailid.click(); 
		emailid.sendKeys("evitasoft@gmail.com");
	}
	public void VerifyMyerpAddress4() {
		Assert.assertTrue(address1.isEnabled()," address1 field is enabled");		 
		Reporter.log("verifyMyerp address1", true);
		address1.click(); 
		address1.sendKeys("virar");
	}
	public void VerifyMyerpSelectState4() throws InterruptedException {
		Select sc = new Select(selectstate);
		Thread.sleep(1000);
		Assert.assertFalse(selectstate.isDisplayed(),"selectstate is displayed");
		Assert.assertFalse(selectstate.isSelected());
		sc.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpSelectDistrict4() throws InterruptedException {
		Select sc = new Select(selectdistrict);
		Thread.sleep(1000);
		Assert.assertFalse(selectdistrict.isDisplayed(),"selectdistrict is displayed");
		Assert.assertFalse(selectdistrict.isSelected());
		sc.selectByVisibleText("Palghar");

	}

	public void voidVerifyMyerpSelectTehsil4() throws InterruptedException {
		Select sc = new Select(selecttehsil);
		Thread.sleep(1000);
		Assert.assertFalse(selecttehsil.isDisplayed(),"selecttehsil is displayed");
		Assert.assertFalse(selecttehsil.isSelected());
		sc.selectByVisibleText("Vasai");
	}
	public void VerifyMyerpEnterCity4() {
		Assert.assertTrue(entercity.isEnabled()," entercity field is enabled");		 
		Reporter.log("verifyMyerpentercity", true);
		entercity.click(); 
		entercity.sendKeys("virar");
	}
	public void VerifyMyerpPincode4() {
		Assert.assertTrue(pincode.isEnabled()," pincode field is enabled");		 
		Reporter.log("verifyMyerppincode", true);
		pincode.click(); 
		pincode.sendKeys("401303");
	}
	public void VerifyMyerpBasicPay4() {
		Assert.assertTrue(basicpay.isEnabled()," basicpay field is enabled");		 
		Reporter.log("verifyMyerpbasicpay", true);
		basicpay.click(); 
		basicpay.sendKeys("14500");
	}
	public void VerifyMyerpDOB4() {
		Assert.assertTrue(dob.isEnabled()," dob field is enabled");		 
		Reporter.log("verifyMyerpdob", true);
		dob.click(); 
		dob.sendKeys("09/02/1999");
	}
	public void VerifyMyerpJoiningDate4() {
		Assert.assertTrue(joiningdate.isEnabled()," joiningdate field is enabled");		 
		Reporter.log("verifyMyerpjoiningdate", true);
		joiningdate.click(); 
		joiningdate.sendKeys("01/01/2023");
	}


	public void VerifyMyerpEmployeeActiveCHK4() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(eactivechk.isEnabled()," eactivechk field is enabled");		 
		Reporter.log("verifyMyerp eactivechk", true);
		eactivechk.click(); 

	}
	public void VerifyMyerpEmployeeSubmitBtn4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ebtnsubmit.isEnabled(),"ebtnsubmitfield is enabled");		 
		Reporter.log("verifyMyerp ebtnsubmit", true);
		ebtnsubmit.click(); 

	}
	public void VerifyMyerpEmployeeSubmitOKBtn4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ebtnsubmitok.isEnabled(),"ebtnsubmitok is enabled");		 
		Reporter.log("verifyMyerp ebtnsubmitok", true);
		ebtnsubmitok.click();

	}
	public void VerifyandClickonPSearchbar4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("Ramesh");
	}
	
	


	public void VerifyMyerpEmployeeFirstName5() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
		Reporter.log("verifyMyerp employeefname", true);
		efname.click(); 
		efname.sendKeys("Deepak");
	}
	public void VerifyMyerpEmployeeLastName5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
		Reporter.log("verifyMyerp elname", true);
		elname.click(); 
		elname.sendKeys("Paramar");
	}
	public void ESelectCompany5() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void setEmpPageGender5(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			eselectgendermale.click();
		}else if(gender.equalsIgnoreCase("female")) {
			eselectgenderfemale.click();
		}else {
			System.out.println("The wrong input selected by user");
		}
	}
	public void ESelectDesignation5() throws InterruptedException {
		Select sc = new Select(eselectdesignation);
		Thread.sleep(1000);
		Assert.assertFalse(eselectdesignation.isDisplayed(),"eselect designation is not displayed");
		Assert.assertFalse(eselectdesignation.isSelected());
		sc.selectByVisibleText("Commercial Deliveryman");
	}
	public void VerifyMyerppersonalcontanctnumber5() {
		Assert.assertTrue(personalcontanctnumber.isEnabled()," personalcontanctnumber field is enabled");		 
		Reporter.log("verifyMyerp personalcontanctnumber", true);
		personalcontanctnumber.click(); 
		personalcontanctnumber.sendKeys("8828420045");
	}
	public void VerifyMyerpoficialcontanctnumber5() {
		Assert.assertTrue(oficialcontanctnumber.isEnabled()," oficialcontanctnumber field is enabled");		 
		Reporter.log("verifyMyerp oficialcontanctnumber", true);
		oficialcontanctnumber.click(); 
		oficialcontanctnumber.sendKeys("8828420045");
	}
	public void VerifyMyerpEmailId5() {
		Assert.assertTrue(emailid.isEnabled()," emailid field is enabled");		 
		Reporter.log("verifyMyerp emailid", true);
		emailid.click(); 
		emailid.sendKeys("evitasoft@gmail.com");
	}
	public void VerifyMyerpAddress5() {
		Assert.assertTrue(address1.isEnabled()," address1 field is enabled");		 
		Reporter.log("verifyMyerp address1", true);
		address1.click(); 
		address1.sendKeys("virar");
	}
	public void VerifyMyerpSelectState5() throws InterruptedException {
		Select sc = new Select(selectstate);
		Thread.sleep(1000);
		Assert.assertFalse(selectstate.isDisplayed(),"selectstate is displayed");
		Assert.assertFalse(selectstate.isSelected());
		sc.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpSelectDistrict5() throws InterruptedException {
		Select sc = new Select(selectdistrict);
		Thread.sleep(1000);
		Assert.assertFalse(selectdistrict.isDisplayed(),"selectdistrict is displayed");
		Assert.assertFalse(selectdistrict.isSelected());
		sc.selectByVisibleText("Palghar");

	}

	public void voidVerifyMyerpSelectTehsil5() throws InterruptedException {
		Select sc = new Select(selecttehsil);
		Thread.sleep(1000);
		Assert.assertFalse(selecttehsil.isDisplayed(),"selecttehsil is displayed");
		Assert.assertFalse(selecttehsil.isSelected());
		sc.selectByVisibleText("Vasai");
	}
	public void VerifyMyerpEnterCity5() {
		Assert.assertTrue(entercity.isEnabled()," entercity field is enabled");		 
		Reporter.log("verifyMyerpentercity", true);
		entercity.click(); 
		entercity.sendKeys("virar");
	}
	public void VerifyMyerpPincode5() {
		Assert.assertTrue(pincode.isEnabled()," pincode field is enabled");		 
		Reporter.log("verifyMyerppincode", true);
		pincode.click(); 
		pincode.sendKeys("401303");
	}
	public void VerifyMyerpBasicPay5() {
		Assert.assertTrue(basicpay.isEnabled()," basicpay field is enabled");		 
		Reporter.log("verifyMyerpbasicpay", true);
		basicpay.click(); 
		basicpay.sendKeys("14000");
	}
	public void VerifyMyerpDOB5() {
		Assert.assertTrue(dob.isEnabled()," dob field is enabled");		 
		Reporter.log("verifyMyerpdob", true);
		dob.click(); 
		dob.sendKeys("27/10/1998");
	}
	public void VerifyMyerpJoiningDate5() {
		Assert.assertTrue(joiningdate.isEnabled()," joiningdate field is enabled");		 
		Reporter.log("verifyMyerpjoiningdate", true);
		joiningdate.click(); 
		joiningdate.sendKeys("01/01/2023");
	}


	public void VerifyMyerpEmployeeActiveCHK5() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(eactivechk.isEnabled()," eactivechk field is enabled");		 
		Reporter.log("verifyMyerp eactivechk", true);
		eactivechk.click(); 

	}
	public void VerifyMyerpEmployeeSubmitBtn5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ebtnsubmit.isEnabled(),"ebtnsubmitfield is enabled");		 
		Reporter.log("verifyMyerp ebtnsubmit", true);
		ebtnsubmit.click(); 

	}
	public void VerifyMyerpEmployeeSubmitOKBtn5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ebtnsubmitok.isEnabled(),"ebtnsubmitok is enabled");		 
		Reporter.log("verifyMyerp ebtnsubmitok", true);
		ebtnsubmitok.click();

	}
	public void VerifyandClickonPSearchbar5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("Deepak");
	}
}