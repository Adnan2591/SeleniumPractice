package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class SelAssignment1 {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options=new ChromeOptions();
    WebDriver driver=new ChromeDriver(options);
        options.addArguments("--start-maximized");

        driver.get("https://app.vwo.com");

//        Assert.assertEquals(driver.getTitle(),"Login - VWO");
//        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

    WebElement username = driver.findElement(By.id("login-username"));
                    username.sendKeys("vwo@1secmail.com");
    WebElement password = driver.findElement(By.id("login-password"));
                    password.sendKeys("Vwo@1234");
    WebElement button = driver.findElement(By.id("js-login-btn"));
                button.click();

try {
        Thread.sleep(2000);
    } catch(InterruptedException e) {
        throw new RuntimeException(e);
    }
       driver.quit();

}

}


