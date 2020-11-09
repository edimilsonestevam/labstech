#language: pt

@cenario
Funcionalidade: Acessar Categorias
  Eu quero acessar as categorias de animais de estimação

  @cenario-acessar-categoria-caes
  Esquema do Cenario: 
    Dado eu estou na pagina do Blog Petz <url>
    Quando eu coloco o mouse sobre a categoria Cães
    Entao o sistema apresenta as quatro últimas notícias sobre Cães <quatroUltimasNoticiaCaes>

    Exemplos: 
      | url                     | quatroUltimasNoticiaCaes                                  | 
      | "www.petz.com.br/blog/" | "Cachorro gosta de música? Saiba mais sobre o assunto"    | 
      | "www.petz.com.br/blog/" | "Cachorro roncando: o que pode ser e quando se preocupar" |
      | "www.petz.com.br/blog/" | "Cachorro filhote pode comer ração de cachorro grande?"   |
      | "www.petz.com.br/blog/" | "Leishmaniose canina: o que é e como tratar?"             |