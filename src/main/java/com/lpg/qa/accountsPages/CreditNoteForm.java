package com.lpg.qa.accountsPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CreditNoteForm {
		
		@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
		@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
		@FindBy(xpath="//input[@id='password-field']")private WebElement password;
		@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
		@FindBy(xpath="//span[text()='Accounts']")private WebElement accounts;
		@FindBy(xpath="//a[text()=' Credit Note']")private WebElement creditnot;
		@FindBy(xpath="//input[@id='txtVoucherNo']")private WebElement voucherno;
		@FindBy(xpath="//input[@id='txtCreditFromAmt']")private WebElement creditledger;
		@FindBy(xpath="//input[@id='txtCreditAmount']")private WebElement creditamount;
		@FindBy(xpath="//input[@id='txtaccount']")private WebElement account;
		@FindBy(xpath="//input[@id='txtAmount']")private WebElement amount;
		@FindBy(xpath="//input[@id='txtGrdNarration']")private WebElement narration;
		@FindBy(xpath="//textarea[@id='txtNarration']")private WebElement narration1;
		@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
		@FindBy(xpath="//button[@id='btnclear']")private WebElement newbtn;
		
		//initialization
		private WebDriver driver;
		public CreditNoteForm(WebDriver driver) {
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
		public void verifyMyerpAccounts() {
			Assert.assertTrue(accounts.isEnabled(),"Accounts is enable");
			Reporter.log("verifyMyerpaccounts",true);
			accounts.click();
		}
		public void verifyMyerpCreditnot() {
			Assert.assertTrue(creditnot.isEnabled(),"creditnot is enable");
			Reporter.log("verifyMyerpcreditnot",true);
			creditnot.click();
		}
		public void verifyMyerpVoucherno() {
			Assert.assertTrue(voucherno.isEnabled(),"voucherno is enable");
			Reporter.log("verifyMyerpvoucherno",true);
			voucherno.sendKeys("80142");
		}
		public void verifyMyerpCreditledger() {
			Assert.assertTrue(creditledger.isEnabled(),"Creditledger is enable");
			Reporter.log("verifyMyerpcreditledger",true);
			creditledger.sendKeys("BANJARA BAR & HOTEL : 100007");
		}
		public void verifyMyerpCreditamount() {
			Assert.assertTrue(creditamount.isEnabled(),"Creditamount is enable");
			Reporter.log("verifyMyerpcreditamount",true);
			creditamount.sendKeys("2000");
		}
		public void verifyMyerpAccount() {
			Assert.assertTrue(account.isEnabled(),"Account is enable");
			Reporter.log("verifyMyerpaccount",true);
			account.sendKeys("DOMESTIC SALE : 300001");
		}
		public void verifyMyerpAmount() {
			Assert.assertTrue(amount.isEnabled(),"Amount is enable");
			Reporter.log("verifyMyerpamount",true);
			amount.sendKeys("2000");
		}
		public void verifyMyerpNarration() {
			Assert.assertTrue(narration.isEnabled(),"Narration is enable");
			Reporter.log("verifyMyerpnarration",true);
			narration.sendKeys("being paid to Domestic sale");
		}
		public void verifyMyerpNarration1() {
			Assert.assertTrue(narration1.isEnabled(),"Narration1 is enable");
			Reporter.log("verifyMyerpnarration1",true);
			narration1.sendKeys("being paid to Domestic sale");
		}
		public void verifyMyerpSubmitbtn() {
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
		
		}
		public void VerifyandClickonMyerpAlertbtn() throws InterruptedException { 
			 submitbtn.click();
			 Thread.sleep(1000);
			 Alert alert1 = driver.switchTo().alert();
			 String alertMagssage1 = driver.switchTo().alert().getText();
			 System.out.print(alertMagssage1);
			 Thread.sleep(1000);	
			 alert1.accept();
	   } 
		public void verifyMyerpNewbtn() {
			Assert.assertTrue(newbtn.isEnabled(),"newbtn is enable");
			Reporter.log("verifyMyerpnewbtn",true);
			newbtn.click();
		}

}
