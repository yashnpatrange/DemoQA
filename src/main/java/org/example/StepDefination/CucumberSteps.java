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

    @Given("the user opens the browser and navigates to the homepage {string}")
    public void OpenBrowser(String website) {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(website);
    }
    @When("the user enters {string} and {string}")
    public void EnterCredentials(String username, String password){
        WebElement uname= driver.findElement(By.xpath("//input[@id='user-name']"));
        uname.sendKeys(username);
        WebElement paswd=driver.findElement(By.xpath("//input[@id='password']"));
        paswd.sendKeys(password);
    }
    @Then("the user should be able to login")
    public void logIn(){
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
    @And("the 'Sauce Labs' logo is displayed")
    public void theLogoIsDisplayed() {
        driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
    }
    @When("the user clicks on 'Add Product button'")
    public void addProducts() {
        WebElement Product1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        WebElement Product2= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        Product1.click();
        Product2.click();
    }
    @Then("the user click on cart logo")
    public void theUserClickOnCartLogo() {
        WebElement cartLogo= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartLogo.click();
    }
    @And("(the user) closes the browser")
    public void CloseBrowser(){
        driver.close();
        driver.quit();
    }



}
