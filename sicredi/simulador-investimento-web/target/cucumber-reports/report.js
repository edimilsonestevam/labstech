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
  "duration": 501507600,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\home\\edimilson\\Drivers\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat pt.po.edimilsonestevam.setup.Configuracao.AbrirNavegador(Configuracao.java:35)\r\n\tat pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(TestSteps.java:27)\r\n\tat ✽.Dado eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"(SimularInvestimentoPoupancaWeb.feature:9)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "duration": 3745700,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\home\\edimilson\\Drivers\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat pt.po.edimilsonestevam.setup.Configuracao.AbrirNavegador(Configuracao.java:35)\r\n\tat pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(TestSteps.java:27)\r\n\tat ✽.Dado eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"(SimularInvestimentoPoupancaWeb.feature:9)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "duration": 3620000,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\home\\edimilson\\Drivers\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat pt.po.edimilsonestevam.setup.Configuracao.AbrirNavegador(Configuracao.java:35)\r\n\tat pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(TestSteps.java:27)\r\n\tat ✽.Dado eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"(SimularInvestimentoPoupancaWeb.feature:9)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "duration": 9160800,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\home\\edimilson\\Drivers\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat pt.po.edimilsonestevam.setup.Configuracao.AbrirNavegador(Configuracao.java:35)\r\n\tat pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(TestSteps.java:27)\r\n\tat ✽.Dado eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"(SimularInvestimentoPoupancaWeb.feature:9)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.eu_confirmo_a_operacao(String)"
});
formatter.result({
  "status": "skipped"
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
  "duration": 4397100,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\home\\edimilson\\Drivers\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat pt.po.edimilsonestevam.setup.Configuracao.AbrirNavegador(Configuracao.java:35)\r\n\tat pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(TestSteps.java:27)\r\n\tat ✽.Dado eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"(SimularInvestimentoPoupancaWeb.feature:9)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.eu_confirmo_a_operacao(String)"
});
formatter.result({
  "status": "skipped"
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
  "duration": 2858700,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\home\\edimilson\\Drivers\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat pt.po.edimilsonestevam.setup.Configuracao.AbrirNavegador(Configuracao.java:35)\r\n\tat pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(TestSteps.java:27)\r\n\tat ✽.Dado eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"(SimularInvestimentoPoupancaWeb.feature:9)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "duration": 2051900,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\home\\edimilson\\Drivers\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat pt.po.edimilsonestevam.setup.Configuracao.AbrirNavegador(Configuracao.java:35)\r\n\tat pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(TestSteps.java:27)\r\n\tat ✽.Dado eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"(SimularInvestimentoPoupancaWeb.feature:9)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "duration": 2754100,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\home\\edimilson\\Drivers\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat pt.po.edimilsonestevam.setup.Configuracao.AbrirNavegador(Configuracao.java:35)\r\n\tat pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(TestSteps.java:27)\r\n\tat ✽.Dado eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"(SimularInvestimentoPoupancaWeb.feature:9)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "duration": 2936200,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\home\\edimilson\\Drivers\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat pt.po.edimilsonestevam.setup.Configuracao.AbrirNavegador(Configuracao.java:35)\r\n\tat pt.po.edimilsonestevam.stepDefinition.TestSteps.eu_estou_na_pagina_do_Simulador_de_Investimento(TestSteps.java:27)\r\n\tat ✽.Dado eu estou na pagina do Simulador de Investimento \"www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/\"(SimularInvestimentoPoupancaWeb.feature:9)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.o_sistema_apresenta_uma_mensagem()"
});
formatter.result({
  "status": "skipped"
});
});