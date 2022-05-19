package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FacebookTitleVerification {

    public static void main(String[] args) {
        //TC #1: Facebook title verification

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Verify title:
        //Expected: “Facebook - log in or sign up”

        String actual = driver.getTitle();
        String expected = "Facebook - log in or sign up";

        if(actual.contains(expected)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");
        }

        driver.quit();




    }


}
