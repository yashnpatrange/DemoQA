package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AppTest {
    public static WebDriver driver;
    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }
    @AfterEach
    public void cleanUp() {
        driver.quit();
    }

    //method to run tests
    @Test
    public void Test_1() {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Alerts alerts = new Alerts(driver);
        alerts.ClickTimerAlert();
    }

    @Test
    public void Test_2(){
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Alerts alerts = new Alerts(driver);
        alerts.ClickPromptAlert();
    }

    @Test
    public void Test_3() {
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        DownloadUpload downloadUpload= new DownloadUpload(driver);
        downloadUpload.ClickDwldBtn();
    }
}
