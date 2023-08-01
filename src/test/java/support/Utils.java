package support;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;


public class Utils extends RunCucumberTest {

    public static void waitElementBePresent(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static String emailRandomico(){
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String firstNameRandomico(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String lastNameRandomico(){
        Faker faker = new Faker();
        return faker.name().lastName();
    }

    public static String addressRandomico(){
        Faker faker = new Faker();
        return faker.address().streetAddress();
    }
}
