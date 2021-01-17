package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.loginPage;
import com.inetBanking.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginTest_002 extends BaseClass{

	
	
	@Test(dataProvider = "LoginData")		//LoginData= excel file from testData
	public void loginDDT(String user, String pwd) throws InterruptedException {
		
		loginPage lp = new loginPage(driver);
		lp.setUsername(user);
		log.info("username entered");
		
		lp.setPassword(pwd);
		log.info("password entered");

		lp.clickSubmit();
		//Thread.sleep(3000);
		
		
			if (isAlertPresent()==true) {
				
				driver.switchTo().alert().accept();		//close alert
				driver.switchTo().defaultContent();
				Assert.assertTrue(false);
				log.warn("login failed");
				
			}else {
				
				Assert.assertTrue(true);
				log.info("login passed");
				//log out xpath. sleep--> implicit wait
				lp.clickLogOut();
				Thread.sleep(2000);
				driver.switchTo().alert().accept(); 	//close logout alert
				driver.switchTo().defaultContent();
			}
	}
	
	
	
	public boolean isAlertPresent() {			//user defined method created to check alert is present or not
		try {
			driver.switchTo().alert();
			return true;
			} 
		catch (NoAlertPresentException e) {
				return false;			
			}
			
		}
	
	
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
	
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetBanking/testData/LoginData.xlsx";
		int rownum= XLUtils.getRowCount(path, "sheet1");
		int colNum= XLUtils.getCellcount(path, "Sheet1", 1);
		
		String logindata[][]= new String [rownum][colNum];
		
		for(int i=1; i<=rownum; i++) {
			
			for (int j = 0; j < colNum; j++) 
			{
				logindata[i-1][j]= XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
				
	}
}
