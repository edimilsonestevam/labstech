# language: pt

@Produto
Funcionalidade: Pesquisar um produto no site GetNet
  Eu quero pesquisar um produto antes de comprá-lo

  @pesquisarProduto
  Esquema do Cenario: Pesquisar um produto
    Dado eu estou na pagina da GetNet <url> para pesquisar um produto
    Quando eu informo o campo de busca <informarBusca>
    E eu confirmo a operacao 
    E eu clico no link <linkPortabilidade>
    Entao o sistema apresenta uma mensagem <mensagemPortabilidade>

    Exemplos: 
      | url                           | informarBusca | linkPortabilidade                               | mensagemPortabilidade                            |
      | "https://site.getnet.com.br/" | superget      | "como faço a portabilidade da minha maquininha" | "Como faço a portabilidade da minha maquininha?" | 