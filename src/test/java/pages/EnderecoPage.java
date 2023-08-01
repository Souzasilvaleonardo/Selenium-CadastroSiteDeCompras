package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class EnderecoPage extends RunCucumberTest {

    // elementos
    private By add_address = By.cssSelector("#center_column > div > div > ul > li:nth-child(1)");

    private By address_field = By.id("address1");

    private By city_field = By.id("city");

    private By state_field = By.id("id_state");
    private By postal_code_field = By.id("postcode");

    private By phone_field = By.id("phone_mobile");

    private By save_button = By.id("submitAddress");
    private By sucess_address = By.xpath("//*[@id=\"center_column\"]/div[2]/a");

    private By home_button = By.cssSelector("#center_column > ul > li:nth-child(2) > a");

    // ações / funções / métodos
    public void address(){

        getDriver().findElement(add_address).click();
    }

    public void field_address(){
        Utils.waitElementBePresent(address_field,20);
        String address = Utils.addressRandomico();
        getDriver().findElement(address_field).sendKeys(address);
    }

    public void field_city(String city){

        getDriver().findElement(city_field).sendKeys(city);
    }

    public void field_state(String state){
        Select select_state = new Select(getDriver().findElement(state_field));
        select_state.selectByVisibleText(state);
    }

    public void field_postal_code(String zip){

        getDriver().findElement(postal_code_field).sendKeys(zip);
    }

    public void field_phone(String phone){

        getDriver().findElement(phone_field).sendKeys(phone);
    }

    public void clicksave(){

        getDriver().findElement(save_button).click();
    }

    public void address_sucess() {
        Utils.waitElementBePresent(sucess_address, 20);
        String resultado_atual = getDriver().findElement(sucess_address).getText();
        Assert.assertEquals("Add a new address", resultado_atual);
    }

    public void home(){
        getDriver().findElement(home_button).click();
    }

}


