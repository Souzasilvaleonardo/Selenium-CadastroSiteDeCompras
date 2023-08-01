package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {

    // elementos
    private String URL = "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account";
    private By creat_email_field = By.id("email_create");
    private By creat_email_button = By.id("SubmitCreate");
    private By login_field = By.id("email");
    private By password_in = By.id("passwd");

    private By sing_in_button = By.id("SubmitLogin");


    // ações / funções / métodos
    public void acessarSite(){
        getDriver().get(URL);
        Utils.waitElementBePresent(creat_email_field,20);
    }

    public void campoCriarEmail(){
        String email = Utils.emailRandomico();
        getDriver().findElement(creat_email_field).sendKeys(email);

    }

    public void clicarCriarConta(){

        getDriver().findElement(creat_email_button).click();
    }

    public void preencherLogin(String login){
        Utils.waitElementBePresent(login_field,20);
        getDriver().findElement(login_field).sendKeys(login);
    }

    public void preencherSenha(String senha){

        getDriver().findElement(password_in).sendKeys(senha);
    }

    public void clicarEntrar(){

        getDriver().findElement(sing_in_button).click();
    }


}
