package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CartPage;

public class CartStepdef {

    CartPage cartPage;

    public CartStepdef() {
        this.cartPage = new CartPage();
    }

    @When("user click cart button")
    public void userClickCartButton() {
        cartPage.clickButtonCart();
    }

    @Then("user will see list cart")
    public void userWillSeeListCart() {
        cartPage.assertListCart();
    }

    @When("user click button continue shopping")
    public void userClickButtonContinueShopping() {
        cartPage.clickButtonContinue();
    }
}
