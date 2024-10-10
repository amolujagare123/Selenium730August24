package OtherSeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SwitchWindows {

    @Test
    public void alertTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://amolujagare.in/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://scriptinglogic.org/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://facebook.com/");

        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(windows.get(0));

        System.out.println(driver.getTitle());

    }
}
