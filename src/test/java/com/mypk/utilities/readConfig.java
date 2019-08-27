package com.mypk.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	Properties pro;
	
	public readConfig() {
		
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
	
		public String getApplicationURL() {
			String	getUrl=	pro.getProperty("baseURL");
			return getUrl;
		}
		
		public String getChromeURL() {
		String chrome =	pro.getProperty("chromepath");
			return chrome;
			
		}

}
