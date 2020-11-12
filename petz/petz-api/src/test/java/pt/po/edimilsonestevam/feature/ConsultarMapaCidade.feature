#language: pt

@cenario
Funcionalidade: Consultar Mapa da Cidade
  Eu quero consultar uma cidade

  @cenario-consultar-cidade
  Esquema do Cenario: 
    Dado eu tenho acesso ao servico Open Weather Map <uri>
    Quando eu informo o nome da cidade para consulta <cidade>
    Entao o serviço apresenta o codigo do pais <codigoPais>, sigla do pais <siglaPais>

    Exemplos: 
      | uri                                          | codigoPais | siglaPais | cidade   |
      | "api.openweathermap.org/data/2.5/weather?q=" | 6900       | "PT"      | "Porto"  |
			| "api.openweathermap.org/data/2.5/weather?q=" | 1414       | "GB"      | "London" |
			| "api.openweathermap.org/data/2.5/weather?q=" | 6443       | "ES"      | "Madrid" |