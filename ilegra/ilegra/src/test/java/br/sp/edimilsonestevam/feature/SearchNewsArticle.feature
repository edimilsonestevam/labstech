Feature: Search News Article
  I want to search a news article on the Agi Blog

  @scenario-search-news-article
  Scenario Outline: User searches a news article
    Given I am Agi Blog <url>
    When I search a news <searchedWord> in the Field of Research
    Then website will show a list with <firstArticle>,  <secondArticle>, <thirdArticle>, <fourthArticle>, <fifthArticle>, <sixthArticle>, <seventhArticle>, <eighthArticle>, <ninthArticle> news articles

    Examples:
      | url                    | searchedWord | firstArticle                                                            | secondArticle                                                                | thirdArticle                                                             | fourthArticle                                                                 | fifthArticle                                                                | sixthArticle                                                                            | seventhArticle                                                | eighthArticle                                           | ninthArticle                                              |
      | "www.blogdoagi.com.br" | "Trânsito"   | "Multa de Trânsito 2024: conheça os tipos, valores e como recorrer " | "Fim do DPVAT: como ficarão as indenizações por acidentes de trânsito? "  | "Multa Renainf: entenda o que é e como pagar a infração de trânsito " | "Cartão de estacionamento do idoso: saiba como tirar e renovar documento " | "Nova Lei do Farol: o que todo motorista precisa saber para evitar multas!" | "Como dar entrada no seguro DPVAT? Entenda como solicitar e quais são as novidades " | "Onde fica o código de segurança da CNH? Veja onde encontrar" | "Pedágio Free Flow: entenda como funciona e como pagar" | "Rodízio SP Hoje: dezembro 2024, horários, placas e dias" |