package stepdefinition;

import io.cucumber.java.en.When;

import static pages.SignInPage.*;

public class SignInPage {
    @When("user successfully enters login details")
        public void user_successfully_enters_login_details(){
        click_on_username();
        click_on_password();
        click_on_login_button();
        }
    }

