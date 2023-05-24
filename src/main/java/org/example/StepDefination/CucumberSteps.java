package org.example.StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberSteps{

    public WebDriver driver;

    @Given("(the user) opens the browser and lands on LogIn page")
    public void OpenBrowser() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
    @When("(the user) enters username and password")
    public void EnterCredentials(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    }

    @Then("(the user) should be able to login")
    public void logIn(){
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }


    @And("(the user) closes the browser")
    public void CloseBrowser(){
        driver.close();
        driver.quit();
    }
}
