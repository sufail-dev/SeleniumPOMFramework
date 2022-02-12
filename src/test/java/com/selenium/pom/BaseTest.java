package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.selenium.factory.DriverManagerClass;

public class BaseTest {
	protected WebDriver driver;
	
	
	@BeforeMethod
	public void driverStart()
	{
		driver=new DriverManagerClass().initializDriver();
	}
	
	@AfterMethod
	public void driverQuit() {
		driver.quit();
	}
}
