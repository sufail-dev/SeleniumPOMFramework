package com.selenium.pom;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void loadUrl(String url) {
		driver.get(url);
	}
}
