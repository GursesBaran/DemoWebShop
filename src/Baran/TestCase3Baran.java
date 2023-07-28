package Baran;
import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TestCase3Baran extends BaseDriver {

    @Test
    void Test() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        login.click();
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("brianlopez@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Demo2023");
        WebElement login1 = driver.findElement(By.xpath("//input[@value='Log in']"));
        login1.click();
        WebElement addcart = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[3]//div[1]//div[2]//div[3]//div[2]//input[1]"));
        addcart.click();
        WebElement shoppingcart = driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']"));
        shoppingcart.click();
        WebElement agreebox = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        agreebox.click();
        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        WebElement billing = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
        billing.click();
        WebElement instore = driver.findElement(By.xpath("//input[@id='PickUpInStore']"));
        instore.click();
        WebElement cont = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        cont.click();
        WebElement cont2 = driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
        cont2.click();
        WebElement cont3 = driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']"));
        cont3.click();
        WebElement confirm = driver.findElement(By.xpath("//input[@value='Confirm']"));


    }
}