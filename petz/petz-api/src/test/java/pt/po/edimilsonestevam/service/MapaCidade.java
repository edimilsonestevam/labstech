package pt.po.edimilsonestevam.service;

import static io.restassured.RestAssured.given;
import org.hamcrest.Matchers;

public class MapaCidade {

	public void consultarCidade(String uri, String cidade) {
		
		System.out.println("• Consultando Cidade...");
		
		given()
		.when()
			.get(uri)
		.then()
			.log().all()
			.statusCode(200)
			.body("name", Matchers.is(cidade))
		;
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void validarAcessoUri(String uri) {
		
		System.out.println("• Validando Acesso URI...");
		
		given()
			.get(uri)
		.then()
			.statusCode(200)
					  .log().status();
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void validarCodigoPais(String uri, int codigoPais) {
		
		System.out.println("• Validando Codigo do País...");
		
		given()
		.when()
			.get(uri)
		.then()
			.log().all()
			.statusCode(200)
			.body("id", Matchers.is(codigoPais))
		;
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void validarSiglaPais(String uri, String siglaPais) {
		
		System.out.println("• Validando Sigla do País...");
		
		given()
		.when()
			.get(uri)
		.then()
			.log().all()
			.statusCode(200)
			.body("country", Matchers.is(siglaPais))
		;
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void validarCidade(String uri, String cidade) {
		
		System.out.println("• Validando Cidade...");
		
		given()
		.when()
			.get(uri)
		.then()
			.log().all()
			.statusCode(200)
			.body("name", Matchers.is(cidade))
		;
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
		
}