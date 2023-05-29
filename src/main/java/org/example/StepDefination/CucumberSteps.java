package org.example.StepDefination;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.DemoQA.SwagLabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public void EnterCredentials(String uname, String pass){
        SwagLabs swagLabs= new SwagLabs(driver);
        swagLabs.enterUSerPass(uname, pass);
    }
    @Then("the user should be able to login")
    public void logIn(){
        SwagLabs swagLabs= new SwagLabs(driver);
        swagLabs.ClickLoginBtn();
    }
    @And("the 'Sauce Labs' logo is displayed")
    public void theLogoIsDisplayed() {
        SwagLabs swagLabs= new SwagLabs(driver);
        swagLabs.DisplayLogo();
    }
    @When("the user clicks on 'Add Product button'")
    public void addProducts() {
        SwagLabs swagLabs= new SwagLabs(driver);
        swagLabs.Products();
    }
    @Then("the user click on cart logo")
    public void theUserClickOnCartLogo() {
        SwagLabs swagLabs= new SwagLabs(driver);
        swagLabs.setCartLogo();
    }
    @And("the user clicks on 'Checkout' button")
    public void ClickOnCheckoutButton() {
        SwagLabs swagLabs= new SwagLabs(driver);
        swagLabs.setChkoutBtn();
    }
    @When("the user enters firstname {string}  ,lastname {string} and zipcode {string}")
    public void CheckoutInfo(String f_name, String l_name, String zip) {
        SwagLabs swagLabs= new SwagLabs(driver);
        swagLabs.ClientInfo(f_name, l_name, zip);
    }
    @And("the user click on 'Finish' button")
    public void ClickOnFinishBtn() {
        SwagLabs swagLabs= new SwagLabs(driver);
        swagLabs.setFinishBtn();
    }
    @Then("final message is displayed")
    public void finalMsg() {
        WebElement message= driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
        assertTrue(message.isDisplayed());
    }
    @And("the user clicks on 'open menu' icon")
    public void ClicksOnMenu() {
        SwagLabs swagLabs= new SwagLabs(driver);
        swagLabs.setMenu();
    }
    @When("the user click on 'Logout' link")
    public void ClickOnLogout() {
        SwagLabs swagLabs= new SwagLabs(driver);
        swagLabs.LoggingOut();
        System.out.println("User logged out");
    }
    @And("(the user) closes the browser")
    public void CloseBrowser(){
        driver.close();
        driver.quit();
    }

}