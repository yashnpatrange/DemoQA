package org.example.builders;

import org.example.driver.DefaultLocalDriverFactory;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.ArrayList;
import java.util.List;


public class ChromeOptionsBuilder extends DefaultLocalDriverFactory {

    private final List<String> preference= new ArrayList<>();



    public ChromeOptionsBuilder addBrowserPreference(String preference){
        this.preference.add(preference);
        return this;
    }

    public ChromeOptions build(){
        return new ChromeOptions()
                .addArguments(preference);
    }
}
