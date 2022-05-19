package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_CydeoVerification {
    /*
    TC #1: Cydeo practice tool verifications
            1. Open Chrome browser
            2. Go to https://practice.cydeo.com
            3. Verify URL contains
            Expected: cydeo
            4. Verify title:
                   Expected: Practice
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // Thread.sleep(3000);

        driver.get("https://practice.cydeo.com");

        String expectedURL = "cydeo"; //it comes from requirement
        String actualURL = driver.getCurrentUrl(); // it comes from selenium web driver.

        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification is passed!");
        }else {
            System.out.println("URL verification is failed!");
        }

        String expectedTitle = "Practice"; //it comes from requirement
        String actualTitle = driver.getTitle(); // it comes from selenium web driver.

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Web Title verification is passed!");
        }else {
            System.out.println("Web Title verification is failed!");
        }

        driver.quit();
    }
}
