package Jazeera;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2_Jazeera extends BaseDriver{
    //❖ Login into website with invalid credentials.
    //❖ Assert that your login is unsuccessful.

    @Test
    public void loginTest_Positive(){

        driver.get("https://demowebshop.tricentis.com/");

        WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        login.click();


        WebElement Email = driver.findElement(By.id("Email"));
        Email.sendKeys("brianlopez2@gmail.com");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Demo2023");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();

        WebElement unsuccessfulMessage = driver.findElement(By.xpath("//span[.='Login was unsuccessful. Please correct the errors and try again.']"));

        Assert.assertTrue(unsuccessfulMessage.getText().contains("unsuccessful"));

    }
}

