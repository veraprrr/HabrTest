package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Authorization {

    @FindBy(css = ".tm-header-user-menu__login")
    private WebElement authorizationButton;

    @FindBy(css = "input.form__field-input[name='email']")
    private WebElement emailField;

    @FindBy(css = "input.form__field-input[name='password']")
    private WebElement passwordField;

    @FindBy(css = ".button_primary")
    private WebElement submitButton;

    public Authorization(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void authorizationFields() {
        authorizationButton.click();
        assertTrue(emailField.isDisplayed(), "Поле ввода email не найдено на странице");
        assertTrue(passwordField.isDisplayed(), "Поле ввода пароля не найдено на странице");
        assertTrue(submitButton.isDisplayed(), "Кнопка входа не найдена на странице");
    }
}