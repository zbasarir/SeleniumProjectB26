package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        //TC#3: Google search
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Write “apple” in search box
        //4- Click google search button
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);//used for input action to write whatever you want

        //5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("apple Title verification is passed");
        }else {
            System.out.println("apple Title verification is failed");
        }

        driver.quit();
    }
}
