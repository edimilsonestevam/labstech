#language: pt

@cenario
Funcionalidade: Usar Filtro de Notícias
  Eu quero usar o filtro de notícias

  @cenario-filtro-noticia
  Esquema do Cenario: 
    Dado eu estou na pagina do Blog Petz <url>
    Quando eu clico no filtro de notícias <filtroNoticia>
    Entao o sistema apresenta a notícia filtrada <noticiaFiltrada>

    Exemplos: 
      | url                     | filtroNoticia     | noticiaFiltrada                                          |
      | "www.petz.com.br/blog/" | "Recentes"        | "Cachorro filhote pode comer ração de cachorro grande?"  |
      | "www.petz.com.br/blog/" | "Mais Comentados" | "Quer um pet diferente? O Safári Petz é o seu lugar!"    |
      | "www.petz.com.br/blog/" | "Populares"       | "Caroço em cachorro: o que este sintoma significa?"      |