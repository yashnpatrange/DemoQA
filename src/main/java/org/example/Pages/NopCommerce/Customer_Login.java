package org.example.Pages.NopCommerce;

import org.example.domain.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Customer_Login extends AbstractPage {
    public Customer_Login(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String Email="//input[@id='Email']";
    static final String Password="//input[@id='Password']";
    static final String LoginBtn="//button[@class='button-1 login-button']";
    static final String ViewDashboard="//h1[contains(text(),'Dashboard')]";
    static final String SelectCustomerTab="//i[@class='nav-icon far fa-user']";
    static final String SelectCustomerItem="//p[text()=' Customers']";
    static final String AddNewUser="//a[@href='/Admin/Customer/Create']";
    static final String CustEmail="//input[@id='Email']";
    static final String CustPassword="//input[@id='Password']";
    static final String FirstName="//input[@id='FirstName']";
    static final String LastName="//input[@id='LastName']";
    static final String GenderMale="//input[@id='Gender_Male']";
    static final String DOB="//input[@id='DateOfBirth']";
    static final String CompName="//input[@id='Company']";
    static final String NewsLetter="//select[@id='SelectedNewsletterSubscriptionStoreIds']";
    static final String AdminComment="//textarea[@id='AdminComment']";
    static final String SaveBtn="//button[@name='save']";
    static final String SuccessMsg="//div[text()='The new customer has been added successfully.']";

    //Objects
    @FindBy(how= How.XPATH, using =Email)
    private WebElement email;
    @FindBy(how= How.XPATH, using =Password)
    private WebElement password;
    @FindBy(how= How.XPATH, using =LoginBtn)
    private WebElement loginBtn;
    @FindBy(how= How.XPATH, using =ViewDashboard)
    private WebElement viewDashboard;
    @FindBy(how= How.XPATH, using =SelectCustomerTab)
    private WebElement selectCustomerTab;
    @FindBy(how= How.XPATH, using =SelectCustomerItem)
    private WebElement selectCustomerItem;
    @FindBy(how= How.XPATH, using =AddNewUser)
    private WebElement addNewUser;
    @FindBy(how= How.XPATH, using =CustEmail)
    private WebElement custEmail;
    @FindBy(how= How.XPATH, using =CustPassword)
    private WebElement custPassword;
    @FindBy(how= How.XPATH, using =FirstName)
    private WebElement firstName;
    @FindBy(how= How.XPATH, using =LastName)
    private WebElement lastName;
    @FindBy(how= How.XPATH, using =GenderMale)
    private WebElement genderMale;
    @FindBy(how= How.XPATH, using =DOB)
    private WebElement dob;
    @FindBy(how= How.XPATH, using =CompName)
    private WebElement compName;
    @FindBy(how= How.XPATH, using =NewsLetter)
    private WebElement newsLetter;
    @FindBy(how= How.XPATH, using =AdminComment)
    private WebElement adminComment;
    @FindBy(how= How.XPATH, using =SaveBtn)
    private WebElement saveBtn;
    @FindBy(how= How.XPATH, using =SuccessMsg)
    private WebElement successMsg;

    //methods to perform actions
    public void setEmailPassword(String e_mail, String passwd) {
        email.clear();
        password.clear();
        email.sendKeys(e_mail);
        password.sendKeys(passwd);
    }
    public void setLoginBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();
    }
    public void setViewDashboard(){
        viewDashboard.isDisplayed();
    }
    public void setSelectCustomer() {
        selectCustomerTab.click();
        wait.until(ExpectedConditions.elementToBeClickable(selectCustomerItem));
        selectCustomerItem.click();
    }
    public void setAddNewUser(){
        addNewUser.click();
    }
    public void fillCustInfo(String e_mail, String passwd, String fname, String lname, String Dob, String CompanyName, String addComment ){
        custEmail.sendKeys(e_mail);
        custPassword.sendKeys(passwd);
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        genderMale.click();
        dob.sendKeys(Dob);
        compName.sendKeys(CompanyName);
//        Select select= new Select(newsLetter);
//        select.selectByValue("2");
        adminComment.sendKeys(addComment);
    }
    public void setSaveBtn(){
        saveBtn.click();
    }
    public void UserAddedMsg(String msg){
        successMsg.isDisplayed();
    }

}
