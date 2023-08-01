# language: pt

@add-endereco
Funcionalidade: Add endereço

  Contexto: acessar site
    Dado que estou no site yourlogo
    E que estou no campo de cadastro

  @acessar-add-endereco
  Cenário: Endereço cadastrado
    Dado que estou com usuário cadastrado
    Quando clico em "add endereço"
    E preencho o formulário de endereço
    E clico em salvar
    Então vejo o endereço cadastrado com sucesso
    E volto para a tela home.
