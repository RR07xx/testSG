package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature/cart.feature",
        glue = "src/test/java/steps/TestCart.java"
)
public class TestRunner_cart {
}
