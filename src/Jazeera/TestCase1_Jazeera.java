package Jazeera;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseDriver;

public class TestCase1_Jazeera extends BaseDriver {
    //❖ Login into website with valid credentials.
    //❖ Assert that your login is successful.

    @Test
    public void loginTest_Positive(){

        driver.get("https://demowebshop.tricentis.com/");

//brianlopez@gmail.com          Demo2023

        WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        login.click();


        WebElement Email = driver.findElement(By.id("Email"));
        Email.sendKeys("brianlopez@gmail.com");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Demo2023");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();

        WebElement welcomeMessage = driver.findElement(By.xpath("//p[.='Welcome to the new Tricentis store!']"));

        Assert.assertTrue(welcomeMessage.getText().contains("Welcome"));

    }
}
