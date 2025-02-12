package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case
 * 
 * 1. launch the chrome browser
 * 2. navigate to google.com
 * 3. input "selenium" in the search box
 * 4. click on the search button
 * 5. verify the title of the page "selenium - Google Search"
 * 6. close the browser
 * 
 * isDisplayed / Submit form / button click
 * 
 */

public class Locator1 {
    public static void main(String[] args) {
        
        // 1. launch the chrome browser
        WebDriver driver = new ChromeDriver();
        
        // 2. navigate to google.com
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        // bonus find logo is displayed or not
        boolean logodisplay = driver.findElement(By.className("lnXdpd")).isDisplayed();
        if (logodisplay) {
            System.out.println("Logo is displayed");
        } else {
            System.out.println("Logo is not displayed");
        }

        // 3. input "selenium" in the search box
            //find element by name
        driver.findElement(By.name("q")).sendKeys("selenium");
            //find element by id
        //driver.findElement(By.id("APjFqb")).sendKeys("selenium");
            //find element by class name
        //driver.findElement(By.className("gLFyf")).sendKeys("selenium");


        // 4. click on the search button
            //find element by name
        driver.findElement(By.className("gNO89b")).submit();


        // 5. verify the title of the page "selenium - Google Search"
        String expectedTitle = "selenium - Google Search";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
           System.out.println("Test Passed!");
        } else {
           System.out.println("Test Failed!");
        }

        // 6. close the browser
        driver.quit();

        //test can be fail because google is mad we test their website so many times
    }
    
}
