package steps;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.home.HomeImplementation;
import pageobject.signIn.SignInImplementation;

public class LoginSteps {

    private HomeImplementation homeImplementation;
    private SignInImplementation signInImplementation;

    private WebDriver driver;

    public LoginSteps() {
        System.setProperty("webdriver.chrome.driver", "C:\\git-repos\\\\automation-practice-pageobject\\\\driver\\\\chromedriver.exe");
        driver = new ChromeDriver();
        homeImplementation = new HomeImplementation(driver);
        signInImplementation = new SignInImplementation(driver);
    }

    @Given("^the user wants to access to the ecommerce$")
    public void theClientIsRegisteredAtThePlatform() throws InterruptedException {
        homeImplementation.goToHomePage();
        Thread.sleep(1000);
    }

    @When("^the user fill the login mandatory field: (.*) and (.*)$")
    public void theUserFillTheLoginForm(String email, String password) throws InterruptedException {
        homeImplementation.goToSignInForm();
        signInImplementation.fillLoginForm(email, password);
        Thread.sleep(2000);
    }

    @Then("^the ecommerce should be show a error feedback$")
    public void theAppShowAErrorMsg() {
        Assert.assertTrue(signInImplementation.getErrorMsg().contains("Authentication failed"));
    }

}
