package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class AreaMasterform {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena;
	@FindBy(xpath="//a[text()='Area Master']")private WebElement areamaster;
	@FindBy(xpath="//input[@id='txtArea']")private WebElement areaname;
	@FindBy(xpath="//input[@id='txtDescription']")private WebElement description;
	@FindBy(xpath="//input[@id='chkActive']")private WebElement checkbox;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement submitokbtn;
	@FindBy(xpath="//input[@class='form-control input-sm']")private WebElement searchbar;
	@FindBy(xpath="//a[@id='btnEdit']")private WebElement editbtn;
	@FindBy(xpath="//button[@class='confirm']")private WebElement editokbtn;
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
			public AreaMasterform(WebDriver driver) {
				PageFactory.initElements(driver,this);
				}

		//usage
			
			public void verifyMyerpagancycode() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(agancycode.isEnabled(),"agancycode find is enable");
				Reporter.log("verifyMyerpagancycode",true);
				agancycode.sendKeys("ERP_00001");
				
			}
			public void verifyMyerpusrname() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(userid.isEnabled(),"username find is enable");
				Reporter.log("verifyMyerpUserid",true);
				userid.sendKeys("admin");
			}
			public void verifyMyerppassword() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(password.isEnabled(),"password find is enable");
				Reporter.log("verifyMyerppassword",true);
				password.sendKeys("admin@123");
			}
			public void verifyMyerploginbtn() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(login.isEnabled(),"loginbtn is enable");
				Reporter.log("verifyMyerplogin",true);
				login.click();
			}
			public void verifyMyerpMasterModule() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(master.isEnabled()," Mastermodule is enable");
				Reporter.log("verifyMyerpmastermodule",true);
				master.click();
			}
			public void verifyMyerpGeneralMaster() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(generalmaster.isEnabled(),"GeneralMaster is Enable");
				Reporter.log("verifyMyerpgeneralmaster",true);
				generalmaster.click();
				
			}
			public void verifyMyerpPageNavigation() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(pagena.isEnabled(),"PageNavigation is Enable");
				Reporter.log("verifyMyerppagena",true);
				pagena.click();
				
			}
			public void verifyMyerpAreaMaster() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(areamaster.isEnabled(),"AreaMaster is Enable");
				Reporter.log("verifyMyerpareamaster",true);
				areamaster.click();
				
			}
			public void verifyMyerpAreaName() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(areaname.isEnabled(),"AreaName is Enable");
				Reporter.log("verifyMyerpareaname",true);
				areaname.sendKeys("Virar East");
				
			}
			public void verifyMyerpDescription() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(description.isEnabled(),"Description is Enable");
				Reporter.log("verifyMyerpdescription",true);
				description.sendKeys("Virar East");
				
			}
			public void verifyMyerpCheckbox() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(checkbox.isEnabled(),"Checkbox is Enable");
				Reporter.log("verifyMyerpcheckbox",true);
				checkbox.click();
				
			}
			public void verifyMyerpclearbtn() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(clearbtn.isEnabled(),"clearbtn is Enable");
				Reporter.log("verifyMyerpclearbtn",true);
				clearbtn.click();
				
			}
			public void verifyMyerpAreaName1() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(areaname.isEnabled(),"AreaName is Enable");
				Reporter.log("verifyMyerpareaname",true);
				areaname.sendKeys("Virar East");
				
			}
			public void verifyMyerpDescription1() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(description.isEnabled(),"Description is Enable");
				Reporter.log("verifyMyerpdescription",true);
				description.sendKeys("Virar East");
				
			}
			public void verifyMyerpCheckbox1() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(checkbox.isEnabled(),"Checkbox is Enable");
				Reporter.log("verifyMyerpcheckbox",true);
				checkbox.click();
				
			}
			public void verifyMyerpSubmitbtn() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is Enable");
				Reporter.log("verifyMyerpsubmitbtn",true);
				submitbtn.click();
				
			}
			public void verifyMyerpsubmitokbtn() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(submitokbtn.isEnabled(),"submitokbtn is Enable");
				Reporter.log("verifyMyerpsubmitokbtn",true);
				submitokbtn.click();
				
			}
			public void verifyMyerpsearchbar() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(searchbar.isEnabled(),"searchbar is Enable");
				Reporter.log("verifyMyerpsearchbar",true);
				searchbar.click();
				searchbar.sendKeys("Virar East");
				searchbar.click();
				
			}
			public void verifyMyerpeditbtn() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(editbtn.isEnabled(),"editbtn is Enable");
				Reporter.log("verifyMyerpeditbtn",true);
				editbtn.click();
				
			}
			public void verifyMyerpeditokbtn() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(editokbtn.isEnabled(),"editokbtn is Enable");
				Reporter.log("verifyMyerpeditokbtn",true);
				editokbtn.click();
				
			}
			public void verifyMyerpupdatebtn() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(updatebtn.isEnabled(),"updatebtn is Enable");
				Reporter.log("verifyMyerpupdatebtn",true);
				updatebtn.click();
				
			}
			
			public void verifyMyerpAreaName2() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(areaname.isEnabled(),"AreaName is Enable");
				Reporter.log("verifyMyerpareaname",true);
				areaname.clear();
				areaname.sendKeys("Virar West");
				
			}
			public void verifyMyerpDescription2() throws InterruptedException{
				Thread.sleep(800);
				Assert.assertTrue(description.isEnabled(),"Description is Enable");
				Reporter.log("verifyMyerpdescription",true);
				description.clear();
				description.sendKeys("Virar West");
				
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
		    	  pcsearchbar.sendKeys("Virar West");
		    	  
		    	  Thread.sleep(500);
		    	  }

}
