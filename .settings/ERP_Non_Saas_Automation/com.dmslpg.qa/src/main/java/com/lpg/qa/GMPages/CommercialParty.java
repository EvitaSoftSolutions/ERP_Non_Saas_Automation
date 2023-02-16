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

public class CommercialParty {
	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
	@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;
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
	@FindBy (xpath="//button[@id='btnclear']") private WebElement cpclearbtn;
	@FindBy (xpath="//button[@id='btnDelete']") private WebElement cpdeletebtn;
	@FindBy (xpath="//button[@id='btnGet']") private WebElement cplistbtn;
	@FindBy (xpath="//a[@id='btnEdit']") private WebElement cpeditbtn;
	@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement cpyesupdateitbtn;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement cpupdatebtn;
	@FindBy (xpath="//button[@class='confirm']") private WebElement cpupdateokbtn;
	@FindBy (xpath="") private WebElement  cpexportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar; 



	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public CommercialParty(WebDriver driver) {
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
	public void VerifyMyerpCommercialPartyForm() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(commpform.isEnabled(),"commp form field is enabled");		 
		Reporter.log("verifyMyerpcommpform", true);
		commpform.click(); 
	}

	public void VerifyMyerpConsumerNumber1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpconsumernum.isEnabled(),"cpconsumernum field is enabled");		 
		Reporter.log("verifyMyerpcpconsumernum", true);
		cpconsumernum.click(); 
		cpconsumernum.sendKeys("5001");
	}

	public void VerifyMyerpCPBusinessname1() throws InterruptedException {
		Thread.sleep(0);
		Assert.assertTrue(cpbusinessname.isEnabled(),"cpbusinessname field is enabled");		 
		Reporter.log("verifyMyerpcpbusinessname", true);
		cpbusinessname.click(); 
		cpbusinessname.sendKeys("SURYA HOTEL");
	}

	public void VerifyMyerpCPSelectBusinessType1() throws InterruptedException {
		Select cpbt = new Select(cpselectbussinesstype);
		Thread.sleep(1000);
		Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
		Assert.assertFalse(cpselectbussinesstype.isSelected());
		cpbt.selectByVisibleText("Hotel_Restaurent");
	}

	public void VerifyMyerpCPSelectGroup1() throws InterruptedException {
		Select spg = new Select(cpselectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(cpselectgroup.isSelected());
		spg.selectByVisibleText("SUNDRY DEBTORS");
	}
	public void VerifyMyerpCPAddress11() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
		Reporter.log("verifyMyerpcpaddress1", true);
		cpaddress1.click(); 
		cpaddress1.sendKeys("Virar");
	}
	public void VerifyMyerpCPSelectState1() throws InterruptedException {
		Select spss = new Select(cpselectstate);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
		Assert.assertFalse(cpselectstate.isSelected());
		spss.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpCPSelectDistrict1() throws InterruptedException {
		Select spss = new Select(cpselectdistrict);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectdistrict.isDisplayed(),"cpselectdistrict is displayed");
		Assert.assertFalse(cpselectdistrict.isSelected());
		spss.selectByVisibleText("Palghar");
	}
	public void VerifyMyerpCPSelectTehsil1() throws InterruptedException {
		Select spss = new Select(cpselecttehsil);
		Thread.sleep(1000);
		Assert.assertFalse(cpselecttehsil.isDisplayed(),"cpselecttehsil is displayed");
		Assert.assertFalse(cpselecttehsil.isSelected());
		spss.selectByVisibleText("Vasai");
	}
	public void VerifyMyerpCPSelectCity1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpselectcity.isEnabled(),"cpselectcity field is enabled");		 
		Reporter.log("verifyMyerpcpselectcity", true);
		cpselectcity.click();
		cpselectcity.sendKeys("Virar");
	}
	public void VerifyMyerpCPPincode1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cppincode.isEnabled(),"cppincode field is enabled");		 
		Reporter.log("verifyMyerpcppincode", true);
		cppincode.click(); 
		cppincode.sendKeys("401303");
	}
	public void VerifyMyerpCPEmailId1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpemailid.isEnabled(),"cpemailid field is enabled");		 
		Reporter.log("verifyMyerpcpemailid", true);
		cpemailid.click(); 
		cpemailid.sendKeys("evitasoftech@gmail.com");
	}
	public void VerifyMyerpCPContactDetail1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpcontactdetail.isEnabled(),"cpcontactdetail field is enabled");		 
		Reporter.log("verifyMyerpcpcontactdetail", true);
		cpcontactdetail.click(); 
		cpcontactdetail.sendKeys("8828420045");
	}
	public void VerifyMyerpCPContactPersonName1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpcontactpersonname.isEnabled(),"cpcontactpersonname field is enabled");		 
		Reporter.log("verifyMyerpcpcontactpersonname", true);
		cpcontactpersonname.click(); 
		cpcontactpersonname.sendKeys("Mohan");
	}
	public void VerifyMyerpCPMobileNumber1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpmobilenumber.isEnabled(),"cpmobilenumber field is enabled");		 
		Reporter.log("verifyMyerpcpmobilenumber", true);
		cpmobilenumber.click(); 
		cpmobilenumber.sendKeys("8828420045");
	}


	public void VerifyMyerpbillingtype() throws InterruptedException {
		Select spss = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"billingtype is displayed");
		Assert.assertFalse(billingtype.isSelected());
		spss.selectByVisibleText("Daily");
	}
	public void VerifyMyerpCPActivechk1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechkfield is enabled");		 
		Reporter.log("verifyMyerpcpactivechk", true);
		cpactivechk.click();
	}
	public void VerifyMyerpCPProduct1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
		Reporter.log("verifyMyerpcpproduct", true);
		cpproduct.click(); 
		cpproduct.sendKeys("19 KG");
	}
	public void VerifyMyerpCPPQantity1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
		Reporter.log("verifyMyerpcpquantity", true);
		cpquantity.click(); 
		cpquantity.sendKeys("1");
	}
	public void VerifyMyerpCPPOpeningCycle1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpopeningcycle.isEnabled(),"cpopeningcycle field is enabled");		 
		Reporter.log("verifyMyerpcpopeningcycle", true);
		cpopeningcycle.click(); 
		cpopeningcycle.sendKeys("0");
	}
	public void VerifyMyerpCPClearBtn1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpclearbtn.isEnabled(),"cpclearbtn field is enabled");		 
		Reporter.log("verifyMyerpcpclearbtn", true);
		cpclearbtn.click();
		Thread.sleep(500);
		Thread.sleep(500);
		if (isAlertPresent6(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent6(WebDriver driver) throws
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
	public void VerifyMyerpCPAddress1() throws InterruptedException {
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
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechkfield is enabled");		 
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
	public void VerifyMyerpCPDeleteBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpdeletebtn.isEnabled(),"cpdeletebtn field is enabled");		 
		Reporter.log("verifyMyerpcpdeletebtn", true);
		cpdeletebtn.click();
		Thread.sleep(500);
		if (isAlertPresent5(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent5(WebDriver driver) throws
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

	public void VerifyandClickonPSearchbar1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("SURYA HOTEL");

		Thread.sleep(500);
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
		cpbusinessname.sendKeys("SAMAR HOTEL");
	}

	public void VerifyMyerpCPSelectBusinessType2() throws InterruptedException {
		Select cpbt = new Select(cpselectbussinesstype);
		Thread.sleep(1000);
		Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
		Assert.assertFalse(cpselectbussinesstype.isSelected());
		cpbt.selectByVisibleText("Hotel_Restaurent");
	}

	public void VerifyMyerpCPSelectGroup2() throws InterruptedException {
		Select spg = new Select(cpselectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(cpselectgroup.isSelected());
		spg.selectByVisibleText("SUNDRY DEBTORS");
	}
	public void VerifyMyerpCPAddress12() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
		Reporter.log("verifyMyerpcpaddress1", true);
		cpaddress1.click(); 
		cpaddress1.sendKeys("Virar");
	}
	public void VerifyMyerpCPSelectState2() throws InterruptedException {
		Select spss = new Select(cpselectstate);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
		Assert.assertFalse(cpselectstate.isSelected());
		spss.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpbillingtype2() throws InterruptedException {
		Select spss = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"billingtype is displayed");
		Assert.assertFalse(billingtype.isSelected());
		spss.selectByVisibleText("Monthly");
	}
	public void VerifyMyerpCPActivechk2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechkfield is enabled");		 
		Reporter.log("verifyMyerpcpactivechk", true);
		cpactivechk.click();
	}
	public void VerifyMyerpCPProduct2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
		Reporter.log("verifyMyerpcpproduct", true);
		cpproduct.click(); 
		cpproduct.sendKeys("19 KG");
	}
	public void VerifyMyerpCPPQantity2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
		Reporter.log("verifyMyerpcpquantity", true);
		cpquantity.click(); 
		cpquantity.sendKeys("1");
	}
	public void VerifyMyerpCPPOpeningCycle2() throws InterruptedException {
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

	public void VerifyMyerpCPGetListBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cplistbtn.isEnabled(),"cplistbtn field is enabled");		 
		Reporter.log("verifyMyerpcplistbtn", true);
		cplistbtn.click(); 
	}
	public void VerifyandClickonPSearchbar2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("SAMAR HOTEL");

		Thread.sleep(500);
	}
	public void VerifyMyerpCPEditBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpeditbtn.isEnabled(),"cpeditbtn field is enabled");		 
		Reporter.log("verifyMyerpcpeditbtn", true);
		Assert.assertFalse(cpeditbtn.isSelected());
		cpeditbtn.click(); 
	}
	public void VerifyMyerpCPYesUpdateBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpyesupdateitbtn.isEnabled(),"cpyesupdateitbtn field is enabled");		 
		Reporter.log("verifyMyerpcpyesupdateitbtn", true);
		Assert.assertFalse(cpyesupdateitbtn.isSelected());
		cpyesupdateitbtn.click(); 
	}
	public void VerifyMyerpCPUpdateBtn() throws InterruptedException {
		cpbusinessname.clear();
		cpbusinessname.sendKeys("SWAPNALI Restaurant");
		Thread.sleep(1000);
		Assert.assertTrue(cpupdatebtn.isEnabled(),"tupdatebtn field is enabled");		 
		Reporter.log("verifyMyerptupdatebtn", true);
		Assert.assertFalse(cpupdatebtn.isSelected());
		cpupdatebtn.click(); 
	}
	public void VerifyMyerpCPUpdateokBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpupdateokbtn.isEnabled(),"cpupdateokbtn field is enabled");		 
		Reporter.log("verifyMyerpcpupdateokbtn", true);
		Assert.assertFalse(cpupdateokbtn.isSelected());
		cpupdateokbtn.click(); 
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
		cpbusinessname.sendKeys("MUKESH TEA CENTER");
	}

	public void VerifyMyerpCPSelectBusinessType3() throws InterruptedException {
		Select cpbt = new Select(cpselectbussinesstype);
		Thread.sleep(1000);
		Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
		Assert.assertFalse(cpselectbussinesstype.isSelected());
		cpbt.selectByVisibleText("Hotel_Restaurent");
	}

	public void VerifyMyerpCPSelectGroup3() throws InterruptedException {
		Select spg = new Select(cpselectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(cpselectgroup.isSelected());
		spg.selectByVisibleText("SUNDRY DEBTORS");
	}
	public void VerifyMyerpCPAddress3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
		Reporter.log("verifyMyerpcpaddress1", true);
		cpaddress1.click(); 
		cpaddress1.sendKeys("Virar");
	}
	public void VerifyMyerpCPSelectState3() throws InterruptedException {
		Select spss = new Select(cpselectstate);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
		Assert.assertFalse(cpselectstate.isSelected());
		spss.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpbillingtype3() throws InterruptedException {
		Select spss = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"billingtype is displayed");
		Assert.assertFalse(billingtype.isSelected());
		spss.selectByVisibleText("FORTHNIGHT");
	}
	public void VerifyMyerpCPActivechk3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechkfield is enabled");		 
		Reporter.log("verifyMyerpcpactivechk", true);
		cpactivechk.click();
	}
	public void VerifyMyerpCPProduct3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
		Reporter.log("verifyMyerpcpproduct", true);
		cpproduct.click(); 
		cpproduct.sendKeys("19 KG");
	}
	public void VerifyMyerpCPPQantity3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
		Reporter.log("verifyMyerpcpquantity", true);
		cpquantity.click(); 
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
	public void VerifyMyerpCPGetListBtn3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cplistbtn.isEnabled(),"cplistbtn field is enabled");		 
		Reporter.log("verifyMyerpcplistbtn", true);
		cplistbtn.click(); 
	}
	public void VerifyandClickonPSearchbar3() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("MUKESH TEA CENTER");

		Thread.sleep(500);
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
		cpbusinessname.sendKeys("DINESH DHABA");
	}

	public void VerifyMyerpCPSelectBusinessType4() throws InterruptedException {
		Select cpbt = new Select(cpselectbussinesstype);
		Thread.sleep(1000);
		Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
		Assert.assertFalse(cpselectbussinesstype.isSelected());
		cpbt.selectByVisibleText("Hotel_Restaurent");
	}

	public void VerifyMyerpCPSelectGroup4() throws InterruptedException {
		Select spg = new Select(cpselectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(cpselectgroup.isSelected());
		spg.selectByVisibleText("SUNDRY DEBTORS");
	}
	public void VerifyMyerpCPAddress4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
		Reporter.log("verifyMyerpcpaddress1", true);
		cpaddress1.click(); 
		cpaddress1.sendKeys("Virar");
	}
	public void VerifyMyerpCPSelectState4() throws InterruptedException {
		Select spss = new Select(cpselectstate);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
		Assert.assertFalse(cpselectstate.isSelected());
		spss.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpbillingtype4() throws InterruptedException {
		Select spss = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"billingtype is displayed");
		Assert.assertFalse(billingtype.isSelected());
		spss.selectByVisibleText("custom");
	}
	public void VerifyMyerpCPActivechk4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechkfield is enabled");		 
		Reporter.log("verifyMyerpcpactivechk", true);
		cpactivechk.click();
	}
	public void VerifyMyerpCPProduct4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
		Reporter.log("verifyMyerpcpproduct", true);
		cpproduct.click(); 
		cpproduct.sendKeys("19 KG");
	}
	public void VerifyMyerpCPPQantity4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
		Reporter.log("verifyMyerpcpquantity", true);
		cpquantity.click(); 
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
		if (isAlertPresent2(driver)) { System.out.println("alert is present");

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

	public void VerifyMyerpCPGetListBtn4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cplistbtn.isEnabled(),"cplistbtn field is enabled");		 
		Reporter.log("verifyMyerpcplistbtn", true);
		cplistbtn.click(); 
	}
	public void VerifyandClickonPSearchbar4() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("DINESH DHABA");

		Thread.sleep(500);
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
		cpbusinessname.sendKeys("RAMESH BIRYANI SHOP");
	}

	public void VerifyMyerpCPSelectBusinessType5() throws InterruptedException {
		Select cpbt = new Select(cpselectbussinesstype);
		Thread.sleep(1000);
		Assert.assertTrue(cpselectbussinesstype.isDisplayed(),"cpselectbussinesstype is displayed");
		Assert.assertFalse(cpselectbussinesstype.isSelected());
		cpbt.selectByVisibleText("Hotel_Restaurent");
	}

	public void VerifyMyerpCPSelectGroup5() throws InterruptedException {
		Select spg = new Select(cpselectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(cpselectgroup.isSelected());
		spg.selectByVisibleText("SUNDRY DEBTORS");
	}
	public void VerifyMyerpCPAddress5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpaddress1.isEnabled(),"cpaddress1 field is enabled");		 
		Reporter.log("verifyMyerpcpaddress1", true);
		cpaddress1.click(); 
		cpaddress1.sendKeys("Virar");
	}
	public void VerifyMyerpCPSelectState5() throws InterruptedException {
		Select spss = new Select(cpselectstate);
		Thread.sleep(1000);
		Assert.assertFalse(cpselectstate.isDisplayed(),"cpselectstate is displayed");
		Assert.assertFalse(cpselectstate.isSelected());
		spss.selectByVisibleText("MAHARASHTRA");
	}
	public void VerifyMyerpbillingtype5() throws InterruptedException {
		Select spss = new Select(billingtype);
		Thread.sleep(1000);
		Assert.assertTrue(billingtype.isDisplayed(),"billingtype is displayed");
		Assert.assertFalse(billingtype.isSelected());
		spss.selectByVisibleText("Immediate");
	}
	public void VerifyMyerpCPActivechk5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpactivechk.isEnabled(),"cpactivechkfield is enabled");		 
		Reporter.log("verifyMyerpcpactivechk", true);
		cpactivechk.click();
	}
	public void VerifyMyerpCPProduct5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpproduct.isEnabled(),"cpproduct field is enabled");		 
		Reporter.log("verifyMyerpcpproduct", true);
		cpproduct.click(); 
		cpproduct.sendKeys("19 KG");
	}
	public void VerifyMyerpCPPQantity5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpquantity.isEnabled(),"cpquantity field is enabled");		 
		Reporter.log("verifyMyerpcpquantity", true);
		cpquantity.click(); 
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
	public void VerifyMyerpCPGetListBtn5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cplistbtn.isEnabled(),"cplistbtn field is enabled");		 
		Reporter.log("verifyMyerpcplistbtn", true);
		cplistbtn.click(); 
	}
	public void VerifyandClickonPSearchbar5() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("RAMESH BIRYANI SHOP");

		Thread.sleep(500);
	}
	public void VerifyMyerpTExportBtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpexportbtn.isEnabled(),"cpexportbtn field is enabled");		 
		Reporter.log("verifyMyerpcpexportbtn", true);
		Assert.assertFalse(cpexportbtn.isSelected());
		cpexportbtn.click();
	}

}