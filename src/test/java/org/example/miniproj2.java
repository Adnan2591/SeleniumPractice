package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class miniproj2 {
    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        options.addArguments("--start-maximized");

        driver.get("https://www.idrive360.com/enterprise/login/");
        WebElement element1 = driver.findElement(By.id("username"));
        element1.sendKeys("augtest_040823@idrive.com");
        WebElement element2 = driver.findElement(By.id("password"));
        element2.sendKeys("123456");
        WebElement element3 = driver.findElement(By.xpath("//button[@type='submit']"));
        element3.click();
        Thread.sleep(5000);

        // I am not able to find xpath ?????? further


    }
}
