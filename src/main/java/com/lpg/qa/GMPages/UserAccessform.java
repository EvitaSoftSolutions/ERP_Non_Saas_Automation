package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class UserAccessform {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena;
	@FindBy(xpath="//a[text()='User Access']")private WebElement useraccessform;
	@FindBy(xpath="//select[@id='ddlUser']")private WebElement username;
	@FindBy(xpath="//button[@id='btnGetData']")private WebElement getdatabtn;
	@FindBy(xpath="//input[@id='chkTax_1']")private WebElement chektax1;
	@FindBy(xpath="//input[@id='chkTax_2']")private WebElement checktax2;
	@FindBy(xpath="//input[@id='chkTax_3']")private WebElement checktax3;
	@FindBy(xpath="//input[@id='chkTax_4']")private WebElement checktax4;
	@FindBy(xpath="//input[@id='chkTax_5']")private WebElement checktax5;
	@FindBy(xpath="//button[text()='Submit']")private WebElement submitbtn;
	
	//initialization
		public UserAccessform(WebDriver driver) {
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
		public void verifyMyerploginbtn() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(login.isEnabled(),"loginbtn is enable");
			Reporter.log("verifyMyerplogin",true);
			login.click();
		}
		public void verifyMyerpMasterModule() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(master.isEnabled()," Mastermodule is enable");
			Reporter.log("verifyMyerpmastermodule",true);
			master.click();
		}
		public void verifyMyerpGeneralMaster() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(generalmaster.isEnabled(),"GeneralMaster is Enable");
			Reporter.log("verifyMyerpgeneralmaster",true);
			generalmaster.click();
			
		}
		public void verifyMyerpPageNavigation() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(pagena.isEnabled(),"PageNavigation is Enable");
			Reporter.log("verifyMyerppagena",true);
			pagena.click();
			
		}
		public void verifyMyerpUserAccessForm() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(useraccessform.isEnabled(),"UserAccessForm is Enable");
			Reporter.log("verifyMyerpuseraccessform",true);
			useraccessform.click();
			
		}
		public void verifyMyerpSelectusername() throws InterruptedException {
			Select sc = new Select(username);
			Thread.sleep(1000);
			Assert.assertFalse(username.isDisplayed(),"selectusername is displayed");
			Assert.assertFalse(username.isSelected());
			sc.selectByVisibleText("yogesh");
			
		}
		public void verifyMyerpGetDataBtn() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is Enable");
			Reporter.log("verifyMyerpgetdatabtn",true);
			getdatabtn.click();
			
		}
		
		
		
		public void verifyMyerpChektax1() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(chektax1.isEnabled(),"Chektax1 is Enable");
			Reporter.log("verifyMyerpchektax1",true);
			chektax1.click();
			
		}
		public void verifyMyerpChecktax2() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(checktax2.isEnabled(),"Checktax2 is Enable");
			Reporter.log("verifyMyerpchecktax2",true);
			checktax2.click();
			
		}
		public void verifyMyerpChecktax3() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(checktax3.isEnabled(),"Checktax3 is Enable");
			Reporter.log("verifyMyerpchecktax3",true);
			checktax3.click();
			
		}
		public void verifyMyerpChecktax4() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(checktax4.isEnabled(),"Checktax4 is Enable");
			Reporter.log("verifyMyerpchecktax4",true);
			checktax4.click();
			
		}
		public void verifyMyerpChecktax5() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(checktax5.isEnabled(),"Checktax5 is Enable");
			Reporter.log("verifyMyerpchecktax5",true);
			checktax5.click();
			
		}
		
		public void verifyMyerpSubmitbtn() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is Enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
			
		}
		public void verifyMyerpSelectusername1() throws InterruptedException {
			Select sc = new Select(username);
			Thread.sleep(1000);
			Assert.assertFalse(username.isDisplayed(),"selectusername is displayed");
			Assert.assertFalse(username.isSelected());
			sc.selectByVisibleText("yogesh");
			
		}
		public void verifyMyerpGetDataBtn1() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is Enable");
			Reporter.log("verifyMyerpgetdatabtn",true);
			getdatabtn.click();
			
		}
}
