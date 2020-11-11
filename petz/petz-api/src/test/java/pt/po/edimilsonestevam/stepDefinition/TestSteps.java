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
	@Dado("^eu tenho acesso ao servivo Open Weather Map através da URI \"([^\"]*)\"$")
	public void eu_tenho_acesso_ao_servivo_Open_Weather_Map_através_da_URI(String uri) throws Throwable {

		usuario.validarAcessoUri(uri);
		
	}

	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)	
	@Quando("^eu pesquiso por uma cidade \"([^\"]*)\" no serviço Open Weather Map através da URI \"([^\"]*)\"$")
	public void eu_pesquiso_por_uma_cidade_no_serviço_Open_Weather_Map_através_da_URI(String nomeCidade, String uri) throws Throwable {

		usuario.consultarCidade(uri, nomeCidade);
		
	}

	@Test
	@FileParameters(value = "src/test/java/resources/MassaDeDados.csv", mapper = CsvWithHeaderMapper.class)	
	@Entao("^o sistema apresenta Codigo do Pais (\\d+), Sigla do Pais \"([^\"]*)\", Nome da Cidade \"([^\"]*)\" conforme o serviço Open Weather Map através da URI \"([^\"]*)\"$")
	public void o_sistema_apresenta_Codigo_do_Pais_Sigla_do_Pais_Nome_da_Cidade_conforme_o_serviço_Open_Weather_Map_através_da_URI(int codigoPais, String siglaPais, String nomeCidade, String uri) throws Throwable {

		usuario.validarCodigoPais(uri, nomeCidade, codigoPais);
		usuario.validarSiglaPais(uri, nomeCidade, siglaPais);
		usuario.validarNomeCidade(uri, nomeCidade);
		
	}
	
}