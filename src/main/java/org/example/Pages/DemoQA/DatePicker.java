package org.example.Pages.DemoQA;

import org.example.domain.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DatePicker extends AbstractPage {
    public DatePicker(WebDriver driver) {
        super(driver);
    }

    //Locators
    static final String DatePicker= "//input[@id='datePickerMonthYearInput']";
    static final String Month="//select[@class='react-datepicker__month-select']";
    static final String Day="//div[@aria-label='Choose Tuesday, February 14th, 2023']";


    //Objects
    @FindBy(how= How.XPATH, using = DatePicker)
    private WebElement datePicker;
    @FindBy(how= How.XPATH, using = Month)
    private WebElement month;
    @FindBy(how= How.XPATH, using = Day)
    private WebElement day;

    //methods to perform actions
    public void setDatePicker() {
        datePicker.click();
    }
    public void setMonth(){
        Select select= new Select(month);
        select.selectByValue("1");
        logger.info("Month of Feb is selected");//logger
    }
    public void setDay(){
        day.click();
        logger.info("14th Day of the month is selected"); //logger
    }

}
