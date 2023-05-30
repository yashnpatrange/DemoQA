package org.example.Pages.DemoQA;


import org.example.domain.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DownloadUpload extends AbstractPage {

    public DownloadUpload(WebDriver driver) {
        super(driver);
    }
    //Locators
    static final String DwldBtn= "//a[@id='downloadButton']";
    static final String UploadBtn="//label[text()='Select a file']";
    static final String ChooseFile="//input[@id='uploadFile']";
    static final String FilePath="C:\\Users\\ypatrange\\Downloads\\sampleFile.jpeg";

    //Objects
    @FindBy(how= How.XPATH, using = DwldBtn)
    private WebElement dwldBtn;
    @FindBy(how= How.XPATH, using = UploadBtn)
    private WebElement uploadBtn;
    @FindBy(how= How.XPATH, using = ChooseFile)
    private WebElement chooseFile;
    @FindBy(how= How.XPATH, using = FilePath)
    private WebElement filepath;

    //methods to perform actions
    //Download function
    public void ClickDwldBtn(){
        dwldBtn.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='sampleFile.jpeg']")));
        //File dwldFile= new File("C:\\Users\\ypatrange\\Downloads\\sampleFile.jpeg");
        //assertTrue(dwldFile.exists());
    }

    //Upload function
    public void ClickUploadBtn(){
        Actions actions = new Actions(driver);
        actions.click(uploadBtn).build().perform();
        chooseFile.sendKeys("C:\\Users\\ypatrange\\Downloads\\sampleFile.jpeg");

    }
}
