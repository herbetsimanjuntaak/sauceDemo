import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumConcept {

    @Test
    public void helloJayjay() throws InterruptedException {


        //inisialisasi browser driver
        WebDriver webDriver = WebDriverManager.chromedriver().create();


        //navigasi url
//        webDriver.get("https://www.saucedemo.com/");

//        //get element attribute
//        String text = webDriver.findElement(By.id("send_form_info")).getText();
//
//        //assertions
//        assertEquals("DAPATKAN KONSULTASI",text);
//
//        webDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
//        webDriver.findElement(By.cssSelector("input#user-name"));

        //SELENIUM METHOD
//        String title = webDriver.getTitle();
//        String curentURL = webDriver.getCurrentUrl();
//
//        System.out.println("Hello ini adalah title "+title);
//        System.out.println("URL = "+curentURL);


        //WEB ELEMENT METHOD
        By input_username = By.id("user-name");
        By input_password = By.id("password");
        By login_button = By.id("login-button");



//        //input text
//        webDriver.findElement(input_username).sendKeys("standard_user");
//        webDriver.findElement(input_password).sendKeys("secret_sauce");
//        //click
//        webDriver.findElement(login_button).click();
//        Thread.sleep(3000);
//
//        String judul = webDriver.findElement(By.className("app_logo")).getText();
//        System.out.println(judul);
//
//        webDriver.navigate().back();




        /*
        //cek status element
        .isDisplayed();
        .isEnabled();
        .isSelected();

        //mengambil text
       .getText();

       //navigasi ke halaman web tertentu
       webDriver.navigate().to("url");
       //refresh
       webDriver.navigate().refresh();
       //back
       webDriver.navigate().back();
       //forward
       webDriver.navigate().forward();

         */
        //contoh penggunaan navigate
        webDriver.navigate().to("https://www.saucedemo.com/");
        webDriver.navigate().refresh();
        webDriver.navigate().to("https://jayjay.co/");
        webDriver.navigate().back();
        Thread.sleep(3000);
        webDriver.navigate().forward();
        Thread.sleep(3000);

        String title = webDriver.getTitle();
        String curentURL = webDriver.getCurrentUrl();

        System.out.println("Hello ini adalah title "+title);
        System.out.println("URL = "+curentURL);



    }

    @Test
    public void implicitWaitTest(){

        WebDriver driver = WebDriverManager.chromedriver().create();

        //setiap action akan memiliki jeda 5 detik
        //kalau action sudah selesai sebelum 5 detik maka tidak perlu ditunggu sampai 5 detik langsung ke action berikutnya
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        driver.get("https://www.saucedemo.com/");

        By input_username = By.id("user-name");
        By input_password = By.id("password");
        By login_button = By.id("login-button");

        driver.findElement(input_username).sendKeys("standard_user");
        driver.findElement(input_password).sendKeys("secret_sauce");
        driver.findElement(login_button).click();

        Assert.assertEquals("Sauce Labs Backpack",driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText());
    }

    @Test
    public void explicitWaitTest(){

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.saucedemo.com/");

        //jadi di setiap action yang ada wait nya akan ditunggu selama 10 second
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10000));

        By input_username = By.id("user-name");
        By input_password = By.id("password");
        By login_button = By.id("login-button");

        wait.until(ExpectedConditions.presenceOfElementLocated(input_username));
        driver.findElement(input_username).sendKeys("standard_user");
        wait.until(ExpectedConditions.presenceOfElementLocated(input_password));
        driver.findElement(input_password).sendKeys("secret_sauce");
        wait.until(ExpectedConditions.presenceOfElementLocated(login_button));
        driver.findElement(login_button).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='item_4_title_link']")));
        Assert.assertEquals("Sauce Labs Backpack",driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText());
    }
}
