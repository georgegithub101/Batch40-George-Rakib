package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	WebDriver driver;
	public webDriver getChromeDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			return driver;
		
	}
	
	
	public webDriver getEdgeDriver() {
		
		WebDriverManager.Edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
			return driver;
		
	}
	
	public webDriver getFirefoxDriver() {
		
		WebDriverManager.Firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
			return driver;
		
	}
}
