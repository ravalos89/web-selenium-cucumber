package com.cucumber.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties properties;
	
	public static WebDriver getWebDriver() throws IOException {
		// Get URL from properties
		properties = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ravalos\\Documents\\AutomationRicardo\\eclipse-workspace-cooltesters"
				+ "\\CucumberAutomation\\src\\main\\resources\\com\\cucumber\\config\\config.properties");
		properties.load(fis);
				
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
    	driver.get(properties.getProperty("URL"));
    	driver.manage().window().maximize();
    	return driver;
	}
	
	

}
