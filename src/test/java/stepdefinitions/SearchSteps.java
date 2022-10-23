package stepdefinitions;

import org.junit.Assert;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchSteps {

	Product product;
	Search search;
	
	@Given("I have a Search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	    System.out.println("Step 1: I am on Search Page");
	}

	@When("I search a product with name {string} and price {int}")
	public void i_search_a_product_with_name_and_price(String productName, Integer price) {
	    System.out.println("Step 2: Search the product with name : "+productName + " price : "+price);
	    
	    product = new Product(productName, price);
	}

	@Then("Product name with {string} should be displayed")
	public void product_name_with_should_be_displayed(String productName) {
	    System.out.println("Step 3: product "+ productName + " is displayed");
	    
	    search = new Search();
	    String name = search.displayProduct(product);
	    System.out.println("The Searched product is : "+name);
	    Assert.assertEquals(product.getProductName(), name);
	}
	
	@Then("Order id is {int} and username is {string}")
	public void order_id_is_and_username_is(Integer int1, String string) {
	   
	}
}
