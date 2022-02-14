package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.pom.BasePage;

public class CartPage extends BasePage {
	
	private final By productName=By.xpath("//*[text()='productName']") ;
	private final By checkOutBtn=By.xpath("//*[@class='checkout-button button alt wc-forward']");
	
	
	

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getproductnameAdd(String prodName) {
		return driver.findElement(By.xpath("//*[text()='"+prodName+"']"));
	}
	
	
	public String getProductName(String txt) {
		return getproductnameAdd(txt).getText();
	}
	public CheckOutPage checkoutClick() {
		driver.findElement(checkOutBtn).click();
		return new CheckOutPage(driver);
		
	}

}
