package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.json.JsonType;
import utility.BrowserDriver;

import static utility.BrowserDriver.driver;

public class SignInPage extends BrowserDriver {
    public static String username_text_xpath="/html[1]/body[1]/center[1]/div[1]/form[1]/div[1]/input[1]";
    public static String password_text_xpath="/html[1]/body[1]/center[1]/div[1]/form[1]/div[2]/input[1]";
    public static String login_button_xpath="/html[1]/body[1]/center[1]/div[1]/form[1]/input[1]";


    public static void click_on_username(){
        driver.findElement(By.xpath(username_text_xpath)).sendKeys("amit");
    }
    public static void click_on_password(){
        driver.findElement(By.xpath(password_text_xpath)).sendKeys("amit");

    }
    public static void click_on_login_button(){
        driver.findElement(By.xpath(login_button_xpath)).click();
    }

}
