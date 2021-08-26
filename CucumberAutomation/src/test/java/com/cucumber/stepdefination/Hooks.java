package com.cucumber.stepdefination;

import com.cucumber.base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	@Before("@MobileTesting")
	public void beforeTest() {
		System.out.println("Mobile Hook");
	}
	
	@After("@SeleniumTest")
	public void afterSeleniumTests() {
		System.out.println("Close Browser");
		driver.close();
	}

}
