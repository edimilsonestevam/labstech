package pt.po.edimilsonestevam.service;

import static io.restassured.RestAssured.given;
import org.hamcrest.Matchers;

import pt.po.edimilsonestevam.setup.Base;

public class MapaCidade extends Base{

	protected String appid = "&appid=1657f46b179509c93448fae18c78680d";
	
	public MapaCidade(String uri) {
		super(uri);
		
	}
	
	public void consultarCidade(String nomeCidade) {
		
		System.out.println("• Consultando Cidade...");
		
		given()
		.when()
			.get(uri+nomeCidade+appid)
		.then()
			.log().all()
			.statusCode(200)
		;
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void validarAcessoUri(String nomeCidade) {
		
		System.out.println("• Validando Acesso URI...");
		
		given()
			.get(uri+nomeCidade+appid)
		.then()
			.statusCode(200)
					  .log()
					  .status();
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void validarCodigoPais(String nomeCidade, int codigoPais) {
		
		System.out.println("• Validando Codigo do País...");
		
		given()
		.when()
			.get(uri+nomeCidade+appid)
		.then()
			.log().all()
			.statusCode(200)
			.body("id", Matchers.is(codigoPais))
		;
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void validarSiglaPais(String nomeCidade, String siglaPais) {
		
		System.out.println("• Validando Sigla do País...");
		
		given()
		.when()
			.get(uri+nomeCidade+appid)
		.then()
			.log().all()
			.statusCode(200)
			.body("country", Matchers.is(siglaPais))
		;
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void validarNomeCidade(String nomeCidade) {
		
		System.out.println("• Validando Cidade...");
		
		given()
		.when()
			.get(uri+nomeCidade+appid)
		.then()
			.log().all()
			.statusCode(200)
			.body("name", Matchers.is(nomeCidade))
		;
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
		
}