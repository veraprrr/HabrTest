package org.example.pages;

import org.example.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RulesPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(RulesPage.class));

    WebDriver driver;

    @FindBy(css = "a[href='/ru/docs/help/registration/']")
    private WebElement registration;

    @FindBy(css = "a[href='/ru/docs/help/sandbox/']")
    private WebElement sandbox;

    @FindBy(css = "a[href='/ru/docs/help/habracentre/']")
    private WebElement habracentre;

    @FindBy(css = "a[href='/ru/docs/help/karma/']")
    private WebElement karma;

    @FindBy(css = "a[href='/ru/docs/help/settings/']")
    private WebElement settings;

    @FindBy(css = "a[href='/ru/docs/help/donations/']")
    private WebElement donations;

    @FindBy(css = "a[href='/ru/docs/help/hubs/']")
    private WebElement hubs;

    @FindBy(css = "a[href='/ru/docs/help/lenta/']")
    private WebElement lenta;

    @FindBy(css = "a[href='/ru/docs/help/publications/']")
    private WebElement publications;

    @FindBy(css = "a[href='/ru/docs/help/posts/']")
    private WebElement posts;

    @FindBy(css = "a[href='/ru/docs/help/comments/']")
    private WebElement comments;

    @FindBy(css = "a[href='/ru/docs/help/problems/']")
    private WebElement problems;

    @FindBy(css = "a[href='/ru/docs/help/hotkeys/']")
    private WebElement hotkeys;

    public RulesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRegistration() {
        String registrationUrl = "https://habr.com/ru/docs/help/registration/";
        registration.click();
        LOG.info("Переход на вкладку Регистрация");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(registrationUrl));
        assertEquals(registrationUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickSandbox() {
        String sandboxUrl = "https://habr.com/ru/docs/help/sandbox/";
        sandbox.click();
        LOG.info("Переход на вкладку Песочница");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(sandboxUrl));
        assertEquals(sandboxUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickHabracentre() {
        String habracentreUrl = "https://habr.com/ru/docs/help/habracentre/";
        habracentre.click();
        LOG.info("Переход на вкладку Хабрацентр");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(habracentreUrl));
        assertEquals(habracentreUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickKarma() {
        String karmaUrl = "https://habr.com/ru/docs/help/karma/";
        karma.click();
        LOG.info("Переход на вкладку Карма, рейтинг и вклад");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(karmaUrl));
        assertEquals(karmaUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickSettings() {
        String settingsUrl = "https://habr.com/ru/docs/help/settings/";
        settings.click();
        LOG.info("Переход на вкладку Настройки");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(settingsUrl));
        assertEquals(settingsUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickDonations() {
        String donationsUrl = "https://habr.com/ru/docs/help/donations/";
        donations.click();
        LOG.info("Переход на вкладку Донаты");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(donationsUrl));
        assertEquals(donationsUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickHubs() {
        String hubsUrl = "https://habr.com/ru/docs/help/hubs/";
        hubs.click();
        LOG.info("Переход на вкладку Хабы");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(hubsUrl));
        assertEquals(hubsUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickLenta() {
        String lentaUrl = "https://habr.com/ru/docs/help/lenta/";
        lenta.click();
        LOG.info("Переход на вкладку Лента");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(lentaUrl));
        assertEquals(lentaUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickPublications() {
        String publicationsUrl = "https://habr.com/ru/docs/help/publications/";
        publications.click();
        LOG.info("Переход на вкладку Публикации");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(publicationsUrl));
        assertEquals(publicationsUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickPosts() {
        String postsUrl = "https://habr.com/ru/docs/help/posts/";
        posts.click();
        LOG.info("Переход на вкладку Посты");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(postsUrl));
        assertEquals(postsUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickComments() {
        String commentsUrl = "https://habr.com/ru/docs/help/comments/";
        comments.click();
        LOG.info("Переход на вкладку Комментарии");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(commentsUrl));
        assertEquals(commentsUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickProblems() {
        String problemsUrl = "https://habr.com/ru/docs/help/problems/";
        problems.click();
        LOG.info("Переход на вкладку Проблемы с сайтом");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(problemsUrl));
        assertEquals(problemsUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickHotkeys() {
        String hotkeysUrl = "https://habr.com/ru/docs/help/hotkeys/";
        hotkeys.click();
        LOG.info("Переход на вкладку Горячие клавиши");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(hotkeysUrl));
        assertEquals(hotkeysUrl, driver.getCurrentUrl(), "url не совпадает");
    }
}