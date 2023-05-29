package org.example.Pages.DemoQA;

import org.example.domain.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwagLabs extends AbstractPage {
    public SwagLabs(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String Username= "//input[@id='user-name']";
    static final String Password= "//input[@id='password']";
    static final String Firstname= "//input[@id='first-name']";
    static final String Lastname= "//input[@id='last-name']";
    static final String ContinueBtn= "//input[@id='continue']";
    static final String ZipCode= "//input[@id='postal-code']";
    static final String FinishBtn= "//button[@id='finish']";
    static final String Message= "//h2[text()='Thank you for your order!']";
    static final String Menu= "//button[@id='react-burger-menu-btn']";
    static final String Logout="//a[@id='logout_sidebar_link']";
    static final String ChkoutBtn="//button[@id='checkout']";
    static final String CartLogo="//a[@class='shopping_cart_link']";
    static final String Product1="//button[@id='add-to-cart-sauce-labs-backpack']";
    static final String Product2="//button[@id='add-to-cart-sauce-labs-bike-light']";
    static final String LogIn="//input[@id='login-button']";

    //Objects
    @FindBy(how= How.XPATH, using = Username)
    private WebElement username;
    @FindBy(how= How.XPATH, using = Password)
    private WebElement password;
    @FindBy(how= How.XPATH, using = ZipCode)
    private WebElement zipCode;
    @FindBy(how= How.XPATH, using = Firstname)
    private WebElement firstName;
    @FindBy(how= How.XPATH, using = Lastname)
    private WebElement lastName;
    @FindBy(how= How.XPATH, using = ContinueBtn)
    private WebElement cntBtn;
    @FindBy(how= How.XPATH, using = FinishBtn)
    private WebElement finishBtn;
    @FindBy(how= How.XPATH, using = Message)
    private WebElement message;
    @FindBy(how= How.XPATH, using = Menu)
    private WebElement menu;
    @FindBy(how= How.XPATH, using = Logout)
    private WebElement logout;
    @FindBy(how= How.XPATH, using = ChkoutBtn)
    private WebElement chkoutBtn;
    @FindBy(how= How.XPATH, using = CartLogo)
    private WebElement cartLogo;
    @FindBy(how= How.XPATH, using = Product1)
    private WebElement product1;
    @FindBy(how= How.XPATH, using = Product2)
    private WebElement product2;
    @FindBy(how= How.XPATH, using = LogIn)
    private WebElement login;

    //methods to perform actions
    public void enterUSerPass(String uname, String pass){
        username.sendKeys(uname);
        password.sendKeys(pass);
    }
    public void ClickLoginBtn(){
        login.click();
    }
    public void DisplayLogo(){
        cartLogo.isDisplayed();
    }
    public void Products(){
        product1.click();
        product2.click();
    }
    public void setCartLogo(){
        cartLogo.click();
    }
    public void setChkoutBtn(){
        chkoutBtn.click();
    }
    public void ClientInfo(String fname, String lname, String zipcode){
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        zipCode.sendKeys(zipcode);
        cntBtn.click();
    }
    public void setFinishBtn(){
        finishBtn.click();
    }
    public void setMenu(){
        menu.click();
    }
    public void LoggingOut(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(logout));
        logout.click();
    }
}
