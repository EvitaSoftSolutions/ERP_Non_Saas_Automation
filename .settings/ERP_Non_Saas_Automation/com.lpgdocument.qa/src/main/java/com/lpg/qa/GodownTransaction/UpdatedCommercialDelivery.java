
package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class UpdatedCommercialDelivery {
	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
	@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[7]/a") private WebElement ucommercialdeliveryform;
	@FindBy (xpath="//button[@id='btnGetdata']") private WebElement ucdgetdatabtn;
	@FindBy (xpath="//select[@id='ddlGodown']") private WebElement ucdselectgodown;
	@FindBy (xpath="//select[@id='ddlProductType']") private WebElement ucdselectproducttype;
	@FindBy (xpath="//input[@id='txtFullCylinder']") private WebElement ucdFullcyl;
	@FindBy (xpath="//input[@id='txtEmptyCylinder']") private WebElement ucdEmptycyl;
	@FindBy (xpath="//input[@id='txtSV']") private WebElement ucvsvcyl;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement ucdsubmitbtn;
	@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement genralreport;
	@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[2]/a") private WebElement dailycomplaintreport;
    @FindBy (xpath="//input[@id='FromDate']") private WebElement selectdate;
	@FindBy (xpath="//select[@id='ddlGodownID']") private WebElement selectgodowen;
	@FindBy (xpath="//Button[@id='btnGetdata']") private WebElement getdatabtn;
	@FindBy (xpath="//input[@id='ReportViewer1_ctl05_ctl03_ctl00']") private WebElement reportsearchbtn;
	@FindBy (xpath="//a[@id='ReportViewer1_ctl05_ctl03_ctl01']") private WebElement reportfindbtn;



	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}

	public UpdatedCommercialDelivery(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// usage
	public void VerifyandClickonMyerpLoginwithoutBtn1() {
		Assert.assertTrue(login.isEnabled(),"login btn is enabled");
		Assert.assertEquals("please enter valid agancycode","please enter valid userid","please enter valid password");
		Reporter.log(" verifyMyerplogin",true);
		login.click();
	}

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
	public void VerifyandClickonMyerpGodownTransactionModule () {
		Assert.assertTrue(gtmodule.isEnabled(),"gtmodule is enabled");
		Reporter.log(" verifyMyerpgtmodule", true);
		gtmodule.click();
	}
	public void VerifyandClickonMyerpGTUpdatedCommercialDeliveryForm () throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(ucommercialdeliveryform.isEnabled(),"ucommercialdeliveryform is enabled");
		Reporter.log(" verifyMyerpucommercialdeliveryform", true);
		ucommercialdeliveryform.click();

	}
	public void VerifyandClickonMyerpUCDGetDataBtn () throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(ucdgetdatabtn.isEnabled(),"ucdgetdatabtn is enabled");
		Reporter.log("verifyMyerpucdgetdatabtn", true);
		ucdgetdatabtn.click();

	}

	public void VerifyMyerpUSelectGodown()  throws InterruptedException {
		Select cdsp = new Select(ucdselectgodown);
		Thread.sleep(500);
		Assert.assertTrue(ucdselectgodown.isDisplayed(),"ucdselectgodown is displayed");
		Assert.assertFalse(ucdselectgodown.isSelected());
		cdsp.selectByVisibleText("VIRAR");
	}
	public void VerifyandClickonMyerpGTSelectProduct() throws InterruptedException { 
		Thread.sleep(1000);
		Select ucdsp = new Select(ucdselectproducttype);
		Thread.sleep(1000);
		Assert.assertTrue(ucdselectproducttype.isDisplayed(),"ucdselectproducttype is displayed");
		Assert.assertFalse(ucdselectproducttype.isSelected());
		ucdsp.selectByVisibleText("5 KG COMM");
	}
	public void VerifyandClickonMyerpUCDFullCylTxtbox() throws InterruptedException { 
		Thread.sleep(1000);
		Assert.assertTrue(ucdFullcyl.isEnabled(),"ucdFullcyl is enabled");
		Reporter.log("verifyMyerpucdFullcyl", true);
		ucdFullcyl.click();
		ucdFullcyl.clear();
		ucdFullcyl.sendKeys("50");

	}
	public void VerifyandClickonMyerpUCDEmptyCylTxtbox() throws InterruptedException { 
		Thread.sleep(1000);
		Assert.assertTrue(ucdEmptycyl.isEnabled(),"ucdEmptycyl is enabled");
		Reporter.log("verifyMyerpucdEmptycyl", true);
		ucdEmptycyl.click();
		ucdEmptycyl.clear();
		ucdEmptycyl.sendKeys("10");

	}
	public void VerifyandClickonMyerpUCDSVCylTextbox() throws InterruptedException { 
		Thread.sleep(1000);
		Assert.assertTrue(ucvsvcyl.isEnabled(),"ucvsvcyl is enabled");
		Reporter.log("verifyMyerpucvsvcyl", true);
		ucvsvcyl.click();
		ucvsvcyl.sendKeys("1");

	}
	public void VerifyandClickonMyerpUCDSubmitBtn() throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(ucdsubmitbtn.isEnabled(),"ucdsubmitbtn is enabled");
		Reporter.log("verifyMyerpucdsubmitbtn", true);
		ucdsubmitbtn.click();
		Thread.sleep(1000);
		if (isAlertPresent1(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent1(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(1000);
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}

	public void VerifyMyerpGenralReportModule() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(genralreport.isEnabled(),"genralreport field is enabled");		 
		Reporter.log("verifyMyerpgenralreport", true);
		genralreport.click(); 
	}

	public void VerifyMyerpDailyComplaintReport() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(dailycomplaintreport.isEnabled(),"dailycomplaintreport field is enabled");		 
		Reporter.log("verifyMyerpdailycomplaintreport", true);
		dailycomplaintreport.click(); 
	}

	public void VerifyMyerpSelectDate() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(selectdate.isEnabled(),"selectdate field is enabled");		 
		Reporter.log("verifyMyerpselectdate", true);
		selectdate.click(); 
		selectdate.clear();
		selectdate.sendKeys("5/02/2023");
	}

	public void verifyMyerpSelectGodown() throws InterruptedException {
		Select su = new Select(selectgodowen);
		Thread.sleep(1000);
		Assert.assertFalse(selectgodowen.isDisplayed(),"selectgodown is displayed");
		Assert.assertFalse(selectgodowen.isSelected());
		su.selectByVisibleText("VIRAR");

	}
	public void VerifyandClickonMyerpGetDataBtn() throws InterruptedException {
		Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
		Reporter.log("verifyMyerpgetdatabtn", true);
		getdatabtn.click();
		Thread.sleep(1000);
	}
	public void VerifyandClickonMyerpReportSearchBarBtn() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(reportsearchbtn.isEnabled(),"reportsearchbtn is enabled");
		Reporter.log("verifyMyerpreportsearchbtn", true);
		reportsearchbtn.click();
		reportsearchbtn.sendKeys("5 KG COMM");
		Thread.sleep(1000);
	}
	public void VerifyandClickonMyerpFindBtn() throws InterruptedException {
		Assert.assertTrue(reportfindbtn.isEnabled(),"reportfindbtn is enabled");
		Reporter.log("verifyMyerpreportfindbtn", true);
		reportfindbtn.click();
		Thread.sleep(1000);
	}




}




