package pt.po.edimilsonestevam.service;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;


public class SimularInvestimentoPoupancaService {
	
	
	public void acessarSimuladorInvestimento() {
		
		System.out.println("Verificando o acesso...");
		
			given()
			.when()
				.get("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador")
			.then()
				.log().status()
				.statusCode(200)
			;
			
		System.out.println( "\n" + "----------------------------------------------------" + "\n");
		
	}
	
	public void acessarSimuladorInvestimento(String uri) {
		
		System.out.println("Verificando o acesso...");
		
			given()
			.when()
				.get(uri)
			.then()
				.log().status()
				.statusCode(200)
			;
			
		System.out.println( "\n" + "----------------------------------------------------" + "\n");
		
	}
	
	public void verificarConteudoRequisicao() {
		
		System.out.println("Verificando o conteúdo da requisição...");
		
			given()
			.when()
				.get("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador")
			.then()
				.log().body()
			;
		
		System.out.println( "\n" + "----------------------------------------------------" + "\n");
			
	}
	
	public void verificarConteudoRequisicao(String uri) {
		
		System.out.println("Verificando o conteúdo da requisição...");
		
			given()
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
			.when()
				.get(uri)
			.then()
				.log().all()
				.statusCode(200)
				.body("meses", Matchers.is("112"))
				.body("meses", Matchers.is("114"))
				.body("meses", Matchers.is("136"))
				.body("meses", Matchers.is("148"))
			;
		
		System.out.println( "\n" + "----------------------------------------------------" + "\n");
		
	}
	
	public void validarValorInvestimento(String uri, int identificador, String valorInvestimento) {
		
		System.out.println("Validando os valores de simulação...");
		
			given()
			.when()
				.get(uri)
			.then()
				.log().all()
				.statusCode(200)
				.body("valor", Matchers.is("2.802"))
				.body("valor", Matchers.is("3.174"))
				.body("valor", Matchers.is("3.564"))
				.body("valor", Matchers.is("3.971"))
			;
		
		System.out.println( "\n" + "----------------------------------------------------" + "\n");
	}
}
