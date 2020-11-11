package pt.po.edimilsonestevam.setup;

public class Configuracao {

	protected String uri = null;

	public String getDriver() {
		
		return uri;
		
	}

	public void setDriver (String uri) {
		
		this.uri = uri;
		
	}

	public String usarUrl(String url) {

		System.out.println("-----------------------------------Iniciando os Testes-----------------------------------");

			uri.concat(url);
			return uri;

	}

}