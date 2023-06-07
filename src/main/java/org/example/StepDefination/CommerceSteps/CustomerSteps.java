package org.example.StepDefination.CommerceSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.NopCommerce.Customer_Login;
import org.example.driver.DefaultLocalDriverFactory;
import org.openqa.selenium.WebDriver;


public class CustomerSteps {

    public WebDriver driver;

    @Given("User launch the browser")
    public void OpenBrowser() {
        driver= new DefaultLocalDriverFactory().create();
//        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @When("user opens url {string}")
    public void userOpensUrl(String website) {
        driver.get(website);
        driver.getTitle();
    }
    @And("user enters email {string} and password {string}")
    public void EnterEmailPasswd(String e_mail, String passwd) {
        Customer_Login customer_login= new Customer_Login(driver);
        customer_login.setEmailPassword(e_mail, passwd);
    }
    @And("user clicks on login")
    public void userClicksOnLogin() {
        Customer_Login customer_login= new Customer_Login(driver);
        customer_login.setLoginBtn();
    }
    @Then("user can view the dashboard")
    public void viewTheDashboard() {
        Customer_Login customer_login= new Customer_Login(driver);
        customer_login.setViewDashboard();
    }
    @And("from the customers tab user selects customers item")
    public void SelectsCustomersItem() {
        Customer_Login customer_login= new Customer_Login(driver);
        customer_login.setSelectCustomer();
    }
    @And("user clicks on 'Add new' button")
    public void AddNewButton() {
        Customer_Login customer_login= new Customer_Login(driver);
        customer_login.setAddNewUser();
    }
    @When("user enters the info")
    public void EnterInfo() {
        Customer_Login customer_login= new Customer_Login(driver);
        customer_login.fillCustInfo("jwick@gmail.com", "jWick@123", "John", "Wick", "1/2/2019", "QAC",
                "Generic Comment");
    }
    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        Customer_Login customer_login= new Customer_Login(driver);
        customer_login.setSaveBtn();
    }
    @Then("user can see the message- 'The new customer has been added successfully'")
    public void userCanSeeTheMessage() {
        Customer_Login customer_login= new Customer_Login(driver);
        customer_login.UserAddedMsg();
    }

    @And("closes the browser")
    public void closesTheBrowser() {
        driver.quit();
    }

}
