package pt.po.edimilsonestevam.stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import pt.po.edimilsonestevam.page.PesquisaProduto;
import pt.po.edimilsonestevam.setup.Configuracao;

public class TestSteps {

	protected static WebDriver navegador;

	@Dado("^eu estou na pagina da GetNet \"([^\"]*)\" para pesquisar um produto$")
	public void eu_estou_na_pagina_da_GetNet_para_pesquisar_um_produto(String arg1) throws Throwable {

		navegador = new Configuracao().abrirNavegador("chrome", "//site.getnet.com.br/");
		
	}
	
	@Quando("^eu informo o campo de busca superget$")
	public void eu_informo_o_campo_de_busca_superget() throws Throwable {

		new PesquisaProduto(navegador).clicarIconeLupaBusca();
		new PesquisaProduto(navegador).informarCampoBusca("superget");
		
	}

	@Quando("^eu confirmo a operacao$")
	public void eu_confirmo_a_operacao() throws Throwable {

		new PesquisaProduto(navegador).clicarBotaoProcurar();
		
	}

	@Quando("^eu clico no link \"([^\"]*)\"$")
	public void eu_clico_no_link(String arg1) throws Throwable {

		new PesquisaProduto(navegador).clicarLinkPortabilidade();
		
	}

	@Entao("^o sistema apresenta uma mensagem \"([^\"]*)\"$")
	public void o_sistema_apresenta_uma_mensagem(String arg1) throws Throwable {

		new PesquisaProduto(navegador).verificarMensagemPortabilidade("Como faço a portabilidade da minha maquininha?");
		new Configuracao().fecharNavegador(navegador);
		
	}
}