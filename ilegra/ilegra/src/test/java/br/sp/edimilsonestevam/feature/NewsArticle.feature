Feature: News
  I want to read a news article on the Agi Blog

  @scenario-read-news-article
  Scenario Outline: User reads a news article
    Given I am Agi Blog <url>
    When I choose a news <article>
    And I confirm action
    Then website will show a news with <article>, <author>, <date>
    And three pieces of news at the end of article <firstArticle>, <secondArticle>, <thirdArticle>

    Examples: 
      | url                    | article                                             | author            | date         | firstArticle                                                  | secondArticle                                                  | thirdArticle                                           |
      | "www.blogdoagi.com.br" | "Golpe da CNH: entenda funciona e como se proteger" | "Redação Agibank" | "08/04/2025" | "Onde fica o código de segurança da CNH? Veja onde encontrar" | "Golpe dos Correios: entenda como funciona e como identificar" | "Abono indenizatório: o que é, como funciona e regras" |