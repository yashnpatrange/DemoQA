package org.example.Pages.DemoQA;

import org.example.domain.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DragNDropElement extends AbstractPage {
    public DragNDropElement(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String SourceElement= "//div[@id='draggable']";
    static final String TargetElement="//div[@id='droppable']";

    //Objects
    @FindBy(how= How.XPATH, using = SourceElement)
    private WebElement sourceElement;
    @FindBy(how= How.XPATH, using = TargetElement)
    private WebElement targetElement;

    //methods to perform actions
    public void DragandDrop() {
        Actions actions= new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
        logger.info("Element is dragged & dropped to the target location");
    }
}
