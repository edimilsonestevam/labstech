package br.sp.edimilsonestevam.page;

import br.sp.edimilsonestevam.setup.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchNewsArticle extends Base {
    public SearchNewsArticle(WebDriver browser) {
        super(browser);
    }

    public void findNewsArticle(String searchNewsArticle){

        System.out.println("• Searching News Article...");

        String xpathSearchNewsArticle = "//span[contains(@class,'ast-icon icon-search icon-search')]//span[contains(@class,'ahfb-svg-iconset ast-inline-flex svg-baseline')]//*//*";
        WebElement element = null;

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathSearchNewsArticle)));
        element.click();
        element.sendKeys(searchNewsArticle);
        element.sendKeys(Keys.ENTER);

    }
}
