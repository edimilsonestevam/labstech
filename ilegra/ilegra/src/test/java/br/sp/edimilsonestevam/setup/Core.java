package br.sp.edimilsonestevam.setup;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Core extends Base {
    public Core(WebDriver browser) {
        super(browser);
    }

    public void verifyCurrentPage(String expectedUrl){

        System.out.println("• Verifying Current Page...");

        String currentUrl = browser.getCurrentUrl();
        Assert.assertEquals("Checking Current URL", "https://" + expectedUrl, currentUrl);

    }

    public static String normalizeText(String text) {

        return text == null ? null : text.replace("\u00A0", " ").trim();
        
    }

}
