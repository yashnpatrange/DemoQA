package org.example.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DefaultLocalDriverFactory {

    public WebDriver create(){
        switch (System.getProperty("browser").toLowerCase()){
            case "firefox":
                return new FirefoxDriver();
            case "chrome":
                return new ChromeDriver();
            default:
                return new EdgeDriver();
        }
    }
}
