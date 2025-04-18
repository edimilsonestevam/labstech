Feature: News
  I want to read a news article on the Agi Blog

  @scenario-read-news-article
  Scenario Outline: User reads a news article
    Given I am Agi Blog <url>
    When I choose a news <article>
    Then website will show a news with <article>, <author>, <date>
    And three pieces of news at the end of article <firstArticle>, <secondArticle>, <thirdArticle>

    Examples: 
      | url                    | article                                                        | author            | date         | firstArticle                                             | secondArticle                                              | thirdArticle                                               |
      | "www.blogdoagi.com.br" | "Atividade Rural: entenda quais são e como comprovar trabalho" | "Redação Agibank" | "15/04/2025" | "Autodeclaração Rural: o que é e como preencher em 2025" | "Aposentadoria Rural: quais são os requisitos em 2024 " | "Pensão por Morte Rural: como funciona e quem tem direito" |