$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastro de usuário",
  "description": "",
  "id": "cadastro-de-usuário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Registrar novo usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuário;registrar-novo-usuário-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou no site yourlogo",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "que estou no campo de cadastro",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "preencho o formulário de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "vejo a mensagem de cadastro realizado com sucesso.",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSteps.que_estou_no_site_yourlogo()"
});
formatter.result({
  "duration": 7171894500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.que_estou_na_tela_de_login()"
});
formatter.result({
  "duration": 418704200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.eu_preencho_o_formulário_de_cadastro()"
});
formatter.result({
  "duration": 2303928000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.clico_em_registrar()"
});
formatter.result({
  "duration": 6384775800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.vejo_a_mensagem_de_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "duration": 100851900,
  "status": "passed"
});
});