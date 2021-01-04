package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newCustomerPage {

	WebDriver driver;
	
	public newCustomerPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement newCustomer;
	
	@FindBy(xpath="//input[@name=\"name\"]")
	@CacheLookup
	WebElement name;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/input[1]")
	@CacheLookup
	WebElement genderMale;
	
	@FindBy(xpath="//input[@id='dob']")
	@CacheLookup
	WebElement dob;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/input[2]")
	@CacheLookup
	WebElement genderFemale;
	
	@FindBy(xpath="//tbody/tr[7]/td[2]/textarea[1]")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath="//tbody/tr[8]/td[2]/input[1]")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath="//tbody/tr[9]/td[2]/input[1]")
	@CacheLookup
	WebElement state;
	
	@FindBy(xpath="//tbody/tr[10]/td[2]/input[1]")
	@CacheLookup
	WebElement pin;
	
	@FindBy(xpath="//tbody/tr[11]/td[2]/input[1]")
	@CacheLookup
	WebElement number;
	
	@FindBy(xpath="//tbody/tr[12]/td[2]/input[1]")
	@CacheLookup
	WebElement email;
	
	//tbody/tr[13]/td[2]/input[1]
	
	@FindBy(xpath="//tbody/tr[13]/td[2]/input[1]")
	@CacheLookup
	WebElement password;
	
	
	@FindBy(xpath="//tbody/tr[14]/td[2]/input[1]")
	@CacheLookup
	WebElement submit;
	
	
	
	
	
	
	public void clicknewCustomer() {
		newCustomer.click();
	}
	
	public void setname(String cname) {
		name.sendKeys(cname);
	}
	
	public void genderMale() {
		genderMale.click();
	}
	
	public void genderFemale() {
		genderFemale.click();
	}
	
	public void  setdob(String mm, String dd, String yyyy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yyyy);
	}
	
	public void  setaddress(String caddress) {
		address.sendKeys(caddress);
	}
	
	public void setcity(String ccity) {
		city.sendKeys(ccity);
		
	}public void setstate(String cstate) {
		state.sendKeys(cstate);
	}
	
	public void setpin(int cpin) {
		pin.sendKeys(String.valueOf(cpin));
	}
	
	public void setnumber(String cnumber) {
		number.sendKeys(cnumber);
	}
	
	public void email(String cemail) {
		email.sendKeys(cemail);
	}
	
	public void setpassword(String cpassword) {
		password.sendKeys(cpassword);
	}
	
	public void setsubmit() {
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
