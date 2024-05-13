package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.TransactionPage;

public class TransactionStepdef {

    TransactionPage transactionPage;

    public TransactionStepdef() {
        this.transactionPage = new TransactionPage();
    }

    @When("user click button checkout")
    public void userClickButtonCheckout() {
        transactionPage.clickButtonCheckout();
    }

    @Then("user redirect to checkout page")
    public void userRedirectToCheckoutPage() {
        transactionPage.assertCheckoutPage();
    }

    @When("user click button cancel")
    public void userClickButtonCancel() {
        transactionPage.clickButtonCancel();
    }

    @And("user input firstname {string}")
    public void userInputFirstname(String firstName) {
        transactionPage.setInputFirstname(firstName);
    }

    @And("user input lastname {string}")
    public void userInputLastname(String lastName) {
        transactionPage.setInputLastname(lastName);
    }

    @And("user input postal code {string}")
    public void userInputZipPostalCode(String postalCode) {
        transactionPage.setInputZip(postalCode);
    }

    @When("user click button continue")
    public void userClickButtonContinue() {
        transactionPage.clickButtonContinue();
    }

    @Then("user redirect to checkout overview")
    public void userRedirectToCheckoutOverview() {
        transactionPage.assertCheckoutOverview();
    }

    @And("user click button finish")
    public void userClickButtonFinish() {
        transactionPage.clickButtonFinish();
    }

    @And("user redirect to complete chekcout")
    public void userRedirectToCompleteChekcout() {
        transactionPage.assertComplete();
    }

    @When("user click button back home")
    public void userClickButtonBackHome() {
        transactionPage.clickButtonBackHome();
    }
}
