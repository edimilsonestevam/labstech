package br.sp.edimilsonestevam.page;

import br.sp.edimilsonestevam.setup.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Stories extends Base {
    public Stories(WebDriver browser) {
        super(browser);
    }

    public void accessVerMaisButton(){

        System.out.println("• Accessing Stories...");

        String xpathVerMaisButton = "//span[@class='uagb-marketing-btn__title']";

        browser.findElement(By.xpath(xpathVerMaisButton)).click();

    }

    public void chooseStory(){

        System.out.println("• Choosing Stories...");

        String xpathFirstStory = "//a[contains(text(),'Mudança no Consignado em 2025: descubra o que mudo')]";
        String xpathSecondStory = "//a[contains(text(),'Entenda as con')]";
        String xpathThirdStory = "//a[contains(text(),'Bolsa Família 2024: veja quando será pago o benefí')]";
        String xpathFourthStory = "//a[contains(text(),'6 Dicas para Criar uma Senha Segura na Internet')]";
        String xpathFifthStory = "//a[contains(text(),'7 dicas essencias para controlar gastos')]";
        String xpathSixthStory = "//a[contains(text(),'6 Mitos e Verdades sobre Cartão de Crédito')]";
        String xpathSeventhStory = "//a[contains(text(),'5 Vantagens sobre Empréstimo Consignado que Você P')]";
        String xpathEighthStory = "//a[contains(text(),'30 anos do Plano Real: conheça 5 Curiosidades sobr')]";
        String xpathNinthStory = "//a[contains(text(),'Taxa de Empréstimo Consignado cai para 1,66%: o qu')]";

        
    }
}
