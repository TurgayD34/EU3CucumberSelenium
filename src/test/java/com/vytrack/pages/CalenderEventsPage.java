package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderEventsPage extends BasePage{
    public CalenderEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalenderEvent;
}
