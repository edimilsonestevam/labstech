package pt.po.edimilsonestevam.service;

import static io.restassured.RestAssured.given;
import org.hamcrest.Matchers;

public class MapaCidade {

	protected String myAppid = "&appid=1657f46b179509c93448fae18c78680d";
	
	public void consultarCidade(String uri, String nomeCidade) {
		
		System.out.println("• Consultando Cidade...");
		
		given()
		.when()
			.get(uri+nomeCidade+myAppid)
		.then()
			.log().all()
			.statusCode(200)
		;
		
	}
	
	public void validarAcessoUri(String uri) {
		
		System.out.println("• Validando Acesso URI...");
		
		
	}
	
	public void validarCodigoPais(String uri, String nomeCidade, int codigoPais) {
		
		System.out.println("• Validando Codigo do País...");
		
		given()
		.when()
			.get(uri+nomeCidade+myAppid)
		.then()
			.log().all()
			.statusCode(200)
			.body("id", Matchers.is(codigoPais))
		;
		
	}
	
	public void validarSiglaPais(String uri, String nomeCidade, String siglaPais) {
		
		System.out.println("• Validando Sigla do País...");
		
		given()
		.when()
			.get(uri+nomeCidade+myAppid)
		.then()
			.log().all()
			.statusCode(200)
			.body("country", Matchers.is(siglaPais))
		;
		
	}
	
	public void validarNomeCidade(String uri, String nomeCidade) {
		
		System.out.println("• Validando Cidade...");
		
		given()
		.when()
			.get(uri+nomeCidade+myAppid)
		.then()
			.log().all()
			.statusCode(200)
			.body("name", Matchers.is(nomeCidade))
		;
		
	}
		
}