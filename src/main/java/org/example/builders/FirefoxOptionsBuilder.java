package org.example.builders;

import org.example.driver.DefaultLocalDriverFactory;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.ArrayList;
import java.util.List;

public class FirefoxOptionsBuilder extends DefaultLocalDriverFactory {

    private final List<String> preference=  new ArrayList<>();

    public FirefoxOptionsBuilder addBrowserPreference(String preference){
        this.preference.add(preference);
        return this;
    }


    public FirefoxOptions build(){
        return new FirefoxOptions()
                .addArguments(preference);
    }
}
