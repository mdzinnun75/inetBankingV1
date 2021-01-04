package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetBanking.testCases.BaseClass;

public class loginPage extends BaseClass {
		//http://demo.guru99.com/V4/
		//userid= mngr296371
		//password= zezynaj
		
		WebDriver driver;
		
		
		public loginPage(WebDriver driver){
			//ldriver= rdriver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//tbody/tr[1]/td[2]/input[1]")
		@CacheLookup
		WebElement txtUsername;
		
		@FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(xpath="//tbody/tr[3]/td[2]/input[1]")
		@CacheLookup
		WebElement btnLogin;
		
		@FindBy(xpath="//a[contains(text(),'Log out')]")
		@CacheLookup
		WebElement logOut;
		
		
		
		public void setUsername(String uname) {
			txtUsername.sendKeys(uname);
		}
		
		public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);
		}
		
		public void clickSubmit() {
			btnLogin.click();
		}
		
		public void clickLogOut() {
			logOut.click();
		}
		
		
		
		
			
		
		
		

	

}
