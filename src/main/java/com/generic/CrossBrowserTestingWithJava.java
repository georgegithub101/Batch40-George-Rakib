package com.generic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTestingWithJava {
	public void getCrossBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			Object webdrivermanager;
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			System.out.println("Browser opened="+browser);
				} else if ()browser.equalsIgnoreCase("Firefox")){
					WebDriverManager.firefoxdriver().setup()
					FirefoxDriver driver = new FirefoxDriver();
					
					System.println.("Browser opened="+browser)
				}
	}

}
