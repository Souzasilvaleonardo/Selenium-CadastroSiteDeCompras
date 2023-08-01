package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import pages.LoginPage;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    @Quando("^preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro()  {
        cadastroPage.selectTile(1);
        String firstName = Utils.firstNameRandomico();
        String lastName = Utils.lastNameRandomico();
        cadastroPage.nameFirst(firstName);
        cadastroPage.nameLast(lastName);
        cadastroPage.passwordField("123456");
        cadastroPage.dateOfBirth(16,04,"1994");
        cadastroPage.check();
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {

        cadastroPage.register();
    }

    @Então("^vejo a mensagem de cadastro realizado com sucesso\\.$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {

        cadastroPage.check_registration();
    }

    @Dado("^que estou com usuário cadastrado$")
    public void que_estou_com_usuário_cadastrado(){
        cadastroPage.selectTile(1);
        String firstName = Utils.firstNameRandomico();
        String lastName = Utils.lastNameRandomico();
        cadastroPage.nameFirst(firstName);
        cadastroPage.nameLast(lastName);
        cadastroPage.passwordField("123456");
        cadastroPage.dateOfBirth(16,04,"1994");
        cadastroPage.check();
        cadastroPage.register();
        cadastroPage.check_registration();

    }
}
