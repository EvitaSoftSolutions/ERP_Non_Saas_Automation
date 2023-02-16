package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Territory {
	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
	@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;
	@FindBy (xpath="//a[text()='Territory']") private WebElement territory;
	@FindBy (xpath="//input[@id='txtTerritoryName']") private WebElement territoryname;
	@FindBy (xpath="//input[@id='chkActive']") private WebElement tactive;
	@FindBy (xpath="//input[@id='txtDescription']") private WebElement tdescription; 
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement tsubmitbtn; 
    @FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement tsubmitokbtn; 
    @FindBy (xpath="//input[@class='form-control input-sm']") private WebElement tserachbar;
    @FindBy (xpath="//button[@id='btnclear']") private WebElement tbtnclear;
	@FindBy (xpath="//*[@id=\"btnEdit\"]/i") private WebElement teditbtn; 
	@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement tyesupdateitbtn;
	@FindBy (xpath="//button[text()='Update']") private WebElement tupdatebtn;
	@FindBy (xpath="/html/body/div[4]/div[7]/div/button") private WebElement tupdateokbtn;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement texportbtn; 
	
	
	// initialization
	public Territory(WebDriver driver) {
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
	
	public void VerifyMyerpMasterModule() {
		 Assert.assertTrue(master.isEnabled(),"Master Module field is enabled");		 
		 Reporter.log("verifyMyerpMasterModule", true);
		 master.click(); 
	}
	public void VerifyMyerpGenralMasterModule() {
		 Assert.assertTrue(genralmaster.isEnabled(),"GenralMaster Module field is enabled");		 
		 Reporter.log("verifyMyerpGenralMasterModule", true);
		 genralmaster.click(); 
	}
	public void VerifyTerritoryform() {
		 Assert.assertTrue(territory.isEnabled(),"territory form field is enabled");		 
		 Reporter.log("verifyMyerpterritory", true);
		 territory.click(); 
	}

  public void VerifyTerritoryName1() throws InterruptedException {
	  Thread.sleep(500);
  Assert.assertTrue(territoryname.isEnabled(),"territory name field is enabled"); Reporter.log("verifyMyerpterritoryname", true); 
  territoryname.click();
  territoryname.sendKeys("Sayaji TERRITORY"); 
  
  } 
   
  public void VerifyTerritoryDescription1() throws InterruptedException {
	  Thread.sleep(500);
	  Assert.assertTrue(tdescription.isEnabled(),"territory description field is enabled");
  Reporter.log("verifyMyerpterritorydescription", true);
  tdescription.click();
  tdescription.sendKeys("INDIA");
  } 
  
  public void VerifyandClickonTActiveBtn1() throws InterruptedException {
	  Thread.sleep(500);
  Assert.assertTrue(tactive.isEnabled(),"active checkbox btn is enabled");
  Reporter.log(" verifyMyerpactive checkbox", true); 
  tactive.click(); 
  }
  public  void VerifyandClickonClearBtn() throws InterruptedException {
	  Thread.sleep(500);
  Assert.assertTrue(tbtnclear.isEnabled(),"clear btn is enabled");
  Reporter.log(" verifyMyerp clear btn", true); 
  tbtnclear.click();
  }
  
  public void VerifyTerritoryName() throws InterruptedException {
	  Thread.sleep(500);
  Assert.assertTrue(territoryname.isEnabled(),"territory name field is enabled");
  Reporter.log("verifyMyerpterritoryname", true); 
  territoryname.click();
  territoryname.sendKeys(" Lalbag TERRITORY"); 
  } 
  
  public void VerifyTerritoryDescription() throws InterruptedException 
  {
	  Thread.sleep(500);
	  Assert.assertTrue(tdescription.isEnabled(),"territory description field is enabled");
  Reporter.log("verifyMyerpterritorydescription", true);
  tdescription.click();
  tdescription.sendKeys("INDIA");
  } 
  public void VerifyandClickonTActiveBtn() throws InterruptedException
  {
	  Thread.sleep(500);
  Assert.assertTrue(tactive.isEnabled(),"active checkbox btn is enabled");
  Reporter.log(" verifyMyerpactive checkbox", true);
  tactive.click(); 
  } 
  
  public void VerifyandClickonSubmitBtn() throws InterruptedException
  {
	  Thread.sleep(500);
  Assert.assertTrue(tsubmitbtn.isEnabled(),"submit btn is enabled");
  Reporter.log(" verifyMyerp submit btn", true);
  tsubmitbtn.click(); 
  }
  
  public void VerifyandClickonTsubmitokbtn() throws InterruptedException {
	  Thread.sleep(500);
  Assert.assertTrue(tsubmitokbtn.isEnabled()," tsubmit ok btnis enabled");
  Reporter.log(" verifyMyerp  tsubmit ok btn", true);
  tsubmitokbtn.click(); 
  }
  public void VerifyandClickonTSearchbar() throws InterruptedException {
	  Thread.sleep(500);
	  Assert.assertTrue(tserachbar.isEnabled()," tserachbar field is enabled");
	  Reporter.log(" verifyMyerp tserachbar", true);
	  tserachbar.click(); 
	  tserachbar.sendKeys(" Lalbag TERRITORY");
	  }
  
  public void VerifyandClickonTeditbtn() throws InterruptedException {
	  Thread.sleep(500);
	  Assert.assertTrue(teditbtn.isEnabled()," Teditbtn is enabled");
	  Reporter.log(" verifyMyerp Teditbtn", true);
	  teditbtn.click(); 
	  }
  public void VerifyandClickonTtyesupdateitbtn() throws InterruptedException {
	  Thread.sleep(500);
	  Assert.assertTrue(tyesupdateitbtn.isEnabled()," tyesupdateitbtn is enabled");
	  Reporter.log(" verifyMyerp  tyesupdateit btn", true);
	  tyesupdateitbtn.click(); 
	  }
  
     public void VerifyTerritoryDescription2() throws InterruptedException 
     {
    	 Thread.sleep(500);
	  Assert.assertTrue(tdescription.isEnabled(),"territory description field is enabled");
      Reporter.log("verifyMyerpterritorydescription", true);
      tdescription.click();
      tdescription.clear();
      tdescription.sendKeys("BHARAT");
     } 
     
     public void VerifyandClickonTupdatebtn() throws InterruptedException {
    	 Thread.sleep(500);
	  Assert.assertTrue(tupdatebtn.isEnabled()," tupdate btn is enabled");
	  Reporter.log(" verifyMyerp tupdate btn", true);
	  tupdatebtn.click(); 
	  }
     
     public void VerifyandClickontupdateokbtn() throws InterruptedException {
    	 Thread.sleep(500);
	  Assert.assertTrue(tupdateokbtn.isEnabled(),"tupdate ok btn is enabled");
	  Reporter.log(" verifyMyerp tupdate ok btn", true);
	  tupdateokbtn.click(); 
	  }
     
      public void VerifyandClickonTExportbtn() throws InterruptedException {
    	  Thread.sleep(500);
		  Assert.assertTrue(texportbtn.isEnabled(),"texport btn is enabled");
		  Reporter.log(" verifyMyerp texport btn", true);
				  texportbtn.click();
	 }
      public void VerifyandClickonTSearchbar2() throws InterruptedException {
    	  Thread.sleep(500);
    	  Assert.assertTrue(tserachbar.isEnabled()," tserachbar field is enabled");
    	  Reporter.log(" verifyMyerp tserachbar", true);
    	  tserachbar.click(); 
    	  tserachbar.sendKeys("Lalbag");
    	  }
  
        }
  
