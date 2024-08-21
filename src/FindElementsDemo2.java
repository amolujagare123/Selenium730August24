import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> wbList = driver.findElements(By.tagName("a"));

        System.out.println(wbList.size());

        System.out.println("== using for loop ===");

        for (int i=0;i<wbList.size();i++)
          System.out.println(wbList.get(i).getText());


        System.out.println("== using for each loop ===");

        for (WebElement wb: wbList)
            System.out.println(wb.getText());





    }
}
