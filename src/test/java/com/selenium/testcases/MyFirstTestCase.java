package com.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.CartPage;
import com.selenium.pages.HomePage;
import com.selenium.pages.StorePage;
import com.selenium.pom.BaseTest;



public class MyFirstTestCase extends BaseTest {

	
	
	@Test
	public void guestCheckOut() throws InterruptedException {
		driver.get("https://askomdch.com");
		HomePage homepage=new HomePage(driver);
		StorePage storePage=homepage.clickMenuStore();
		Thread.sleep(3000);
//		storePage.enterTextboxField("Blue");
//		storePage.clicSearchBtn();
		storePage.searchaProduct("Blue").clickAddToCartBtn(); //functional approach
		Assert.assertEquals(storePage.getTitile(), "Search results: “Blue”");
		Thread.sleep(2000);
		CartPage cart=storePage.viewCart();
		//storePage.clickAddToCartBtn();
		Assert.assertEquals(cart.getProductName("Blue Shoes"), "Blue Shoes");
		cart.checkoutClick();
		driver.findElement(By.xpath("//*[@class='checkout-button button alt wc-forward']")).click();
		driver.findElement(By.xpath("//*[@id='billing_first_name']")).sendKeys("Sufail");
		driver.findElement(By.xpath("//*[@id='billing_last_name']")).sendKeys("S");
		driver.findElement(By.xpath("//*[@id='billing_address_1']")).sendKeys("San Francisco");
		driver.findElement(By.xpath("//*[@id='billing_city']")).sendKeys("Landro");
		driver.findElement(By.xpath("//*[@id='billing_postcode']")).sendKeys("24627");
		driver.findElement(By.xpath("//*[@id='billing_email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id='place_order']")).click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(By.cssSelector(".woocommerce-notice")).getText(),
				"Thank you. Your order has been received");
		
		
		//driver.quit();
		
		
	}
	
	
	
	
	@Test
	public void loginCheckout() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriverexe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://askomdch.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menu-item-1227\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"woocommerce-product-search-field-0\"]")).sendKeys("Blue");
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Assert.assertEquals(
				driver.findElement(By.xpath("//*[@class=\"woocommerce-products-header__title page-title\"]")).getText(),
				"Search results: “Blue”");
		driver.findElement(By.xpath("(//*[text()='Add to cart'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[title='View cart']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Blue Shoes']")).getText(), "Blue Shoes");
		driver.findElement(By.xpath("//*[@class='checkout-button button alt wc-forward']")).click();
		driver.findElement(By.xpath("//*[@class='showlogin']")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sufail");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("qwas");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='billing_first_name']")).sendKeys("Sufail");
		driver.findElement(By.xpath("//*[@id='billing_last_name']")).sendKeys("S");
		driver.findElement(By.xpath("//*[@id='billing_address_1']")).sendKeys("San Francisco");
		driver.findElement(By.xpath("//*[@id='billing_city']")).sendKeys("Landro");
		driver.findElement(By.xpath("//*[@id='billing_postcode']")).sendKeys("24627");
		driver.findElement(By.xpath("//*[@id='billing_email']")).clear();
		driver.findElement(By.xpath("//*[@id='billing_email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id='place_order']")).click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(By.cssSelector(".woocommerce-notice")).getText(),
				"Thank you. Your order has been received");
		
		
		driver.quit();
		
		
	}
	

}
