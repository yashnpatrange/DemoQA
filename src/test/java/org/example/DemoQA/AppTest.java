package org.example.DemoQA;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Pages.DemoQA.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    public static WebDriver driver;
    public Logger logger= LogManager.getLogger(AppTest.class);

    @BeforeEach
    public void setup() {
        logger.info("test case Started"); //logger
        driver = new ChromeDriver();
    }
    @AfterEach
    public void cleanUp() {
        driver.quit();
    }

    //method to run tests
    @Test
    public void Test_1() { //Alerts
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Alerts alerts = new Alerts(driver);
        alerts.ClickTimerAlert();
    }

    @Test
    public void Test_2() { // Prompts
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Alerts alerts = new Alerts(driver);
        alerts.ClickPromptAlert();
    }

    @Test
    public void Test_3()  { //Download-upload
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        DownloadUpload downloadUpload= new DownloadUpload(driver);
        downloadUpload.ClickDwldBtn();
    }

    @Test
    public void Test_4() { //Window handling
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        WindowHandle windowHandle= new WindowHandle(driver);
        windowHandle.ClickNewTab();
    }

    @Test
    public void Test_5() { //Widgets- Date Picker
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();
        DatePicker datePicker= new DatePicker(driver);
        datePicker.setDatePicker();
        datePicker.setMonth();
        datePicker.setDay();
    }

    @Test
    public void Test_6() { //Drag and drop the element
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        DragNDropElement dragNDropElement= new DragNDropElement(driver);
        dragNDropElement.DragandDrop();
    }

    @Test //under test
    public void Test_7() throws InterruptedException { //Registration form with upload function
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        FormRegister formRegister= new FormRegister(driver);
        formRegister.fillForm("John", "Wick", "Jwick@gmail.com","9058648888");
        Thread.sleep(3000);
    }

}

