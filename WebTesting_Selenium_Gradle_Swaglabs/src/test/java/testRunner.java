import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"swaglabs"},
        features = {"src/test/resources/features/menu.feature"},
        plugin = {"pretty","html:reports/test-report-web.html", "json:reports/test-report-web.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class testRunner {
}
