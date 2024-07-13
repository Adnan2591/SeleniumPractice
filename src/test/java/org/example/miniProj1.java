package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class miniProj1 {
    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        options.addArguments("--start-maximized");

        driver.get(" https://katalon-demo-cura.herokuapp.com/");
        WebElement makappointment = driver.findElement(By.id("btn-make-appointment"));
        makappointment.click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

//        WebElement element1 = driver.findElement(By.xpath("//input[@value ='John Doe']"));
//        WebElement element2 = driver.findElement(By.xpath("//input[@value ='ThisIsNotAPassword']"));


        WebElement element1 = driver.findElement(By.id("txt-username"));
        element1.sendKeys("John Doe");
         WebElement element2 = driver.findElement(By.id("txt-password"));
        element2.sendKeys("ThisIsNotAPassword");
        WebElement element3 = driver.findElement(By.id("btn-login"));
        element3.click();
        WebElement title = driver.findElement(By.tagName("h2"));
        System.out.println(title.getText());
        Assert.assertTrue(title.isDisplayed(),"Make Appointment");

        WebElement Visitdate=driver.findElement(By.id("txt_visit_date"));
        Visitdate.sendKeys("25/07/2024");

        WebElement cmnt=driver.findElement(By.id("txt_comment"));
        cmnt.sendKeys("Emergency Selenium is not so difficult");

        WebElement Appbooked=driver.findElement(By.id("btn-book-appointment"));
        Appbooked.click();

        driver.quit();

//        String mytext = driver.findElement(By.xpath("//input[@value ='John Doe']")).getText();
//        System.out.println(mytext);
//        driver.findElement(By.id("txt-username")).sendKeys(mytext);



//        String gettextuser = driver.findElement(By.xpath("//input[@value ='John Doe']")).getText();
//        System.out.println(gettextuser);

      //  String usertext = gettextuser.getText();
     //   System.out.println(usertext);
//


//
//        WebElement getpass = driver.findElement(By.xpath("//input[@value ='ThisIsNotAPassword']"));
//        String pwd = getpass.getText();
//        System.out.println(pwd);
//
//        WebElement username = driver.findElement(By.id("txt-username"));
//        username.sendKeys(text);
//        WebElement password = driver.findElement(By.id("txt-password"));
//        password.sendKeys(pwd);











    }



}
