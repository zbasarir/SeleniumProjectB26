package com.cydeo.test.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    //TC #1: Etsy Title Verification
    //1. Open Chrome browser
    //2. Go to https://www.etsy.com
    //3. Search for “wooden spoon”
    //4. Verify title:
    //Expected: “Wooden spoon | Etsy”

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is passed");
        }else {
            System.out.println("Title verification is failed");
        }

        driver.quit();


    }
}
