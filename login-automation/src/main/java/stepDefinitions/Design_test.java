package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;
import java.util.Map;

public class Design_test {

    private WebDriver driver;

    @Given("I am logged in as {string}")
    public void iAmLoggedInAs(String username) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");

        // Set up Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);

        driver.get("https://qa-desk-demo.livelyworks.net/#!/login");

        // Implement code to log in as the specified user
    }

    @When("I review various pages for design consistency")
    public void iReviewVariousPagesForDesignConsistency() {
        // Implement code to review various pages for design consistency
    }

    @Then("design elements should appear uniform")
    public void designElementsShouldAppearUniform() {
        // Implement code to verify design elements for uniform appearance
        driver.quit();
    }

    @When("I access the application on different devices")
    public void iAccessTheApplicationOnDifferentDevices() {
        // Implement code to access the application on different devices
    }

    @Then("the application should display properly on all screen sizes")
    public void theApplicationShouldDisplayProperlyOnAllScreenSizes() {
        // Implement code to verify proper display on all screen sizes
        driver.quit();
    }
}
