package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/Activity3.feature",
        glue = {"stepDefinitions"},
        tags = "@SimpleTest or @ConfirmAlert"
)
public class Activity3TestRunner {
}
