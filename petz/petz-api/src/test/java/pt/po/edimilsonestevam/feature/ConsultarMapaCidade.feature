#language: pt

@cenario
Funcionalidade: Consultar Mapa da Cidade
  Eu quero consultar uma cidade

  @cenario-consultar-cidade
  Esquema do Cenario: 
    Dado eu tenho acesso ao servivo Open Weather Map através da URI <uri>
    Quando eu pesquiso por uma cidade <nomeCidade> no serviço Open Weather Map através da URI <uri>
    Entao o sistema apresenta Codigo do Pais <codigoPais>, Sigla do Pais <siglaPais>, Nome da Cidade <nomeCidade> conforme o serviço Open Weather Map através da URI <uri>

    Exemplos: 
      | uri                                          | codigoPais | siglaPais | nomeCidade |
      | "api.openweathermap.org/data/2.5/weather?q=" | 6900       | "PT"      | "Porto"    |
			| "api.openweathermap.org/data/2.5/weather?q=" | 1414       | "GB"      | "London"   |
			| "api.openweathermap.org/data/2.5/weather?q=" | 6443       | "ES"      | "Madrid"   |