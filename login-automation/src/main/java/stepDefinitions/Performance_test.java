package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Performance_test {

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

    @When("I perform various actions")
    public void iPerformVariousActions() throws InterruptedException {
        // Implement code to perform various actions
        // Adding a delay of 3 seconds for demonstration purposes
        Thread.sleep(3000);
    }

    @Then("the application should respond within an acceptable time frame")
    public void theApplicationShouldRespondWithinAnAcceptableTimeFrame() {
        // Implement code to verify response times within acceptable limits
        driver.quit();
    }
}
