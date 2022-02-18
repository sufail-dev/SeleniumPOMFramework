package com.selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverManagerClass {
	
	
	public WebDriver initializDriver() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriverexe\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://askomdch.com");
		driver.manage().window().maximize();
		return driver;
	}

}
