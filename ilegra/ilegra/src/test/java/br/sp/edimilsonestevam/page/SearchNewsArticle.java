package br.sp.edimilsonestevam.page;

import br.sp.edimilsonestevam.setup.Base;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class SearchNewsArticle extends Base {
    public SearchNewsArticle(WebDriver browser) {
        super(browser);
    }

    public void findNewsArticle(String searchNewsArticle) throws AWTException {

        System.out.println("• Searching News Article...");

        String locator = "//button[contains(@class, 'icon-search')]";

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        try {

            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));

            wait.until(ExpectedConditions.visibilityOf(element));

            ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);

            try {

                wait.until(ExpectedConditions.elementToBeClickable(element)).click();

            } catch (Exception e) {

                ((JavascriptExecutor) browser).executeScript("arguments[0].click();", element);

            }

        } catch (TimeoutException e) {

            throw new RuntimeException("Element can not be clicked: " + locator.toString(), e);

        }
    }
}
