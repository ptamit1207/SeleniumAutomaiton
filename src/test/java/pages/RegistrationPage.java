package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static utility.BrowserDriver.driver;

public class RegistrationPage extends BrowserDriver {
    public static String first_name_text="/html[1]/body[1]/center[1]/div[1]/form[1]/div[1]/input[1]";
    public static String last_name_text="/html[1]/body[1]/center[1]/div[1]/form[1]/div[1]/input[2]";
    public static String emailid_text="/html[1]/body[1]/center[1]/div[1]/form[1]/div[1]/input[3]";
    public static String contact_text="/html[1]/body[1]/center[1]/div[1]/form[1]/div[1]/input[4]";
    public static String user_name_registration_text="/html[1]/body[1]/center[1]/div[1]/form[1]/div[1]/input[5]";
    public static String password_registration_text="/html[1]/body[1]/center[1]/div[1]/form[1]/div[1]/input[6]";
    public static String submit_btn_registration="/html[1]/body[1]/center[1]/div[1]/form[1]/div[1]/div[2]/center[1]/input[1]";
    public static String registration_headingxpath="/html[1]/body[1]/center[1]/h1[1]";

    public static void click_on_regis_first_name(){
        driver.findElement(By.xpath(first_name_text)).sendKeys("amit");


    }
    public static void click_on_regis_last_name(){
        driver.findElement(By.xpath(last_name_text)).sendKeys("gupta");
    }
    public static void click_on_regis_emaild(){
        driver.findElement(By.xpath(emailid_text)).sendKeys("test@gmail.com");
    }
    public static void click_on_regis_contact(){
        driver.findElement(By.xpath(contact_text)).sendKeys("43432343432");
    }
    public static void click_on_regis_userfirst_name(){
        driver.findElement(By.xpath(user_name_registration_text)).sendKeys("amit");
    }
    public static void click_on_regis_password(){
        driver.findElement(By.xpath(password_registration_text)).sendKeys("amit123");
    }
    public static void click_on_regis_submit() {
        driver.findElement(By.xpath(submit_btn_registration)).click();
    }

    public static void validate_user_registration_text() {
        driver.findElement(By.xpath(registration_headingxpath)).getText();
    }
    }


