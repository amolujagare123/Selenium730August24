package OtherSeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SwitchTabs {

    @Test
    public void alertTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amolujagare.in/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://scriptinglogic.org/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://facebook.com/");

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(2));

        Thread.sleep(2000);

        driver.close();
        //System.out.println(driver.getTitle());

    }
}
