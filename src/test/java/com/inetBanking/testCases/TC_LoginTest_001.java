package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.loginPage;



public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws IOException, InterruptedException {
		
		
		//creating object of loginPage
		loginPage lp= new loginPage(driver);
		lp.setUsername(userName);
		log.info("username entered");
		
		lp.setPassword(password);
		log.info("password entered");
		
		lp.clickSubmit();
		log.info("username & pasword submitted");

		
		Thread.sleep(3000);
		String title= driver.getTitle();
		System.out.println("title: "+title);
		
		if (title.equals("Guru99 Bank Manager HomePage")) 
		{

			Assert.assertTrue(true);
			log.info("Login test PASSED!!");

		}
		else 
		{
			
			Assert.assertTrue(false);
			log.info("Login test FAILED");
			captureScreen(driver, "loginTest");

		}
	}
}
