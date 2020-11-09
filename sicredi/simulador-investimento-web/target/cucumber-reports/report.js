$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SimularInvestimentoPoupancaWeb.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Simulador Investimento Poupanca",
  "description": "Eu quero fazer um investimento na Poupanca",
  "id": "simulador-investimento-poupanca",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@cenario"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cenario-simulador-investimento-poupanca"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "eu estou na pagina do Simulador de Investimento \u003curl\u003e",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu informo o perfil \u003cperfil\u003e",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu informo o valor a ser aplicado \u003cvalorAplicado\u003e, o valor a ser poupado \u003cvalorPoupado\u003e, a quantidade de meses ou anos \u003cquantidadeMesesOuAnos\u003e, o tipo do prazo \u003ctipoPrazo\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu confirmo a operacao \u003cmensagemAdvertencia\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema apresenta uma mensagem \u003cmensagemSucessoInvestimento\u003e",
  "keyword": "Entao "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;;",
  "rows": [
    {
      "cells": [
        "url",
        "perfil",
        "valorAplicado",
        "valorPoupado",
        "quantidadeMesesOuAnos",
        "tipoPrazo",
        "valorFinal",
        "mensagemAdvertencia",
        "mensagemSucessoInvestimento"
      ],
      "line": 16,
      "id": "simulador-investimento-poupanca;;;1"
    },
    {
      "cells": [
        "\"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
        "1",
        "1900",
        "2000",
        "12",
        "2",
        "",
        "\"Valor mínimo de 20.00\"",
        ""
      ],
      "line": 17,
      "id": "simulador-investimento-poupanca;;;2"
    },
    {
      "cells": [
        "\"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
        "1",
        "1900",
        "1900",
        "12",
        "2",
        "",
        "\"Valor mínimo de 20.00\"",
        ""
      ],
      "line": 18,
      "id": "simulador-investimento-poupanca;;;3"
    },
    {
      "cells": [
        "\"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
        "1",
        "2000",
        "1900",
        "12",
        "2",
        "",
        "\"Valor mínimo de 20.00\"",
        ""
      ],
      "line": 19,
      "id": "simulador-investimento-poupanca;;;4"
    },
    {
      "cells": [
        "\"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
        "1",
        "2000",
        "2000",
        "12",
        "2",
        "3402",
        "",
        "\"Em 144 meses você terá guardado\""
      ],
      "line": 20,
      "id": "simulador-investimento-poupanca;;;5"
    },
    {
      "cells": [
        "\"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
        "1",
        "2100",
        "2100",
        "12",
        "2",
        "3572",
        "",
        "\"Em 144 meses você terá guardado\""
      ],
      "line": 21,
      "id": "simulador-investimento-poupanca;;;6"
    },
    {
      "cells": [
        "\"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
        "1",
        "2000",
        "2000",
        "",
        "2",
        "",
        "\"Obrigatório\"",
        ""
      ],
      "line": 22,
      "id": "simulador-investimento-poupanca;;;7"
    },
    {
      "cells": [
        "\"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
        "1",
        "2000",
        "2000",
        "0",
        "2",
        "",
        "\"Valor esperado não confere\"",
        ""
      ],
      "line": 23,
      "id": "simulador-investimento-poupanca;;;8"
    },
    {
      "cells": [
        "\"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
        "1",
        "2000",
        "2000",
        "-1",
        "2",
        "",
        "\"Valor esperado não confere\"",
        ""
      ],
      "line": 24,
      "id": "simulador-investimento-poupanca;;;9"
    },
    {
      "cells": [
        "\"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
        "1",
        "2000",
        "2000",
        "999",
        "2",
        "",
        "\"Valor esperado não confere\"",
        ""
      ],
      "line": 25,
      "id": "simulador-investimento-poupanca;;;10"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cenario-simulador-investimento-poupanca"
    },
    {
      "line": 3,
      "name": "@cenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu informo o perfil 1",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu informo o valor a ser aplicado 1900, o valor a ser poupado 2000, a quantidade de meses ou anos 12, o tipo do prazo 2",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu confirmo a operacao \"Valor mínimo de 20.00\"",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema apresenta uma mensagem ",
  "matchedColumns": [
    8
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/",
      "offset": 49
    }
  ],
  "location": "TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(String)"
});
formatter.result({
  "duration": 11305682500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "TestSteps.eu_informo_o_perfil(int)"
});
formatter.result({
  "duration": 288394300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1900",
      "offset": 34
    },
    {
      "val": "2000",
      "offset": 62
    },
    {
      "val": "12",
      "offset": 98
    },
    {
      "val": "2",
      "offset": 118
    }
  ],
  "location": "TestSteps.eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo1(int,int,int,int)"
});
formatter.result({
  "duration": 732552300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Valor mínimo de 20.00",
      "offset": 24
    }
  ],
  "location": "TestSteps.eu_confirmo_a_operacao()"
});
formatter.result({
  "duration": 285800,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_confirmo_a_operacao() in file:/C:/Users/edimi/Repositories/GitHub/labstech/sicredi/simulador-investimento-web/target/test-classes/\u0027 with pattern [^eu confirmo a operacao \"([^\"]*)\"$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Valor mínimo de 20.00]. \nStep: E eu confirmo a operacao \"Valor mínimo de 20.00\"\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.o_sistema_apresenta_uma_mensagem()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cenario-simulador-investimento-poupanca"
    },
    {
      "line": 3,
      "name": "@cenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu informo o perfil 1",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu informo o valor a ser aplicado 1900, o valor a ser poupado 1900, a quantidade de meses ou anos 12, o tipo do prazo 2",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu confirmo a operacao \"Valor mínimo de 20.00\"",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema apresenta uma mensagem ",
  "matchedColumns": [
    8
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/",
      "offset": 49
    }
  ],
  "location": "TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(String)"
});
formatter.result({
  "duration": 7334159200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "TestSteps.eu_informo_o_perfil(int)"
});
formatter.result({
  "duration": 55269900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1900",
      "offset": 34
    },
    {
      "val": "1900",
      "offset": 62
    },
    {
      "val": "12",
      "offset": 98
    },
    {
      "val": "2",
      "offset": 118
    }
  ],
  "location": "TestSteps.eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo1(int,int,int,int)"
});
formatter.result({
  "duration": 467541800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Valor mínimo de 20.00",
      "offset": 24
    }
  ],
  "location": "TestSteps.eu_confirmo_a_operacao()"
});
formatter.result({
  "duration": 205600,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_confirmo_a_operacao() in file:/C:/Users/edimi/Repositories/GitHub/labstech/sicredi/simulador-investimento-web/target/test-classes/\u0027 with pattern [^eu confirmo a operacao \"([^\"]*)\"$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Valor mínimo de 20.00]. \nStep: E eu confirmo a operacao \"Valor mínimo de 20.00\"\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.o_sistema_apresenta_uma_mensagem()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;;;4",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cenario-simulador-investimento-poupanca"
    },
    {
      "line": 3,
      "name": "@cenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu informo o perfil 1",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu informo o valor a ser aplicado 2000, o valor a ser poupado 1900, a quantidade de meses ou anos 12, o tipo do prazo 2",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu confirmo a operacao \"Valor mínimo de 20.00\"",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema apresenta uma mensagem ",
  "matchedColumns": [
    8
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/",
      "offset": 49
    }
  ],
  "location": "TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(String)"
});
formatter.result({
  "duration": 9420392300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "TestSteps.eu_informo_o_perfil(int)"
});
formatter.result({
  "duration": 60862700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 34
    },
    {
      "val": "1900",
      "offset": 62
    },
    {
      "val": "12",
      "offset": 98
    },
    {
      "val": "2",
      "offset": 118
    }
  ],
  "location": "TestSteps.eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo1(int,int,int,int)"
});
formatter.result({
  "duration": 479591000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Valor mínimo de 20.00",
      "offset": 24
    }
  ],
  "location": "TestSteps.eu_confirmo_a_operacao()"
});
formatter.result({
  "duration": 161800,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_confirmo_a_operacao() in file:/C:/Users/edimi/Repositories/GitHub/labstech/sicredi/simulador-investimento-web/target/test-classes/\u0027 with pattern [^eu confirmo a operacao \"([^\"]*)\"$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Valor mínimo de 20.00]. \nStep: E eu confirmo a operacao \"Valor mínimo de 20.00\"\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.o_sistema_apresenta_uma_mensagem()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;;;5",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cenario-simulador-investimento-poupanca"
    },
    {
      "line": 3,
      "name": "@cenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu informo o perfil 1",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu informo o valor a ser aplicado 2000, o valor a ser poupado 2000, a quantidade de meses ou anos 12, o tipo do prazo 2",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu confirmo a operacao ",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema apresenta uma mensagem \"Em 144 meses você terá guardado\"",
  "matchedColumns": [
    8
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/",
      "offset": 49
    }
  ],
  "location": "TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(String)"
});
formatter.result({
  "duration": 6936892300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "TestSteps.eu_informo_o_perfil(int)"
});
formatter.result({
  "duration": 76602400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 34
    },
    {
      "val": "2000",
      "offset": 62
    },
    {
      "val": "12",
      "offset": 98
    },
    {
      "val": "2",
      "offset": 118
    }
  ],
  "location": "TestSteps.eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo1(int,int,int,int)"
});
formatter.result({
  "duration": 506392900,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.eu_confirmo_a_operacao(String)"
});
formatter.result({
  "duration": 223400,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_confirmo_a_operacao(String) in file:/C:/Users/edimi/Repositories/GitHub/labstech/sicredi/simulador-investimento-web/target/test-classes/\u0027 with pattern [^eu confirmo a operacao $] is declared with 1 parameters. However, the gherkin step has 0 arguments []. \nStep: E eu confirmo a operacao \r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Em 144 meses você terá guardado",
      "offset": 34
    }
  ],
  "location": "TestSteps.o_sistema_apresenta_uma_mensagem(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 21,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;;;6",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cenario-simulador-investimento-poupanca"
    },
    {
      "line": 3,
      "name": "@cenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu informo o perfil 1",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu informo o valor a ser aplicado 2100, o valor a ser poupado 2100, a quantidade de meses ou anos 12, o tipo do prazo 2",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu confirmo a operacao ",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema apresenta uma mensagem \"Em 144 meses você terá guardado\"",
  "matchedColumns": [
    8
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/",
      "offset": 49
    }
  ],
  "location": "TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(String)"
});
formatter.result({
  "duration": 6833460900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "TestSteps.eu_informo_o_perfil(int)"
});
formatter.result({
  "duration": 66655700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2100",
      "offset": 34
    },
    {
      "val": "2100",
      "offset": 62
    },
    {
      "val": "12",
      "offset": 98
    },
    {
      "val": "2",
      "offset": 118
    }
  ],
  "location": "TestSteps.eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo1(int,int,int,int)"
});
formatter.result({
  "duration": 463020800,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.eu_confirmo_a_operacao(String)"
});
formatter.result({
  "duration": 158000,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_confirmo_a_operacao(String) in file:/C:/Users/edimi/Repositories/GitHub/labstech/sicredi/simulador-investimento-web/target/test-classes/\u0027 with pattern [^eu confirmo a operacao $] is declared with 1 parameters. However, the gherkin step has 0 arguments []. \nStep: E eu confirmo a operacao \r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Em 144 meses você terá guardado",
      "offset": 34
    }
  ],
  "location": "TestSteps.o_sistema_apresenta_uma_mensagem(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 22,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;;;7",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cenario-simulador-investimento-poupanca"
    },
    {
      "line": 3,
      "name": "@cenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu informo o perfil 1",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu informo o valor a ser aplicado 2000, o valor a ser poupado 2000, a quantidade de meses ou anos , o tipo do prazo 2",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu confirmo a operacao \"Obrigatório\"",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema apresenta uma mensagem ",
  "matchedColumns": [
    8
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/",
      "offset": 49
    }
  ],
  "location": "TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(String)"
});
formatter.result({
  "duration": 8354162900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "TestSteps.eu_informo_o_perfil(int)"
});
formatter.result({
  "duration": 63504100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 34
    },
    {
      "val": "2000",
      "offset": 62
    },
    {
      "val": "2",
      "offset": 116
    }
  ],
  "location": "TestSteps.eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo(int,int,int)"
});
formatter.result({
  "duration": 533690800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Obrigatório",
      "offset": 24
    }
  ],
  "location": "TestSteps.eu_confirmo_a_operacao()"
});
formatter.result({
  "duration": 361700,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_confirmo_a_operacao() in file:/C:/Users/edimi/Repositories/GitHub/labstech/sicredi/simulador-investimento-web/target/test-classes/\u0027 with pattern [^eu confirmo a operacao \"([^\"]*)\"$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Obrigatório]. \nStep: E eu confirmo a operacao \"Obrigatório\"\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.o_sistema_apresenta_uma_mensagem()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 23,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;;;8",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cenario-simulador-investimento-poupanca"
    },
    {
      "line": 3,
      "name": "@cenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu informo o perfil 1",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu informo o valor a ser aplicado 2000, o valor a ser poupado 2000, a quantidade de meses ou anos 0, o tipo do prazo 2",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu confirmo a operacao \"Valor esperado não confere\"",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema apresenta uma mensagem ",
  "matchedColumns": [
    8
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/",
      "offset": 49
    }
  ],
  "location": "TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(String)"
});
formatter.result({
  "duration": 8863166900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "TestSteps.eu_informo_o_perfil(int)"
});
formatter.result({
  "duration": 60237100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 34
    },
    {
      "val": "2000",
      "offset": 62
    },
    {
      "val": "0",
      "offset": 98
    },
    {
      "val": "2",
      "offset": 117
    }
  ],
  "location": "TestSteps.eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo1(int,int,int,int)"
});
formatter.result({
  "duration": 515405000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Valor esperado não confere",
      "offset": 24
    }
  ],
  "location": "TestSteps.eu_confirmo_a_operacao()"
});
formatter.result({
  "duration": 125000,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_confirmo_a_operacao() in file:/C:/Users/edimi/Repositories/GitHub/labstech/sicredi/simulador-investimento-web/target/test-classes/\u0027 with pattern [^eu confirmo a operacao \"([^\"]*)\"$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Valor esperado não confere]. \nStep: E eu confirmo a operacao \"Valor esperado não confere\"\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.o_sistema_apresenta_uma_mensagem()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 24,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;;;9",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cenario-simulador-investimento-poupanca"
    },
    {
      "line": 3,
      "name": "@cenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu informo o perfil 1",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu informo o valor a ser aplicado 2000, o valor a ser poupado 2000, a quantidade de meses ou anos -1, o tipo do prazo 2",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu confirmo a operacao \"Valor esperado não confere\"",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema apresenta uma mensagem ",
  "matchedColumns": [
    8
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/",
      "offset": 49
    }
  ],
  "location": "TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(String)"
});
formatter.result({
  "duration": 8877388000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "TestSteps.eu_informo_o_perfil(int)"
});
formatter.result({
  "duration": 58395200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 34
    },
    {
      "val": "2000",
      "offset": 62
    },
    {
      "val": "1",
      "offset": 99
    },
    {
      "val": "2",
      "offset": 118
    }
  ],
  "location": "TestSteps.eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo(int,int,int,int)"
});
formatter.result({
  "duration": 449101200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Valor esperado não confere",
      "offset": 24
    }
  ],
  "location": "TestSteps.eu_confirmo_a_operacao()"
});
formatter.result({
  "duration": 222600,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_confirmo_a_operacao() in file:/C:/Users/edimi/Repositories/GitHub/labstech/sicredi/simulador-investimento-web/target/test-classes/\u0027 with pattern [^eu confirmo a operacao \"([^\"]*)\"$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Valor esperado não confere]. \nStep: E eu confirmo a operacao \"Valor esperado não confere\"\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.o_sistema_apresenta_uma_mensagem()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 25,
  "name": "",
  "description": "",
  "id": "simulador-investimento-poupanca;;;10",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cenario-simulador-investimento-poupanca"
    },
    {
      "line": 3,
      "name": "@cenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu informo o perfil 1",
  "matchedColumns": [
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu informo o valor a ser aplicado 2000, o valor a ser poupado 2000, a quantidade de meses ou anos 999, o tipo do prazo 2",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu confirmo a operacao \"Valor esperado não confere\"",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "o sistema apresenta uma mensagem ",
  "matchedColumns": [
    8
  ],
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/",
      "offset": 49
    }
  ],
  "location": "TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(String)"
});
formatter.result({
  "duration": 12368669100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "TestSteps.eu_informo_o_perfil(int)"
});
formatter.result({
  "duration": 68311300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 34
    },
    {
      "val": "2000",
      "offset": 62
    },
    {
      "val": "999",
      "offset": 98
    },
    {
      "val": "2",
      "offset": 119
    }
  ],
  "location": "TestSteps.eu_informo_o_valor_a_ser_aplicado_o_valor_a_ser_poupado_a_quantidade_de_meses_ou_anos_o_tipo_do_prazo1(int,int,int,int)"
});
formatter.result({
  "duration": 599650200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Valor esperado não confere",
      "offset": 24
    }
  ],
  "location": "TestSteps.eu_confirmo_a_operacao()"
});
formatter.result({
  "duration": 160600,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_confirmo_a_operacao() in file:/C:/Users/edimi/Repositories/GitHub/labstech/sicredi/simulador-investimento-web/target/test-classes/\u0027 with pattern [^eu confirmo a operacao \"([^\"]*)\"$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Valor esperado não confere]. \nStep: E eu confirmo a operacao \"Valor esperado não confere\"\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.o_sistema_apresenta_uma_mensagem()"
});
formatter.result({
  "status": "skipped"
});
});