package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static utility.BrowserDriver.driver;

public class ProductCategoryPage extends BrowserDriver {
    public static String product_category_headingxpath="/html[1]/body[1]/div[2]/center[1]/h2[1]";

    public static void visibility_product_category(){
        driver.findElement(By.xpath(product_category_headingxpath));
    }
}
