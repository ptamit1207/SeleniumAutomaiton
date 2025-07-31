package stepdefinition;

import io.cucumber.java.en.Then;

import static pages.ProductCategoryPage.visibility_product_category;

public class ProductCategoryPage {
    @Then("user should be able to view product category page")
    public static void user_should_be_able_to_view_product_category_page(){
        visibility_product_category();
    }
}
