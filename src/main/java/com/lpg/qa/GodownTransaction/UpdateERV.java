package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class UpdateERV {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[4]/a") private WebElement uervform;
			@FindBy (xpath="//input[@id='txtERVNumber']") private WebElement ervnumber;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement eclearbtn;
			@FindBy (xpath="//button[@id='btnSearch']") private WebElement searchervbtn;
			@FindBy (xpath="//*[@id=\"tb2\"]") private WebElement  xmierv;
			
			// initialization
			public UpdateERV(WebDriver driver) {
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
				public void VerifyandClickonMyerpGTUpdateERVForm () { 
					 Assert.assertTrue(uervform.isEnabled(),"uervform is enabled");
					 Reporter.log(" verifyMyerpuervform", true);
					 uervform.click();
			    }
			
				public void VerifyandClickonMyerpErvNumber() { 
					 Assert.assertTrue(ervnumber.isEnabled(),"ervnumber is enabled");
					 Reporter.log(" verifyMyerpervnumber", true);
					 ervnumber.click();
					 ervnumber.sendKeys("10001");
				}
			
                public void VerifyandClickonMyerpClearBtn() throws InterruptedException { 
                	Thread.sleep(500);
	                 Assert.assertTrue(eclearbtn.isEnabled(),"eclearbtn is enabled");
	                 Reporter.log(" verifyMyerpeclearbtn", true);
	                 eclearbtn.click();
                }
                public void VerifyandClickonMyerpSearchBtn() throws InterruptedException { 
                	Thread.sleep(1000);
	                 Assert.assertTrue(searchervbtn.isEnabled(),"searchervbtn is enabled");
	                 Reporter.log(" verifyMyerpsearchervbtn", true);
	                 searchervbtn.click();
               }
               
}


