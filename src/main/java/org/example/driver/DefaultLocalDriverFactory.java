package org.example.driver;

import org.example.builders.ChromeOptionsBuilder;
import org.example.builders.FirefoxOptionsBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class DefaultLocalDriverFactory {

    public ChromeOptions getChromeOptions(){
        return new ChromeOptionsBuilder()
                .addBrowserPreference("--incognito")
//                .addBrowserPreference("--headless")
                .build();
    }
    public FirefoxOptions getFirefoxOptions(){
        return new FirefoxOptionsBuilder()
                .addBrowserPreference("start-maximized")
                .addBrowserPreference("--start-fullscreen")
                .build();
    }

    public WebDriver create(){
        switch (System.getProperty("browser").toLowerCase()){
            case "firefox":
                return new FirefoxDriver();
            case "chrome":
                return new ChromeDriver(getChromeOptions());
            default:
                return new EdgeDriver();
        }
    }
}
