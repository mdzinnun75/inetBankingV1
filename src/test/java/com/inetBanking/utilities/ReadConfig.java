package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configuration\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
			
			
		} catch (Exception e) {
				System.out.println("exception is "+ e.getMessage());

		}
		
		
	}
	
	
	
	public String getApplicationURL() {

		String url= pro.getProperty("baseUrl");
		return url;
		
	}
	
	public String getUserName() {

		String userName= pro.getProperty("userName");
		return userName;
		
	}
	
	public String getPassword() {

		String password= pro.getProperty("password");
		return password;
		
	}
	
	public String getChrome() {
		
		String chrome= pro.getProperty("chrome");
		return chrome;
		
	}

	public String getChromePath() {
		
		String chrome_path= pro.getProperty("chrome_path");
		return chrome_path;
		
	}
	public String getFirefox() {
			
			String firefox= pro.getProperty("firefox");
			return firefox;
			
		}
	public String getGeckoPath() {
		
		String gecko_path= pro.getProperty("gecko_path");
		return gecko_path;
		
	}
	
	public String getEdge() {
		
		String edge= pro.getProperty("edge");
		return edge;
		
	}
	public String getEdgePath() {
		
		String edge_path= pro.getProperty("edge_path");
		return edge_path;
		
	}
	
	

}
