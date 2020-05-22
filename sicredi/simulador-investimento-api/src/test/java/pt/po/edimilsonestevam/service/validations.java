package pt.po.edimilsonestevam.service;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.hamcrest.Matchers;

public class validations {

	public void data(String uri, String mesInvestimento) {
	
	String[] meses = { "112", "124", "136", "148" };
	String[] valores = { "2.802", "3.174", "3.564", "3.971"};
		
	given()
		.contentType("application/json")
	.when()
		.get(uri)
	.then()
		.log().all()
		.statusCode(200).assertThat()
		.body("valor", Matchers.hasItems("2.802", "3.174", "3.564", "3.971"))	
	;
		
	}
}
