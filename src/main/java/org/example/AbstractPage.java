package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected ChromeOptions options;

    //Constructor of Abstract class (Super)
    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        options.addArguments("download.default.directory", "C:\\Users\\ypatrange\\Downloads");
//        this.driver= new ChromeDriver(options);
        PageFactory.initElements(driver, this);
    }
}
