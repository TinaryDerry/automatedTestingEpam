package io.github.epam.page_objects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactFormPage {
    WebDriver driver;
    public ContactFormPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //описание элементов
    
}
