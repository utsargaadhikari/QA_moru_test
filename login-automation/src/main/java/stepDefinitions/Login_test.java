package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_test {

    private WebDriver driver;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa-desk-demo.livelyworks.net/#!/login");
    }

    @And("I log in as {string} with password {string}")
    public void iLogInAsWithPassword(String username, String password) {
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        // Implement code to enter valid username and password
    }

    @When("I enter invalid username or password")
    public void iEnterInvalidUsernameOrPassword() {
        // Implement code to enter invalid username or password
    }

    @And("I click the \"Login\" button")
    public void iClickTheLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginButton.click();
    }

    @Then("I should be redirected to the dashboard")
    public void iShouldBeRedirectedToTheDashboard() {
        // Implement code to verify redirection to the dashboard
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        // Implement code to verify the presence of an error message
    }

    @When("I navigate to the user registration page")
    public void iNavigateToTheUserRegistrationPage() {
        // Implement code to navigate to the user registration page
    }

    @When("I enter valid registration details")
    public void iEnterValidRegistrationDetails() {
        // Implement code to enter valid registration details
    }

    @And("I click the \"Register\" button")
    public void iClickTheRegisterButton() {
        WebElement registerButton = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        registerButton.click();
    }

    @Then("a new user account should be created")
    public void aNewUserAccountShouldBeCreated() {
        // Implement code to verify the creation of a new user account
    }

    @When("I navigate to the user profile page")
    public void iNavigateToTheUserProfilePage() {
        // Implement code to navigate to the user profile page
    }

    @When("I modify user profile information")
    public void iModifyUserProfileInformation() {
        // Implement code to modify user profile information
    }

    @And("I click the \"Save\" button")
    public void iClickTheSaveButton() {
        WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
        saveButton.click();
    }

    @Then("the user profile information should be updated")
    public void theUserProfileInformationShouldBeUpdated() {
        // Implement code to verify the update of user profile information
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
