package com.cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/cucumber/features", 
glue = "com/cucumber/stepdefination", 
stepNotifications = true,
tags="@SeleniumTest",
plugin= {"pretty","html:test-output/CucumberReport/cucumber.html", "junit:test-output/CucumberReport/cucumber.xml"},
monochrome=true)
public class TestRunnerJunit {
	
}
