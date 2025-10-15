package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainPageTest {
    private WebDriver driver;

    @BeforeEach
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.habr.com");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void search() {
        String input = "Linux";
        By searchFieldCss = By.cssSelector(".tm-input-text-decorated__input");
        WebElement searchIcon = driver.findElement(By.cssSelector(".tm-header-user-menu__icon_search"));
        searchIcon.click();

        WebElement searchField = driver.findElement(searchFieldCss);
        searchField.sendKeys(input);
        searchField.submit();
        String attributeValue = driver
                .findElement(searchFieldCss)
                .getAttribute("value");

        WebElement searchPageField = driver.findElement(searchFieldCss);
        assertEquals(input, attributeValue, "Текст не совпадает");
    }

    @Test
    public void authorization() {
        WebElement authorizationButton = driver.findElement(By.cssSelector(".tm-header-user-menu__login"));
        authorizationButton.click();

        WebElement emailField = driver.findElement(By.cssSelector("input.form__field-input[name='email']"));
        assertTrue(emailField.isDisplayed(), "Поле ввода email не найдено на странице");

        WebElement passwordField = driver.findElement(By.cssSelector("input.form__field-input[name='password']"));
        assertTrue(passwordField.isDisplayed(), "Поле ввода пароля не найдено на странице");

        WebElement enterButton = driver.findElement(By.cssSelector(".button_primary"));
        assertTrue(enterButton.isDisplayed(), "Кнопка входа не найдена на странице");
    }
}