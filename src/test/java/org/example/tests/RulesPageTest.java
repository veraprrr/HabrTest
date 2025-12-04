package org.example.tests;

import org.example.pages.RulesPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class RulesPageTest {

    private WebDriver driver;
    private RulesPage rulesPage;

    @BeforeEach
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://habr.com/ru/docs/help/rules/");
        rulesPage = new RulesPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Регистрация")
    public void registrationClick() {
        rulesPage.clickRegistration();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Песочница")
    public void sandboxClick() {
        rulesPage.clickSandbox();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Хабрацентр")
    public void habracentreClick() {
        rulesPage.clickHabracentre();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Карма, рейтинг и вклад")
    public void karmaClick() {
        rulesPage.clickKarma();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Настройки")
    public void settingsClick() {
        rulesPage.clickSettings();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Донаты")
    public void donationsClick() {
        rulesPage.clickDonations();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Хабы")
    public void hubsClick() {
        rulesPage.clickHubs();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Лента")
    public void lentaClick() {
        rulesPage.clickLenta();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Публикации")
    public void publicationsClick() {
        rulesPage.clickPublications();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Посты")
    public void postsClick() {
        rulesPage.clickPosts();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Комментарии")
    public void commentsClick() {
        rulesPage.clickComments();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Проблемы с сайтом")
    public void problemsClick() {
        rulesPage.clickProblems();
    }

    @Test
    @DisplayName("Проверка перехода в пункт Горячие клавиши")
    public void hotkeysClick() {
        rulesPage.clickHotkeys();
    }
}
