Feature: Stories
  I want to read more about a story on the Agi Blog

  @scenario-news-stories
  Scenario Outline: User access a story
    Given I am Agi Blog <url>
    When I access more story
    Then website will show a list with <firstStory>,  <secondStory>, <thirdStory>, <fourthStory>, <fifthStory>, <sixthStory>, <seventhStory>, <eighthStory>, <ninthStory> stories

    Examples:
      | url                    | firstStory                                                                                  | secondStory                                                    | thirdStory                                                          | fourthStory                                       | fifthStory                                | sixthStory                                   | seventhStory                                                        | eighthStory                                                      | ninthStory                                                               |
      | "www.blogdoagi.com.br" | "Mudança no Consignado em 2025: descubra o que mudou e como isso pode afetar suas finanças" | "O que acontece com quem não votar?  Entenda as consequências" | "Bolsa Família 2024: veja quando será pago o benefício em setembro" | "6 Dicas para Criar uma Senha Segura na Internet" | "7 dicas essencias para controlar gastos" | "6 Mitos e Verdades sobre Cartão de Crédito" | "5 Vantagens sobre Empréstimo Consignado que Você Precisa Conhecer" | "30 anos do Plano Real: conheça 5 Curiosidades sobre o Programa" | "Taxa de Empréstimo Consignado cai para 1,66%: o que você precisa saber" |