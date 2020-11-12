#language: pt

@cenario
Funcionalidade: Consultar Mapa da Cidade
  Eu quero consultar uma cidade

  @cenario-consultar-cidade
  Esquema do Cenario: 
    Dado eu tenho acesso ao servico Open Weather Map <uri>
    Quando eu informo o nome da cidade para consulta <cidade> no servico Open Weather Map <uri>
    Entao o serviço apresenta o codigo do pais <codigoPais> e sigla do pais <siglaPais>

    Exemplos: 
      | uri                                                                                              | codigoPais | siglaPais | cidade   |
      | "http://api.openweathermap.org/data/2.5/weather?q=porto&appid=1657f46b179509c93448fae18c78680d"  | 6900       | "PT"      | "Porto"  |
			| "http://api.openweathermap.org/data/2.5/weather?q=london&appid=1657f46b179509c93448fae18c78680d" | 1414       | "GB"      | "London" |
			| "http://api.openweathermap.org/data/2.5/weather?q=madrid&appid=1657f46b179509c93448fae18c78680d" | 6443       | "ES"      | "Madrid" |