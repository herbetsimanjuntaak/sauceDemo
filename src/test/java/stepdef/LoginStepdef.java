package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginStepdef {


    LoginPage loginPage;

    public LoginStepdef() {
        this.loginPage = new LoginPage();
    }

    @Given("user in login page")
    public void userInLoginPage() {
        loginPage.openBrowser();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        loginPage.setInputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.setInputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickButtonLogin();
    }


    @Then("user will see notification error message {string}")
    public void userWillSeeNotificationErrorMessage(String errorMessage) {
        loginPage.lockedUser(errorMessage);
    }

    @Then("user able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) {
        loginPage.validateErrorAppear(errorMessage);
    }
}
