package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage {

    @FindBy(css = ".tm-header-user-menu__icon_search")
    private WebElement searchIcon;

    @FindBy(css = ".tm-input-text-decorated__input")
    private WebElement searchField;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchOnMainPage() {
        String input = "Linux";
        searchIcon.click();
        searchField.sendKeys(input);
        searchField.submit();
        String attributeValue = searchField.getAttribute("value");
        assertEquals(input, attributeValue, "Текст не совпадает");
    }
}