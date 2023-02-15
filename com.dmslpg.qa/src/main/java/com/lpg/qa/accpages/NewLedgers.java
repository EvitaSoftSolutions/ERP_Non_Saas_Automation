package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class NewLedgers {
	
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;  
	@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[2]/a") private WebElement accountmaster;
	@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[1]/td[2]/a") private WebElement newledgresform;
	
	@FindBy (xpath="//input[@id='txtNameOfLedger']") private WebElement nameofledger;
	@FindBy (xpath="//select[@id='ddlGroup']") private WebElement selectgroup;
	@FindBy (xpath="//input[@id='txtAlias']") private WebElement aliasname;
	@FindBy (xpath="//input[@id='OpeningDate']")private WebElement date;
	@FindBy (xpath="//button[@id='btnClear']") private WebElement clearbtn;
	@FindBy (xpath="//button[@id='btnSave']") private WebElement savebtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement saveokbtn;
	
	@FindBy (xpath="//button[@id='btnGet']") private WebElement getlist;

	
	
	// initialization
	 WebDriver driver;
	 public void setup(WebDriver driver) 
	 {
		 this.driver=driver;
	 }
		
	public NewLedgers(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

		// usage
		public void VerifyandClickonMyerpLoginwithoutBtn1() {
			 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
			 Assert.assertEquals("please enter valid agancycode","please enter valid userid","please enter valid password");
			 Reporter.log(" verifyMyerplogin",true);
			login.click();
		}
		
		public void VerifyMyerpMasterModule() {
			 Assert.assertTrue(master.isEnabled(),"Master Module field is enabled");		 
			 Reporter.log("verifyMyerpMasterModule", true);
			 master.click(); 
		}
		public void VerifyMyerpAccountMaster() {
			 Assert.assertTrue(accountmaster.isEnabled(),"accountmaster Module field is enabled");		 
			 Reporter.log("verifyMyerpaccountmaster", true);
			 accountmaster.click(); 
		}
		public void VerifyMyerpNewLedgersForm() {
			 Assert.assertTrue(newledgresform.isEnabled(),"newledgresform Module field is enabled");		 
			 Reporter.log("verifyMyerpnewledgresform", true);
			 newledgresform.click(); 
		}
		
		
		public void VerifyMyerpNameOfLedgers() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
			 Reporter.log("verifyMyerpnameofledger", true);
			 nameofledger.click();
			 nameofledger.sendKeys("cylinder deposit");
			 
		}
		public void VerifyMyerpSelectGroup() throws InterruptedException {
			Select sc = new Select(selectgroup);
			Thread.sleep(1000);
			Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
			Assert.assertFalse(selectgroup.isSelected());
			sc.selectByVisibleText("DEPOSITS");
		}
		public void VerifyMyerpAliasname() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
			 Reporter.log("verifyMyerpnlaliasname", true);
			 aliasname.click();
			 aliasname.sendKeys("cylinder deposit");
			 
		}
		public void VerifyMyerpDate() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
			 Reporter.log("verifyMyerpdate", true);
			 date.click();
			 date.clear();
			 date.sendKeys("01-01-2023");
			 
		}
		public void VerifyMyerpSaveBtn() throws InterruptedException {
			Thread.sleep(400);
			 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
			 Reporter.log("verifyMyerpnlsavebtn", true);
			 savebtn.click();
		}
		public void VerifyMyerpSaveOKBtn() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
			 Reporter.log("verifyMyerpnlsaveokbtn", true);
			 saveokbtn.click();
		}
		public void VerifyMyerpNameOfLedgers1() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
			 Reporter.log("verifyMyerpnameofledger", true);
			 nameofledger.click();
			 nameofledger.sendKeys("cylinder Lost");
			 
		}
		public void VerifyMyerpSelectGroup1() throws InterruptedException {
			Select sc = new Select(selectgroup);
			Thread.sleep(1000);
			Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
			Assert.assertFalse(selectgroup.isSelected());
			sc.selectByVisibleText("STOCK IN HAND");
		}
		public void VerifyMyerpAliasname1() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
			 Reporter.log("verifyMyerpnlaliasname", true);
			 aliasname.click();
			 aliasname.sendKeys("cylinder Lost");
			 
		}
		public void VerifyMyerpDate1() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
			 Reporter.log("verifyMyerpdate", true);
			 date.click();
			 date.clear();
			 date.sendKeys("01-01-2023");
			 
		}
		public void VerifyMyerpSaveBtn1() throws InterruptedException {
			Thread.sleep(400);
			 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
			 Reporter.log("verifyMyerpnlsavebtn", true);
			 savebtn.click();
		}
		public void VerifyMyerpSaveOKBtn1() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
			 Reporter.log("verifyMyerpnlsaveokbtn", true);
			 saveokbtn.click();
		}
		public void VerifyMyerpNameOfLedgers2() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
			 Reporter.log("verifyMyerpnameofledger", true);
			 nameofledger.click();
			 nameofledger.sendKeys("Dpr deposits");
			 
		}
		public void VerifyMyerpSelectGroup2() throws InterruptedException {
			Select sc = new Select(selectgroup);
			Thread.sleep(1000);
			Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
			Assert.assertFalse(selectgroup.isSelected());
			sc.selectByVisibleText("DEPOSITS");
		}
		public void VerifyMyerpAliasname2() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
			 Reporter.log("verifyMyerpnlaliasname", true);
			 aliasname.click();
			 aliasname.sendKeys("Dpr deposits");
			 
		}
		public void VerifyMyerpDate2() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
			 Reporter.log("verifyMyerpdate", true);
			 date.click();
			 date.clear();
			 date.sendKeys("01-01-2023");
			 
		}
		public void VerifyMyerpSaveBtn2() throws InterruptedException {
			Thread.sleep(400);
			 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
			 Reporter.log("verifyMyerpnlsavebtn", true);
			 savebtn.click();
		}
		public void VerifyMyerpSaveOKBtn2() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
			 Reporter.log("verifyMyerpnlsaveokbtn", true);
			 saveokbtn.click();
		}
		public void VerifyMyerpNameOfLedgers3() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
			 Reporter.log("verifyMyerpnameofledger", true);
			 nameofledger.click();
			 nameofledger.sendKeys("Dpr lost");
			 
		}
		public void VerifyMyerpSelectGroup3() throws InterruptedException {
			Select sc = new Select(selectgroup);
			Thread.sleep(1000);
			Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
			Assert.assertFalse(selectgroup.isSelected());
			sc.selectByVisibleText("STOCK IN HAND");
		}
		public void VerifyMyerpAliasname3() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
			 Reporter.log("verifyMyerpnlaliasname", true);
			 aliasname.click();
			 aliasname.sendKeys("Dpr lost");
			 
		}
		public void VerifyMyerpDate3() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
			 Reporter.log("verifyMyerpdate", true);
			 date.click();
			 date.clear();
			 date.sendKeys("01-01-2023");
			 
		}
		public void VerifyMyerpSaveBtn3() throws InterruptedException {
			Thread.sleep(400);
			 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
			 Reporter.log("verifyMyerpnlsavebtn", true);
			 savebtn.click();
		}
		public void VerifyMyerpSaveOKBtn3() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
			 Reporter.log("verifyMyerpnlsaveokbtn", true);
			 saveokbtn.click();
		}
		public void VerifyMyerpNameOfLedgers4() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
			 Reporter.log("verifyMyerpnameofledger", true);
			 nameofledger.click();
			 nameofledger.sendKeys("Bpcl online receivable");
			 
		}
		public void VerifyMyerpSelectGroup4() throws InterruptedException {
			Select sc = new Select(selectgroup);
			Thread.sleep(1000);
			Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
			Assert.assertFalse(selectgroup.isSelected());
			sc.selectByVisibleText("SALES");
		}
		public void VerifyMyerpAliasname4() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
			 Reporter.log("verifyMyerpnlaliasname", true);
			 aliasname.click();
			 aliasname.sendKeys("Bpcl online receivable");
			 
		}
		public void VerifyMyerpDate4() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
			 Reporter.log("verifyMyerpdate", true);
			 date.click();
			 date.clear();
			 date.sendKeys("01-01-2023");
			 
		}
		public void VerifyMyerpSaveBtn4() throws InterruptedException {
			Thread.sleep(400);
			 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
			 Reporter.log("verifyMyerpnlsavebtn", true);
			 savebtn.click();
		}
		public void VerifyMyerpSaveOKBtn4() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
			 Reporter.log("verifyMyerpnlsaveokbtn", true);
			 saveokbtn.click();
		}
		
		
		public void VerifyMyerpNameOfLedgers5() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
			 Reporter.log("verifyMyerpnameofledger", true);
			 nameofledger.click();
			 nameofledger.sendKeys("DBTL");
			 
		}
		public void VerifyMyerpSelectGroup5() throws InterruptedException {
			Select sc = new Select(selectgroup);
			Thread.sleep(1000);
			Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
			Assert.assertFalse(selectgroup.isSelected());
			sc.selectByVisibleText("OTHER INCOME");
		}
		public void VerifyMyerpAliasname5() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
			 Reporter.log("verifyMyerpnlaliasname", true);
			 aliasname.click();
			 aliasname.sendKeys("DBTL");
			 
		}
		public void VerifyMyerpDate5() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
			 Reporter.log("verifyMyerpdate", true);
			 date.click();
			 date.clear();
			 date.sendKeys("01-01-2023");
			 
		}
		public void VerifyMyerpSaveBtn5() throws InterruptedException {
			Thread.sleep(400);
			 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
			 Reporter.log("verifyMyerpnlsavebtn", true);
			 savebtn.click();
		}
		public void VerifyMyerpSaveOKBtn5() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
			 Reporter.log("verifyMyerpnlsaveokbtn", true);
			 saveokbtn.click();
		}
		
		
		public void VerifyMyerpNameOfLedgers6() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
			 Reporter.log("verifyMyerpnameofledger", true);
			 nameofledger.click();
			 nameofledger.sendKeys("Discount");
			 
		}
		public void VerifyMyerpSelectGroup6() throws InterruptedException {
			Select sc = new Select(selectgroup);
			Thread.sleep(1000);
			Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
			Assert.assertFalse(selectgroup.isSelected());
			sc.selectByVisibleText("INDIRECT EXPENCES");
		}
		public void VerifyMyerpAliasname6() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
			 Reporter.log("verifyMyerpnlaliasname", true);
			 aliasname.click();
			 aliasname.sendKeys("Discount");
			 
		}
		public void VerifyMyerpDate6() throws InterruptedException {
			Thread.sleep(500);
			 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
			 Reporter.log("verifyMyerpdate", true);
			 date.click();
			 date.clear();
			 date.sendKeys("01-01-2023");
			 
		}
		public void VerifyMyerpSaveBtn6() throws InterruptedException {
			Thread.sleep(400);
			 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
			 Reporter.log("verifyMyerpnlsavebtn", true);
			 savebtn.click();
		}
		public void VerifyMyerpSaveOKBtn6() throws InterruptedException {
			Thread.sleep(1000);
			 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
			 Reporter.log("verifyMyerpnlsaveokbtn", true);
			 saveokbtn.click();
		}
}