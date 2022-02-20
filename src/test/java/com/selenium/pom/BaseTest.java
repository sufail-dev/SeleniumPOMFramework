package com.selenium.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.selenium.factory.DriverManagerClass;

public class BaseTest {
	protected WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void driverStart(String browser)
	{
		driver=new DriverManagerClass().initializDriver( browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	@AfterMethod
	public void driverQuit() {
		driver.quit();
	}
}
