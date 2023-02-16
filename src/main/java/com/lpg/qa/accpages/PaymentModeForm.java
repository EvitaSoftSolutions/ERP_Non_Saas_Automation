package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class PaymentModeForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::ul/child::li[2]/a")private WebElement accountmaster;
	@FindBy(xpath="//a[text()='Payment Mode Master']")private WebElement paymentmode;
	@FindBy(xpath="//input[@id='txtMode_Desc']")private WebElement modedescription;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement checkativebtn;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//button[text()='Update']")private WebElement updatebtn;
	@FindBy (xpath="//button[@class='confirm']") private WebElement cpupdateokbtn;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement  cpexportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar; 
	
	//initialization
	public PaymentModeForm(WebDriver driver) {
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
	public void verifyMyerpPaymentMode() {
		Assert.assertTrue(paymentmode.isEnabled(),"PaymentMode is enable");
		Reporter.log("verifyMyerppaymentmode",true);
		paymentmode.click();
	}
	public void verifyMyerpModeDescription() {
		Assert.assertTrue(modedescription.isEnabled(),"ModeDescription is enable");
		Reporter.log("verifyMyerpmodedescription",true);
		modedescription.sendKeys("UPI");
	}
	public void verifyMyerpCheckAtivebtn() {
		Assert.assertTrue(checkativebtn.isEnabled(),"CheckAtivebtn is enable");
		Reporter.log("verifyMyerpcheckativebtn",true);
		checkativebtn.click();
	}
	public void verifyMyerpClearButton() {
		Assert.assertTrue(clearbtn.isEnabled(),"ClearButton is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void verifyMyerpModeDescription1() {
		Assert.assertTrue(modedescription.isEnabled(),"ModeDescription is enable");
		Reporter.log("verifyMyerpmodedescription",true);
		modedescription.sendKeys("UPI");
	}
	public void verifyMyerpCheckAtivebtn1() {
		Assert.assertTrue(checkativebtn.isEnabled(),"CheckAtivebtn is enable");
		Reporter.log("verifyMyerpcheckativebtn",true);
		checkativebtn.click();
	}
	public void verifyMyerpSubmitButton() {
		Assert.assertTrue(submitbtn.isEnabled(),"SubmitButton is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void verifyMyerpOkButton() {
		Assert.assertTrue(okbtn.isEnabled(),"OkButton is enable");
		Reporter.log("verifyMyerpokbtn",true);
		okbtn.click();
	}
	public void VerifyandClickonPSearchbar1() throws InterruptedException {
  	  Thread.sleep(500);
  	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
  	  Reporter.log(" verifyMyerp pcsearchbar", true);
  	  pcsearchbar.click(); 
  	  pcsearchbar.clear();
  	  pcsearchbar.sendKeys("UPI");
  	  
  	 }
	public void verifyMyerpEditButton() {
		Assert.assertTrue(editbtn.isEnabled(),"EditButton is enable");
		Reporter.log("verifyMyerpeditbtn",true);
		editbtn.click();
	}
	public void verifyMyerpConfirmButton() {
		Assert.assertTrue(confirmbtn.isEnabled(),"ConfirmButton is enable");
		Reporter.log("verifyMyerpconfirmbtn",true);
		confirmbtn.click();
	}

	public void verifyMyerpModeDescription2() {
		Assert.assertTrue(modedescription.isEnabled(),"ModeDescription is enable");
		Reporter.log("verifyMyerpmodedescription",true);
		modedescription.sendKeys("CASH RS");
	}
	public void verifyMyerpCheckAtivebtn2() {
		Assert.assertTrue(checkativebtn.isEnabled(),"CheckAtivebtn is enable");
		Reporter.log("verifyMyerpcheckativebtn",true);
		checkativebtn.click();
	}
	public void verifyMyerpUpdateButton() {
		Assert.assertTrue(updatebtn.isEnabled(),"UpdateButton is enable");
		Reporter.log("verifyMyerpupdatebtn",true);
		updatebtn.click();
	}
	
	public void VerifyMyerpCPUpdateokBtn() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(cpupdateokbtn.isEnabled(),"cpupdateokbtn field is enabled");		 
		 Reporter.log("verifyMyerpcpupdateokbtn", true);
		 Assert.assertFalse(cpupdateokbtn.isSelected());
		 cpupdateokbtn.click(); 
	}
	public void VerifyMyerpTExportBtn() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(cpexportbtn.isEnabled(),"cpexportbtn field is enabled");		 
		 Reporter.log("verifyMyerpcpexportbtn", true);
		 Assert.assertFalse(cpexportbtn.isSelected());
		 cpexportbtn.click();
	}
	public void VerifyandClickonPSearchbar3() throws InterruptedException {
    	  Thread.sleep(500);
    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
    	  Reporter.log(" verifyMyerp pcsearchbar", true);
    	  pcsearchbar.click(); 
    	  pcsearchbar.clear();
    	  pcsearchbar.sendKeys("CASH RS");
    	  
    	 }

	
}
