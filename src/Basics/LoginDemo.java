package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // upcasting

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("d Cust"));
        lnkAddCustomer.click();

        driver.findElement(By.name("name")).sendKeys("rajeshwari");
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("656565656");
        driver.findElement(By.name("contact2")).sendKeys("65656565");
        driver.findElement(By.name("Submit")).click();







    }
}
