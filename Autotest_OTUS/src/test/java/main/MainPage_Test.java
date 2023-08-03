package main;

import annotations.Driver;
import exeptions.BrowserNotSupportedException;
import exeptions.PathEmptyException;
import extensions.UIExtensions;
import factory.FactoryDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

@ExtendWith(UIExtensions.class)
public class MainPage_Test {

    @Driver
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() throws BrowserNotSupportedException {
        this.driver = new FactoryDriver().getDriver();
    }

    @Test
    public void testArticleThumbs() throws PathEmptyException {
        MainPage mainPage = new MainPage(driver)
                .open()
                .pageHeaderShouldBeVisible()
                .pageArticleThumbsShouldBeVisiable();

        String title = mainPage.getArticleThumbsTitle(1);
        mainPage.clickArticleThumbsByTitle(title)
                .pageHeaderShouldBeSameAs(title);
    }

}
