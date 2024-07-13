package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class class3selenium {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options=new ChromeOptions();

        //browser - headless (NOUI)
        //Full mode
        //options browser- maximise, add extension, add options


        WebDriver driver=new ChromeDriver(options);
        options.addArguments("--start-maximized");
//        options.addArguments("--window-size=600,500");
//        options.addArguments("--guest");

//We can add proxy also like VPN and others

        //proxy code: how to set proxy
//        Proxy proxy = new Proxy();
//        proxy.setHttpProxy("92.58.111.111:8080");
//        options.setCapability("proxy", proxy);

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //1. Eager, Normal,none" --

        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        WebElement username = driver.findElement(By.id("login-username"));
                    username.sendKeys("adnan01");
        WebElement password = driver.findElement(By.id("login-password"));
                    password.sendKeys("Adnan@12345");
        WebElement button = driver.findElement(By.id("js-login-btn"));
                button.click();

    WebElement freelink = driver.findElement(By.linkText("Start a free trial"));
freelink.click();



try {
    Thread.sleep(2000);
} catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
       driver.quit();

    }

}
