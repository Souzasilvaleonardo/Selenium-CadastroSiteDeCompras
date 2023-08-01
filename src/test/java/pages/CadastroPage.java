package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

    // elementos
    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By name_first = By.id("customer_firstname");
    private By name_last = By.id("customer_lastname");
    private By password_field = By.id("passwd");
    private By day_field = By.id("days");
    private By months_field = By.id("months");
    private By years_field = By.id("years");
    private By checkbox = By.id("newsletter");
    private By register_button = By.id("submitAccount");
    private By sucess_registration = By.cssSelector("#center_column > p.alert.alert-success");


    // ações / funções / métodos
    public void selectTile(Integer type){
        Utils.waitElementBePresent(titleM,20);
        if(type ==1){
            getDriver().findElement(titleM).click();
        }else if(type ==2){
            getDriver().findElement(titleF).click();
        }
    }

    public void nameFirst(String firstName){

        getDriver().findElement(name_first).sendKeys(firstName);
    }

    public void nameLast(String lastName){

        getDriver().findElement(name_last).sendKeys(lastName);
    }
    public void passwordField(String password){

        getDriver().findElement(password_field).sendKeys(password);
    }
    public void dateOfBirth(Integer day, Integer month, String year){
        Select select_day = new Select(getDriver().findElement(day_field));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(months_field));
        select_month.selectByIndex(month);

        Select select_year = new Select(getDriver().findElement(years_field));
        select_year.selectByValue(year);
    }
    public void check(){

        getDriver().findElement(checkbox).click();
    }

    public void register(){

        getDriver().findElement(register_button).click();
    }

    public void check_registration(){
        Utils.waitElementBePresent(sucess_registration,20);
        String resultado_atual = getDriver().findElement(sucess_registration).getText();
        Assert.assertEquals("Your account has been created.",resultado_atual);
    }
}
