package com.cydeo.test.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTask_NC {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://login2.nextbasecrm.com/");

        WebElement userName = driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("helpdesk@cybertekschool.com");
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("useruser" + Keys.ENTER);

        //Verify the invalid page

        String expectedMsg = "Authorization";
        String actualMsg = driver.getTitle();
        if(actualMsg.equals(expectedMsg)){
            System.out.println("Error msg matches");
        }else{
            System.out.println("Error msg is failed");
        }

        driver.quit();





    }
}
