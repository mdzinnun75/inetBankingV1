package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.loginPage;
import com.inetBanking.pageObjects.newCustomerPage;

import junit.framework.Assert;

public class TC_AddCustomer_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		
		loginPage lp = new loginPage(driver);
		lp.setUsername(userName);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		log.info("login successful");
		
		newCustomerPage cp = new newCustomerPage(driver);
		log.info("providing customer data");

		cp.clicknewCustomer();
		cp.setname("Myshara");
		cp.genderFemale();
		cp.setdob("12", "13", "1989");
		Thread.sleep(3000);
		
		cp.setaddress("downtown NY");
		cp.setcity("NY");
		cp.setstate("NY");
		cp.setpin(123456);
		cp.setnumber("+12036486599");
		
		//cp.email("myshara.rana@yahoo.com");
				
		String mail=randomString()+"@gmail.com";
		cp.email(mail);
		cp.setpassword("98765");
		
		cp.setsubmit();
		Thread.sleep(3000);
		log.info("data submitted");

		Thread.sleep(3000);
		
		boolean confirm=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if (confirm==true) {
			Assert.assertTrue(true);
			log.info("test PASSED!!");

		}else {
			
			//captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
			log.info("test failed");

		}
		
		
	}
	
	
	public String  randomString() {					//create random String values
		
		String generatedString= RandomStringUtils.randomAlphabetic(8);
		
		return generatedString;
		
	}
	
	public static String  randomNumeric() {					//create random String values
		
		String generatedString2= RandomStringUtils.randomNumeric(6);
		
		return generatedString2;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
