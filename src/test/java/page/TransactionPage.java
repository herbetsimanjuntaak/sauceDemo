package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransactionPage {

    By button_checkout = By.id("checkout");

    By checkout = By.xpath("//span[@class='title']");

    By button_cancel = By.id("cancel");

    By first_name = By.id("first-name");
    By last_name = By.id("last-name");
    By postal = By.id("postal-code");
    By button_continue = By.id("continue");
    By title = By.xpath("//span[@class='title']");

    By button_finish = By.id("finish");
    By button_back = By.id("back-to-products");


    public void clickButtonCheckout(){
        driver.findElement(button_checkout).click();
    }

    public void assertCheckoutPage(){

        //penggunaan ini untuk validation memastikan Swag Labs ada
        WebElement productElement = driver.findElement(checkout);
        assertTrue(productElement.isDisplayed());
        assertEquals("Checkout: Your Information", productElement.getText());
    }

    public void clickButtonCancel(){
        driver.findElement(button_cancel).click();
    }

    public void setInputFirstname(String firstName){
        driver.findElement(first_name).sendKeys(firstName);
    }

    public void setInputLastname(String lastName){
        driver.findElement(last_name).sendKeys(lastName);
    }
    public void setInputZip(String postalCode){
        driver.findElement(postal).sendKeys(postalCode);
    }

    public void clickButtonContinue(){
        driver.findElement(button_continue).click();
    }

    public void assertCheckoutOverview(){
        driver.findElement(title).isDisplayed();
    }

    public void clickButtonFinish(){
        driver.findElement(button_finish).click();
    }

    public void assertComplete(){
        driver.findElement(title).isDisplayed();
    }
    public void clickButtonBackHome(){
        driver.findElement(button_back).click();
    }

}
