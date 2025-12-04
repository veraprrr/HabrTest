package org.example.tests;

import org.example.pages.ArticlesMainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ArticlesMainPageTest {

    private WebDriver driver;
    private ArticlesMainPage articlesMainPage;

    @BeforeEach
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://habr.com/ru/articles/");
        articlesMainPage = new ArticlesMainPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка перехода в пункт меню Посты")
    public void postsClick() {
        articlesMainPage.clickOnPosts();
    }

    @Test
    @DisplayName("Проверка перехода в пункт меню Новости")
    public void newsClick() {
        articlesMainPage.clickOnNews();
    }

    @Test
    @DisplayName("Проверка перехода в пункт меню Хабы")
    public void hubsClick() {
        articlesMainPage.clickOnHubs();
    }

    @Test
    @DisplayName("Проверка перехода в пункт меню Авторы")
    public void usersClick() {
        articlesMainPage.clickOnUsers();
    }

    @Test
    @DisplayName("Проверка перехода в пункт меню Компании")
    public void companiesClick() {
        articlesMainPage.clickOnCompanies();
    }
}