package com.lpg.qa.GMPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class GeneralMaster {
	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
	@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;  
	
//product form
	@FindBy (xpath="//a[text()='GeneralMaster']") private WebElement productform;
	@FindBy (xpath="//input[@id='txtProductName']") private WebElement productname;
	@FindBy (xpath="//input[@id='txtProductCode']") private WebElement productcode;
	@FindBy (xpath="//input[@id='txtDescription']") private WebElement productdesc; 
	@FindBy (xpath="//select[@id='ddlUnitOfMeasurement']") private WebElement selectunitofmeasurement; 
	@FindBy (xpath="//select[@id=\"ddlProdCat\"]") private WebElement selectproductcategory; 
	@FindBy (xpath="//*[@id=\"ddlInventoryMethod\"]") private WebElement selectinventorymethod;
	@FindBy (xpath="//*[@id=\"chkTax\"]") private WebElement prodisgst; 
	@FindBy (xpath="//h4[text()='Tax Details']") private WebElement prodtaxdetials;
	@FindBy (xpath="//input[@id='txtHSN_SAC']") private WebElement hsncode; 
	@FindBy (xpath="//input[@id='txtName']") private WebElement pname;
	@FindBy (xpath="//input[@id='txtTaxRate_1']") private WebElement pcgst;
	@FindBy (xpath="//input[@id='txtEffectiveDate']")private WebElement date;
	@FindBy (xpath="//button[@id='btnSaveTax']") private WebElement ptaxsavebtn;
	@FindBy (xpath="//input[@id='chkActive']") private WebElement pactivechk;  
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement psubmitbtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement psubmitbtnok;
	@FindBy (xpath="//input[@id='btnback']")private WebElement backbtn;
	
//product Rate Slab
	@FindBy (xpath="//a[text()='GeneralMaster Rate Slab']") private WebElement productrateslab;
	@FindBy (xpath="//select[@id='ddlProductCode']") private WebElement selectproduct;
	@FindBy (xpath="//select[@id=\"ddlArea\"]") private WebElement selectarea;
	@FindBy (xpath="//input[@id='txtPurchaseRate']") private WebElement productrate;
	@FindBy (xpath="//input[@id='txtProductMRP']") private WebElement prdouctmrp;
	@FindBy (xpath="//input[@id='txtProductDeposite']") private WebElement productdeposit;
	@FindBy (xpath="//input[@id='datepicker']") private WebElement productdate;
	@FindBy (xpath="//select[@id='ddlCompanyID']") private WebElement selectcompany;
	@FindBy (xpath="//input[@id='chkActive']")private WebElement activebox;
	@FindBy (xpath="//button[@id='btnSubmit']")private WebElement submitbtn1;
	@FindBy (xpath="//input[@id='btnback']")private WebElement backbtn1;
	
//Supplier Form	
	@FindBy (xpath="//a[text()='Supplier']") private WebElement supplier;
	@FindBy (xpath="//select[@id='ddlCompanyID']")private WebElement selectcomp1;
	@FindBy (xpath="//input[@id='txtSupplierCompanyCode']") private WebElement supcompanycode;
	@FindBy (xpath="//input[@id='txtSupplierName']") private WebElement sname;
	@FindBy (xpath="//select[@id='ddlGroup']") private WebElement selectgroup;
	@FindBy (xpath="//input[@id='txtContactDetail']") private WebElement scontanctdetail;
	@FindBy (xpath="//input[@id='txtAddress1']") private WebElement saddress1;
	@FindBy (xpath="//select[@id='ddlstate']") private WebElement selectstate;
	@FindBy (xpath="//select[@id='ddldistrict']")private WebElement selectdestrict;
	@FindBy (xpath="//select[@id='ddlTahsil']")private WebElement selecttahasil;
	@FindBy (xpath="//input[@id='txtCity']")private WebElement city;
	@FindBy (xpath="//input[@id='txtPinCode']")private WebElement pincode1;
	@FindBy (xpath="//input[@id='txtGSTINNo']")private WebElement gstinnumber;
	@FindBy (xpath="txtPANNo")private WebElement pannumber;
	@FindBy (xpath="//select[@id='ddlCategory']")private WebElement tdscategory;
	@FindBy (xpath="//input[@id='OpeningDate']")private WebElement openingdate;
	@FindBy (xpath="//input[@id='chkActive']") private WebElement sactivechk;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement ssubmitbtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement ssubmitok;
	
//Empty master Form
	@FindBy (xpath="//a[text()='Employee']") private WebElement employeeform; 
	@FindBy (xpath="//input[@id='txtFname']") private WebElement efname;
	@FindBy (xpath="//input[@id='txtLname']") private WebElement elname;
	@FindBy (xpath="//input[@id='male']") private WebElement eselectgendermale;
	@FindBy (xpath="//input[@id='female']") private WebElement eselectgenderfemale;
	@FindBy (xpath="//select[@id='ddlDesignation']") private WebElement eselectdesignation;
	@FindBy (xpath="//input[@id='txtPersonalContact']") private WebElement personalcontanctnumber;
	@FindBy (xpath="//input[@id='txtOfficialContact']") private WebElement oficialcontanctnumber;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement emailid;
	@FindBy (xpath="//input[@id='txtAddress1']") private WebElement address1;
	@FindBy (xpath="//select[@id='ddlstate']")private WebElement selectstate1;
	@FindBy (xpath="//select[@id='ddldistrict']") private WebElement selectdistrict;
	@FindBy (xpath="//select[@id='ddlTahsil']") private WebElement selecttehsil;
	@FindBy (xpath="//input[@id='txtCity']") private WebElement entercity;
	@FindBy (xpath="//input[@id='txtPinCode']") private WebElement pincode;
	@FindBy (xpath="//input[@id='txtBasicPay']") private WebElement basicpay;
	@FindBy (xpath="//input[@id='datepicker']") private WebElement dob;
	@FindBy (xpath="//input[@id='datepicker_join']") private WebElement joiningdate;
	@FindBy (xpath="//input[@id='chkActive']") private WebElement eactivechk;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement ebtnsubmit;
	@FindBy (xpath="//button[text()='OK']") private WebElement ebtnsubmitok;
	
//vehicle Form
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena;
	@FindBy(xpath="//a[text()='Vehicle']")private WebElement vehicle;
	@FindBy(xpath="//select[@id='ddlTransporterName']")private WebElement transportername;
	@FindBy(xpath="//input[@id='txtVehicleNo']")private WebElement vehicleno;
	@FindBy(xpath="//input[@id='datepicker']")private WebElement modelyear;
	@FindBy(xpath="//input[@id='datepicker_Insurancefromdate']")private WebElement insurancefromdate;
	@FindBy(xpath="//input[@id='datepicker_InsuranceEnddate']")private WebElement insurancetodate;
	@FindBy(xpath="//select[@id='ddlDriverName']")private WebElement selectdriver;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement checkbox;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	
//Transporter Form
	@FindBy (xpath="//a[text()='Transporter']") private WebElement transporter;
	@FindBy (xpath="//select[@id='ddlCompanyID']")private WebElement selectcompany1;
	@FindBy (xpath="//input[@id='txtTransporterCode']") private WebElement tcode;
	@FindBy (xpath="//input[@id='txtTransporterName']") private WebElement tname;
	@FindBy (xpath="//input[@id='txtTransporterAliasName']")private WebElement aliasname;
	@FindBy (xpath="//select[@id='ddlGroup']")private WebElement selectgroup1;
	@FindBy (xpath="//select[@id='ddlCategory']") private WebElement tselectcategory;
	@FindBy (xpath="//input[@id='txtContactDetail']") private WebElement tcontanctdetail;
	@FindBy (xpath="//input[@id='txtAddress1']") private WebElement taddress1;
	@FindBy (xpath="//select[@id='ddlstate']")private WebElement selectstate2;
	@FindBy (xpath="//select[@id='ddldistrict']")private WebElement selectdistrict1;
	@FindBy(xpath="ddlTahsil")private WebElement selecttehsil1;
	@FindBy (xpath="//input[@id='txtCity']") private WebElement tselectcity;
	@FindBy(xpath="//input[@id='txtPinCode']")private WebElement pincode2;
	@FindBy (xpath="//input[@id='chkActive']") private WebElement tactivechk;
	@FindBy (xpath="//button[@id='btnclear']") private WebElement tclearbtn;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement tsubmitbtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement tsubmitok;
	
//Commercial Party Form
	@FindBy (xpath="//a[text()='Commercial Party']") private WebElement commpform; 
	@FindBy (xpath="//input[@id='txtConsumerNumber']") private WebElement cpconsumernum;
	@FindBy (xpath="//input[@id='txtBusinessName']") private WebElement cpbusinessname;
	@FindBy (xpath="//select[@id='ddlBussinesType']") private WebElement cpselectbussinesstype;
	@FindBy (xpath="//select[@id='ddlGroup']") private WebElement cpselectgroup;
	@FindBy (xpath="//input[@id='txtAddress1']") private WebElement cpaddress1;
	@FindBy (xpath="//select[@id='ddlstate']") private WebElement cpselectstate;
	@FindBy (xpath="//select[@id='ddldistrict']") private WebElement cpselectdistrict;
	@FindBy (xpath="//select[@id='ddlTahsil']") private WebElement cpselecttehsil;
	@FindBy (xpath="//input[@id='txtCity']") private WebElement cpselectcity;
	@FindBy (xpath="//input[@id='txtPinCode']") private WebElement cppincode;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement cpemailid;
	@FindBy (xpath="//input[@id='txtContactDetail']") private WebElement cpcontactdetail;
	@FindBy (xpath="//input[@id='txtContactPersonName']") private WebElement cpcontactpersonname;
	@FindBy (xpath="//input[@id='txtMobileNumber']") private WebElement cpmobilenumber;
	@FindBy (xpath="//select[@id='ddlBillingType']")private WebElement billingtype;
	@FindBy (xpath="//input[@id='chkActive']") private WebElement cpactivechk;
	@FindBy (xpath="//input[@id='txtProduct']") private WebElement cpproduct;
	@FindBy (xpath="//input[@id='txtMDLNoOfCyl']") private WebElement cpquantity;
	@FindBy (xpath="//input[@id='txtMDLOpningCyl']") private WebElement cpopeningcycle;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement cpsubmitbtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement cpmsgsucess;
	
//Service Form
	@FindBy(xpath="//a[text()='Services']")private WebElement services;
	@FindBy(xpath="//input[@id='txtService_Description']")private WebElement servicedescription;
	@FindBy(xpath="//input[@id='txtDisplay_Title']")private WebElement servicetitile;
	@FindBy(xpath="//input[@id='txtAliasName']")private WebElement servicealiasname;
	@FindBy(xpath="//input[@id='txtService_Cost']")private WebElement servicecost;
	@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement selectcom;
	@FindBy(xpath="//select[@id='ddlType']")private WebElement selecttype;
	@FindBy(xpath="//input[@id='txtHSNCODE']")private WebElement servicehsnco;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement serviceactivbtn;
	@FindBy(xpath="//input[@id='chkTax']")private WebElement serviceigst;
	@FindBy(xpath="//button[@id='btnUpdateGST']")private WebElement updategst;
	@FindBy(xpath="//input[@id='txtTaxRate_1']")private WebElement gsttextrate1;
	@FindBy(xpath="//input[@id='txtTaxRate_2']")private WebElement gsttestrate2;
	@FindBy(xpath="//button[@id='btnSaveTax']")private WebElement savebtn;
	
// Godown Form
	@FindBy(xpath="//a[text()='Godown']")private WebElement godowntransaction;
	@FindBy(xpath="//input[@id='txtGodown_Name']")private WebElement godownname;
	@FindBy(xpath="//input[@id='txtGodown_Address']")private WebElement godownaddress;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement chekactive;
	
// User Master Form
	@FindBy(xpath="//a[text()='User']")private WebElement usermaster;
	@FindBy(xpath="//select[@id='ddlEmp_Code']")private WebElement selectempy;
	@FindBy(xpath="//select[@id='ddlUser_Type']")private WebElement selectusertyp;
	@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement selectcomp;
	@FindBy(xpath="//input[@id='txtUserName']")private WebElement useridname;
	@FindBy(xpath="//input[@id='password-field']")private WebElement userpass;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement useremail;
	@FindBy(xpath="//input[@id='txtMobileNo']")private WebElement usermob;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement checkboxcl; 
	@FindBy (xpath="//button[text()='OK']") private WebElement cdpsubmitokbtn;
	

	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public GeneralMaster(WebDriver driver) {
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
	//product form
	
	public void VerifyMyerpProductform() {
		Assert.assertTrue(productform.isEnabled(),"productform field is enabled");		 
		Reporter.log("verifyMyerpproductform ", true);
		productform.click(); 
	}
	public void VerifyMyerProductname() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productname.isEnabled(),"productname field is enabled");		 
		Reporter.log("verifyMyerpproductname ", true);
		productname.click(); 
		productname.sendKeys("14.2 KG");
	}
	public void VerifyMyerProductcode() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productcode.isEnabled(),"productcode field is enabled");		 
		Reporter.log("verifyMyerpproductcode", true);
		productcode.click(); 
		productcode.sendKeys("2011");
	}
	public void VerifyMyerProductDesc() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdesc.isEnabled(),"productdesc field is enabled");		 
		Reporter.log("verifyMyerpproductdesc ", true);
		productdesc.click(); 
		productdesc.sendKeys("KILOGRAM"); 
	}
	public void setselectunitofmeasurement() throws InterruptedException {
		Select suom = new Select(selectunitofmeasurement);
		Thread.sleep(1000);
		Assert.assertFalse(selectunitofmeasurement.isDisplayed(),"selectunitofmeasurement is not displayed");
		Assert.assertFalse(selectunitofmeasurement.isSelected());
		suom.selectByVisibleText("KILOGRAM");
	}
	public void setselectproductcategory() throws InterruptedException {
		Select spc = new Select(selectproductcategory);
		Thread.sleep(1000);
		Assert.assertFalse(selectproductcategory.isDisplayed(),"selectproductcategory is not displayed");
		Assert.assertFalse(selectproductcategory.isSelected());
		spc.selectByVisibleText("Domestic");
	}
	public void setselectinventorymethod() throws InterruptedException {
		Select sim = new Select(selectinventorymethod);
		Thread.sleep(1000);
		Assert.assertFalse(selectinventorymethod.isDisplayed(),"selectinventorymethod is not displayed");
		Assert.assertFalse(selectinventorymethod.isSelected());
		sim.selectByVisibleText("FIFO");
	}
	public void VerifyMyerIsGST() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prodisgst.isEnabled(),"prodisgst field is enabled");		 
		Reporter.log("verifyMyerpprodisgst ", true);
		prodisgst.click(); 
		/*
		 * Alert al = driver.switchTo().alert();
		 * driver.switchTo().frame("iframeResult"); prodisgst.click();
		 * System.out.println(al.getText()); al.accept();
		 */
	}
	public void VerifyMyerpTaxDetails() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prodtaxdetials.isEnabled(),"prodtaxdetials field is enabled");		 
		Reporter.log("verifyMyerpprodtaxdetials ", true);
		prodtaxdetials.getText();
		System.out.println(prodtaxdetials.getText());
	}
	public void VerifyMyerpHSNCode() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(hsncode.isEnabled(),"hsncode field is enabled");		 
		Reporter.log("verifyMyerphsncode ", true);
		hsncode.click(); 
	}
	public void VerifyMyerpPName() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pname.isEnabled(),"pname field is enabled");		 
		Reporter.log("verifyMyerppname ", true);
		pname.click(); 
		pname.sendKeys("Demo");
	}
	public void VerifyMyerpPCGST() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcgst.isEnabled(),"pcgst field is enabled");		 
		Reporter.log("verifyMyerphsncode ", true);
		pcgst.click(); 
		pcgst.sendKeys("2.5");
	}
	public void VerifyMyerpdate() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		Reporter.log("verifyMyerpdate", true);
		date.click(); 
		date.clear();
		date.sendKeys("01/04/2022");
	}
	public void VerifyMyerpPTaxSavebtn() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(ptaxsavebtn.isEnabled(),"ptaxsavebtn field is enabled");		 
		Reporter.log("verifyMyerpptaxsavebtn ", true);
		ptaxsavebtn.click(); 
	}
	public void VerifyMyerpPActiveCheckbox() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
		Reporter.log("verifyMyerppactivechk ", true);
		pactivechk.click(); 
	}
	public void VerifyMyerpPSubmitBtn() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtn ", true);
		psubmitbtn.click(); 
		Thread.sleep(800);
	}
	public void VerifyMyerpPSubmitBtnOK() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(psubmitbtnok.isEnabled(),"psubmitbtnok field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtnok ", true);
		psubmitbtnok.click(); 
	}
	
	public void VerifyMyerProductName1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productname.isEnabled(),"productname field is enabled");		 
		Reporter.log("verifyMyerpproductname ", true);
		productname.click(); 
		productname.clear();
		productname.sendKeys("19 KG");
	}
	public void VerifyMyerProductcode1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productcode.isEnabled(),"productcode field is enabled");		 
		Reporter.log("verifyMyerpproductcode ", true);
		productcode.click(); 
		productcode.clear();
		productcode.sendKeys("5350");
	}

	public void VerifyMyerProductDesc1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdesc.isEnabled(),"productdesc field is enabled");		 
		Reporter.log("verifyMyerpproductname ", true);
		productdesc.click(); 
		productdesc.clear();
		productdesc.sendKeys("KILOGRAM"); 
	}

	public void setselectunitofmeasurement1() throws InterruptedException {
		Select suom = new Select(selectunitofmeasurement);
		Thread.sleep(1000);
		Assert.assertFalse(selectunitofmeasurement.isDisplayed(),"selectunitofmeasurement is not displayed");
		Assert.assertFalse(selectunitofmeasurement.isSelected());
		suom.selectByVisibleText("KILOGRAM");
	}
	public void setselectproductcategory1() throws InterruptedException {
		Select spc = new Select(selectproductcategory);
		Thread.sleep(1000);
		Assert.assertFalse(selectproductcategory.isDisplayed(),"selectproductcategory is not displayed");
		Assert.assertFalse(selectproductcategory.isSelected());
		spc.selectByVisibleText("Commercial");
	}

	public void setselectinventorymethod1() throws InterruptedException {
		Select sim = new Select(selectinventorymethod);
		Thread.sleep(1000);
		Assert.assertFalse(selectinventorymethod.isDisplayed(),"selectinventorymethod is not displayed");
		Assert.assertFalse(selectinventorymethod.isSelected());
		sim.selectByVisibleText("FIFO");
	}
	public void VerifyMyerIsGST1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prodisgst.isEnabled(),"prodisgst field is enabled");		 
		Reporter.log("verifyMyerpprodisgst ", true);
		prodisgst.click(); 
		/*
		 * Alert al = driver.switchTo().alert();
		 * driver.switchTo().frame("iframeResult"); prodisgst.click();
		 * System.out.println(al.getText()); al.accept();
		 */
	}
	public void VerifyMyerpTaxDetails1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prodtaxdetials.isEnabled(),"prodtaxdetials field is enabled");		 
		Reporter.log("verifyMyerpprodtaxdetials", true);
		prodtaxdetials.getText();
		System.out.println(prodtaxdetials.getText());
	}
	public void VerifyMyerpHSNCode1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(hsncode.isEnabled(),"hsncode field is enabled");		 
		Reporter.log("verifyMyerphsncode ", true);
		hsncode.click(); 
	}
	public void VerifyMyerpPName1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pname.isEnabled(),"pname field is enabled");		 
		Reporter.log("verifyMyerppname ", true);
		pname.click(); 
		pname.sendKeys("Demo");
	}
	public void VerifyMyerpPCGST1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcgst.isEnabled(),"pcgst field is enabled");		 
		Reporter.log("verifyMyerppcgst", true);
		pcgst.click();
		pcgst.sendKeys("9");
	}
	public void VerifyMyerpdate1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		Reporter.log("verifyMyerpdate", true);
		date.click(); 
		date.clear();
		date.sendKeys("01/04/2022");
	}
	public void VerifyMyerpPTaxSavebtn1() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(ptaxsavebtn.isEnabled(),"ptaxsavebtn field is enabled");		 
		Reporter.log("verifyMyerpptaxsavebtn", true);
		ptaxsavebtn.click(); 
	}
	public void VerifyMyerpPActiveCheckbox1() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
		Reporter.log("verifyMyerppactivechk", true);
		pactivechk.click(); 
	}
	public void VerifyMyerpPSubmitBtn1() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtn", true);
		psubmitbtn.click(); 
		Thread.sleep(800);
	}
	public void VerifyMyerpPSubmitBtnOK1() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(psubmitbtnok.isEnabled(),"psubmitbtnok field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtnok", true);
		psubmitbtnok.click(); 
	}

	public void VerifyMyerProductname2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productname.isEnabled(),"productname field is enabled");		 
		Reporter.log("verifyMyerpproductname ", true);
		productname.click(); 
		productname.clear();
		productname.sendKeys("SRT PIPE");
	}
	public void VerifyMyerProductcode2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productcode.isEnabled(),"productcode field is enabled");		 
		Reporter.log("verifyMyerpproductcode", true);
		productcode.click(); 
		productcode.clear();
		productcode.sendKeys("10001");
	}

	public void VerifyMyerProductDesc2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdesc.isEnabled(),"productdesc field is enabled");		 
		Reporter.log("verifyMyerpproductdesc", true);
		productdesc.click(); 
		productdesc.clear();
		productdesc.sendKeys("UNIT"); 
	}

	public void setselectunitofmeasurement2() throws InterruptedException {
		Select suom = new Select(selectunitofmeasurement);
		Thread.sleep(1000);
		Assert.assertFalse(selectunitofmeasurement.isDisplayed(),"selectunitofmeasurement is not displayed");
		Assert.assertFalse(selectunitofmeasurement.isSelected());
		suom.selectByVisibleText("UNIT");
	}
	public void setselectProductcategory2() throws InterruptedException {
		Select spc = new Select(selectproductcategory);
		Thread.sleep(1000);
		Assert.assertFalse(selectproductcategory.isDisplayed(),"selectproductcategory is not displayed");
		Assert.assertFalse(selectproductcategory.isSelected());
		spc.selectByVisibleText("Oil Company Other GeneralMaster");
	}

	public void setselectinventorymethod2() throws InterruptedException {
		Select sim = new Select(selectinventorymethod);
		Thread.sleep(1000);
		Assert.assertFalse(selectinventorymethod.isDisplayed(),"selectinventorymethod is not displayed");
		Assert.assertFalse(selectinventorymethod.isSelected());
		sim.selectByVisibleText("FIFO");
	}
	public void VerifyMyerIsGST2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prodisgst.isEnabled(),"prodisgst field is enabled");		 
		Reporter.log("verifyMyerpprodisgst", true);
		prodisgst.click(); 
		/*
		 * Alert al = driver.switchTo().alert();
		 * driver.switchTo().frame("iframeResult"); prodisgst.click();
		 * System.out.println(al.getText()); al.accept();
		 */
	}
	public void VerifyMyerpTaxDetails2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prodtaxdetials.isEnabled(),"prodtaxdetials field is enabled");		 
		Reporter.log("verifyMyerpprodtaxdetials", true);
		prodtaxdetials.getText();
		System.out.println(prodtaxdetials.getText());
	}
	public void VerifyMyerpHSNCode2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(hsncode.isEnabled(),"hsncode field is enabled");		 
		Reporter.log("verifyMyerphsncode ", true);
		hsncode.click(); 
	}
	public void VerifyMyerpPName2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pname.isEnabled(),"pname field is enabled");		 
		Reporter.log("verifyMyerppname", true);
		pname.click(); 
		pname.sendKeys("Demo");
	}
	public void VerifyMyerpPCGST2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcgst.isEnabled(),"pcgst field is enabled");		 
		Reporter.log("verifyMyerppcgst", true);
		pcgst.click(); 
		pcgst.sendKeys("2.5");
	}
	public void VerifyMyerpdate2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		Reporter.log("verifyMyerpdate", true);
		date.click(); 
		date.clear();
		date.sendKeys("01/04/2022");
	}
	public void VerifyMyerpPTaxSavebtn2() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(ptaxsavebtn.isEnabled(),"ptaxsavebtn field is enabled");		 
		Reporter.log("verifyMyerpptaxsavebtn", true);
		ptaxsavebtn.click(); 
	}
	public void VerifyMyerpPActiveCheckbox2() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
		Reporter.log("verifyMyerppactivechk", true);
		pactivechk.click(); 
	}

	public void VerifyMyerpPSubmitBtn2() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtn", true);
		psubmitbtn.click(); 
		Thread.sleep(800);
	}
	public void VerifyMyerpPSubmitBtnOK2() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(psubmitbtnok.isEnabled(),"psubmitbtnok field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtnok", true);
		psubmitbtnok.click(); 
	}
	
	public void VerifyMyerproductname3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productname.isEnabled(),"productname field is enabled");		 
		Reporter.log("verifyMyerpproductname", true);
		productname.click(); 
		productname.clear();
		productname.sendKeys("DPR");
	}
	public void VerifyMyerProductcode3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productcode.isEnabled(),"productcode field is enabled");		 
		Reporter.log("verifyMyerpproductcode", true);
		productcode.click(); 
		productcode.clear();
		productcode.sendKeys("10002");
	}

	public void VerifyMyerProductDesc3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdesc.isEnabled(),"productdesc field is enabled");		 
		Reporter.log("verifyMyerpproductdesc", true);
		productdesc.click(); 
		productdesc.clear();
		productdesc.sendKeys("NUMBER"); 
	}

	public void setselectunitofmeasurement3() throws InterruptedException {
		Select suom = new Select(selectunitofmeasurement);
		Thread.sleep(1000);
		Assert.assertFalse(selectunitofmeasurement.isDisplayed(),"selectunitofmeasurement is not displayed");
		Assert.assertFalse(selectunitofmeasurement.isSelected());
		suom.selectByVisibleText("NUMBER");
	}
	public void setselectproductcategory3() throws InterruptedException {
		Select spc = new Select(selectproductcategory);
		Thread.sleep(1000);
		Assert.assertFalse(selectproductcategory.isDisplayed(),"selectproductcategory is not displayed");
		Assert.assertFalse(selectproductcategory.isSelected());
		spc.selectByVisibleText("Oil Company Other GeneralMaster");
	}

	public void setselectinventorymethod3() throws InterruptedException {
		Select sim = new Select(selectinventorymethod);
		Thread.sleep(1000);
		Assert.assertFalse(selectinventorymethod.isDisplayed(),"selectinventorymethod is not displayed");
		Assert.assertFalse(selectinventorymethod.isSelected());
		sim.selectByVisibleText("FIFO");
	}
	public void VerifyMyerIsGST3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prodisgst.isEnabled(),"prodisgst field is enabled");		 
		Reporter.log("verifyMyerpprodisgst", true);
		prodisgst.click(); 
		/*
		 * Alert al = driver.switchTo().alert();
		 * driver.switchTo().frame("iframeResult"); prodisgst.click();
		 * System.out.println(al.getText()); al.accept();
		 */
	}
	public void VerifyMyerpTaxDetails3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prodtaxdetials.isEnabled(),"prodtaxdetials field is enabled");		 
		Reporter.log("verifyMyerpprodtaxdetials", true);
		prodtaxdetials.getText();
		System.out.println(prodtaxdetials.getText());
	}
	public void VerifyMyerpHSNCode3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(hsncode.isEnabled(),"hsncode field is enabled");		 
		Reporter.log("verifyMyerphsncode ", true);
		hsncode.click(); 
	}
	public void VerifyMyerpPName3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pname.isEnabled(),"pname field is enabled");		 
		Reporter.log("verifyMyerppname", true);
		pname.click(); 
		pname.clear();
		pname.sendKeys("Demo");
	}
	public void VerifyMyerpPCGST3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcgst.isEnabled(),"pcgst field is enabled");		 
		Reporter.log("verifyMyerppcgst", true);
		pcgst.click(); 
		pcgst.sendKeys("2.5");
	}
	public void VerifyMyerpdate3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		Reporter.log("verifyMyerpdate", true);
		date.click(); 
		date.clear();
		date.sendKeys("01/04/2022");
	}
	public void VerifyMyerpPTaxSavebtn3() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(ptaxsavebtn.isEnabled(),"ptaxsavebtn field is enabled");		 
		Reporter.log("verifyMyerpptaxsavebtn", true);
		ptaxsavebtn.click(); 
	}
	public void VerifyMyerpPActiveCheckbox3() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
		Reporter.log("verifyMyerppactivechk", true);
		pactivechk.click(); 
	}
	public void VerifyMyerpPSubmitBtn3() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtn", true);
		psubmitbtn.click(); 
		Thread.sleep(800);
	}
	public void VerifyMyerpPSubmitBtnOK3() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(psubmitbtnok.isEnabled(),"psubmitbtnok field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtnok", true);
		psubmitbtnok.click(); 
	} 
	
	public void VerifyMyerProductName4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productname.isEnabled(),"productname field is enabled");		 
		Reporter.log("verifyMyerpproductname ", true);
		productname.click(); 
		productname.clear();
		productname.sendKeys("DGCC BOOK");
	}
	public void VerifyMyerProductcode4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productcode.isEnabled(),"productcode field is enabled");		 
		Reporter.log("verifyMyerpproductcode", true);
		productcode.click(); 
		productcode.clear();
		productcode.sendKeys("10003");
	}
	public void VerifyMyerProductDesc4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdesc.isEnabled(),"productdesc field is enabled");		 
		Reporter.log("verifyMyerpproductdesc", true);
		productdesc.click(); 
		productdesc.clear();
		productdesc.sendKeys("NUMBER"); 
	}
	public void setselectunitofmeasurement4() throws InterruptedException {
		Select suom = new Select(selectunitofmeasurement);
		Thread.sleep(1000);
		Assert.assertFalse(selectunitofmeasurement.isDisplayed(),"selectunitofmeasurement is not displayed");
		Assert.assertFalse(selectunitofmeasurement.isSelected());
		suom.selectByVisibleText("NUMBER");
	}
	public void setselectproductcategory4() throws InterruptedException {
		Select spc = new Select(selectproductcategory);
		Thread.sleep(1000);
		Assert.assertFalse(selectproductcategory.isDisplayed(),"selectproductcategory is not displayed");
		Assert.assertFalse(selectproductcategory.isSelected());
		spc.selectByVisibleText("Oil Company Other GeneralMaster");
	}
	public void setselectinventorymethod4() throws InterruptedException {
		Select sim = new Select(selectinventorymethod);
		Thread.sleep(1000);
		Assert.assertFalse(selectinventorymethod.isDisplayed(),"selectinventorymethod is not displayed");
		Assert.assertFalse(selectinventorymethod.isSelected());
		sim.selectByVisibleText("FIFO");
	}
	public void VerifyMyerIsGST4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prodisgst.isEnabled(),"prodisgst field is enabled");		 
		Reporter.log("verifyMyerpprodisgst", true);
		prodisgst.click(); 
		/*
		 * Alert al = driver.switchTo().alert();
		 * driver.switchTo().frame("iframeResult"); prodisgst.click();
		 * System.out.println(al.getText()); al.accept();
		 */
	}
	public void VerifyMyerpTaxDetails4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prodtaxdetials.isEnabled(),"prodtaxdetials field is enabled");		 
		Reporter.log("verifyMyerpprodtaxdetials", true);
		prodtaxdetials.getText();
		System.out.println(prodtaxdetials.getText());
	}
	public void VerifyMyerpHSNCode4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(hsncode.isEnabled(),"hsncode field is enabled");		 
		Reporter.log("verifyMyerphsncode", true);
		hsncode.click(); 
	}
	public void VerifyMyerpPName4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pname.isEnabled(),"pname field is enabled");		 
		Reporter.log("verifyMyerppname ", true);
		pname.click();
		pname.sendKeys("Demo");
	}
	public void VerifyMyerpPCGST4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcgst.isEnabled(),"pcgst field is enabled");		 
		Reporter.log("verifyMyerppcgst", true);
		pcgst.click(); 
		pcgst.sendKeys("2.5");
	}
	public void VerifyMyerpdate4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		Reporter.log("verifyMyerpdate", true);
		date.click(); 
		date.clear();
		date.sendKeys("01/04/2022");
	}
	public void VerifyMyerpPTaxSavebtn4() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(ptaxsavebtn.isEnabled(),"ptaxsavebtn field is enabled");		 
		Reporter.log("verifyMyerpptaxsavebtn", true);
		ptaxsavebtn.click(); 

	}
	public void VerifyMyerpPActiveCheckbox4() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
		Reporter.log("verifyMyerppactivechk", true);
		pactivechk.click(); 
	}

	public void VerifyMyerpPSubmitBtn4() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtn", true);
		psubmitbtn.click(); 
		Thread.sleep(800);

	}
	public void VerifyMyerpPSubmitBtnOK4() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(psubmitbtnok.isEnabled(),"psubmitbtnok field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtnok", true);
		psubmitbtnok.click(); 
	}
	
	public void VerifyMyerpBackbtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(backbtn.isEnabled(),"backbtn field is enabled");		 
		Reporter.log("verifyMyerpbackbtn", true);
		backbtn.click(); 
	}
//product rate slab
	
	public void VerifyMyerpProductRSlab() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productrateslab.isEnabled(),"productrateslab field is enabled");		 
		Reporter.log("verifyMyerpproductrateslab", true);
		productrateslab.click(); 
	}
	public void setselectproduct() throws InterruptedException {
		Select sp = new Select(selectproduct);
		Thread.sleep(1000);
		Assert.assertFalse(selectproduct.isDisplayed(),"selectproduct is  displayed");
		Assert.assertFalse(selectproduct.isSelected());
		sp.selectByVisibleText("19 KG");
	}
	public void setselectarea() throws InterruptedException {

		Select sp = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"selectarea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		sp.selectByVisibleText("VIRAR");
	}
	public void VerifyMyerpProductrate() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productrate.isEnabled(),"productrate field is enabled");		 
		Reporter.log("verifyMyerpproductrate", true);
		productrate.click(); 
		productrate.sendKeys("1325.29");
	}
	public void VerifyMyerpprdouctmrp() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prdouctmrp.isEnabled(),"prdouctmrp field is enabled");		 
		Reporter.log("verifyMyerpprdouctmrp", true);
		prdouctmrp.click(); 
		prdouctmrp.sendKeys("1720");

	}
	public void VerifyMyerpPurchasDeposit() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdeposit.isEnabled(),"productdeposit field is enabled");		 
		Reporter.log("verifyMyerpproductdeposit", true);
		productdeposit.click(); 
		productdeposit.sendKeys("2400");

	}
	public void VerifyMyerpProductDate() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdate.isEnabled(),"productdate field is enabled");		 
		Reporter.log("verifyMyerproductdate", true);
		productdate.click(); 
		productdate.sendKeys("01-01-2023");

	}
	public void selectcompany() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertTrue(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("Bugfix Gas");
	}
	public void VerifyMyerpProductActiveBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
		Reporter.log("verifyMyerppactivechk", true);
		pactivechk.click(); 
	}
	public void VerifyMyerpProductSubmitBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtn", true);
		psubmitbtn.click(); 
	}
	
	public void setselectproduct1() throws InterruptedException {
		Select sp = new Select(selectproduct);
		Thread.sleep(1000);
		Assert.assertFalse(selectproduct.isDisplayed(),"selectproduct is  displayed");
		Assert.assertFalse(selectproduct.isSelected());
		sp.selectByVisibleText("14.2 KG");
	}
	public void setselectarea1() throws InterruptedException {
		Select sp = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"selectarea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		selectarea.clear();
		sp.selectByVisibleText("VIRAR");
	}
	public void VerifyMyerpProductrate1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productrate.isEnabled(),"productrate field is enabled");		 
		Reporter.log("verifyMyerpproductrate", true);
		productrate.click(); 
		productrate.sendKeys("337.54");
	}
	public void VerifyMyerpprdouctmrp1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prdouctmrp.isEnabled(),"prdouctmrp field is enabled");		 
		Reporter.log("verifyMyerpprdouctmrp", true);
		prdouctmrp.click(); 
		prdouctmrp.sendKeys("1052.5");

	}
	public void VerifyMyerpProductDeposit1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prdouctmrp.isEnabled(),"productdeposit field is enabled");		 
		Reporter.log("verifyMyerproductdeposit", true);
		productdeposit.click(); 
		productdeposit.sendKeys("2200");

	}
	public void VerifyMyerpProductDate1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdate.isEnabled(),"productdate field is enabled");		 
		Reporter.log("verifyMyerproductdate", true);
		productdate.click(); 
		productdate.clear();
		productdate.sendKeys("01-01-2023");

	}
	public void selectcompany1() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertTrue(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("Bugfix Gas");
	}
	public void VerifyMyerpProductActiveBtn1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
		Reporter.log("verifyMyerppactivechk", true);
		pactivechk.click(); 
	}
	public void VerifyMyerpProductSubmitBtn1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtn", true);
		psubmitbtn.click(); 
	}
	
	public void setselectproduct2() throws InterruptedException {
		Select sp = new Select(selectproduct);
		Thread.sleep(1000);
		Assert.assertFalse(selectproduct.isDisplayed(),"selectproduct is  displayed");
		Assert.assertFalse(selectproduct.isSelected());
		sp.selectByVisibleText("SRT PIPE");
	}
	public void setselectarea2() throws InterruptedException {
		Select sp = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"selectarea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		selectarea.clear();
		sp.selectByVisibleText("VIRAR");
	}
	public void VerifyMyerpProductRate2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productrate.isEnabled(),"productrate field is enabled");		 
		Reporter.log("verifyMyerppurchaserate", true);
		productrate.click(); 
		productrate.clear();
		productrate.sendKeys("190");
	}
	public void VerifyMyerpprdouctmrp2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prdouctmrp.isEnabled(),"prdouctmrp field is enabled");		 
		Reporter.log("verifyMyerpprdouctmrp", true);
		prdouctmrp.click(); 
		prdouctmrp.clear();
		prdouctmrp.sendKeys("200");

	}
	public void VerifyMyerpProductDeposit2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdeposit.isEnabled(),"productdeposit field is enabled");		 
		Reporter.log("verifyMyerproductdeposit", true);
		productdeposit.click(); 
		productdeposit.clear();
		productdeposit.sendKeys("100");

	}
	public void VerifyMyerpProductDate2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdate.isEnabled(),"productdate field is enabled");		 
		Reporter.log("verifyMyerproductdate", true);
		productdate.click(); 
		productdate.clear();
		productdate.sendKeys("01-01-2023");

	}
	public void selectcompany2() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertTrue(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("Bugfix Gas");
	}
	public void VerifyMyerpProductActiveBtn2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
		Reporter.log("verifyMyerppactivechk", true);
		pactivechk.click(); 

	}
	public void VerifyMyerpProductSubmitBtn2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtn", true);
		psubmitbtn.click(); 
	}
	
	public void setselectproduct3() throws InterruptedException {
		Select sp = new Select(selectproduct);
		Thread.sleep(1000);
		Assert.assertFalse(selectproduct.isDisplayed(),"selectproduct is  displayed");
		Assert.assertFalse(selectproduct.isSelected());
		sp.selectByVisibleText("DPR");
	}
	public void setselectarea3() throws InterruptedException {
		Select sp = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"selectarea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		sp.selectByVisibleText("VIRAR");
	}
	public void VerifyMyerpProductrate3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productrate.isEnabled(),"purchaserate field is enabled");		 
		Reporter.log("verifyMyerppurchaserate", true);
		productrate.click(); 
		productrate.sendKeys("250");
	}
	public void VerifyMyerpprdouctmrp3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prdouctmrp.isEnabled(),"prdouctmrp field is enabled");		 
		Reporter.log("verifyMyerpprdouctmrp", true);
		prdouctmrp.click(); 
		prdouctmrp.sendKeys("260");

	}
	public void VerifyMyerpPurchasDeposit3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdeposit.isEnabled(),"productdeposit field is enabled");		 
		Reporter.log("verifyMyerpproductdeposit", true);
		productdeposit.click(); 
		productdeposit.sendKeys("0");

	}
	public void VerifyMyerpProductDate3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdate.isEnabled(),"productdate field is enabled");		 
		Reporter.log("verifyMyerproductdate", true);
		productdate.click(); 
		productdate.clear();
		productdate.sendKeys("01-01-2023");

	}
	public void selectcompany3() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertTrue(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("Bugfix Gas");
	}
	public void VerifyMyerpProductActiveBtn3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
		Reporter.log("verifyMyerppactivechk", true);
		pactivechk.click(); 
	}
	public void VerifyMyerpProductSubmitBtn3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtn", true);
		psubmitbtn.click(); 

	}
	public void setselectproduct4() throws InterruptedException {
		Select sp = new Select(selectproduct);
		Thread.sleep(1000);
		Assert.assertFalse(selectproduct.isDisplayed(),"selectproduct is  displayed");
		Assert.assertFalse(selectproduct.isSelected());
		sp.selectByVisibleText("DGCC BOOK");
	}
	public void setselectarea4() throws InterruptedException {
		Select sp = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"selectarea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		sp.selectByVisibleText("VIRAR");
	}
	public void VerifyMyerpProductrate4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productrate.isEnabled(),"productrate field is enabled");		 
		Reporter.log("verifyMyerpproductrate", true);
		productrate.click(); 
		productrate.sendKeys("50");
	}
	public void VerifyMyerpprdouctmrp4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(prdouctmrp.isEnabled(),"prdouctmrp field is enabled");		 
		Reporter.log("verifyMyerpprdouctmrp", true);
		prdouctmrp.click(); 
		prdouctmrp.sendKeys("60");

	}
	public void VerifyMyerpPurchasDeposit4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdeposit.isEnabled(),"productdeposit field is enabled");		 
		Reporter.log("verifyMyerproductdeposit", true);
		productdeposit.click(); 
		productdeposit.sendKeys("");

	}
	public void VerifyMyerpProductDate4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(productdate.isEnabled(),"productdate field is enabled");		 
		Reporter.log("verifyMyerproductdate", true);
		productdate.click(); 
		productdate.clear();
		productdate.sendKeys("01-01-2023");

	}
	public void selectcompany4() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertTrue(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		selectcompany.clear();
		sc.selectByVisibleText("Bugfix Gas");
	}
	public void VerifyMyerpProductActiveBtn4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
		Reporter.log("verifyMyerppactivechk", true);
		pactivechk.click(); 
	}
	public void VerifyMyerpProductSubmitBtn4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
		Reporter.log("verifyMyerppsubmitbtn", true);
		psubmitbtn.click(); 	 
	}
	public void VerifyMyerpBackbtn1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(backbtn.isEnabled(),"backbtn field is enabled");		 
		Reporter.log("verifyMyerpbackbtn", true);
		backbtn.click(); 
	}
//supplier	
	
	public void VerifyMyerpSupplier() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(supplier.isEnabled(),"supplier field is enabled");		 
		Reporter.log("verifyMyerpsupplier", true);
		supplier.click(); 
	}
	public void SelectCompany() throws InterruptedException {
		Select sc = new Select(selectcompany);
		Thread.sleep(1000);
		Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
		Assert.assertFalse(selectcompany.isSelected());
		sc.selectByVisibleText("Bugfix Gas");
	}
	public void VerifyMyerpSsupcompanyCode() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(supcompanycode.isEnabled(),"supcompanycode field is enabled");		 
		Reporter.log("verifyMyerpsupcompanycode", true);
		supcompanycode.click(); 
		supcompanycode.sendKeys("12345");
	}
	public void VerifyMyerpSupplierName() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(sname.isEnabled(),"sname field is enabled");		 
		Reporter.log("verifyMyerpsname", true);
		sname.click();
		sname.sendKeys("BPCL");
	}
	public void SelectGroup() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("SUNDRY CREDITORS");
	}
	public void VerifyMyerpSupplierContandDetial() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(scontanctdetail.isEnabled(),"scontanctdetail field is enabled");		 
		Reporter.log("verifyMyerpscontanctdetail", true);
		scontanctdetail.click(); 
		scontanctdetail.sendKeys("8828420045");
	}
	public void VerifyMyerpSupplierAddress1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(saddress1.isEnabled(),"saddress1 field is enabled");		 
		Reporter.log("verifyMyerpsaddress1", true);
		saddress1.click(); 
		saddress1.sendKeys("URAN");
	}
	public void SelectState() throws InterruptedException {
		Select ss = new Select(selectstate);
		Thread.sleep(1000);
		Assert.assertFalse(selectstate.isDisplayed(),"selectstate is displayed");
		Assert.assertFalse(selectstate.isSelected());
		ss.selectByVisibleText("MAHARASHTRA");
	}
	public void SelectDestrict() throws InterruptedException {
		Select ss = new Select(selectdestrict);
		Thread.sleep(1000);
		Assert.assertFalse(selectdestrict.isDisplayed(),"selectdestrict is displayed");
		Assert.assertFalse(selectdestrict.isSelected());
		ss.selectByVisibleText("");
	}
	public void SelectTahasil() throws InterruptedException {
		Select ss = new Select(selecttahasil);
		Thread.sleep(1000);
		Assert.assertFalse(selecttahasil.isDisplayed(),"selecttahasil is displayed");
		Assert.assertFalse(selecttahasil.isSelected());
		ss.selectByVisibleText("");
	}
		public void VeryFymyerpCity() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(city.isEnabled(),"city field is enabled");		 
			Reporter.log("VeryFymyerpcity", true);
			city.click(); 
			city.sendKeys("Virar");
	}
		public void VeryFymyerppincode1() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(pincode1.isEnabled(),"pincode1 field is enabled");		 
			Reporter.log("VeryFymyerppincode1", true);
			pincode1.click(); 
			pincode1.sendKeys("401303");
	}
		public void VeryFymyerpgstinnumber() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(gstinnumber.isEnabled(),"gstinnumber field is enabled");		 
			Reporter.log("VeryFymyerpgstinnumber", true);
			gstinnumber.click(); 
			gstinnumber.sendKeys("27ACSPT8705B1Z8");
	}
		public void VeryFymyerppannumber() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(pannumber.isEnabled(),"pannumber field is enabled");		 
			Reporter.log("VeryFymyerppannumber", true);
			pannumber.click(); 
			pannumber.sendKeys("ACSPT8705B");
	}
		public void VeryFymyerptdscategory() throws InterruptedException {
			Select ss = new Select(selecttahasil);
			Thread.sleep(1000);
			Assert.assertFalse(tdscategory.isDisplayed(),"tdscategory is displayed");
			Assert.assertFalse(tdscategory.isSelected());
			ss.selectByVisibleText("");
	}
		public void VerifyMyerpOpeningdate() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(openingdate.isEnabled(),"openingdate field is enabled");		 
			Reporter.log("verifyMyerpopeningdate", true);
			openingdate.click(); 
			openingdate.clear();
			openingdate.sendKeys("01-01-2023");
	}	
	public void VerifyMyerpSupplierActveChk() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(sactivechk.isEnabled(),"sactivechk field is enabled");		 
		Reporter.log("verifyMyerpsactivechk", true);
		sactivechk.click(); 
	}
	public void VerifyMyerpSupplierSubmitBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ssubmitbtn.isEnabled(),"ssubmitbtn field is enabled");		 
		Reporter.log("verifyMyerpsupplierssubmitbtn", true);
		ssubmitbtn.click(); 
		Thread.sleep(500); 
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
	public void VerifyMyerpSupplierSubmiOKBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(ssubmitok.isEnabled(),"ssubmitok field is enabled");		 
		Reporter.log("verifyMyerpssubmitok", true);
		Assert.assertFalse(ssubmitok.isSelected());
		ssubmitok.click(); 
	}
	public void VerifyMyerpBackbtn2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(backbtn.isEnabled(),"backbtn field is enabled");		 
		Reporter.log("verifyMyerpbackbtn", true);
		backbtn.click(); 
	}
	public void verifyMyerpPageNavigation() {
		Assert.assertTrue(pagena.isEnabled(),"pagena is Enable");
		Reporter.log("verifyMyerppagena",true);
		pagena.click();
	}
//Vehicle
	
	public void verifyMyerpVehicleMaster() {
		Assert.assertTrue(vehicle.isEnabled(),"Vehicle is Enable");
		Reporter.log("verifyMyerpvehicle",true);
		vehicle.click();
	}
	public void verifyMyerpTransporterName() throws InterruptedException {
		Select tn = new Select(transportername);
		Thread.sleep(1000);
		Assert.assertFalse(transportername.isDisplayed(),"transportername is displayed");
		Assert.assertFalse(transportername.isSelected());
		tn.selectByVisibleText("Bugfix Gas");
	}
	public void verifyMyerpVehicleNo() {
		Assert.assertTrue(vehicleno.isEnabled(),"vehicleno is Enable");
		Reporter.log("veryfyMyerpvehicleno", true);
		vehicleno.sendKeys("MH 02 BA 1237");
	}
	public void verifyMyerpModelYear() {
		Assert.assertTrue(modelyear.isEnabled(),"modelyear is Enable");
		Reporter.log("vedryfyMyerpmodelyear",true);
		modelyear.click();
		modelyear.clear();
		modelyear.sendKeys("13/01/2023");
	}
	public void verifyMyerpInsuranceFromDate() {
		Assert.assertTrue(insurancefromdate.isEnabled(),"insurancefromdate is Enable");
		Reporter.log("vedryfyMyerpinsurancefromdate",true);
		insurancefromdate.click();
		insurancefromdate.clear();
		insurancefromdate.sendKeys("13/12/2023");
	}
	public void verifyMyerpInsuranceToDate() {
		Assert.assertTrue(insurancetodate.isEnabled(),"insurancetodate is Enable");
		Reporter.log("vedryfyMyerpinsurancetodate",true);
		insurancetodate.click();
		insurancetodate.clear();
		insurancetodate.sendKeys("3/12/2023");
	}

	public void verifyMyerpSelectdriver() throws InterruptedException {
		Select tn = new Select(selectdriver);
		Thread.sleep(1000);
		Assert.assertFalse(selectdriver.isDisplayed(),"selectdriver is displayed");
		Assert.assertFalse(selectdriver.isSelected());
		tn.selectByVisibleText("SURESH");

	}
	public void verifyMyerpCheckBox() {
		Assert.assertTrue(checkbox.isEnabled(),"CheckBox is Enable");
		Reporter.log("vedryfyMyerpcheckbox",true);
		checkbox.click();
	}
	public void verifyMyerpSubmitBtn() {
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is Enable");
		Reporter.log("vedryfyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void verifyMyerpOKButton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(okbtn.isEnabled(),"okbtn is Enable");
		Reporter.log("verifyMyerpokbtn",true);
		okbtn.click();
	}
	public void VerifyMyerpBackbtn3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(backbtn.isEnabled(),"backbtn field is enabled");		 
		Reporter.log("verifyMyerpbackbtn", true);
		backbtn.click(); 
	}
	//Employee Form
	
		public void VerifyMyerpEmployeeForm() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(employeeform.isEnabled()," employeeform field is enabled");		 
			Reporter.log("verifyMyerpemployeeform", true);
			employeeform.click(); 
		}
		public void VerifyMyerpEmployeeFirstName() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
			Reporter.log("verifyMyerpefname", true);
			efname.click();
			efname.sendKeys("Manoj");
		}
		public void VerifyMyerpEmployeeLastName() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
			Reporter.log("verifyMyerpelname", true);
			elname.click();
			elname.sendKeys("Kumar");
		}
		public void ESelectCompany() throws InterruptedException {
			Select sc = new Select(selectcompany);
			Thread.sleep(1000);
			Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
			Assert.assertFalse(selectcompany.isSelected());
			sc.selectByVisibleText("Bugfix Gas");
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
			Assert.assertFalse(eselectdesignation.isDisplayed(),"eselectdesignation is not displayed");
			Assert.assertFalse(eselectdesignation.isSelected());
			sc.selectByVisibleText("USER");
		}

		public void VerifyMyerpPersonalContanctNumber() {
			Assert.assertTrue(personalcontanctnumber.isEnabled(),"personalcontanctnumber field is enabled");		 
			Reporter.log("verifyMyerp personalcontanctnumber", true);
			personalcontanctnumber.click(); 
			personalcontanctnumber.sendKeys("8828420045");
		}
		public void VerifyMyerpoficialcontanctnumber() {
			Assert.assertTrue(oficialcontanctnumber.isEnabled(),"oficialcontanctnumber field is enabled");		 
			Reporter.log("verifyMyerpoficialcontanctnumber", true);
			oficialcontanctnumber.click(); 
			oficialcontanctnumber.sendKeys("8828420045");
		}
		public void VerifyMyerpEmailId() {
			Assert.assertTrue(emailid.isEnabled(),"emailid field is enabled");		 
			Reporter.log("verifyMyerp emailid", true);
			emailid.click(); 
			emailid.sendKeys("evitasoft@gmail.com");
		}
		public void VerifyMyerpAddress1() {
			Assert.assertTrue(address1.isEnabled(),"address1 field is enabled");		 
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
			Assert.assertTrue(entercity.isEnabled(),"entercity field is enabled");		 
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
			Reporter.log("verifyMyerpeactivechk", true);
			eactivechk.click(); 
			Thread.sleep(500);
		}
			public void VerifyMyerpEmployeeSubmitBtn() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(ebtnsubmit.isEnabled(),"ebtnsubmitfield is enabled");		 
			Reporter.log("verifyMyerpebtnsubmit", true);
			ebtnsubmit.click(); 

		}
		public void VerifyMyerpEmployeeSubmitOKBtn() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(ebtnsubmitok.isEnabled(),"ebtnsubmitok is enabled");		 
			Reporter.log("verifyMyerpebtnsubmitok", true);
			ebtnsubmitok.click();

		}
		
		public void VerifyMyerpEmployeeFirstName3() throws InterruptedException {
			Thread.sleep(1000);
			Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
			Reporter.log("verifyMyerp employeefname", true);
			efname.click(); 
			efname.clear();
			efname.sendKeys("Suresh");
		}
		public void VerifyMyerpEmployeeLastName3() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
			Reporter.log("verifyMyerp elname", true);
			elname.click(); 
			elname.clear();
			elname.sendKeys("Mishra");
		}
		public void ESelectCompany3() throws InterruptedException {
			Select sc = new Select(selectcompany);
			Thread.sleep(1000);
			Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
			Assert.assertFalse(selectcompany.isSelected());
			selectcompany.clear();
			sc.selectByVisibleText("Bugfix Gas");
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
			eselectdesignation.clear();
			sc.selectByVisibleText("Driver");
		}

		public void VerifyMyerppersonalcontanctnumber3() {
			Assert.assertTrue(personalcontanctnumber.isEnabled()," personalcontanctnumber field is enabled");		 
			Reporter.log("verifyMyerp personalcontanctnumber", true);
			personalcontanctnumber.click(); 
			personalcontanctnumber.clear();
			personalcontanctnumber.sendKeys("8828420045");
		}
		public void VerifyMyerpoficialcontanctnumber3() {
			Assert.assertTrue(oficialcontanctnumber.isEnabled()," oficialcontanctnumber field is enabled");		 
			Reporter.log("verifyMyerp oficialcontanctnumber", true);
			oficialcontanctnumber.click(); 
			oficialcontanctnumber.clear();
			oficialcontanctnumber.sendKeys("8828420045");
		}
		public void VerifyMyerpEmailId3() {
			Assert.assertTrue(emailid.isEnabled()," emailid field is enabled");		 
			Reporter.log("verifyMyerp emailid", true);
			emailid.click(); 
			emailid.clear();
			emailid.sendKeys("evitasoft@gmail.com");
		}
		public void VerifyMyerpAddress3() {
			Assert.assertTrue(address1.isEnabled()," address1 field is enabled");		 
			Reporter.log("verifyMyerp address1", true);
			address1.click(); 
			address1.clear();
			address1.sendKeys("virar");
		}
		public void VerifyMyerpSelectState3() throws InterruptedException {
			Select sc = new Select(selectstate);
			Thread.sleep(1000);
			Assert.assertFalse(selectstate.isDisplayed(),"selectstate is displayed");
			Assert.assertFalse(selectstate.isSelected());
			selectstate.clear();
			sc.selectByVisibleText("MAHARASHTRA");
		}
		public void VerifyMyerpSelectDistrict3() throws InterruptedException {
			Select sc = new Select(selectdistrict);
			Thread.sleep(1000);
			Assert.assertFalse(selectdistrict.isDisplayed(),"selectdistrict is displayed");
			Assert.assertFalse(selectdistrict.isSelected());
			selectdistrict.clear();
			sc.selectByVisibleText("Palghar");

		}

		public void voidVerifyMyerpSelectTehsil3() throws InterruptedException {
			Select sc = new Select(selecttehsil);
			Thread.sleep(1000);
			Assert.assertFalse(selecttehsil.isDisplayed(),"selecttehsil is displayed");
			Assert.assertFalse(selecttehsil.isSelected());
			selecttehsil.clear();
			sc.selectByVisibleText("Vasai");
		}
		public void VerifyMyerpEnterCity3() {
			Assert.assertTrue(entercity.isEnabled()," entercity field is enabled");		 
			Reporter.log("verifyMyerpentercity", true);
			entercity.click(); 
			entercity.clear();
			entercity.sendKeys("virar");
		}
		public void VerifyMyerpPincode3() {
			Assert.assertTrue(pincode.isEnabled()," pincode field is enabled");		 
			Reporter.log("verifyMyerppincode", true);
			pincode.click(); 
			pincode.clear();
			pincode.sendKeys("401303");
		}
		public void VerifyMyerpBasicPay3() {
			Assert.assertTrue(basicpay.isEnabled(),"basicpay field is enabled");		 
			Reporter.log("verifyMyerpbasicpay", true);
			basicpay.click(); 
			basicpay.clear();
			basicpay.sendKeys("14000");
		}
		public void VerifyMyerpDOB3() {
			Assert.assertTrue(dob.isEnabled()," dob field is enabled");		 
			Reporter.log("verifyMyerpdob", true);
			dob.click(); 
			dob.clear();
			dob.sendKeys("14/06/1994");
		}
		public void VerifyMyerpJoiningDate3() {
			Assert.assertTrue(joiningdate.isEnabled(),"joiningdate field is enabled");		 
			Reporter.log("verifyMyerpjoiningdate", true);
			joiningdate.click(); 
			joiningdate.clear();
			joiningdate.sendKeys("01/01/2023");
		}

		public void VerifyMyerpEmployeeActiveCHK3() throws InterruptedException {
			Thread.sleep(1000);
			Assert.assertTrue(eactivechk.isEnabled(),"eactivechk field is enabled");		 
			Reporter.log("verifyMyerpeactivechk", true);
			eactivechk.click(); 

		}
		public void VerifyMyerpEmployeeSubmitBtn3() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(ebtnsubmit.isEnabled(),"ebtnsubmitfield is enabled");		 
			Reporter.log("verifyMyerpebtnsubmit", true);
			ebtnsubmit.click(); 

		}
		public void VerifyMyerpEmployeeSubmitOKBtn3() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(ebtnsubmitok.isEnabled(),"ebtnsubmitok is enabled");		 
			Reporter.log("verifyMyerpebtnsubmitok", true);
			ebtnsubmitok.click();

		}

		public void VerifyMyerpEmployeeFirstName4() throws InterruptedException {
			Thread.sleep(2000);
			Assert.assertTrue(efname.isEnabled()," efname field is enabled");		 
			Reporter.log("verifyMyerpemployeefname", true);
			efname.click(); 
			efname.clear();
			efname.sendKeys("Ramesh");
		}
		public void VerifyMyerpEmployeeLastName4() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
			Reporter.log("verifyMyerpelname", true);
			elname.click(); 
			elname.clear();
			elname.sendKeys("Sachan");
		}
		public void ESelectCompany4() throws InterruptedException {
			Select sc = new Select(selectcompany);
			Thread.sleep(1000);
			Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
			Assert.assertFalse(selectcompany.isSelected());
			selectcompany.clear();
			sc.selectByVisibleText("Bugfix Gas");
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
			Assert.assertFalse(eselectdesignation.isDisplayed(),"eselectdesignation is not displayed");
			Assert.assertFalse(eselectdesignation.isSelected());
			eselectdesignation.clear();
			sc.selectByVisibleText("Domestic Deliveryman");
		}
		public void VerifyMyerppersonalcontanctnumber4() {
			Assert.assertTrue(personalcontanctnumber.isEnabled(),"personalcontanctnumber field is enabled");		 
			Reporter.log("verifyMyerppersonalcontanctnumber", true);
			personalcontanctnumber.click(); 
			personalcontanctnumber.clear();
			personalcontanctnumber.sendKeys("8828420045");
		}
		public void VerifyMyerpoficialcontanctnumber4() {
			Assert.assertTrue(oficialcontanctnumber.isEnabled(),"oficialcontanctnumber field is enabled");		 
			Reporter.log("verifyMyerp oficialcontanctnumber", true);
			oficialcontanctnumber.click(); 
			oficialcontanctnumber.clear();
			oficialcontanctnumber.sendKeys("8828420045");
		}
		public void VerifyMyerpEmailId4() {
			Assert.assertTrue(emailid.isEnabled(),"emailid field is enabled");		 
			Reporter.log("verifyMyerp emailid", true);
			emailid.click(); 
			emailid.clear();
			emailid.sendKeys("evitasoft@gmail.com");
		}
		public void VerifyMyerpAddress4() {
			Assert.assertTrue(address1.isEnabled(),"address1 field is enabled");		 
			Reporter.log("verifyMyerp address1", true);
			address1.click(); 
			address1.clear();
			address1.sendKeys("virar");
		}
		public void VerifyMyerpSelectState4() throws InterruptedException {
			Select sc = new Select(selectstate);
			Thread.sleep(1000);
			Assert.assertFalse(selectstate.isDisplayed(),"selectstate is displayed");
			Assert.assertFalse(selectstate.isSelected());
			selectstate.clear();
			sc.selectByVisibleText("MAHARASHTRA");
		}
		public void VerifyMyerpSelectDistrict4() throws InterruptedException {
			Select sc = new Select(selectdistrict);
			Thread.sleep(1000);
			Assert.assertFalse(selectdistrict.isDisplayed(),"selectdistrict is displayed");
			Assert.assertFalse(selectdistrict.isSelected());
			selectdistrict.clear();
			sc.selectByVisibleText("Palghar");

		}
		public void voidVerifyMyerpSelectTehsil4() throws InterruptedException {
			Select sc = new Select(selecttehsil);
			Thread.sleep(1000);
			Assert.assertFalse(selecttehsil.isDisplayed(),"selecttehsil is displayed");
			Assert.assertFalse(selecttehsil.isSelected());
			selecttehsil.clear();
			sc.selectByVisibleText("Vasai");
		}
		public void VerifyMyerpEnterCity4() {
			Assert.assertTrue(entercity.isEnabled(),"entercity field is enabled");		 
			Reporter.log("verifyMyerpentercity", true);
			entercity.click(); 
			entercity.clear();
			entercity.sendKeys("virar");
		}
		public void VerifyMyerpPincode4() {
			Assert.assertTrue(pincode.isEnabled(),"pincode field is enabled");		 
			Reporter.log("verifyMyerppincode", true);
			pincode.click(); 
			pincode.clear();
			pincode.sendKeys("401303");
		}
		public void VerifyMyerpBasicPay4() {
			Assert.assertTrue(basicpay.isEnabled(),"basicpay field is enabled");		 
			Reporter.log("verifyMyerpbasicpay", true);
			basicpay.click(); 
			basicpay.clear();
			basicpay.sendKeys("14500");
		}
		public void VerifyMyerpDOB4() {
			Assert.assertTrue(dob.isEnabled(),"dob field is enabled");		 
			Reporter.log("verifyMyerpdob", true);
			dob.click(); 
			dob.clear();
			dob.sendKeys("09/02/1999");
		}
		public void VerifyMyerpJoiningDate4() {
			Assert.assertTrue(joiningdate.isEnabled(),"joiningdate field is enabled");		 
			Reporter.log("verifyMyerpjoiningdate", true);
			joiningdate.click(); 
			joiningdate.clear();
			joiningdate.sendKeys("01/01/2023");
		}
		public void VerifyMyerpEmployeeActiveCHK4() throws InterruptedException {
			Thread.sleep(1000);
			Assert.assertTrue(eactivechk.isEnabled(),"eactivechk field is enabled");		 
			Reporter.log("verifyMyerp eactivechk", true);
			eactivechk.click(); 
		}
		public void VerifyMyerpEmployeeSubmitBtn4() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(ebtnsubmit.isEnabled(),"ebtnsubmitfield is enabled");		 
			Reporter.log("verifyMyerpebtnsubmit", true);
			ebtnsubmit.click(); 
		}
		public void VerifyMyerpEmployeeSubmitOKBtn4() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(ebtnsubmitok.isEnabled(),"ebtnsubmitok is enabled");		 
			Reporter.log("verifyMyerpebtnsubmitok", true);
			ebtnsubmitok.click();
		}
		
		public void VerifyMyerpEmployeeFirstName5() throws InterruptedException {
			Thread.sleep(2000);
			Assert.assertTrue(efname.isEnabled(),"efname field is enabled");		 
			Reporter.log("verifyMyerpefname", true);
			efname.click(); 
			efname.clear();
			efname.sendKeys("Deepak");
		}
		public void VerifyMyerpEmployeeLastName5() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(elname.isEnabled()," elname field is enabled");		 
			Reporter.log("verifyMyerpelname", true);
			elname.click(); 
			elname.clear();
			elname.sendKeys("Paramar");
		}
		public void ESelectCompany5() throws InterruptedException {
			Select sc = new Select(selectcompany);
			Thread.sleep(1000);
			Assert.assertFalse(selectcompany.isDisplayed(),"selectcompany is displayed");
			Assert.assertFalse(selectcompany.isSelected());
			selectcompany.clear();
			sc.selectByVisibleText("Bugfix Gas");
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
			Assert.assertFalse(eselectdesignation.isDisplayed(),"eselectdesignation is not displayed");
			Assert.assertFalse(eselectdesignation.isSelected());
			eselectdesignation.clear();
			sc.selectByVisibleText("Commercial Deliveryman");
		}
		public void VerifyMyerppersonalcontanctnumber5() {
			Assert.assertTrue(personalcontanctnumber.isEnabled(),"personalcontanctnumber field is enabled");		 
			Reporter.log("verifyMyerppersonalcontanctnumber", true);
			personalcontanctnumber.click(); 
			personalcontanctnumber.clear();
			personalcontanctnumber.sendKeys("8828420045");
		}
		public void VerifyMyerpOficialcontanctnumber5() {
			Assert.assertTrue(oficialcontanctnumber.isEnabled(),"oficialcontanctnumber field is enabled");		 
			Reporter.log("verifyMyerpoficialcontanctnumber", true);
			oficialcontanctnumber.click(); 
			oficialcontanctnumber.clear();
			oficialcontanctnumber.sendKeys("8828420045");
		}
		public void VerifyMyerpEmailId5() {
			Assert.assertTrue(emailid.isEnabled(),"emailid field is enabled");		 
			Reporter.log("verifyMyerpemailid", true);
			emailid.click(); 
			emailid.clear();
			emailid.sendKeys("evitasoft@gmail.com");
		}
		public void VerifyMyerpAddress5() {
			Assert.assertTrue(address1.isEnabled(),"address1 field is enabled");		 
			Reporter.log("verifyMyerpaddress1", true);
			address1.click(); 
			address1.clear();
			address1.sendKeys("virar");
		}
		public void VerifyMyerpSelectState5() throws InterruptedException {
			Select sc = new Select(selectstate);
			Thread.sleep(1000);
			Assert.assertFalse(selectstate.isDisplayed(),"selectstate is displayed");
			Assert.assertFalse(selectstate.isSelected());
			selectstate.clear();
			sc.selectByVisibleText("MAHARASHTRA");
		}
		public void VerifyMyerpSelectDistrict5() throws InterruptedException {
			Select sc = new Select(selectdistrict);
			Thread.sleep(1000);
			Assert.assertFalse(selectdistrict.isDisplayed(),"selectdistrict is displayed");
			Assert.assertFalse(selectdistrict.isSelected());
			selectdistrict.clear();
			sc.selectByVisibleText("Palghar");

		}

		public void voidVerifyMyerpSelectTehsil5() throws InterruptedException {
			Select sc = new Select(selecttehsil);
			Thread.sleep(1000);
			Assert.assertFalse(selecttehsil.isDisplayed(),"selecttehsil is displayed");
			Assert.assertFalse(selecttehsil.isSelected());
			selecttehsil.clear();
			sc.selectByVisibleText("Vasai");
		}
		public void VerifyMyerpEnterCity5() {
			Assert.assertTrue(entercity.isEnabled(),"entercity field is enabled");		 
			Reporter.log("verifyMyerpentercity", true);
			entercity.click(); 
			entercity.clear();
			entercity.sendKeys("virar");
		}
		public void VerifyMyerpPincode5() {
			Assert.assertTrue(pincode.isEnabled(),"pincode field is enabled");		 
			Reporter.log("verifyMyerppincode", true);
			pincode.click(); 
			pincode.clear();
			pincode.sendKeys("401303");
		}
		public void VerifyMyerpBasicPay5() {
			Assert.assertTrue(basicpay.isEnabled(),"basicpay field is enabled");		 
			Reporter.log("verifyMyerpbasicpay", true);
			basicpay.click(); 
			basicpay.clear();
			basicpay.sendKeys("14000");
		}
		public void VerifyMyerpDOB5() {
			Assert.assertTrue(dob.isEnabled(),"dob field is enabled");		 
			Reporter.log("verifyMyerpdob", true);
			dob.click(); 
			dob.clear();
			dob.sendKeys("27/10/1998");
		}
		public void VerifyMyerpJoiningDate5() {
			Assert.assertTrue(joiningdate.isEnabled(),"joiningdate field is enabled");		 
			Reporter.log("verifyMyerpjoiningdate", true);
			joiningdate.click(); 
			joiningdate.clear();
			joiningdate.sendKeys("01/01/2023");
		}
		public void VerifyMyerpEmployeeActiveCHK5() throws InterruptedException {
			Thread.sleep(1000);
			Assert.assertTrue(eactivechk.isEnabled(),"eactivechk field is enabled");		 
			Reporter.log("verifyMyerpeactivechk", true);
			eactivechk.click(); 
		}
		public void VerifyMyerpEmployeeSubmitBtn5() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(ebtnsubmit.isEnabled(),"ebtnsubmitfield is enabled");		 
			Reporter.log("verifyMyerpebtnsubmit", true);
			ebtnsubmit.click(); 
		}
		public void VerifyMyerpEmployeeSubmitOKBtn5() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(ebtnsubmitok.isEnabled(),"ebtnsubmitok is enabled");		 
			Reporter.log("verifyMyerpebtnsubmitok", true);
			ebtnsubmitok.click();
		}
		public void VerifyMyerpBackbtn6() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(backbtn.isEnabled(),"backbtn field is enabled");		 
			Reporter.log("verifyMyerpbackbtn", true);
			backbtn.click(); 
		}

		public void verifyMyerpPageNavigation1() {
			Assert.assertTrue(pagena.isEnabled(),"PageNavigation is Enable");
			Reporter.log("verifyMyerppagena",true);
			pagena.click();
		}
//Transporter Form	
		
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
		sc.selectByVisibleText("Bugfix Gas ");
	}

	public void VerifyMyerpTcompanyCode() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tcode.isEnabled(),"tcode field is enabled");		 
		Reporter.log("verifyMyerptcode", true);
		tcode.sendKeys("202054");

	}
	public void VerifyMyerpTName() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tname.isEnabled(),"tname field is enabled");		 
		Reporter.log("verifyMyerptname", true);
		tname.click();
		tname.sendKeys("Bugfix Gas");
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
		tcontanctdetail.sendKeys("8828420045");
	}
	public void VerifyMyerpTAddress() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(taddress1.isEnabled(),"taddress1 field is enabled");		 
		Reporter.log("verifyMyerptaddress1", true);
		taddress1.click(); 
		taddress1.sendKeys("Virar");		 
	}
	public void VerifyMyerpTSelectCity() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(tselectcity.isEnabled(),"tselectcity field is enabled");		 
		Reporter.log("verifyMyerptselectcity", true);
		tselectcity.click(); 
		tselectcity.sendKeys("Virar");		 
	}
	public void VerifyMyerpTActveChk() throws InterruptedException {
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
	public void VerifyMyerpBackbtn4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(backbtn.isEnabled(),"backbtn field is enabled");		 
		Reporter.log("verifyMyerpbackbtn", true);
		backbtn.click(); 
	}
//commercial Party From
	
	public void VerifyMyerpCommercialPartyForm() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(commpform.isEnabled(),"commpform field is enabled");		 
		Reporter.log("verifyMyerpcommpform", true);
		commpform.click(); 
	}
	public void VerifyMyerpConsumerNumber() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpconsumernum.isEnabled(),"cpconsumernum field is enabled");		 
		Reporter.log("verifyMyerpcpconsumernum", true);
		cpconsumernum.click();
		cpconsumernum.sendKeys("5001");
	}

	public void VerifyMyerpCPBusinessname() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpbusinessname.isEnabled(),"cpbusinessname field is enabled");		 
		Reporter.log("verifyMyerpcpbusinessname", true);
		cpbusinessname.click(); 
		cpbusinessname.sendKeys("SURYA HOTEL");
	}

	public void VerifyMyerpCPSelectBusinessType() throws InterruptedException {
		Select cpbt = new Select(cpselectbussinesstype);
		Thread.sleep(1000);
		Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
		Assert.assertFalse(cpselectbussinesstype.isSelected());
		cpbt.selectByVisibleText("Hotel_Restaurent");
	}

	public void VerifyMyerpCPSelectGroup() throws InterruptedException {
		Select spg = new Select(cpselectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(cpselectgroup.isSelected());
		spg.selectByVisibleText("SUNDRY DEBTORS");
	}
	public void VerifyMyerpCPAddress() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
		Reporter.log("verifyMyerpcpaddress1", true);
		cpaddress1.click(); 
		cpaddress1.sendKeys("Virar");
	}
	public void VerifyMyerpCPSelectState() throws InterruptedException {
		Select spss = new Select(cpselectstate);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
		Assert.assertFalse(cpselectstate.isSelected());
		spss.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpbillingtype1() throws InterruptedException {
		Select spss = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"billingtype is displayed");
		Assert.assertFalse(billingtype.isSelected());
		spss.selectByVisibleText("Daily");
	}

	public void VerifyMyerpCPActivechk() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechk is enabled");		 
		Reporter.log("verifyMyerpcpactivechk", true);
		cpactivechk.click();
	}
	public void VerifyMyerpCPProduct() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
		Reporter.log("verifyMyerpcpproduct", true);
		cpproduct.click(); 
		cpproduct.sendKeys("19 KG");
	}
	public void VerifyMyerpCPPQantity() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
		Reporter.log("verifyMyerpcpquantity", true);
		cpquantity.click(); 
		cpquantity.sendKeys("1");
	}
	public void VerifyMyerpCPPOpeningCycle() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpopeningcycle.isEnabled(),"cpopeningcycle field is enabled");		 
		Reporter.log("verifyMyerpcpopeningcycle", true);
		cpopeningcycle.click(); 
		cpopeningcycle.sendKeys("0");
	}
	public void VerifyMyerpCPSubmitBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpsubmitbtn.isEnabled(),"cpsubmitbtn field is enabled");		 
		Reporter.log("verifyMyerpcpsubmitbtn", true);
		cpsubmitbtn.click(); 
		Thread.sleep(500);
		if (isAlertPresent4(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent4(WebDriver driver) throws
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
	
	public void VerifyMyerpConsumerNumber2() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpconsumernum.isEnabled(),"cpconsumernum field is enabled");		 
		Reporter.log("verifyMyerpcpconsumernum", true);
		cpconsumernum.click(); 
		cpconsumernum.clear();
		cpconsumernum.sendKeys("5002");
	}
	public void VerifyMyerpCPBusinessname2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpbusinessname.isEnabled(),"cpbusinessname field is enabled");		 
		Reporter.log("verifyMyerpcpbusinessname", true);
		cpbusinessname.click(); 
		cpbusinessname.clear();
		cpbusinessname.sendKeys("SAMAR HOTEL");
	}
	public void VerifyMyerpCPSelectBusinessType2() throws InterruptedException {
		Select cpbt = new Select(cpselectbussinesstype);
		Thread.sleep(1000);
		Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
		Assert.assertFalse(cpselectbussinesstype.isSelected());
		cpselectbussinesstype.clear();
		cpbt.selectByVisibleText("Hotel_Restaurent");
	}
	public void VerifyMyerpCPSelectGroup2() throws InterruptedException {
		Select spg = new Select(cpselectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(cpselectgroup.isSelected());
		cpselectgroup.clear();
		spg.selectByVisibleText("SUNDRY DEBTORS");
	}
	public void VerifyMyerpCPAddress12() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
		Reporter.log("verifyMyerpcpaddress1", true);
		cpaddress1.click(); 
		cpaddress1.clear();
		cpaddress1.sendKeys("Virar");
	}
	public void VerifyMyerpCPSelectState2() throws InterruptedException {
		Select spss = new Select(cpselectstate);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
		Assert.assertFalse(cpselectstate.isSelected());
		cpselectstate.clear();
		spss.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpbillingtype2() throws InterruptedException {
		Select spss = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"billingtype is displayed");
		Assert.assertFalse(billingtype.isSelected());
		billingtype.clear();
		spss.selectByVisibleText("Monthly");
	}
	public void VerifyMyerpCPActivechk2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechk is enabled");		 
		Reporter.log("verifyMyerpcpactivechk", true);
		cpactivechk.click();
	}
	public void VerifyMyerpCPProduct2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
		Reporter.log("verifyMyerpcpproduct", true);
		cpproduct.click(); 
		cpproduct.clear();
		cpproduct.sendKeys("19 KG");
	}
	public void VerifyMyerpCPPQantity2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
		Reporter.log("verifyMyerpcpquantity", true);
		cpquantity.click(); 
		cpquantity.clear();
		cpquantity.sendKeys("1");
	}
	public void VerifyMyerpCPPOpeningCycle2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpopeningcycle.isEnabled(),"cpopeningcycle field is enabled");		 
		Reporter.log("verifyMyerpcpopeningcycle", true);
		cpopeningcycle.click(); 
		cpopeningcycle.sendKeys("0");
	}
	public void VerifyMyerpCPSubmitBtn2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpsubmitbtn.isEnabled(),"cpsubmitbtn field is enabled");		 
		Reporter.log("verifyMyerpcpsubmitbtn", true);
		cpsubmitbtn.click(); 
		Thread.sleep(500);
		if (isAlertPresent4(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent21(WebDriver driver) throws
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

	public void VerifyMyerpConsumerNumber3() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpconsumernum.isEnabled(),"cpconsumernum field is enabled");		 
		Reporter.log("verifyMyerpcpconsumernum", true);
		cpconsumernum.click(); 
		cpconsumernum.clear();
		cpconsumernum.sendKeys("5003");
	}
	public void VerifyMyerpCPBusinessname3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpbusinessname.isEnabled(),"cpbusinessname field is enabled");		 
		Reporter.log("verifyMyerpcpbusinessname", true);
		cpbusinessname.click(); 
		cpbusinessname.clear();
		cpbusinessname.sendKeys("MUKESH TEA CENTER");
	}

	public void VerifyMyerpCPSelectBusinessType3() throws InterruptedException {
		Select cpbt = new Select(cpselectbussinesstype);
		Thread.sleep(1000);
		Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
		Assert.assertFalse(cpselectbussinesstype.isSelected());
		cpselectbussinesstype.clear();
		cpbt.selectByVisibleText("Hotel_Restaurent");
	}

	public void VerifyMyerpCPSelectGroup3() throws InterruptedException {
		Select spg = new Select(cpselectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(cpselectgroup.isSelected());
		cpselectgroup.clear();
		spg.selectByVisibleText("SUNDRY DEBTORS");
	}
	public void VerifyMyerpCPAddress3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
		Reporter.log("verifyMyerpcpaddress1", true);
		cpaddress1.click(); 
		cpaddress1.clear();
		cpaddress1.sendKeys("Virar");
	}
	public void VerifyMyerpCPSelectState3() throws InterruptedException {
		Select spss = new Select(cpselectstate);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
		Assert.assertFalse(cpselectstate.isSelected());
		cpselectstate.clear();
		spss.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpbillingtype3() throws InterruptedException {
		Select spss = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"billingtype is displayed");
		Assert.assertFalse(billingtype.isSelected());
		billingtype.clear();
		spss.selectByVisibleText("FORTHNIGHT");
	}
	public void VerifyMyerpCPActivechk3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechk is enabled");		 
		Reporter.log("verifyMyerpcpactivechk", true);
		cpactivechk.click();
	}
	public void VerifyMyerpCPProduct3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
		Reporter.log("verifyMyerpcpproduct", true);
		cpproduct.click(); 
		cpproduct.clear();
		cpproduct.sendKeys("19 KG");
	}
	public void VerifyMyerpCPPQantity3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
		Reporter.log("verifyMyerpcpquantity", true);
		cpquantity.click(); 
		cpquantity.clear();
		cpquantity.sendKeys("1");
	}
	public void VerifyMyerpCPPOpeningCycle3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpopeningcycle.isEnabled(),"cpopeningcycle field is enabled");		 
		Reporter.log("verifyMyerpcpopeningcycle", true);
		cpopeningcycle.click(); 
		cpopeningcycle.sendKeys("0");
	}
	public void VerifyMyerpCPSubmitBtn3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpsubmitbtn.isEnabled(),"cpsubmitbtn field is enabled");		 
		Reporter.log("verifyMyerpcpsubmitbtn", true);
		cpsubmitbtn.click(); 
		Thread.sleep(500);
		if (isAlertPresent3(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent3(WebDriver driver) throws
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

	public void VerifyMyerpConsumerNumber4() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpconsumernum.isEnabled(),"cpconsumernum field is enabled");		 
		Reporter.log("verifyMyerpcpconsumernum", true);
		cpconsumernum.click(); 
		cpconsumernum.clear();
		cpconsumernum.sendKeys("5004");
	}
	public void VerifyMyerpCPBusinessname4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpbusinessname.isEnabled(),"cpbusinessname field is enabled");		 
		Reporter.log("verifyMyerpcpbusinessname", true);
		cpbusinessname.click(); 
		cpbusinessname.clear();
		cpbusinessname.sendKeys("DINESH DHABA");
	}
	public void VerifyMyerpCPSelectBusinessType4() throws InterruptedException {
		Select cpbt = new Select(cpselectbussinesstype);
		Thread.sleep(1000);
		Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
		Assert.assertFalse(cpselectbussinesstype.isSelected());
		cpselectbussinesstype.clear();
		cpbt.selectByVisibleText("Hotel_Restaurent");
	}

	public void VerifyMyerpCPSelectGroup4() throws InterruptedException {
		Select spg = new Select(cpselectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(cpselectgroup.isSelected());
		cpselectgroup.clear();
		spg.selectByVisibleText("SUNDRY DEBTORS");
	}
	public void VerifyMyerpCPAddress4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
		Reporter.log("verifyMyerpcpaddress1", true);
		cpaddress1.click(); 
		cpaddress1.clear();
		cpaddress1.sendKeys("Virar");
	}
	public void VerifyMyerpCPSelectState4() throws InterruptedException {
		Select spss = new Select(cpselectstate);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
		Assert.assertFalse(cpselectstate.isSelected());
		cpselectstate.clear();
		spss.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpbillingtype4() throws InterruptedException {
		Select spss = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"billingtype is displayed");
		Assert.assertFalse(billingtype.isSelected());
		billingtype.clear();
		spss.selectByVisibleText("custom");
	}
	public void VerifyMyerpCPActivechk4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechk is enabled");		 
		Reporter.log("verifyMyerpcpactivechk", true);
		cpactivechk.click();
	}
	public void VerifyMyerpCPProduct4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
		Reporter.log("verifyMyerpcpproduct", true);
		cpproduct.click(); 
		cpproduct.clear();
		cpproduct.sendKeys("19 KG");
	}
	public void VerifyMyerpCPPQantity4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
		Reporter.log("verifyMyerpcpquantity", true);
		cpquantity.click(); 
		cpquantity.clear();
		cpquantity.sendKeys("1");
	}
	public void VerifyMyerpCPPOpeningCycle4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpopeningcycle.isEnabled(),"cpopeningcycle field is enabled");		 
		Reporter.log("verifyMyerpcpopeningcycle", true);
		cpopeningcycle.click(); 
		cpopeningcycle.sendKeys("0");
	}
	public void VerifyMyerpCPSubmitBtn4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpsubmitbtn.isEnabled(),"cpsubmitbtn field is enabled");		 
		Reporter.log("verifyMyerpcpsubmitbtn", true);
		cpsubmitbtn.click(); 
		Thread.sleep(500);
		if (isAlertPresent21(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent2(WebDriver driver) throws
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

	public void VerifyMyerpConsumerNumber5() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpconsumernum.isEnabled(),"cpconsumernum field is enabled");		 
		Reporter.log("verifyMyerpcpconsumernum", true);
		cpconsumernum.click(); 
		cpconsumernum.clear();
		cpconsumernum.sendKeys("5005");
	}
	public void VerifyMyerpCPBusinessname5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpbusinessname.isEnabled(),"cpbusinessname field is enabled");		 
		Reporter.log("verifyMyerpcpbusinessname", true);
		cpbusinessname.click(); 
		cpbusinessname.clear();
		cpbusinessname.sendKeys("RAMESH BIRYANI SHOP");
	}

	public void VerifyMyerpCPSelectBusinessType5() throws InterruptedException {
		Select cpbt = new Select(cpselectbussinesstype);
		Thread.sleep(1000);
		Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
		Assert.assertFalse(cpselectbussinesstype.isSelected());
		cpselectbussinesstype.clear();
		cpbt.selectByVisibleText("Hotel_Restaurent");
	}

	public void VerifyMyerpCPSelectGroup5() throws InterruptedException {
		Select spg = new Select(cpselectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectgroup.isDisplayed(),"cpselectgroup is displayed");
		Assert.assertFalse(cpselectgroup.isSelected());
		cpselectgroup.clear();
		spg.selectByVisibleText("SUNDRY DEBTORS");
	}
	public void VerifyMyerpCPAddress5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
		Reporter.log("verifyMyerpcpaddress1", true);
		cpaddress1.click(); 
		cpaddress1.clear();
		cpaddress1.sendKeys("Virar");
	}
	public void VerifyMyerpCPSelectState5() throws InterruptedException {
		Select spss = new Select(cpselectstate);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
		Assert.assertFalse(cpselectstate.isSelected());
		cpselectstate.clear();
		spss.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpbillingtype5() throws InterruptedException {
		Select spss = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"billingtype is displayed");
		Assert.assertFalse(billingtype.isSelected());
		billingtype.clear();
		spss.selectByVisibleText("Immediate");
	}
	public void VerifyMyerpCPActivechk5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechk is enabled");		 
		Reporter.log("verifyMyerpcpactivechk", true);
		cpactivechk.click();
	}
	public void VerifyMyerpCPProduct5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
		Reporter.log("verifyMyerpcpproduct", true);
		cpproduct.click(); 
		cpproduct.clear();
		cpproduct.sendKeys("19 KG");
	}
	public void VerifyMyerpCPPQantity5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
		Reporter.log("verifyMyerpcpquantity", true);
		cpquantity.click(); 
		cpquantity.clear();
		cpquantity.sendKeys("1");
	}
	public void VerifyMyerpCPPOpeningCycle5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpopeningcycle.isEnabled(),"cpopeningcycle field is enabled");		 
		Reporter.log("verifyMyerpcpopeningcycle", true);
		cpopeningcycle.click(); 
		cpopeningcycle.sendKeys("0");
	}
	public void VerifyMyerpCPSubmitBtn5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpsubmitbtn.isEnabled(),"cpsubmitbtn field is enabled");		 
		Reporter.log("verifyMyerpcpsubmitbtn", true);
		cpsubmitbtn.click(); 
		Thread.sleep(500);
		if (isAlertPresent(driver)) { System.out.println("alert is present");

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
	
	public void VerifyMyerpBackbtn5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(backbtn.isEnabled(),"backbtn field is enabled");		 
		Reporter.log("verifyMyerpbackbtn", true);
		backbtn.click(); 
	}
	public void verifyMyerpPageNavigation3() {
		Assert.assertTrue(pagena.isEnabled(),"PageNavigation is Enable");
		Reporter.log("verifyMyerppagena",true);
		pagena.click();
	}

// Services Form	
	
	public void verifyMyerpServices() {
		Assert.assertTrue(services.isEnabled(),"Services is Enable");
		Reporter.log("verifyMyerpservices",true);
		services.click();
	}
	public void verifyMyerpServiceDescription() {
		Assert.assertTrue(servicedescription.isEnabled(),"ServiceDescription is Enable");
		Reporter.log("verifyMyerpservicedescription",true);
		servicedescription.sendKeys("STAMP DUTY");
	}
	public void verifyMyerpServicestitle() {
		Assert.assertTrue(servicetitile.isEnabled(),"Servicestitle is Enable");
		Reporter.log("verifyMyerpservicetitile",true);
		servicetitile.sendKeys("STAMP DUTY");
	}
	public void verifyMyerpServicesAlias() {
		Assert.assertTrue(servicealiasname.isEnabled(),"servicealiasname is Enable");
		Reporter.log("verifyMyerpservicealiasname",true);
		servicealiasname.sendKeys("STAMP DUTY");
	}
	public void verifyMyerpServicescost() {
		Assert.assertTrue(servicecost.isEnabled(),"Servicescost is Enable");
		Reporter.log("verifyMyerpservicecost",true);
		servicecost.sendKeys("100");
	}
	public void verifyMyerpselectcom() throws InterruptedException {
		Select sc = new Select(selectcom);
		Thread.sleep(1000);
		Assert.assertFalse(selectcom.isDisplayed(),"selectcom is displayed");
		Assert.assertFalse(selectcom.isSelected());
		sc.selectByVisibleText("Bugfix Gas ");

	}
	public void verifyMyerpSelectselecttype() throws InterruptedException {
		Select su = new Select(selecttype);
		Thread.sleep(1000);
		Assert.assertFalse(selecttype.isDisplayed(),"selecttype is displayed");
		Assert.assertFalse(selecttype.isSelected());
		su.selectByVisibleText("NON-REFUNDABLE-INCOME");

	}
	public void verifyMyerpServiceshsncod() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(servicehsnco.isEnabled(),"servicehsnco is Enable");
		Reporter.log("verifyMyerpservicehsnco",true);
		servicehsnco.sendKeys("22859");
	}
	public void verifyMyerpServicesactiv() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(serviceactivbtn.isEnabled(),"serviceactivbtn is Enable");
		Reporter.log("verifyMyerpserviceactivbtn",true);
		serviceactivbtn.click();
	}
	public void verifyMyerpServicesisgst() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(serviceigst.isEnabled(),"serviceigst is Enable");
		Reporter.log("verifyMyerpserviceigst",true);
		serviceigst.click();
	}
	public void verifyMyerpUpdateGst() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(updategst.isEnabled(),"updategst is Enable");
		Reporter.log("verifyMyerpupdategst",true);
		updategst.click();
	}
	public void verifyMyerpGstTextrate1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(gsttextrate1.isEnabled(),"gsttextrate1 is Enable");
		Reporter.log("verifyMyerpgsttextrate1",true);
		gsttextrate1.sendKeys("0");
	}
	public void verifyMyerpGstTestRate2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(gsttestrate2.isEnabled(),"gsttestrate2 is Enable");
		Reporter.log("verifyMyerpgsttestrate2",true);
		gsttestrate2.sendKeys("0");
	}
	public void verifyMyerpDate() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(date.isEnabled(),"date is Enable");
		Reporter.log("verifyMyerpdate",true);
		date.click();
		date.clear();
		date.sendKeys("01/04/2022");
	}
	public void verifyMyerpSaveGstbtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(savebtn.isEnabled(),"savebtn is Enable");
		Reporter.log("verifyMyerpsavebtn",true);
		savebtn.click();
	}
	public void verifyMyerpSubmit() {
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is Enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void verifyMyerpOKButton4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(okbtn.isEnabled(),"okbtn is Enable");
		Reporter.log("verifyMyerpokbtn",true);
		okbtn.click();
	}
	
	public void verifyMyerpServiceDescription2() {
		Assert.assertTrue(servicedescription.isEnabled(),"servicedescription is Enable");
		Reporter.log("verifyMyerpservicedescription",true);
		servicedescription.clear();
		servicedescription.sendKeys("INSTALLATION CHARGE");
	}
	public void verifyMyerpServicestitle2() {
		Assert.assertTrue(servicetitile.isEnabled(),"servicetitile is Enable");
		Reporter.log("verifyMyerpservicetitile",true);
		servicetitile.clear();
		servicetitile.sendKeys("INSTALLATION CHARGE");
	}
	public void verifyMyerpServicesAlias2() {
		Assert.assertTrue(servicealiasname.isEnabled(),"servicealiasname is Enable");
		Reporter.log("verifyMyerpservicealiasname",true);
		servicealiasname.clear();
		servicealiasname.sendKeys("INSTALLATION CHARGE");
	}
	public void verifyMyerpServicescost2() {
		Assert.assertTrue(servicecost.isEnabled(),"servicecost is Enable");
		Reporter.log("verifyMyerpservicecost",true);
		servicecost.clear();
		servicecost.sendKeys("100");
	}
	public void verifyMyerpselectcom2() throws InterruptedException {
		Select sc = new Select(selectcom);
		Thread.sleep(1000);
		Assert.assertFalse(selectcom.isDisplayed(),"selectcom is displayed");
		Assert.assertFalse(selectcom.isSelected());
		selectcom.clear();
		sc.selectByVisibleText("Bugfix Gas ");

	}
	public void verifyMyerpSelectselecttype2() throws InterruptedException {
		Select su = new Select(selecttype);
		Thread.sleep(1000);
		Assert.assertFalse(selecttype.isDisplayed(),"selecttype is displayed");
		Assert.assertFalse(selecttype.isSelected());
		selecttype.clear();
		su.selectByVisibleText("NON-REFUNDABLE-INCOME");

	}
	public void verifyMyerpServiceshsncod2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(servicehsnco.isEnabled(),"servicehsnco is Enable");
		Reporter.log("verifyMyerpservicehsnco",true);
		servicehsnco.clear();
		servicehsnco.sendKeys("228519");
	}
	public void verifyMyerpServicesactiv2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(serviceactivbtn.isEnabled(),"serviceactivbtn is Enable");
		Reporter.log("verifyMyerpserviceactivbtn",true);
		serviceactivbtn.click();
	}
	public void verifyMyerpServicesisgst2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(serviceigst.isEnabled(),"Servicesisgst is Enable");
		Reporter.log("verifyMyerpserviceigst",true);
		serviceigst.click();
	}
	public void verifyMyerpUpdateGst2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(updategst.isEnabled(),"updategst is Enable");
		Reporter.log("verifyMyerpupdategst",true);
		updategst.click();
	}
	public void verifyMyerpGstTextrate2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(gsttextrate1.isEnabled(),"gsttextrate1 is Enable");
		Reporter.log("verifyMyerpgsttextrate1",true);
		gsttextrate1.sendKeys("2.5");
	}
	public void verifyMyerpGstTestRate22() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(gsttestrate2.isEnabled(),"gsttestrate2 is Enable");
		Reporter.log("verifyMyerpgsttestrate2",true);
		gsttestrate2.sendKeys("2.5");
	}
	public void verifyMyerpDate2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(date.isEnabled(),"date is Enable");
		Reporter.log("verifyMyerpdate",true);
		date.click();
		date.clear();
		date.sendKeys("01/04/2022");
	}
	public void verifyMyerpSaveGstbtn2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(savebtn.isEnabled(),"savebtn is Enable");
		Reporter.log("verifyMyerpsavebtn",true);
		savebtn.click();
	}

	public void verifyMyerpSubmit2() {
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is Enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void verifyMyerpOKButton2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(okbtn.isEnabled(),"okbtn is Enable");
		Reporter.log("verifyMyerpokbtn",true);
		okbtn.click();

	}
	
	public void verifyMyerpServiceDescription3() {
		Assert.assertTrue(servicedescription.isEnabled(),"servicedescription is Enable");
		Reporter.log("verifyMyerpservicedescription",true);
		servicedescription.clear();
		servicedescription.sendKeys("Mechanical Service");
	}
	public void verifyMyerpServicestitle3() {
		Assert.assertTrue(servicetitile.isEnabled(),"servicetitile is Enable");
		Reporter.log("verifyMyerpservicetitile",true);
		servicetitile.clear();
		servicetitile.sendKeys("Mechanical Service");
	}
	public void verifyMyerpServicesAlias3() {
		Assert.assertTrue(servicealiasname.isEnabled(),"servicealiasname is Enable");
		Reporter.log("verifyMyerpservicealiasname",true);
		servicealiasname.clear();
		servicealiasname.sendKeys("Mechanical Service");
	}
	public void verifyMyerpServicescost3() {
		Assert.assertTrue(servicecost.isEnabled(),"servicecost is Enable");
		Reporter.log("verifyMyerpservicecost",true);
		servicecost.clear();
		servicecost.sendKeys("236");
	}
	public void verifyMyerpselectcom3() throws InterruptedException {
		Select sc = new Select(selectcom);
		Thread.sleep(1000);
		Assert.assertFalse(selectcom.isDisplayed(),"selectcom is displayed");
		Assert.assertFalse(selectcom.isSelected());
		selectcom.clear();
		sc.selectByVisibleText("Bugfix Gas ");

	}
	public void verifyMyerpSelectselecttype3() throws InterruptedException {
		Select su = new Select(selecttype);
		Thread.sleep(1000);
		Assert.assertFalse(selecttype.isDisplayed(),"selecttype is displayed");
		Assert.assertFalse(selecttype.isSelected());
		selecttype.clear();
		su.selectByVisibleText("NON-REFUNDABLE-INCOME");

	}
	public void verifyMyerpServiceshsncod3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(servicehsnco.isEnabled(),"servicehsnco is Enable");
		Reporter.log("verifyMyerpservicehsnco",true);
		servicehsnco.clear();
		servicehsnco.sendKeys("28519");
	}
	public void verifyMyerpServicesactiv3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(serviceactivbtn.isEnabled(),"serviceactivbtn is Enable");
		Reporter.log("verifyMyerpserviceactivbtn",true);
		serviceactivbtn.click();
	}
	public void verifyMyerpServicesisgst3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(serviceigst.isEnabled(),"serviceigst is Enable");
		Reporter.log("verifyMyerpserviceigst",true);
		serviceigst.click();
	}
	public void verifyMyerpUpdateGst3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(updategst.isEnabled(),"updategst is Enable");
		Reporter.log("verifyMyerpupdategst",true);
		updategst.click();
	}
	public void verifyMyerpGstTextrate3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(gsttextrate1.isEnabled(),"gsttextrate1 is Enable");
		Reporter.log("verifyMyerpgsttextrate1",true);
		gsttextrate1.sendKeys("2.5");
	}
	public void verifyMyerpGstTestRate33() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(gsttestrate2.isEnabled(),"gsttestrate2 is Enable");
		Reporter.log("verifyMyerpgsttestrate2",true);
		gsttestrate2.sendKeys("2.5");
	}
	public void verifyMyerpDate3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(date.isEnabled(),"date is Enable");
		Reporter.log("verifyMyerpdate",true);
		date.click();
		date.clear();
		date.sendKeys("01/04/2022");
	}
	public void verifyMyerpSaveGstbtn3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(savebtn.isEnabled(),"savebtn is Enable");
		Reporter.log("verifyMyerpsavebtn",true);
		savebtn.click();
	}
	public void verifyMyerpSubmit3() {
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is Enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void verifyMyerpOKButton3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(okbtn.isEnabled(),"okbtn is Enable");
		Reporter.log("verifyMyerpokbtn",true);
		okbtn.click();

	}
	
	public void VerifyMyerpBackbtn7() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(backbtn.isEnabled(),"backbtn field is enabled");		 
		Reporter.log("verifyMyerpbackbtn", true);
		backbtn.click(); 
	}

	public void verifyMyerpPageNavigation2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pagena.isEnabled(),"PageNavigation is Enable");
		Reporter.log("verifyMyerppagena",true);
		pagena.click();

	}
//Godown Transaction Form	
	
	public void verifyMyerpGodownTransaction() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(godowntransaction.isEnabled(),"godowntransaction is Enable");
		Reporter.log("verifyMyerpgodowntransaction",true);
		godowntransaction.click();
	}
	public void verifyMyerpGodownName() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(godownname.isEnabled(),"godownname is Enable");
		Reporter.log("verifyMyerpgodownname",true);
		godownname.sendKeys("VIRAR EAST");
	}
	public void verifyMyerpGodownAddress() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(godownaddress.isEnabled(),"godownaddress is Enable");
		Reporter.log("verifyMyerpgodownaddress",true);
		godownaddress.sendKeys("VIRAR East");
	}
	public void verifyMyerpCheckActive()throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(chekactive.isEnabled(),"chekactive is Enable");
		Reporter.log("verifyMyerpchekactive",true);
		chekactive.click();
	}
	public void verifyMyerpSubmitBtn22()throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is Enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void verifyMyerpOKButton22() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(okbtn.isEnabled(),"okbtn is Enable");
		Reporter.log("verifyMyerpokbtn",true);
		okbtn.click();

	}
	
	public void verifyMyerpGodownName1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(godownname.isEnabled(),"godownname is Enable");
		Reporter.log("verifyMyerpgodownname",true);
		godownname.sendKeys("VIRAR WEST");
	}
	public void verifyMyerpGodownAddress1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(godownaddress.isEnabled(),"godownaddress is Enable");
		Reporter.log("verifyMyerpgodownaddress",true);
		godownaddress.sendKeys("VIRAR West");
	}
	public void verifyMyerpCheckActive1()throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(chekactive.isEnabled(),"chekactive is Enable");
		Reporter.log("verifyMyerpchekactive",true);
		chekactive.click();
	}
	public void verifyMyerpSubmitBtn1()throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is Enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void verifyMyerpOKButton1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(okbtn.isEnabled(),"okbtn is Enable");
		Reporter.log("verifyMyerpokbtn",true);
		okbtn.click();
	}
	public void VerifyMyerpBackbtn8() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(backbtn.isEnabled(),"backbtn field is enabled");		 
		Reporter.log("verifyMyerpbackbtn", true);
		backbtn.click(); 
	}
	public void verifyMyerpPageNavigation5() {
		Assert.assertTrue(pagena.isEnabled(),"PageNavigation is Enable");
		Reporter.log("verifyMyerppagena",true);
		pagena.click();

	}
//User Form	
	
	public void verifyMyerpUserMaster() {
		Assert.assertTrue(usermaster.isEnabled(),"Usermaster is Enable");
		Reporter.log("verifyMyerpusermaster",true);
		usermaster.click();

	}
	public void verifyMyerpSelectEmployee() throws InterruptedException {
		Thread.sleep(1500);
		Select sc = new Select(selectempy);
		Thread.sleep(1000);
		Assert.assertFalse(selectempy.isDisplayed(),"selectempy is displayed");
		Assert.assertFalse(selectempy.isSelected());
		sc.selectByVisibleText("MANOJ KUMAR : USER");

	}
	public void verifyMyerpSelectUserType() throws InterruptedException {
		Thread.sleep(400);
		Select su = new Select(selectusertyp);
		Thread.sleep(1000);
		Assert.assertTrue(selectusertyp.isDisplayed(),"selectusertyp is displayed");
		Assert.assertFalse(selectusertyp.isSelected());
		su.selectByVisibleText("Both");

	}
	public void verifyMyerpSelectCompany() throws InterruptedException {
		Select su = new Select(selectcomp);
		Thread.sleep(1000);
		Assert.assertFalse(selectcomp.isDisplayed(),"selectcomp is displayed");
		Assert.assertFalse(selectcomp.isSelected());
		su.selectByVisibleText("Bugfix Gas ");

	}
	public void verifyMyerpUseridname()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(useridname.isEnabled(),"useridname is Enable");
		Reporter.log("verifyMyerpuseridname",true);
		useridname.sendKeys("manoj");

	}
	public void verifyMyerpUserpass()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(userpass.isEnabled(),"userpass is Enable");
		Reporter.log("verifyMyerpuserpass",true);
		userpass.sendKeys("manoj@123");
	}
	public void verifyMyerpUseremail()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(useremail.isEnabled(),"useremail is Enable");
		Reporter.log("verifyMyerpuseremail",true);
		useremail.sendKeys("evitasoftech12@gmail.com");
	}
	public void verifyMyerpUserMob()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(usermob.isEnabled(),"usermob is Enable");
		Reporter.log("verifyMyerpusermob",true);
		usermob.sendKeys("8828420054"); 
	}
	public void verifyMyerpcheckboxcl()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(checkboxcl.isEnabled(),"checkboxcl is Enable");
		Reporter.log("verifyMyerpcheckboxcl",true);
		checkboxcl.click();
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
	
	public void verifyMyerpSelectEmployee2() throws InterruptedException {
		Thread.sleep(2000);
		Select sc = new Select(selectempy);
		Thread.sleep(1000);
		Assert.assertFalse(selectempy.isDisplayed(),"selectempy is displayed");
		Assert.assertFalse(selectempy.isSelected());
		selectempy.clear();
		sc.selectByVisibleText("DEEPAK PARAMAR : Commercial Deliveryman");
	}
	public void verifyMyerpSelectUserType2() throws InterruptedException {
		Thread.sleep(400);
		Select su = new Select(selectusertyp);
		Thread.sleep(1000);
		Assert.assertTrue(selectusertyp.isDisplayed(),"selectusertyp is displayed");
		Assert.assertFalse(selectusertyp.isSelected());
		selectusertyp.clear();
		su.selectByVisibleText("Android");
	}
	public void verifyMyerpSelectCompany2() throws InterruptedException {
		Select su = new Select(selectcomp);
		Thread.sleep(1000);
		Assert.assertFalse(selectcomp.isDisplayed(),"selectcomp is displayed");
		Assert.assertFalse(selectcomp.isSelected());
		selectcomp.clear();
		su.selectByVisibleText("Bugfix Gas ");

	}
	public void verifyMyerpUseridname2()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(useridname.isEnabled(),"useridname is Enable");
		Reporter.log("verifyMyerpuseridname",true);
		useridname.clear();
		useridname.sendKeys("deepak");

	}
	public void verifyMyerpUserpass2()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(userpass.isEnabled(),"userpass is Enable");
		Reporter.log("verifyMyerpuserpass",true);
		userpass.clear();
		userpass.sendKeys("deepak@123");
	}
	public void verifyMyerpUseremail2()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(useremail.isEnabled(),"useremail is Enable");
		Reporter.log("verifyMyerpuseremail",true);
		useremail.sendKeys("evitasoftech@gmail.com");
	}
	public void verifyMyerpUserMob2()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(usermob.isEnabled(),"usermob is Enable");
		Reporter.log("verifyMyerpusermob",true);
		usermob.sendKeys("8828420054"); 
	}
	public void verifyMyerpcheckboxcl2()  throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(checkboxcl.isEnabled(),"checkboxcl is Enable");
		Reporter.log("verifyMyerpcheckboxcl",true);
		checkboxcl.click();
	}

	public void verifyMyerpsubmitbtn2()  throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is Enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void VerifySubmitOKBtn2() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(cdpsubmitokbtn.isEnabled(),"cdpsubmitokbtn is enabled");
		Reporter.log(" verifyMyerpcdpsubmitokbtn", true);
		cdpsubmitokbtn.click();
	}
	

}