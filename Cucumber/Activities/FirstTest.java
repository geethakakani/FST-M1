package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest extends BaseClass {
    @BeforeAll
    public static void SetUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }

    @Given("the user is on the TS home page")
    public void OpenBrowser() {

    }

    @Then("close the browser")
    public void closeBrowser() {
        driver.close();

    }
}

