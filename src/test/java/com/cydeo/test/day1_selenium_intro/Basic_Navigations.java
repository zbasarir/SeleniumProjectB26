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

        Thread.sleep(3000);

        // 3- Make our page full screen (it will cover the all window)
        driver.manage().window().maximize();
       // driver.manage().window().fullscreen();



        //Second create -> get method:
        driver.get("http://www.etsy.com");

        // Third create -> navigate method
        //navigate().to() method is for navigating to web Page

        //driver.navigate().to("http://www.etsy.com");

        //It is using for stopping application. We are giving time to application to see steps

        Thread.sleep(3000);// it gets execute the code slowly

        //navigate().back() method is for navigating to back from web page

        driver.navigate().back(); //open the web show it and then close it!

        Thread.sleep(3000);

        // navigate().forward() method is for navigate to forward from web page
        driver.navigate().forward();

       // driver.navigate().refresh();method is for refreshing the page
        driver.navigate().refresh();


        //getting title of the current page
        //driver.getTitle(); will give you the title of the page
        // get title will give you the title of the page but you have to use println since driver.getTitle(); is a String
        System.out.println("driver.getTitle() = " + driver.getTitle());

        // getting URL of the web page
        System.out.println("Etsy page driver.getCurrentUrl() = " + driver.getCurrentUrl());


        //Another example:

        driver.get("http://www.amazon.com");
        System.out.println("Amazon page driver.getTitle() = " + driver.getTitle());
        System.out.println("Amazon page driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //shortcut for soutv-> finish the code and type .soutv+enter
        /*On the console we will see:
         driver.getTitle() = Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
        Etsy page driver.getCurrentUrl() = https://www.etsy.com/
        Amazon page driver.getTitle() = Amazon.com. Spend less. Smile more.
        Amazon page driver.getCurrentUrl() = https://www.amazon.com/
         */


        //driver.close(); this will close the currently open page
        driver.close();

       // driver.quit(); this will close whole current open apps
        driver.quit();



        //String currentTitle = driver.getTitle();
        String currentTitle = driver.getTitle();













    }
}
