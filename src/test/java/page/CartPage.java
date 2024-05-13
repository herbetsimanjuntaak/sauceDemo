package page;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class CartPage {

    By btn_cart = By.xpath("//a[@class='shopping_cart_link']");

    By btn_continue_shop = By.id("continue-shopping");
    By cart_list = By.xpath("//div[@class='cart_list']");

    public void clickButtonCart(){
        driver.findElement(btn_cart).click();
    }

    public void clickButtonContinue(){
        driver.findElement(btn_continue_shop).click();
    }

    public void assertListCart(){
        driver.findElement(cart_list).isDisplayed();
    }

}
