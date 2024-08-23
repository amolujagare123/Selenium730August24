package xpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewCutomerDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // upcasting

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.linkText("View Customers")).click();

        driver.findElement(By.xpath("//tr[td[text()='Divya1']]//input")).click();








    }
}
