package com.stepdef;
///date 9-28-24
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.DriverManager;
import com.pagefactory.MasterPageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition { // corrected class name

    MasterPageFactory mpf;
    WebDriver driver;
    DriverManager dm;

    @Given("open the browser")
    public void open_the_browser() {
        WebDriverManager.chromedriver().setup(); // set up the ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser window
        
        dm = new DriverManager();
        
    }

    @Given("Pass the URL {string}")
    public void pass_the_URL(String aeURL) {
        driver.navigate().to(aeURL); // navigate to the URL
    }

    @When("Click on Login button")
    public void click_on_Login_Button() {
        mpf = new MasterPageFactory(driver); // initialize the page factory
        mpf.getSigninbtn_homepage().click(); // click the login button
    }

    @When("Enter Email {string}")
    public void enter_email(String email) {
        mpf.getEmail().sendKeys(email); // enter email
    }

    @When("Enter Password {string}")
    public void enter_password(String password) {
        mpf.getPassword().sendKeys(password); // enter password
    }

    @When("Click on login button")
    public void click_on_login_button() {
        mpf.getLogin_btn().click(); // click the login button
    }

    @Then("Validate login is successful")
    public void validate_login_is_successful() {
        Assert.assertTrue("Login not successful", mpf.getLogout_btn().isDisplayed()); // check if logout button is displayed, indicating successful login
    }
}
