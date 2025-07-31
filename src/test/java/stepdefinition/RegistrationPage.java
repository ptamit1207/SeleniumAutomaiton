package stepdefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.validate_user_registration_text;

public class RegistrationPage {

    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() {
        validate_user_registration_text();
    }

    @Then("^User should be able to view the Registration page$")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {


    }

}