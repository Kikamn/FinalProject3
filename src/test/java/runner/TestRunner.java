package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:reports/cucumber_report.html", "json:reports/cucumber_report.json"},
        glue = {"stepDef"},
        features = {"src/test/java/features"},
        tags = "@api",
        monochrome = true
)
public class TestRunner {
}
