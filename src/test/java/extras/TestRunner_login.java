package extras;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature/login.feature",
        glue = "src/test/java/steps/TestLogin.java",
        plugin = {"pretty"}
)
public class TestRunner_login {
}
