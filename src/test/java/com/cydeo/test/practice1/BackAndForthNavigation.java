package com.cydeo.test.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {

    public static void main(String[] args) throws InterruptedException {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        Thread.sleep(3000);
        WebElement gmailTab = driver.findElement(By.linkText("Gmail"));
        gmailTab.click();


        //4- Verify title contains:
        //  Expected: Gmail
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Gmail Title verification is passed");
        }else {
            System.out.println("Gmail Title verification is failed");
        }
        Thread.sleep(3000);
        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //  Expected: Google
        Thread.sleep(3000);
        actualTitle = driver.getTitle();
        expectedTitle = "Google";

        if(actualTitle.contains(expectedTitle)){

            System.out.println("Google Title verification is passed");
        }else {
            System.out.println("Google Title verification is failed");
        }
        driver.quit();

    }

}
