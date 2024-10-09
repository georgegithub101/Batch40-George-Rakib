package com.test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
    public void getLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.automationexercise.com/");
    
    driver.findElement(By.xpath("//i[@class=\"fa fa-lock\"]")).click();
    
    driver.findElement(By.xpath("//input[@name=\"email\"][1]")).sendKeys("ghdhd");
    
    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("ghdhd");
    
    if (driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")).isDisplayed()) {
        System.out.println("Login successful");
    } else {
        System.out.println("Login Failed"); /// 8/28 8:35min
    }
   
    }
}
