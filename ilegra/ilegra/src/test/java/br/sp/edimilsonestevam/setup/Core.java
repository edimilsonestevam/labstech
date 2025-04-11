package br.sp.edimilsonestevam.setup;

import org.openqa.selenium.WebDriver;

public class Core extends Base {
    public Core(WebDriver browser) {
        super(browser);
    }

    public static String normalizeText(String text) {
        return text == null ? null : text.replace("\u00A0", " ").trim();
    }

}
