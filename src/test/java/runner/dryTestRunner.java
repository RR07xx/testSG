package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature/",
        glue = "steps",
        plugin = {"pretty"},
        dryRun = true
)
public class dryTestRunner {
}
