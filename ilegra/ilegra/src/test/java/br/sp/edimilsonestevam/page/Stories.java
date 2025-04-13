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

    public void chooseStory(String chooseStory){

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

        String txtFirstStory = "Mudança no Consignado em 2025: descubra o que mudou e como isso pode afetar suas finanças";
        String txtSecondStory = "O que acontece com quem não votar?  Entenda as consequências";
        String txtThirdStory = "Bolsa Família 2024: veja quando será pago o benefício em setembro";
        String txtFourthStory = "6 Dicas para Criar uma Senha Segura na Internet";
        String txtFifthStory = "7 dicas essencias para controlar gastos";
        String txtSixthStory = "6 Mitos e Verdades sobre Cartão de Crédito";
        String txtSeventhStory = "5 Vantagens sobre Empréstimo Consignado que Você Precisa Conhecer";
        String txtEighthStory = "30 anos do Plano Real: conheça 5 Curiosidades sobre o Programa";
        String txtNinthStory = "Taxa de Empréstimo Consignado cai para 1,66%: o que você precisa saber";


        if(txtFirstStory.equalsIgnoreCase(chooseStory)){

            browser.findElement(By.xpath(xpathFirstStory)).click();

        }
        else if (txtSecondStory.equalsIgnoreCase(chooseStory)) {

            browser.findElement(By.xpath(xpathSecondStory)).click();

        }
        else if (txtThirdStory.equalsIgnoreCase(chooseStory)) {

            browser.findElement(By.xpath(xpathThirdStory)).click();

        }
        else if (txtFourthStory.equalsIgnoreCase(chooseStory)) {

            browser.findElement(By.xpath(xpathFourthStory)).click();

        }
        else if (txtFifthStory.equalsIgnoreCase(chooseStory)) {

            browser.findElement(By.xpath(xpathFifthStory)).click();

        }
        else if (txtSixthStory.equalsIgnoreCase(chooseStory)) {

            browser.findElement(By.xpath(xpathSixthStory)).click();

        }
        else if (txtSeventhStory.equalsIgnoreCase(chooseStory)) {

            browser.findElement(By.xpath(xpathSeventhStory)).click();

        }
        else if (txtEighthStory.equalsIgnoreCase(chooseStory)) {

            browser.findElement(By.xpath(xpathEighthStory)).click();

        }
        else if (txtNinthStory.equalsIgnoreCase(chooseStory)) {

            browser.findElement(By.xpath(xpathNinthStory)).click();

        }
        else {

            System.out.println("You should inform: firstStory, secondStory, thirdStory, fourthStory, fifthStory, sixthStory, seventhStory, eighthStory or ninthStory!");

        }
    }
}
