package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;


public class BaseClass {
		public static WebDriver driver;
		public static Logger log;
		
		//getting datas from ReadConfig from utilities
		ReadConfig rc = new ReadConfig();
	
		public String baseUrl= rc.getApplicationURL();		//public String baseUrl= "http://demo.guru99.com/V4/()";
		public String userName= rc.getUserName();			//public String  userName= "mngr296371"();
		public String password= rc.getPassword();			//public String password= "zezynaj"();
		
		//browsers
		//public String chrome= "webdriver.chrome.driver";
		//public String chrome_path= "E:\\Eclipse Projects\\inetBankingV1\\Drivers\\chromedriver.exe";
		//public String firefox= "";
		
		
		@Parameters("browser")
		@BeforeClass
		public void setup(String br) {
			log=Logger.getLogger("eBanking");
			PropertyConfigurator.configure("Log4j.properties");
			
			if(br.equals("chrome")) {
			System.setProperty(rc.getChrome(),rc.getChromePath());
			driver=new ChromeDriver();
			}
			else if (br.equals("firefox")) {
				System.setProperty(rc.getFirefox(),rc.getGeckoPath());
				driver=new FirefoxDriver();
			}else {
				System.setProperty(rc.getEdge(),rc.getEdgePath());
				driver=new EdgeDriver();
			}
			
			driver.get(baseUrl);
			log.info("url is opened");
			
		}
		
		@AfterClass
		public void teardown() {
			driver.quit();
		}
		
		
		
		public void captureScreen(WebDriver driver, String tname) throws IOException {
			TakesScreenshot ts= (TakesScreenshot) driver;
			File source= ts.getScreenshotAs(OutputType.FILE);
			File target= new File(System.getProperty("user.dir"+"/Screenshots/"+tname + ".png"));
			FileUtils.copyFile(source, target);
			System.out.println("screenshot taken");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
