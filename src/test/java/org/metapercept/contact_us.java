package org.metapercept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class contact_us {

    public static void main(String[] args) {

        System.setProperty("webdriver.chromedriver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ditaxpresso.com/#/contactus");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String Heading = driver.findElement(By.xpath("//h1[text()='Contact Us']")).getText();
        if (Heading.equals("Contact Us")) {
            System.out.println("Page displaying");
        }
        else {
            System.out.println("Page not displaying");
        }


        driver.findElement(By.name("First Name")).sendKeys("Kartik");
        driver.findElement(By.name("Last Name")).sendKeys("Jain");
        driver.findElement(By.name("CONTACTCF2")).click();
        driver.findElement(By.xpath("//option[text()='India (+91)']")).click();
        driver.findElement(By.name("Phone")).sendKeys("9694577668");
        driver.findElement(By.name("Email")).sendKeys("jainkartik1297@gmail.com");
        driver.findElement(By.name("Title")).sendKeys("Software Testing");
        driver.findElement(By.name("Description")).sendKeys("Need a software for testing.");
        driver.findElement(By.id("formsubmit")).click();




    }

}
