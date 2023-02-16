package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ConsumerDoctypeForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena1;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena2;
	@FindBy(xpath="//a[text()='Consumer Document Type']")private WebElement consumerdoclogin;
	@FindBy(xpath="//input[@id='txtConsumerDocTypeName']")private WebElement doctypename;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement checkactbtn;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtnclick;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtnclick;
	@FindBy(xpath="//input[@id='txtConsumerDocTypeName']")private WebElement chengename;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement clickckecbox;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement updateokbtn;
	@FindBy(xpath="//input[@id='btnExportToExcel']")private WebElement exportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	
	//initialization
			public ConsumerDoctypeForm(WebDriver driver) {
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
			public void verifyMyerpPageNavigation1() {
				Assert.assertTrue(pagena1.isEnabled(),"PageNavigation1 is Enable");
				Reporter.log("verifyMyerppagena",true);
				pagena1.click();
				
			}
			public void verifyMyerpPageNavigation2() {
				Assert.assertTrue(pagena2.isEnabled(),"PageNavigation2 is Enable");
				Reporter.log("verifyMyerppagena",true);
				pagena2.click();
				
			}
			public void verifyMyerpconsumerdoclogin() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(consumerdoclogin.isEnabled(),"consumerdoclogin is Enable");
				Reporter.log("verifyMyerpconsumerdoclogin",true);
				consumerdoclogin.click();
				
			}
			public void verifyMyerpdoctypename() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(doctypename.isEnabled(),"doctypename is Enable");
				Reporter.log("verifyMyerpdoctypename",true);
				doctypename.sendKeys("Driveringlicence");
				
			}
			public void verifyMyerpCheckactbtn() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(checkactbtn.isEnabled(),"Checkactbtn is Enable");
				Reporter.log("verifyMyerpcheckactbtn",true);
				checkactbtn.click();
				
			}
			public void verifyMyerpClearbtn() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is Enable");
				Reporter.log("verifyMyerpclearbtn",true);
				clearbtn.click();
				
			}
			public void verifyMyerpdoctypename1() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(doctypename.isEnabled(),"doctypename1 is Enable");
				Reporter.log("verifyMyerpdoctypename",true);
				doctypename.sendKeys("Driveringlicence");
				
			}
			public void verifyMyerpCheckactbtn1() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(checkactbtn.isEnabled(),"Checkactbtn is Enable");
				Reporter.log("verifyMyerpcheckactbtn1",true);
				checkactbtn.click();
				
			}
			public void verifyMyerpsubmitbtn() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is Enable");
				Reporter.log("verifyMyerpsubmitbtn",true);
				submitbtn.click();
				
			}
			public void verifyMyerpOkBtnclick() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(okbtnclick.isEnabled(),"OkBtnclick is Enable");
				Reporter.log("verifyMyerpokbtnclick",true);
				okbtnclick.click();
				
			}
			public void VerifyandClickonPSearchbar1() throws InterruptedException {
		    	  Thread.sleep(500);
		    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp pcsearchbar", true);
		    	  pcsearchbar.click(); 
		    	  pcsearchbar.clear();
		    	  pcsearchbar.sendKeys("Driveringlicence");
		    	  
		    	  Thread.sleep(500);
		    	  }
			
			public void verifyMyerpEditbutton() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(editbtn.isEnabled(),"Editbutton is Enable");
				Reporter.log("verifyMyerpeditbtn",true);
				editbtn.click();
				
			}
			public void verifyMyerpConfirmBtnClick() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(confirmbtnclick.isEnabled(),"ConfirmBtnClick is Enable");
				Reporter.log("verifyMyerpconfirmbtnclick",true);
				confirmbtnclick.click();
				
			}
			public void verifyMyerpChengeName() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(chengename.isEnabled(),"ChengeName is Enable");
				Reporter.log("verifyMyerpchengename",true);
				chengename.click();
				chengename.clear();
				chengename.sendKeys("INSURANCEID");
				
			}
			public void verifyMyerpClickckecbox() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(clickckecbox.isEnabled(),"Clickckecbox is Enable");
				Reporter.log("verifyMyerpclickckecbox",true);
				clickckecbox.click();
				
			}
			public void verifyMyerpUpdatebtn() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(updatebtn.isEnabled(),"Updatebtn is Enable");
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
		    	  pcsearchbar.sendKeys("INSURANCEID");
		    	  
		    	  Thread.sleep(500);
		    	  }
			

}
