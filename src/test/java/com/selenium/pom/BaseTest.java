package com.selenium.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.selenium.factory.DriverManagerClass;

public class BaseTest {
	private ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public void setDriver(WebDriver driver) {
		this.driver.set(driver);
	}
	
	public WebDriver getDriver() {
		return this.driver.get();
	}
	
	@Parameters("browser")
	@BeforeMethod
	public void driverStart(String browser)
	{
		browser=System.getProperty("browser");
		setDriver(new DriverManagerClass().initializDriver( browser));
//		driver=new DriverManagerClass().initializDriver( browser);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	@AfterMethod
	public void driverQuit() throws InterruptedException {
		Thread.sleep(100);
		getDriver().quit();
	}
}
