#language: pt

@cenario
Funcionalidade: Simulador Investimento Poupanca
  Eu quero acessar os dados de simulacao de investimento na Poupanca

  @cenario-simulador-investimento-poupanca
  Esquema do Cenario: 
    Dado eu tenho acesso ao Simulador de Investimento <uri>
    Quando eu executo o servico de consulta <uri>
    Entao o sistema apresenta o identificador da simulacao <identificador>, mes de investimento <mesInvestimento> e valor de investimento <valorInvestimento>   

    Exemplos: 
      | uri                                                           |identificador | mesInvestimento | valorInvestimento |  
      | "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador" | 1            | "112"           | "2.802"           |
      | "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador" | 1            | "124"           | "3.174"           |
      | "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador" | 1            | "136"           | "3.564"           |
      | "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador" | 1            | "148"           | "3.971"           |