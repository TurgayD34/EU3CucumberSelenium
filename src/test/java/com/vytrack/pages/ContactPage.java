package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {

    public WebElement getContactEmail(String email) {
        String xpath = "//td[contains(text(),'" + email + "') and @data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }

    @FindBy(css = ".input-widget")
    public WebElement pageNumber;
}
