package session1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Test Case
 * 
 * 1. launch the chrome browser
 * 2. navigate to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
 * 3. input "Admin" in the username box
 * 4. input "admin123" in the password box
 * 5. click on the login button
 * 6. verify element "Dashboard" is displayed
 * 7. close the browser
 * 
 * Wait till element loaded
 * By Xpath
 * 
 */

public class Locator2 {

    
    public static void main(String[] args) {
        //1. launch the chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. navigate to page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        //3. input "Admin" in the username box
        //driver.findElement(By.name("username")).sendKeys("Admin");
        input.sendKeys("Admin");

        //4. input "admin123" in the password box
        driver.findElement(By.name("password")).sendKeys("admin123");

        //5. click on the login button
        driver.findElement(By.className("orangehrm-login-button")).submit();

        By Dashboard = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6");
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Dashboard));

        //6. verify element "Dashboard" is displayed
        if (element.isDisplayed()) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        //7. close the browser
        driver.quit();

    }



    
}
