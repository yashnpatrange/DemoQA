package org.example.Pages.DemoQA;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.example.domain.AbstractPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

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
    static final String Checkbox1="//label[text()='Sports']";
    static final String Checkbox2="//label[text()='Music']";
    static final String UploadFile="//input[@id='uploadPicture']";
    static final String FilePath="C:\\Users\\ypatrange\\Downloads\\Batman.jpeg";
    static final String Address="//textarea[@id='currentAddress']";
    static final String State="//div[@id='state']";


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
    @FindBy(how= How.XPATH, using = Address)
    public WebElement address;
    @FindBy(how= How.XPATH, using = State)
    public WebElement state;


    //methods to perform actions
    public void fillForm(String fname, String lname, String e_mail, String phoneNum, String addrs) throws InterruptedException {
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(e_mail);
        gender.click();
        number.sendKeys(phoneNum);
        dob.click();
        wait.until(ExpectedConditions.elementToBeClickable(dayofMonth));
        dayofMonth.click();
        address.sendKeys(addrs);
//        state.sendKeys("NCR" + Keys.ENTER);
       // uploadFile.sendKeys("C:/Users/ypatrange/Downloads/Batman.jpeg");
//        Actions actions= new Actions(driver);
//        actions.keyDown(Keys.CONTROL).click().build().perform();
    }

    public void StateAndCity(){
        state.click();


    }

    public  void Chk(){
        System.out.println("Before Checkbox clicked");
        //wait.until(ExpectedConditions.elementToBeClickable(checkbox1));
        //driver.execute_script("arguments[0].click():", checkbox1);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", checkbox1);
        js.executeScript("arguments[0].click();", checkbox2);
        //checkbox1.click();
        System.out.println("After");
    }


    public void SelectSubject1() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement del= driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        js.executeScript("arguments[0].click();", del);
        del.sendKeys("Maths");
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='subjectsInput']")));
//        List<WebElement> suggestions = driver.findElements(By.xpath("//input[@id='subjectsInput']"));
//        suggestions.get(0).click();
    }
}

