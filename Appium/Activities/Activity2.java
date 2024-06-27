package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2{

    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Set Capabilities
        UiAutomator2Options caps = new UiAutomator2Options()
                .setPlatformName("android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.android.chrome")
                .setAppActivity("com.google.android.apps.chrome.Main")
                .noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverURL, caps);
        driver.get("https://training-support.net/");
    }

        // Test method
    @Test
    public void chromeTest() {
        // Find heading on the page
        String pageHeading = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@text=\"Training Support\"]"
        )).getText();

        // Print to console
        System.out.println("Heading: " + pageHeading);

        // Find and click the About Us link
        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"About Us\"]")).click();

        // Find heading of new page and print to console
        String aboutPageHeading = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@text=\"About Us\"]"
        )).getText();
        System.out.println(aboutPageHeading);
    }

    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}