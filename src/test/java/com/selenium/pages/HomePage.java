package com.selenium.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.pom.BasePage;
import com.selenium.utils.ConfigLoader;

public class HomePage extends BasePage {
	ConfigLoader loader;
	private final By storeLin=By.xpath("//*[@id=\"menu-item-1227\"]/a");
	

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	public HomePage urlnavigate() throws IOException {
		loadUrl(ConfigLoader.getInstance().getbaseUrl());
		return this;
	}
	
	
	public StorePage clickMenuStore() {
		driver.findElement(storeLin).click();
		return new StorePage(driver);
	}

}
