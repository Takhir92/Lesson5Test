package Lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
        Thread.sleep(5000);
//        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Women']")));

//        WebElement dressStile = driver.findElement(By.id("//input[@id=layered_id_attribute_group_2]"));
        WebElement dressStile = driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_1']"));


        dressStile.click();
        driver.findElement(By.xpath("//input[@id='layered_category_4']")).click();

        Thread.sleep(5000);

        driver.quit();


    }
}

