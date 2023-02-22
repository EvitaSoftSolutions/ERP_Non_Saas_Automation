package com.lpg.qa.CounterSales;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class TaoutForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Transfer Advise (TA) Out']")private WebElement taout;
	@FindBy(xpath="//input[@id='txtConsumerNoSearch']")private WebElement consumerno;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement serchbtn;
	@FindBy(xpath="//input[@id='txtGSTIN']")private WebElement consumergstin;
	@FindBy(xpath="//input[@id='txtDocNo']")private WebElement docserialno;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement entercity;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement state;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement district;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement tehsil;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement email;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn; 
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/form/section[1]/h1/a")private WebElement updatetaout;
	@FindBy(xpath="//input[@id='txtMDLDocumentNo']")private WebElement documentno; 
	@FindBy(xpath="//button[@id='btnMDLGet']")private WebElement ugetdatabtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement uupdatebtn;
	@FindBy(xpath="//button[@id='btnDelete']")private WebElement udeletebtn;
	
	
	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
		public TaoutForm(WebDriver driver) {
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
		public void verifyMyerpCounterSales() {
			Assert.assertTrue(countersales.isEnabled(),"CounterSales is enable");
			Reporter.log("verifyMyerpcountersales",true);
			countersales.click();
		}
		public void verifyMyerpTaout() {
			Assert.assertTrue(taout.isEnabled(),"Taout is enable");
			Reporter.log("verifyMyerptaout",true);
			taout.click();
		}
		public void verifyMyerpConsumerno() {
			Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
			Reporter.log("verifyMyerpconsumerno",true);
			consumerno.sendKeys("5656");
		}
		public void verifyMyerpSerchbtn() throws InterruptedException {
			Assert.assertTrue(serchbtn.isEnabled(),"Serchbtn is enable");
			Reporter.log("verifyMyerpserchbtn",true);
			serchbtn.click();
			Thread.sleep(500);

			if (isAlertPresent3(driver)) { System.out.println("alert is present");

			}else { System.out.println("alert is not present"); }

		} 
		public static boolean isAlertPresent3(WebDriver driver) throws
		InterruptedException { 
			try {
				Alert al=driver.switchTo().alert();
				Thread.sleep(2000); 
				al.accept(); 

				return true; }
			catch (UnhandledAlertException u) 
			{ // TODO Auto-generated catch block
				u.printStackTrace(); 
			} return false;
		}
		public void verifyMyerpConsumerGSTIN() {
			Assert.assertTrue(consumergstin.isEnabled(),"consumergstin is enable");
			Reporter.log("verifyMyerpconsumergstin",true);
			consumergstin.click();
			consumergstin.sendKeys("6789");
		}
		
		public void verifyMyerpDocSerialNo() {
			Assert.assertTrue(docserialno.isEnabled(),"docserialno is enable");
			Reporter.log("verifyMyerpdocserialno",true);
					docserialno.click();
					docserialno.sendKeys("5678");
		}
		
		
		
		public void verifyMyerpEnterCity1() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(entercity.isEnabled(),"EnterCity is enable");
			Reporter.log("verifyMyerpentercity",true);
			entercity.sendKeys("VIRAR");
		}
		public void SelectState1() throws InterruptedException {
			Select s = new Select(state);
			Thread.sleep(1000);
			Assert.assertFalse(state.isDisplayed(),"State is  displayed");
			Assert.assertFalse(state.isSelected());
			s.selectByVisibleText("MAHARASHTRA");
		}
		public void SelectDistrict1() throws InterruptedException {
			Select d = new Select(district);
			Thread.sleep(1000);
			Assert.assertFalse(district.isDisplayed(),"District is  displayed");
			Assert.assertFalse(district.isSelected());
			d.selectByVisibleText("Palghar");
		}
		public void SelectTehsil1() throws InterruptedException {
			Select t = new Select(tehsil);
			Thread.sleep(1000);
			Assert.assertFalse(tehsil.isDisplayed(),"tehsil is  displayed");
			Assert.assertFalse(tehsil.isSelected());
			t.selectByVisibleText("Vasai");
		}
		public void verifyMyerpEnterEmail() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(email.isEnabled(),"email is enable");
			Reporter.log("verifyMyerpemail",true);
			email.sendKeys("yogeshshendage123@gmail.com"); 
		}
		public void verifyMyerpUUpdateSubmitBtn() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(uupdatebtn.isEnabled(),"uupdatebtn is enable");
			Reporter.log("verifyMyerpuupdatebtn",true);
			uupdatebtn.click(); 
			Thread.sleep(1000);
			if (isAlertPresent6(driver)) { System.out.println("alert is present");

			}else { System.out.println("alert is not present"); }

		} 
		public static boolean isAlertPresent6(WebDriver driver) throws
		InterruptedException { 
			try {
				Thread.sleep(1000);
				Alert al=driver.switchTo().alert();
				Thread.sleep(1000); 
				al.accept(); 
				Thread.sleep(1000); 
				al.accept(); 
				return true; }
			catch (UnhandledAlertException u)
			{ // TODO Auto-generated catch block
				u.printStackTrace(); } return false;
		}
		public void verifyMyerpClearbtn() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(clearbtn.isEnabled(),"clearbtn is enable");
			Reporter.log("verifyMyerpclearbtn",true);
			clearbtn.click();
		}
		
		public void verifyMyerpDeletebtn() throws InterruptedException {
			Thread.sleep(500);
			Assert.assertTrue(udeletebtn.isEnabled(),"udeletebtn is enable");
			Reporter.log("verifyMyerpudeletebtn",true);
			udeletebtn.click();
			Thread.sleep(1000);
			if (isAlertPresent7(driver)) { System.out.println("alert is present");

			}else { System.out.println("alert is not present"); }

		} 
		public static boolean isAlertPresent7(WebDriver driver) throws
		InterruptedException { 
			try {
				Thread.sleep(1000);
				Alert al=driver.switchTo().alert();
				Thread.sleep(1000); 
				al.accept(); 
				Thread.sleep(1000); 
				al.accept(); 
				return true; }
			catch (UnhandledAlertException u)
			{ // TODO Auto-generated catch block
				u.printStackTrace(); } return false;
		}
		}


