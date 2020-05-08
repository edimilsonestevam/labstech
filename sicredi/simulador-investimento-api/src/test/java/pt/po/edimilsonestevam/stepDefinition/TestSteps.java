package pt.po.edimilsonestevam.stepDefinition;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;
import pt.po.edimilsonestevam.service.SimularInvestimentoPoupancaService;


public class TestSteps {
	
	protected static String uri;
	
	@Before
	@Dado("^eu tenho acesso ao Simulador de Investimento$")
	public void eu_tenho_acesso_ao_Simulador_de_Investimento() throws Throwable {
		
		new SimularInvestimentoPoupancaService().acessarSimuladorInvestimento();
		
	}

	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Quando("^eu executo o servico de consulta \"([^\"]*)\"$")
	public void eu_executo_o_servico_de_consulta(String uri) throws Throwable {
		
		new SimularInvestimentoPoupancaService().verificarConteudoRequisicao(uri);
		
	}

	@After
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Entao("^o sistema apresenta o identificador da simulacao (\\d+), mes de investimento \"([^\"]*)\" e valor de investimento \"([^\"]*)\"$")
	public void o_sistema_apresenta_o_identificador_da_simulacao_mes_de_investimento_e_valor_de_investimento(int identificador, String mesInvestimento, String valorInvestimento) throws Throwable {
		
		new SimularInvestimentoPoupancaService().validarMesInvestimento(uri, identificador, mesInvestimento);
		new SimularInvestimentoPoupancaService().validarValorInvestimento(uri, identificador, valorInvestimento);
		
	}

}