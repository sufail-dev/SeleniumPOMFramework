package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.pom.BasePage;

public class StorePage extends BasePage {
	private final By searchBox=By.xpath("//*[@id=\"woocommerce-product-search-field-0\"]");
	private final By searchbtn=By.xpath("//*[text()='Search']");
	private final By title=By.xpath("//*[@class=\"woocommerce-products-header__title page-title\"]");
	private final By addToCartBtn=By.xpath("(//*[text()='Add to cart'])[1]");
	private final By viewCart=By.cssSelector("a[title='View cart']");

	public StorePage(WebDriver driver) {
		super(driver);
		
	}
	
	private StorePage enterTextboxField(String txt) {
		driver.findElement(searchBox).sendKeys(txt);
		return this;
	}
	
	private StorePage clicSearchBtn() {
		driver.findElement(searchbtn).click();
		return this;
	}
	public String getTitile() {
		return driver.findElement(title).getText();
	}
	public StorePage clickAddToCartBtn() {
		driver.findElement(addToCartBtn).click();
		return this;
	}
	
	public CartPage viewCart() {
		driver.findElement(viewCart).click();
		return new CartPage(driver);
	}
	//functional PO method
	
	public StorePage searchaProduct(String txt) {
		enterTextboxField(txt).clicSearchBtn();
		return this;
	}

}
