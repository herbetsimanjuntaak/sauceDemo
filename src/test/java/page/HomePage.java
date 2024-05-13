package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helper.Utility.driver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {


    By icon_cart = By.xpath("//a[@class='shopping_cart_link']");
    By title = By.xpath("//div[@class='app_logo']");

    By option_sorting = By.xpath("//select[@class='product_sort_container']");

    By addToCart = By.xpath("(//*[text()='Add to cart'])[1]");

    By icon_cart_items = By.xpath("//span[@class=\"shopping_cart_badge\"]");

    By remove = By.xpath("(//*[text()='Remove'])[1]");

    By getSortingBy(String sorting){
        return By.xpath("//option[contains(text(),'"+sorting+"')]");
    }
    public void assertHomePage(){
        driver.findElement(icon_cart).isDisplayed();

        //penggunaan ini untuk validation memastikan Swag Labs ada
        WebElement productElement = driver.findElement(title);
        assertTrue(productElement.isDisplayed());
        assertEquals("Swag Labs", productElement.getText());
    }

    public void optionSorting(){
        driver.findElement(option_sorting).click();
    }

    public void sortingBy(String sorting){
        driver.findElement(getSortingBy(sorting)).click();
    }


    public void setAddToCart(){
        driver.findElement(addToCart).click();
    }

    public void setRemove(){
        driver.findElement(remove).click();
    }

    public void assertChartItem(String cartItem){
        String itemActual = driver.findElement(icon_cart_items).getText();
        System.out.println(driver.findElement(icon_cart_items).getText());
        assertThat(cartItem).isEqualTo(itemActual);
    }

}
