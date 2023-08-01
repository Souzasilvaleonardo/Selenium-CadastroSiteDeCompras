package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RunBase {

    static WebDriver driver;

    //iniciar nosso driver
    public static WebDriver initDriver() {

        String browser = System.getProperty("browser");

        if (driver != null) {
            driver.quit();
        }
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Passe um navegador válido");
        }

        if(driver != null){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            driver.manage().window().maximize();
        }

        return driver;

    }
    // retornar o driver criado
    public static WebDriver getDriver() {

        return driver;
    }

}
