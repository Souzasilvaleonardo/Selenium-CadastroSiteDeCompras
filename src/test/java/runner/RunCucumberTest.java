package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberTest.json", "html:target/reports/"},
        features = "src/test/resources/features",
        tags = {"@cadastro"},
        glue = {"steps"}
)

public class RunCucumberTest extends RunBase {


    @AfterClass
    public static void stop() {

        getDriver().quit();
    }
}
