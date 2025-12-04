package org.example.pages;

import org.example.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArticlesMainPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(ArticlesMainPage.class));

    WebDriver driver;

    @FindBy(css = "a[href='/ru/posts/']")
    private WebElement postsOnMain;

    @FindBy(css = "a[href='/ru/news/']")
    private WebElement newsOnMain;

    @FindBy(css = "a[href='/ru/hubs/']")
    private WebElement hubsOnMain;

    @FindBy(css = "a[href='/ru/users/']")
    private WebElement usersOnMain;

    @FindBy(css = "a[href='/ru/companies/']")
    private WebElement companiesOnMain;

    public ArticlesMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnPosts() {
        String postsUrl = "https://habr.com/ru/posts/";
        postsOnMain.click();
        LOG.info("Переход на вкладку Посты");
        assertEquals(postsUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickOnNews() {
        String newsUrl = "https://habr.com/ru/news/";
        newsOnMain.click();
        LOG.info("Переход на вкладку Новости");
        assertEquals(newsUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickOnHubs() {
        String hubsUrl = "https://habr.com/ru/hubs/";
        hubsOnMain.click();
        LOG.info("Переход на вкладку Хабы");
        assertEquals(hubsUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickOnUsers() {
        String usersUrl = "https://habr.com/ru/users/";
        usersOnMain.click();
        LOG.info("Переход на вкладку Авторы");
        assertEquals(usersUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickOnCompanies() {
        String companiesUrl = "https://habr.com/ru/companies/";
        companiesOnMain.click();
        LOG.info("Переход на вкладку Компании");
        assertEquals(companiesUrl, driver.getCurrentUrl(), "url не совпадает");
    }
}