package org.example.Pages.DemoQA;

import org.example.domain.AbstractPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class FormRegister extends AbstractPage {
    public FormRegister(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String Firstname= "//input[@id='firstName']";
    static final String Lastname= "//input[@id='lastName']";
    static final String Email= "//input[@id='userEmail']";
    static final String Gender="//label[text()='Male']";
    static final String Number="//input[@id='userNumber']";
    static final String DOB="//input[@id='dateOfBirthInput']";
    static final String DayofMonth="//div[@aria-label='Choose Tuesday, May 16th, 2023']";
    static final String Subjects="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']";
    static final String Checkbox="//div[@class='col-md-9 col-sm-12']//child::input[@type='checkbox']";


    //Objects
    @FindBy(how= How.XPATH, using = Firstname)
    private WebElement firstname;
    @FindBy(how= How.XPATH, using = Lastname)
    private WebElement lastname;
    @FindBy(how= How.XPATH, using = Email)
    private WebElement email;
    @FindBy(how= How.XPATH, using = Gender)
    private WebElement gender;
    @FindBy(how= How.XPATH, using = Number)
    private WebElement number;
    @FindBy(how= How.XPATH, using = DOB)
    private WebElement dob;
    @FindBy(how= How.XPATH, using = DayofMonth)
    private WebElement dayofMonth;
    @FindBy(how= How.XPATH, using = Subjects)
    public WebElement subjects;
    @FindBy(how= How.XPATH, using = Checkbox)
    public WebElement checkbox;

    //methods to perform actions
    public void fillForm(String fname, String lname, String e_mail, String phoneNum) {
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(e_mail);
        gender.click();
        number.sendKeys(phoneNum);
        dob.click();
        dayofMonth.click();
//        subjects.click();
//        Actions actions= new Actions(driver);
//        actions.keyDown(Keys.CONTROL).click().build().perform();
        List<WebElement> checkboxes=checkbox;
    }
}

