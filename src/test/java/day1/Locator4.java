package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case
 * 
 * 1. launch the chrome browser
 * 2. navigate to https://library.mfu.ac.th/th/
 * 3. find and count element by css selector div.brz-column__items
 * 4. close the browser
 * 
 * find multiple elements
 * css selector
 * 
 */

public class Locator4 {
    public static void main(String[] args) {
        
        // 1. launch the chrome browser
        WebDriver driver = new ChromeDriver();

        
        // 2. navigate to https://library.mfu.ac.th/th/
        driver.get("https://library.mfu.ac.th/th/");

        // 3. find and count element by css selector div.brz-column__items
        int count = driver.findElements(By.cssSelector("div.brz-column__items")).size();
        System.out.println("Total elements: " + count);

        // 4. close the browser
        driver.quit();

    }
    
}
