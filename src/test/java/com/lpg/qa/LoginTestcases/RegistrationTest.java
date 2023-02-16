package com.lpg.qa.LoginTestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import com.lpg.qa.Login.Registration;
import com.lpg.qa.Login.RegistrationBase;



public class RegistrationTest  extends RegistrationBase{

	WebDriver driver;
   
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
	//RegistrationBase.driver.close();
	}
	
	@Test
	public void RegistrationPageTest() throws InterruptedException {
		Registration reg=new Registration(RegistrationBase.driver); 
	reg.VerifyandClickonMyerpRegistrationFname();
	reg.VerifyandClickonMyerpRegistrationLname();
	reg.VerifyandClickonMyerpOwnerContanctnum();
	reg.VerifyandClickonMyerpOwnerEmail();
	reg.VerifyandClickonMyerpDistributercode();
    reg.VerifyandClickonMyerpRegistrationDname();
	reg.VerifyandClickonMyerpDAddress1();
	reg.VerifyandClickonMyerpDAAdress2();
	reg.VerifyandClickonMyerpselectstate();
	reg.VerifyandClickonMyerpselectdistinct();
	reg.VerifyandClickonMyerpSelectTehshil();
	reg.VerifyandClickonMyerDCity();
	reg.VerifyandClickonMyerDSaleArea();
	reg.VerifyandClickonMyerpDistributercode();
	reg.VerifyandClickonMyerpDpincode();
	reg.VerifyandClickonMyerpDcontanctdet1();
	reg.VerifyandClickonMyerpDcontanctdet2();
	reg.VerifyandClickonMyerpDEmailID();
	reg.VerifyandClickonMyerpSelectDistributer();
	reg.VerifyandClickonMyerpSelectTerritory();
	reg.VerifyandClickonMyerpSelectDType();
	reg.VerifyandClickonMyerptransportercode();
	reg.VerifyandClickonMyerpDPanNumber();
	reg.VerifyandClickonMyerpDGSTINnumbe();
	reg.VerifyandClickonMyerpDUserid();
	reg.VerifyandClickonMyerpDPassword();
	reg.VerifyandClickonMyerpDReconfirmPassword();
	reg.VerifyandClickonMyerpDClearbtn();
	reg.VerifyandClickonMyerpRegistrationFname();
	reg.VerifyandClickonMyerpRegistrationLname();
	reg.VerifyandClickonMyerpOwnerContanctnum();
	reg.VerifyandClickonMyerpOwnerEmail();
	reg.VerifyandClickonMyerpDistributercode();
    reg.VerifyandClickonMyerpRegistrationDname();
	reg.VerifyandClickonMyerpDAddress1();
	reg.VerifyandClickonMyerpDAAdress2();
	reg.VerifyandClickonMyerpselectstate();
	reg.VerifyandClickonMyerpselectdistinct();
	reg.VerifyandClickonMyerpSelectTehshil();
	reg.VerifyandClickonMyerDCity();
	reg.VerifyandClickonMyerDSaleArea();
	reg.VerifyandClickonMyerpDistributercode();
	reg.VerifyandClickonMyerpDpincode();
	reg.VerifyandClickonMyerpDcontanctdet1();
	reg.VerifyandClickonMyerpDcontanctdet2();
	reg.VerifyandClickonMyerpDEmailID();
	reg.VerifyandClickonMyerpSelectDistributer();
	reg.VerifyandClickonMyerpSelectTerritory();
	reg.VerifyandClickonMyerpSelectDType();
	reg.VerifyandClickonMyerptransportercode();
	reg.VerifyandClickonMyerpDPanNumber();
	reg.VerifyandClickonMyerpDGSTINnumbe();
	reg.VerifyandClickonMyerpDUserid();
	reg.VerifyandClickonMyerpDPassword();
	reg.VerifyandClickonMyerpDReconfirmPassword();
	reg.VerifyandClickonMyerpDregisterbtn();

//	reg.VerifyandClickonMyerpDtextalreadyacc();
	
	
	
	
	
	
		
	   
	} 
}
