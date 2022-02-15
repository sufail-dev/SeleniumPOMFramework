package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.pom.BasePage;

public class HomePage extends BasePage {
	private final By storeLin=By.xpath("//*[@id=\"menu-item-1227\"]/a");
	

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	public HomePage urlnavigate() {
		loadUrl("https://askomdch.com");
		return this;
	}
	
	
	public StorePage clickMenuStore() {
		driver.findElement(storeLin).click();
		return new StorePage(driver);
	}

}
