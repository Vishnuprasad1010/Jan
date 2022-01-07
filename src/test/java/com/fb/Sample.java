package com.fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	@Parameters({"browser"})
	@Test
	private void launchBrowser(String name) {
	
		if(name.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		}
		else if(name.equalsIgnoreCase("FireFox")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(); 
		}
		if(name.equalsIgnoreCase("Edge")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		
		}
	}
}
	
		

		

	

