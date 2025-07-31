package stepdefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

import static pages.HomePage.click_humberger_menu;
import static pages.HomePage.click_signin_link;


public class BasePage  extends BrowserDriver {
    @Given("user navigates to login page")
        public void user_navigates_to_login_page() throws InterruptedException {

        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        click_humberger_menu();
        click_signin_link();
        }
    }

