package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {
        // 1- Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        // 2- First create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //Second create -> get method:
        driver.get("http://www.etsy.com");

        // Third create -> navigate method
        //navigate().to() method is for navigating to web Page

        //driver.navigate().to("http://www.etsy.com");

        //It is using for stopping application. We are giving time to application to see steps

        Thread.sleep(3000);

        //navigate().back() method is for navigating to back from web page

        driver.navigate().back(); //open the web show it and then close it!
    }
}
