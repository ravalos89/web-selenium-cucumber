package com.cucumber.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By txtSearch = By.xpath("//input[@type='search']");
	By lblProductName = By.cssSelector("h4.product-name");
	
	public void typeVegetable(String vegetable) throws InterruptedException {
		driver.findElement(txtSearch).sendKeys(vegetable);
		Thread.sleep(3000);
	}
	
	public boolean validateVegetableResult(String vegetable) {
		return driver.findElement(lblProductName).getText().contains(vegetable);
	}

}
