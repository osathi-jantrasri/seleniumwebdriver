package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/*
 * Test Case
 * 
 * 1. launch the chrome browser
 * 2. navigate to google.com
 * 3. verify the title of the page "Google"
 * 4. close the browser
 * 
 */

public class FirstTestCase {
    public static void main(String[] args) {
        
        // 1. launch the chrome browser
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new SafariDriver();
        
        // 2. navigate to google.com
        driver.get("https://www.google.com");

        // 3. verify the title of the page "Google"
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        // 4. close the browser
        driver.close();
    }
    
}
