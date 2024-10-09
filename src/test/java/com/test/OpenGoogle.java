package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {

    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Open a website (Google in this case)
        driver.get("https://www.google.com");
        
        // Print the title of the current page
        System.out.println("Page Title: " + driver.getTitle());
        
        // Close the browser
        driver.quit();
    }
}
