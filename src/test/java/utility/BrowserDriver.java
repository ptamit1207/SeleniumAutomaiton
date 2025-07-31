package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static utility.BrowserDriver.driver;

public class BrowserDriver {
    public static WebDriver driver;

    public  BrowserDriver() {

        System.setProperty("webdriver.driver.chrome", System.getProperty("Users/amit/Downloads/chromedriver"));
        WebDriver driver =new ChromeDriver();

        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }
    public void close(){
driver.close();
    }
}
