package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.EnderecoPage;
import runner.RunCucumberTest;

public class EnderecoSteps extends RunCucumberTest {

    EnderecoPage enderecoPage = new EnderecoPage();

    @Dado("^clico em \"add endereço\"$")
    public void acesso_adcionar_meu_endereço() {

        enderecoPage.address();
    }

    @Quando("^preencho o formulário de endereço$")
    public void eu_preencho_o_formulário_de_endereço() {
        enderecoPage.field_address();
        enderecoPage.field_city("São Paulo");
        enderecoPage.field_state("Florida");
        enderecoPage.field_postal_code("12345");
        enderecoPage.field_phone("+551194856548");

    }

    @Quando("^clico em salvar$")
    public void clico_em_salvar() {
        enderecoPage.clicksave();

    }

    @Então("^vejo o endereço cadastrado com sucesso$")
    public void vejo_registro_realizado_com_sucesso() {

        enderecoPage.address_sucess();
    }

    @Então("^volto para a tela home.$")
    public void volto_para_a_tela_home() {

        enderecoPage.home();
    }

}

