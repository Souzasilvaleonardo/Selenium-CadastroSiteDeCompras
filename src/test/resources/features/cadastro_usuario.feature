# language: pt

@cadastro
Funcionalidade: Cadastro de usuário



  @cadastro-sucesso
  Cenário: Registrar novo usuário com sucesso
    Dado que estou no site yourlogo
    E que estou no campo de cadastro
    Quando preencho o formulário de cadastro
    E clico em registrar
    Então vejo a mensagem de cadastro realizado com sucesso.

