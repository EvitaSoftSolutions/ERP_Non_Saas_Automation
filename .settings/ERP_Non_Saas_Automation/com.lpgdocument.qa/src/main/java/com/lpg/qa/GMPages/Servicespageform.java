package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Servicespageform {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena;
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
	@FindBy (xpath="//button[@id='btnclear']") private WebElement cpclearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
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
	public Servicespageform(WebDriver driver) {
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
	public void verifyMyerpServices() {
		Assert.assertTrue(services.isEnabled(),"Services is Enable");
		Reporter.log("verifyMyerpservices",true);
		services.click();
	}
	public void verifyMyerpServiceDescription() {
		Assert.assertTrue(servicedescription.isEnabled(),"ServiceDescription is Enable");
		Reporter.log("verifyMyerpservicedescription",true);
		servicedescription.sendKeys("OFFICE BoyDuty");
	}
	public void verifyMyerpServicestitle() {
		Assert.assertTrue(servicetitile.isEnabled(),"Servicestitle is Enable");
		Reporter.log("verifyMyerpservicetitile",true);
		servicetitile.sendKeys("OFFICE BoyDuty");
	}
	public void verifyMyerpServicesAlias() {
		Assert.assertTrue(servicealiasname.isEnabled(),"ServicesAlias is Enable");
		Reporter.log("verifyMyerpservicealiasname",true);
		servicealiasname.sendKeys("OFFICE BoyDuty");
	}
	public void verifyMyerpServicescost() {
		Assert.assertTrue(servicecost.isEnabled(),"Servicescost is Enable");
		Reporter.log("verifyMyerpservicecost",true);
		servicecost.sendKeys("170");
	}
	public void verifyMyerpselectcom() throws InterruptedException {
		Select sc = new Select(selectcom);
		Thread.sleep(1000);
		Assert.assertFalse(selectcom.isDisplayed(),"Selectselectcom is displayed");
		Assert.assertFalse(selectcom.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");

	}
	public void verifyMyerpSelectselecttype() throws InterruptedException {
		Select su = new Select(selecttype);
		Thread.sleep(1000);
		Assert.assertFalse(selecttype.isDisplayed(),"Selectselecttype is displayed");
		Assert.assertFalse(selecttype.isSelected());
		su.selectByVisibleText("REFUNDABLE-LIABILITY");

	}
	public void verifyMyerpServiceshsncod() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(servicehsnco.isEnabled(),"Serviceshsncod is Enable");
		Reporter.log("verifyMyerpservicehsnco",true);
		servicehsnco.sendKeys("228519");
	}
	public void verifyMyerpServicesactiv() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(serviceactivbtn.isEnabled(),"Servicesactiv is Enable");
		Reporter.log("verifyMyerpserviceactivbtn",true);
		serviceactivbtn.click();
	}
	public void verifyMyerpServicesisgst() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(serviceigst.isEnabled(),"Servicesisgst is Enable");
		Reporter.log("verifyMyerpserviceigst",true);
		serviceigst.click();
	}
	public void verifyMyerpUpdateGst() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(updategst.isEnabled(),"UpdateGst is Enable");
		Reporter.log("verifyMyerpupdategst",true);
		updategst.click();
	}
	public void verifyMyerpGstTextrate1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(gsttextrate1.isEnabled(),"GstTextrate1 is Enable");
		Reporter.log("verifyMyerpgsttextrate1",true);
		gsttextrate1.sendKeys("10.8");
	}
	public void verifyMyerpGstTestRate2() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(gsttestrate2.isEnabled(),"GstTestRate2 is Enable");
		Reporter.log("verifyMyerpgsttestrate2",true);
		gsttestrate2.sendKeys("10.8");
	}
	public void verifyMyerpSaveGstbtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(savebtn.isEnabled(),"SaveGstbtn is Enable");
		Reporter.log("verifyMyerpsavebtn",true);
		savebtn.click();
	}
	public void VerifyMyerpClearBtn1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(cpclearbtn.isEnabled(),"cpclearbtn field is enabled");		 
		Reporter.log("verifyMyerpcpclearbtn", true);
		cpclearbtn.click();
		Thread.sleep(500);
	}
	public void verifyMyerpSubmit() {
		Assert.assertTrue(submitbtn.isEnabled(),"Submit is Enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
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
		pcsearchbar.sendKeys("OFFICE BoyDuty");

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
	public void verifyMyerpServiceDescription1() {
		Assert.assertTrue(servicedescription.isEnabled(),"ServiceDescription is Enable");
		Reporter.log("verifyMyerpservicedescription",true);
		servicedescription.click();
		servicedescription.clear();
		servicedescription.sendKeys("ONDuty");
	}
	public void verifyMyerpServicestitle1() {
		Assert.assertTrue(servicetitile.isEnabled(),"Servicestitle is Enable");
		Reporter.log("verifyMyerpservicetitile",true);
		servicetitile.click();
		servicetitile.clear();
		servicetitile.sendKeys("ONDuty");
	}
	public void verifyMyerpselectcom1() throws InterruptedException {
		Select sc = new Select(selectcom);
		Thread.sleep(1000);
		Assert.assertFalse(selectcom.isDisplayed(),"Selectselectcom is displayed");
		Assert.assertFalse(selectcom.isSelected());
		sc.selectByVisibleText("ANITA GAS SERVICES");

	}
	public void verifyMyerpSelectselecttype1() throws InterruptedException {
		Select su = new Select(selecttype);
		Thread.sleep(1000);
		Assert.assertFalse(selecttype.isDisplayed(),"Selectselecttype is displayed");
		Assert.assertFalse(selecttype.isSelected());
		su.selectByVisibleText("NON-REFUNDABLE-INCOME");

	}
	public void verifyMyerpServiceshsncod1() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(servicehsnco.isEnabled(),"Serviceshsncod is Enable");
		Reporter.log("verifyMyerpservicehsnco",true);
		servicehsnco.click();
		servicehsnco.clear();
		servicehsnco.sendKeys("84020");
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
		Thread.sleep(1000);
		Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		Reporter.log(" verifyMyerp pcsearchbar", true);
		pcsearchbar.click(); 
		pcsearchbar.clear();
		pcsearchbar.sendKeys("ONDuty");

		Thread.sleep(500);
	}


}


