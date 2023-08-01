package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginpage = new LoginPage();

    @Dado("^que estou no site yourlogo$")
    public void que_estou_no_site_yourlogo() {
        initDriver();
        loginpage.acessarSite();
    }

    @Dado("^que estou no campo de cadastro$")
    public void que_estou_na_tela_de_login() {
        loginpage.campoCriarEmail();
        loginpage.clicarCriarConta();
    }


}
