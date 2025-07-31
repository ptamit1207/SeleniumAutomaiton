package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/amit/IdeaProjects/SeleniumAutomation/src/test/java/features",
        glue = {"stepdefinition","utility"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
}
