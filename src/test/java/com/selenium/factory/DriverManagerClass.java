package com.selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverManagerClass {
	
	WebDriver driver;
	public WebDriver initializDriver(String browser) {
		
		//String browserName=System.getProperty("browser",browser);
		String browserName=browser;
		switch(browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriverexe\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "Firefox":
			System.out.println("firefox going to exceute");
			break;
			default: 
				throw new IllegalStateException("invalid browser name: "+browserName);
		}
		
		
//		WebDriverManager.chromedriver().setup();
//		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriverexe\\chromedriver.exe");
//		//WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		//driver.get("https://askomdch.com");
//		driver.manage().window().maximize();
		return driver;
	}

}
