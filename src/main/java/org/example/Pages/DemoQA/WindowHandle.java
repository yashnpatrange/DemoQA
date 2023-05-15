package org.example.Pages.DemoQA;

import org.example.domain.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WindowHandle extends AbstractPage {
    public WindowHandle(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String NewTab= "//button[@id='tabButton']";

    //Objects
    @FindBy(how= How.XPATH, using = NewTab)
    private WebElement newTab;

    //methods to perform actions
    //open new tab
    public void ClickNewTab() {
        newTab.click();
        String originalHandle= driver.getWindowHandle();
        for(String handle: driver.getWindowHandles()){
            if(!handle.equals(originalHandle)){
                driver.switchTo().window(handle);
                logger.info("Opened new Tab"); //logger
                break;
            }
        }
        //Close the new tab and switch focus back to original window
        driver.close();
        driver.switchTo().window(originalHandle);
        logger.info("Closed the newly opened tab and back to the main window");
    }

}
