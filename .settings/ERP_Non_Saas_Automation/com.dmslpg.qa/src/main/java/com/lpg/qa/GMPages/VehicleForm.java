package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class VehicleForm {


	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena;
	@FindBy(xpath="//a[text()='Vehicle']")private WebElement vehicle;
	@FindBy(xpath="//select[@id='ddlTransporterName']")private WebElement transportername;
	@FindBy(xpath="//input[@id='txtVehicleNo']")private WebElement vehicleno;
	@FindBy(xpath="//input[@id='datepicker']")private WebElement modelyear;
	@FindBy(xpath="//input[@id='datepicker_Insurancefromdate']")private WebElement insurancefromdate;
	@FindBy(xpath="//input[@id='datepicker_InsuranceEnddate']")private WebElement insurancetodate;
	@FindBy(xpath="//select[@id='ddlDriverName']")private WebElement selectdriver;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement checkbox;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//input[@id='txtConnectionCategory']")private WebElement updatecategory; 
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement updateokbtn;
	@FindBy(xpath="//input[@id='btnExportToExcel']")private WebElement exportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;


	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public  VehicleForm(WebDriver driver) {
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
	public void verifyMyerpVehicleMaster() {
		Assert.assertTrue(vehicle.isEnabled(),"Vehicle is Enable");
		Reporter.log("verifyMyerpvehicle",true);
		vehicle.click();
	}

	public void verifyMyerpTransporterName() throws InterruptedException {
		Select tn = new Select(transportername);
		Thread.sleep(1000);
		Assert.assertFalse(transportername.isDisplayed(),"Selecttransportername is displayed");
		Assert.assertFalse(transportername.isSelected());
		tn.selectByVisibleText("ANITA GAS SERVICE");

	}
	public void verifyMyerpVehicleNo() {
		Assert.assertTrue(vehicleno.isEnabled(),"VehicleNo is Enable");
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
		Assert.assertFalse(selectdriver.isDisplayed(),"Selectdriver is displayed");
		Assert.assertFalse(selectdriver.isSelected());
		tn.selectByVisibleText("SURESH");

	}
	public void verifyMyerpCheckBox() {
		Assert.assertTrue(checkbox.isEnabled(),"CheckBox is Enable");
		Reporter.log("vedryfyMyerpcheckbox",true);
		checkbox.click();
	}
	public void verifyMyerpClearbutton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbutton is Enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();

	}
	public void verifyMyerpSubmitBtn() {
		Assert.assertTrue(submitbtn.isEnabled(),"SubmitBtn is Enable");
		Reporter.log("vedryfyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void verifyMyerpOKButton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(okbtn.isEnabled(),"OKButton is Enable");
		Reporter.log("verifyMyerpokbtn",true);
		okbtn.click();

	}
	public void VerifyandClickonPSearchbar1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("MH 02 BA 1237");

		Thread.sleep(500);
	}
	public void verifyMyerpEditbutton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(editbtn.isEnabled(),"Editbutton is Enable");
		Reporter.log("verifyMyerpeditbtn",true);
		editbtn.click();

	}
	public void verifyMyerpConfirmbutton() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(confirmbtn.isEnabled(),"Confirmbutton is Enable");
		Reporter.log("verifyMyerpconfirmbtn",true);
		confirmbtn.click();

	}
	public void verifyMyerpTransporterName1() throws InterruptedException {
		Select tn = new Select(transportername);
		Thread.sleep(1000);
		Assert.assertFalse(transportername.isDisplayed(),"Selecttransportername is displayed");
		Assert.assertFalse(transportername.isSelected());
		tn.selectByVisibleText("ANITA GAS SERVICE");

	}
	public void verifyMyerpVehicleNo1() {
		Assert.assertTrue(vehicleno.isEnabled(),"VehicleNo is Enable");
		Reporter.log("veryfyMyerpvehicleno", true);
		vehicleno.click();
		vehicleno.clear();
		vehicleno.sendKeys("MH 02 BA 1237");
	}

	public void verifyMyerpSelectdriver11() throws InterruptedException {
		Select tn = new Select(selectdriver);
		Thread.sleep(1000);
		Assert.assertFalse(selectdriver.isDisplayed(),"Selectdriver is displayed");
		Assert.assertFalse(selectdriver.isSelected());
		tn.selectByVisibleText("SURESH");

	}

	public void verifyMyerpUpdatebtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(updatebtn.isEnabled(),"updatebtn is Enable");
		Reporter.log("verifyMyerpupdatebtn",true);
		updatebtn.click();

	}
	public void verifyMyerpupdateokbtn() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(updateokbtn.isEnabled(),"updateokbtn is Enable");
		Reporter.log("verifyMyerpupdateokbtn",true);
		updateokbtn.click();

	}
	public void verifyMyerpexportbtn() throws InterruptedException{
		Thread.sleep(800);
		Assert.assertTrue(exportbtn.isEnabled(),"exportbtn is Enable");
		Reporter.log("verifyMyerpexportbtn",true);
		exportbtn.click();

	}
	public void VerifyandClickonPSearchbar2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("MH 02 BA 1237");

		Thread.sleep(500);
	}


}




