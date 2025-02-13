package session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case
 * 1. launch the chrome browser
 * 2. navigate to https://www.selenium.dev/
 * 3. verify the title of the page "Selenium"
 * 4.find the element by link text "Downloads"
 * 5. click on the link
 * 6. verify the title of the page "Downloads | Selenium"
 * 7. close the browser
 * 
 * LinkedText
 * 
 */

public class Locator3 {
    
    public static void main(String[] args) {
        // 1. launch the chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. navigate to https://www.selenium.dev/
        driver.get("https://www.selenium.dev/");

        // 3. verify the title of the page "Selenium"
        String expectedTitle = "Selenium";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        // 4.find the element by link text "Downloads"
        WebElement element = driver.findElement(By.linkText("Downloads"));
        
        // 5. click on the link
        element.click();

        // 6. verify the title of the page "Downloads | Selenium"
        String expectedTitle2 = "Downloads | Selenium";
        String actualTitle2 = driver.getTitle();
        if (expectedTitle2.equals(actualTitle2)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        // 7. close the browser
        driver.quit();
    }
    
}
