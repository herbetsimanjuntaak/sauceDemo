package page;

import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    By input_username = By.id("user-name");
    By input_password = By.id("password");
    By login_button = By.id("login-button");

    By getNotif_error(String message){
        return By.xpath("//h3[contains(text(),'"+message+"')] ");
    }
    public void openBrowser(){
        driver.get("https://www.saucedemo.com/");
    }

    public void setInputUsername(String username){
        driver.findElement(input_username).sendKeys(username);
    }

    public void setInputPassword(String password){
        driver.findElement(input_password).sendKeys(password);
    }

    public void clickButtonLogin(){
        driver.findElement(login_button).click();
    }

    public void lockedUser(String errMsg){
        driver.findElement(getNotif_error(errMsg)).isDisplayed();
    }

    public void validateErrorAppear(String errorMessage) {
        assertTrue(driver.getPageSource().contains(errorMessage));
    }


}
