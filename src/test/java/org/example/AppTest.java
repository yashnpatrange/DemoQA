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
    public void Test_1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Alerts alerts = new Alerts(driver);
        alerts.ClickTimerAlert();
        Thread.sleep(2000);
    }

    @Test
    public void Test_2() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Alerts alerts = new Alerts(driver);
        alerts.ClickPromptAlert();
        Thread.sleep(3000);
    }

    @Test
    public void Test_3() throws InterruptedException {
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        DownloadUpload downloadUpload= new DownloadUpload(driver);
        downloadUpload.ClickDwldBtn();
        Thread.sleep(3000);
    }
}
