package org.example.Pages.DemoQA;

import org.example.domain.AbstractPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
    static final String Checkbox1="//label[text()='Sports' and (@class='custom-control-label')]";
    static final String Checkbox2="//label[text()='Music' and (@class='custom-control-label')]";
    static final String UploadFile="//input[@id='uploadPicture']";
    static final String FilePath="C:\\Users\\ypatrange\\Downloads\\Batman.jpeg";


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
    @FindBy(how= How.XPATH, using = Checkbox1)
    public WebElement checkbox1;
    @FindBy(how= How.XPATH, using = Checkbox2)
    public WebElement checkbox2;
    @FindBy(how= How.XPATH, using = UploadFile)
    public WebElement uploadFile;
    @FindBy(how= How.XPATH, using = FilePath)
    public WebElement filePath;

    //methods to perform actions
    public void fillForm(String fname, String lname, String e_mail, String phoneNum) {
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(e_mail);
        gender.click();
        number.sendKeys(phoneNum);
        dob.click();
        dayofMonth.click();
        checkbox1.isSelected();
        checkbox2.isSelected();
        uploadFile.sendKeys("C:/Users/ypatrange/Downloads/Batman.jpeg");
//        WebElement checkbox21=wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox1);
//        subjects.click();
//        Actions actions= new Actions(driver);
//        actions.keyDown(Keys.CONTROL).click().build().perform();
        //checkbox1.isSelected();
        //checkbox2.click();
    }
}

