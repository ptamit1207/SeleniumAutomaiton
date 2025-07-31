package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static utility.BrowserDriver.driver;

public class HomePage extends BrowserDriver {
    public static String humberger_menu_xpath="/html[1]/body[1]/div[1]/nav[1]/div[1]/input[1]";
    public static String signin_link="/html[1]/body[1]/div[1]/nav[1]/div[1]/ul[1]/a[2]/li[1]";


    public static void click_humberger_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(humberger_menu_xpath)).click();
    }
    public static void click_signin_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signin_link)).click();
    }
}

