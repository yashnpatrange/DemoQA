package org.example.StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberSteps{

    public WebDriver driver;

    @Given("the user opens the browser and lands on {string}")
    public void OpenBrowser(String website) {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(website);

    }
    @When("the user enters {string} and {string}")
    public void EnterCredentials(String username, String password){
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @Then("the user should be able to login")
    public void logIn(){
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }


    @And("(the user) closes the browser")
    public void CloseBrowser(){
        driver.close();
        driver.quit();
    }


//    public void theUserOpensTheBrowserAndLandsOn(String arg0) {
//    }
//
//
//    public void theUserShouldBeAbleToLogin() {
//    }
}
