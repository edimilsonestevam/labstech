package pt.po.edimilsonestevam.service;

import static io.restassured.RestAssured.given;
import org.hamcrest.Matchers;

public class SimularInvestimentoPoupancaService {
	
	public void acessarSimuladorInvestimento(String uri) {
		
		System.out.println("Verificando o acesso...");
		
			given()
				.contentType("application/json")
			.when()
				.get(uri)
			.then()
				.log().status()
				.statusCode(200)
			;
			
		System.out.println( "\n" + "----------------------------------------------------" + "\n");
		
	}
	
	public void verificarConteudoRequisicao(String uri) {
		
		System.out.println("Verificando o conteúdo da requisição...");
		
			given()
				.contentType("application/json")
			.when()
				.get(uri)
			.then()
				.log().body()
			;
		
		System.out.println( "\n" + "----------------------------------------------------" + "\n");
			
	}
	
	public void validarMesInvestimento(String uri, int identificador, String mesInvestimento) {
		
		System.out.println("Validando os meses de simulação...");
		
			given()
				.contentType("application/json")
			.when()
				.get(uri)
			.then()
				.log().all()
				.statusCode(200).assertThat()
				.body("meses", Matchers.hasItems("112", "124", "136", "148"))
				
			;
		
		System.out.println( "\n" + "----------------------------------------------------" + "\n");
		
	}
	
	public void validarValorInvestimento(String uri, int identificador, String valorInvestimento) {
		
		System.out.println("Validando os valores de simulação...");
		
			given()
				.contentType("application/json")
			.when()
				.get(uri)
			.then()
				.log().all()
				.statusCode(200).assertThat()
				.body("valor", Matchers.hasItems("2.802", "3.174", "3.564", "3.971"))
			;
		
		System.out.println( "\n" + "----------------------------------------------------" + "\n");
	}
}
