package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_test {

    private WebDriver driver;

    @Given("I am logged in as {string}")
    public void iAmLoggedInAs(String username) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa-desk-demo.livelyworks.net/#!/login");

        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));

        // Login as the specified user
        if ("demoadmin".equalsIgnoreCase(username)) {
            usernameField.sendKeys("demoadmin");
            passwordField.sendKeys("demopass12");
            loginButton.click();
        }
        // Add more conditions for other users if needed
    }

    @When("I create a new role with specific permissions")
    public void iCreateANewRoleWithSpecificPermissions() {
        // Implement code to create a new user role with specific permissions
    }

    @Then("a new user role should be created")
    public void aNewUserRoleShouldBeCreated() {
        // Implement code to verify the creation of a new user role
        driver.quit();
    }
}
