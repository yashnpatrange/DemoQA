package org.example.Pages.DemoQA;

import org.example.domain.AbstractPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Alerts extends AbstractPage {
    public Alerts(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String TimerAlert= "//button[@id='timerAlertButton']";
    static final String PromptAlert= "//button[@id='promtButton']";


    //Objects
    @FindBy(how= How.XPATH, using = TimerAlert)
    private WebElement timerAlert;
    @FindBy(how= How.XPATH, using = PromptAlert)
    private WebElement promptAlert;


    //methods to perform actions
    public void ClickTimerAlert() {
        timerAlert.click();
        //explicit wait
        Alert alert= wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.accept();
        driver.switchTo().defaultContent();
    }

    public void ClickPromptAlert() {
        promptAlert.click();
        //explicit wait
        Alert alert= wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.sendKeys("Generic Text");
        alert.accept();
        driver.switchTo().defaultContent();
    }

}
