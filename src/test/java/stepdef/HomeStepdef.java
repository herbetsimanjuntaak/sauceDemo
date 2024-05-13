package stepdef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomeStepdef {

    HomePage homePage;

    public HomeStepdef() {
        this.homePage = new HomePage();
    }


    @Then("user redirect to homepage")
    public void userRedirectToHomepage() {
        homePage.assertHomePage();
    }

    @And("user click option sorting")
    public void userClickOptionSorting() {
        homePage.optionSorting();
    }

    @And("user click field {string}")
    public void userClickField(String field) {
        homePage.sortingBy(field);
    }

    @When("user add product to cart")
    public void userAddProductToCart() {
        homePage.setAddToCart();
    }

    @Then("verify cart item is match {string}")
    public void verifyCartItemIsMatch(String arg0) {
        homePage.assertChartItem(arg0);
    }

    @When("user remove product")
    public void userRemoveProduct() {
        homePage.setRemove();
    }
}
