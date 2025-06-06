package pt.po.edimilsonestevam.stepDefinition;

import org.junit.Test;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;
import pt.po.edimilsonestevam.service.MapaCidade;

public class TestSteps {
			
	MapaCidade usuario = new MapaCidade();
	
	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)	
	@Dado("^eu tenho acesso ao servico Open Weather Map \"([^\"]*)\"$")
	public void eu_tenho_acesso_ao_servico_Open_Weather_Map(String uri) throws Throwable {

		usuario.validarAcessoUri(uri);
		
	}

	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Quando("^eu informo o nome da cidade para consulta \"([^\"]*)\" no servico Open Weather Map \"([^\"]*)\"$")
	public void eu_informo_o_nome_da_cidade_para_consulta_no_servico_Open_Weather_Map(String uri, String cidade) throws Throwable {

		usuario.validarCidade(uri, cidade);
		
	}
	
	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)
	@Entao("^o serviço apresenta o codigo do pais (\\d+), sigla do pais \"([^\"]*)\"$")
	public void o_serviço_apresenta_o_codigo_do_pais_sigla_do_pais(String uri, int codigoPais, String siglaPais) throws Throwable {
		
		usuario.validarCodigoPais(uri, codigoPais);
		usuario.validarSiglaPais(uri, siglaPais);
		
	}
	
}