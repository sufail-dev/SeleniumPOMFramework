package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.selenium.pom.BasePage;

public class CheckOutPage extends BasePage {
	
	private final By firstName=By.xpath("//*[@id='billing_first_name']");
	private final By lastName=By.xpath("//*[@id='billing_last_name']");
	private final By billingAddress= By.xpath("//*[@id='billing_address_1']");
	private final By billingCity=By.xpath("//*[@id='billing_city']");
	private final By postalCode=By.xpath("//*[@id='billing_postcode']");
	private final By billingEmail=By.xpath("//*[@id='billing_email']");
	private final By placeOrderButton=By.xpath("//*[@id='place_order']");
	private final By successMessage=By.cssSelector(".woocommerce-notice");
	private final By countryDropdown=By.xpath("//select[@id='billing_country']");
	private final By stateDropDown=By.xpath("//select[@id='billing_state']");

	public CheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	public CheckOutPage enterFirstName(String first_name) {
		driver.findElement(firstName).sendKeys(first_name);
		return this;
	}
	
	public CheckOutPage enterLastName(String last_name) {
		driver.findElement(lastName).sendKeys(last_name);
		return this;
	}
	
	public CheckOutPage enterBillingAddress(String billing_address) {
		driver.findElement(billingAddress).sendKeys(billing_address);
		return this;
	}
	public CheckOutPage enterBillingCity(String billing_city) {
		driver.findElement(billingCity).sendKeys(billing_city);
		return this;
	}
	public CheckOutPage enterPostalCode(String postal_Code) {
		driver.findElement(postalCode).sendKeys(postal_Code);
		return this;
	}
	public CheckOutPage enterBillingEmail(String billing_email) {
		driver.findElement(billingEmail).sendKeys(billing_email);
		return this;
	}
	public CheckOutPage clickPlaceOrderButton() {
		driver.findElement(placeOrderButton).click();
		return this;
	}
	
	public CheckOutPage selectCountry(String countryName) {
		Select drp=new Select(driver.findElement(countryDropdown));
		drp.selectByVisibleText(countryName);
		return this;
	} 
	
	public CheckOutPage selectState(String stateName) {
		Select drp=new Select(driver.findElement(stateDropDown));
		drp.selectByVisibleText(stateName);
		return this;
	} 
	
	
	
	
	
	public String getsuccessMessage() {
		return driver.findElement(successMessage).getText();
	}
	
	
	

}
