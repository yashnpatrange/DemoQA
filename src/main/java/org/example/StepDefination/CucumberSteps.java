package org.example.StepDefination;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class CucumberSteps{

    public WebDriver driver;

    @Before
    public void BeforeAllTests(){
        System.out.println("Printing before all tests");
    }

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
    @And("the user clicks on 'Checkout' button")
    public void ClickOnCheckoutButton() {
        WebElement ChkoutBtn= driver.findElement(By.xpath("//button[@id='checkout']"));
        ChkoutBtn.click();
    }
    @When("the user enters firstname {string}  ,lastname {string} and zipcode {string}")
    public void CheckoutInfo(String fname, String lname, String zip) {
        WebElement firstName= driver.findElement(By.xpath("//input[@id='first-name']"));
        WebElement lastName= driver.findElement(By.xpath("//input[@id='last-name']"));
        WebElement zipCode= driver.findElement(By.xpath("//input[@id='postal-code']"));
        WebElement cntBtn= driver.findElement(By.xpath("//input[@id='continue']"));
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        zipCode.sendKeys(zip);
        cntBtn.click();
    }
    @And("the user click on 'Finish' button")
    public void ClickOnFinishBtn() {
        WebElement finishBtn= driver.findElement(By.xpath("//button[@id='finish']"));
        finishBtn.click();
    }
    @Then("final message is displayed {string}")
    public void finalMsg(String msg) {
        WebElement message= driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
        assertTrue(message.isDisplayed());
    }
    @And("the user clicks on 'open menu' icon")
    public void ClicksOnMenu() {
        WebElement menu= driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        menu.click();
    }
    @When("the user click on 'Logout' link")
    public void ClickOnLogout() {
        WebElement logout= driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(logout));
        logout.click();
        System.out.println("USer logged out");
    }
    @And("(the user) closes the browser")
    public void CloseBrowser(){
        driver.close();
        driver.quit();
    }



}
