package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ProductPage;

public class ProductStepdef {

    ProductPage productPage;

    public ProductStepdef() {
        this.productPage = new ProductPage();
    }

    @When("user click image Backpack product")
    public void userClickImageBackpackProduct() {
        productPage.clickImageBackpack();
    }

    @Then("user will see detail product")
    public void userWillSeeDetailProduct() {
        productPage.detailProductBackpack();
    }


    @When("user click Bike image product")
    public void userClickBikeImageProduct() {
        productPage.clickImageBike();
    }

    @When("user click Bolt image product")
    public void userClickBoltImageProduct() {
        productPage.clickImageBolt();
    }

    @When("user click Fleece image product")
    public void userClickFleeceImageProduct() {
        productPage.clickImageFleece();
    }

    @When("user click Onesie image product")
    public void userClickOnesieImageProduct() {
        productPage.clickImageOnesie();
    }

    @When("user click Red image product")
    public void userClickRedImageProduct() {
        productPage.clickImageRed();
    }
}
