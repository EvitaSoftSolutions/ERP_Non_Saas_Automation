package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class TvTypeform {
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena1;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena2;
	@FindBy(xpath="//a[text()='TV Type']")private WebElement tvtypemaster; 
	@FindBy(xpath="//input[@id='txtTVTypeName']")private WebElement tvname;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement chkactive;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement confirmbtn;
	@FindBy(xpath="//input[@id='txtTVTypeName']")private WebElement tvname2;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement chkactive1;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement updatebtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement updateokbtn;
	@FindBy(xpath="//input[@id='btnExportToExcel']")private WebElement exportbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	
	//initialization
		public TvTypeform(WebDriver driver) {
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
		public void verifyMyerpTVTypeMaster() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(tvtypemaster.isEnabled(),"TVTypeMaster is Enable");
			Reporter.log("verifyMyerptvtypemaster",true);
			tvtypemaster.click();
			
		}
		public void verifyMyerpTVTypeName() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(tvname.isEnabled(),"TVTypeName is Enable");
			Reporter.log("verifyMyerptvname",true);
			tvname.sendKeys("Domestic and Commercial");
			
		}
		public void verifyMyerpChkactive() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(chkactive.isEnabled(),"Chkactive is Enable");
			Reporter.log("verifyMyerpchkactive",true);
			chkactive.click();
			
		}
		public void verifyMyerpClearbtn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is Enable");
			Reporter.log("verifyMyerpclearbtn",true);
			clearbtn.click();
			
		}
		public void verifyMyerpTVTypeName1() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(tvname.isEnabled(),"TVTypeName is Enable");
			Reporter.log("verifyMyerptvname",true);
			tvname.sendKeys("Domestic and Commercial");
			
		}
		public void verifyMyerpChkactive1() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(chkactive.isEnabled(),"Chkactive is Enable");
			Reporter.log("verifyMyerpchkactive",true);
			chkactive.click();
			
		}
		public void verifyMyerpSubmitbtn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(submitbtn.isEnabled(),"SubmitButton is Enable");
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
	    	  pcsearchbar.sendKeys("Domestic and Commercial");
	    	  
	    	  Thread.sleep(500);
	    	  }

		public void verifyMyerpEditbtn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(editbtn.isEnabled(),"Editbtn is Enable");
			Reporter.log("verifyMyerpeditbtn",true);
			editbtn.click();
			
		}
		public void verifyMyerpConfirmbtn() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(confirmbtn.isEnabled(),"Confirmbtn is Enable");
			Reporter.log("verifyMyerpconfirmbtn",true);
			confirmbtn.click();
			
		}
		public void verifyMyerptvname2() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(tvname.isEnabled(),"tvname2 is Enable");
			Reporter.log("verifyMyerptvname2",true);
			tvname.click();
			tvname.clear();
			tvname.sendKeys("HEAVY cyl.");
			
		}
		public void verifyMyerpChkactive2() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(chkactive1.isEnabled(),"Chkactive2 is Enable");
			Reporter.log("verifyMyerpchkactive1",true);
			chkactive1.click();
			
		}
		public void verifyMyerpUpdateButton() throws InterruptedException {
	    	  Thread.sleep(500);
			Assert.assertTrue(updatebtn.isEnabled(),"UpdateButton is Enable");
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
	    	  pcsearchbar.sendKeys("HEAVY ");
	    	  
	    	  Thread.sleep(500);
	    	  }

}
