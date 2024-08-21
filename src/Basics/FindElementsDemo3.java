package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        List<WebElement> wbList = driver.findElements(By.className("round"));

       System.out.println(wbList.size()); // 4

        wbList.get(0).sendKeys("admin"); // username
        wbList.get(1).sendKeys("admin"); // password
        //wbList.get(2).click(); // button

        System.out.println(wbList.get(3).getText());

    }
}
