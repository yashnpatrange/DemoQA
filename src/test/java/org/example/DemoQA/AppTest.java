package org.example.DemoQA;

import org.example.Pages.DemoQA.Alerts;
import org.example.Pages.DemoQA.DownloadUpload;
import org.example.Pages.DemoQA.WindowHandle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public void Test_2() {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Alerts alerts = new Alerts(driver);
        alerts.ClickPromptAlert();
    }

    @Test
    public void Test_3()  {
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        DownloadUpload downloadUpload= new DownloadUpload(driver);
        downloadUpload.ClickDwldBtn();
    }

    @Test
    public void Test_4() {
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        WindowHandle windowHandle= new WindowHandle(driver);
        windowHandle.ClickNewTab();
    }
}

