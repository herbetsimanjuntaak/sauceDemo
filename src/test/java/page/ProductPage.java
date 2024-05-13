package page;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class ProductPage {

    By backpack = By.xpath("//img[@alt='Sauce Labs Backpack']");

    By text_detail_product = By.xpath("//div[@class='inventory_details_name large_size']");

    By bike = By.xpath("//img[@alt='Sauce Labs Bike Light']");

    By bolt_t_shirt = By.xpath("//img[@alt='Sauce Labs Bolt T-Shirt']");

    By fleece = By.xpath("//img[@alt='Sauce Labs Fleece Jacket']");

    By onesie = By.xpath("//img[@alt='Sauce Labs Onesie']");

    By red_t_shirt = By.xpath("//img[@alt='Test.allTheThings() T-Shirt (Red)']");


    public void clickImageBackpack() {
        driver.findElement(backpack).click();
    }

    public void detailProductBackpack() {
        driver.findElement(text_detail_product).isDisplayed();
    }

    public void clickImageRed() {
        driver.findElement(red_t_shirt).click();
    }

    public void clickImageBike() {
        driver.findElement(bike).click();
    }

    public void clickImageBolt() {
        driver.findElement(bolt_t_shirt).click();
    }

    public void clickImageFleece() {
        driver.findElement(fleece).click();
    }

    public void clickImageOnesie() {
        driver.findElement(onesie).click();
    }


}
